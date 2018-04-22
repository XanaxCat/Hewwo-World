package com.example.catsyrup.catcollection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.catsyrup.catcollection.cats.DonutCat;
import com.example.catsyrup.catcollection.cats.PizzaCat;
import com.example.catsyrup.catcollection.cats.TacoCat;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Button btnpizza = (Button) findViewById(R.id.btn_pizzacat);
        btnpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPizzaCat();
            }
        });

        Button btndonut = (Button) findViewById(R.id.btn_donutcat);
        btndonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDonutCat();
            }
        });

        Button btntaco = (Button) findViewById(R.id.btn_tacocat);
        btntaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTacoCat();
            }
        });
    }

    private void goToPizzaCat() {
        Intent intent = new Intent(this, PizzaCat.class);
        startActivity(intent);
    }

    private void goToDonutCat() {
        Intent intent = new Intent(this, DonutCat.class);
        startActivity(intent);
    }

    private void goToTacoCat() {
        Intent intent = new Intent(this, TacoCat.class);
        startActivity(intent);
    }
}
