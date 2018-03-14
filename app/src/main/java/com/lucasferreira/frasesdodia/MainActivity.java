package com.lucasferreira.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){

        String[] frases = {
                "Lhe peço que tenha coragem de confiar em sua criação.",
                "A young boy and his father, idol and best friend.",
                "Não se opor à luz que for pra renovar.",
                "Cante alto seus sonhos!",
                "Crie sua própria luz, o seu calor e sua missão, infinitas chances vão surgir se permitir.",
                "Quem vive sem loucura não sabe o que é ter o real livre arbítrio em si.",
        };

        int numero = new Random().nextInt(frases.length);
        TextView textView = findViewById(R.id.frase);
        textView.setText(frases[numero]);

    }

}
