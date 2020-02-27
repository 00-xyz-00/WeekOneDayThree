# Week 1 - Day 3

### Research

1. What is the difference in a hash map versus a hash table?

 Hash map is not synchronized, but hash table is.
 Hash table does not accept any null value (key or pair), but hash map accept one null key and multiple null values.

2. Why should you generally override the equals and hashCode methods?

Because we need it to make objects usable as keys.

3. How does a factory design pattern work?

There is a Creator that implements an abstract factoryMethod() that lets its subclasses (i.e. CreatorSubclass) override this factoryMethod to create subclasses of a Product interface.

4. How does Java Garbage Collection Work?

It’s a Daemon thread that is making sure to suppress any Object that is not useful for the program, but waste space in the memory.

5. What is the difference in a HashMap vs a HashTable?

HashMap extends java.util.Map, while HashTable extends java.util.Dictionnary.

6. What is a sparse Array?

An array with multiple zeros.

7. What is the difference in a ArrayList and the List?

List is an Interface and ArrayList is a class that is a subtype of ArrayList.

8. What is the difference in comparator vs comparable?

With a comparator it is possible to sort objects by the mean of multiple elements, while comparable uses only one 1 element.

### Coding 
##### Problem 1
Create a function to print the duplicates in a list of strings
Method:
- use a java.util.Collection.Set which can not contain duplicates;
- try to add one of the string in the set: if it can not, it's because this string is a duplicate.
```java
class ProblemOne {
    public void findDuplicates(List<String> strings){
        Set<String> set = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String s: strings){
            if(!set.add(s))
                duplicates.add(s);
        }
        System.out.println(duplicates);
    }
}
```
### Problem 2
 Create function to check if the string is a palindrome without using string.reverse() method.
 
Method:
- use two pointers for beginning and end;
- increment left and decrement right as long as it is not a letter or a digit;
- compare them: continue until they cross if they are the same. If they finally cross, it is a palindrome. If they are not the same, it is not a palindrome.
```java
class ProblemTwo {
    public boolean checkPalindrome(String word){
        if(word == null || word.length == 0) return false;
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(word.charAt(i))){
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(word.charAt(j))){
                j--;
            }
            if (i < j && Character.toLowerCase(word.charAt(i++)) != Character.toLowerCase(word.charAt(j--))){
                return false;
            }
        }
        return true;
    }
}
```
### Problem 3
Create a function that will print:
"fizz" is the number is divisible by 3
"buzz" is the number is divisible by 5
"fizzbuzz" is the number is divisible by both

Method: 
- iterate until n;
- use if and else if conditions with modulo 3 or 5 to verify divisibility;
- store corresponding word into a list

Code: 
```java
class ProblemThree {
    public List<String> fizzBuzz(int n) {
    	List<String> res = new ArrayList();
    	for (int i = 1; i <= n; i++) {
    		if (i % 3 == 0 && i % 5 == 0) {
    			res.add(“FizzBuzz”);
    		} else if (i % 3 == 0) {
    			res.add(“Fizz”);
    		} else if (i % 5 == 0 ){
    			buzz = 0;
    			res.add(“Buzz”);
    		}  else {
    			res.add(Integer.toString(i));
    		}
    	}
    	return res;
    }
}
```
### Problem 4
Create a function to check if the two strings are anagrams: Eg: COAT and TACO would be anagrams.

Method: 
- compare length of both: if it's not the same, they are not anagrams
- sort both strings and compare them: if they have a different character, they are not anagrams

```java
class ProblemFour {
    public boolean checkAnagrams(String word1, String word2){
        if(word1 == null || word1.length() == 0) return false;
        if(word2 == null || word2.length() == 0) return false;
        if(word1.length() != word2.length())
            return false;
        Arrays.sort(word1);
        Arrays.sort(word2);
        for (int i = 0; i < word1.length(); i++){
            if(word1[i] != word2[i])
                return false;
        }
        return true;
    }
}
```
### Problem 5
Print a multiplication table from 1 to 10 using multidimensional array
Output
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
Method: 
- nested loops from 1 to 10;
- use printf to stay on same line;
- use println to create new line;
```java
class ProblemFive{
    public void printTables(){
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.printf("%2d", i * j)
            }
            System.out.println();
        }
    }
}
```


