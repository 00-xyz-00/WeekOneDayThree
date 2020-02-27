package com.bb.pokelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView plusTextView;
    private ImageView pokeImgView;
    private TextView numTextView;

    private int pokeNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokeImgView = findViewById(R.id.pokemon_view);
        plusTextView = findViewById(R.id.plus_view);
        numTextView = findViewById(R.id.num_view);
        plusTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                pokeNum++;
                Log.d("TAG_X", String.valueOf(pokeNum));
                if (pokeNum == 2){
                    pokeImgView.setImageDrawable(getDrawable(R.drawable.ic_002_ivysaur_icon));
                } else if (pokeNum == 3){
                    pokeImgView.setImageDrawable(getDrawable(R.drawable.ic_003_venusaur_icon));
                } else if (pokeNum == 4){
                    pokeImgView.setImageDrawable(getDrawable(R.drawable.ic_004_charmander_icon));
                } else if (pokeNum == 5){
                    pokeImgView.setImageDrawable(getDrawable(R.drawable.ic_005_charmeleon_icon));
                } else if (pokeNum == 6){
                    pokeImgView.setImageDrawable(getDrawable(R.drawable.ic_006_charizard_icon));
                } else if (pokeNum == 7){
                    pokeImgView.setImageDrawable(getDrawable(R.drawable.ic_007_squirtle_icon));
                } else if (pokeNum == 8){
                    pokeImgView.setImageDrawable(getDrawable(R.drawable.ic_008_wartortle_icon));
                } else if (pokeNum == 9) {
                    pokeImgView.setImageDrawable(getDrawable(R.drawable.ic_009_blastoise_icon));
                } else if (pokeNum > 9){
                    pokeNum = 1;
                    pokeImgView.setImageDrawable(getDrawable(R.drawable.ic_001_bulbasaur_icon));
                }
                numTextView.setText(String.valueOf(pokeNum));
            }
        });
    }

}
