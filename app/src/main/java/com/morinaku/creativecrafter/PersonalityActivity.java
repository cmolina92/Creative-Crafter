package com.morinaku.creativecrafter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PersonalityActivity extends AppCompatActivity {
    private Random roll = new Random();
    private int one;

    TextView behav,statu,profe,posit,habit,activ,food,speci,weakn,desir;
    String[] tempA,tempB,tempC,tempD,tempE,tempF,tempG,tempH,tempI,tempJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        behav = (TextView) findViewById(R.id.Pone);
        statu = (TextView) findViewById(R.id.Ptwo);
        profe = (TextView) findViewById(R.id.Pthree);
        posit = (TextView) findViewById(R.id.Pfour);
        habit = (TextView) findViewById(R.id.Pfive);
        activ = (TextView) findViewById(R.id.Psix);
        food = (TextView) findViewById(R.id.Pseven);
        speci = (TextView) findViewById(R.id.Peight);
        weakn = (TextView) findViewById(R.id.Pnine);
        desir = (TextView) findViewById(R.id.Pten);

        tempA = getResources().getStringArray(R.array.Pone);
        tempB = getResources().getStringArray(R.array.Ptwo);
        tempC = getResources().getStringArray(R.array.Pthree);
        tempD = getResources().getStringArray(R.array.Pfour);
        tempE = getResources().getStringArray(R.array.Pfive);
        tempF = getResources().getStringArray(R.array.Psix);
        tempG = getResources().getStringArray(R.array.Pseven);
        tempH = getResources().getStringArray(R.array.Peight);
        tempI = getResources().getStringArray(R.array.Pnine);
        tempJ = getResources().getStringArray(R.array.Pten);

        one = roll.nextInt();
        behav.setText(tempA[one]);
        one = roll.nextInt();
        statu.setText(tempB[one]);
        one = roll.nextInt();
        profe.setText(tempC[one]);
        one = roll.nextInt();
        posit.setText(tempD[one]);
        one = roll.nextInt();
        habit.setText(tempE[one]);
        one = roll.nextInt();
        activ.setText(tempF[one]);
        one = roll.nextInt();
        food.setText(tempG[one]);
        one = roll.nextInt();
        speci.setText(tempH[one]);
        one = roll.nextInt();
        weakn.setText(tempI[one]);
        one = roll.nextInt();
        desir.setText(tempJ[one]);

        behav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                behav.setText(tempA[one]);
            }
        });
        statu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                statu.setText(tempB[one]);
            }
        });
        profe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                profe.setText(tempC[one]);
            }
        });
        posit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                posit.setText(tempD[one]);
            }
        });
        habit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                habit.setText(tempE[one]);
            }
        });
        activ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                activ.setText(tempF[one]);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                food.setText(tempG[one]);
            }
        });
        speci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                speci.setText(tempH[one]);
            }
        });
        weakn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                weakn.setText(tempI[one]);
            }
        });
        desir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                desir.setText(tempJ[one]);
            }
        });

        Button randomize = (Button) findViewById(R.id.Prandom);
        randomize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = roll.nextInt();
                behav.setText(tempA[one]);
                one = roll.nextInt();
                statu.setText(tempB[one]);
                one = roll.nextInt();
                profe.setText(tempC[one]);
                one = roll.nextInt();
                posit.setText(tempD[one]);
                one = roll.nextInt();
                habit.setText(tempE[one]);
                one = roll.nextInt();
                activ.setText(tempF[one]);
                one = roll.nextInt();
                food.setText(tempG[one]);
                one = roll.nextInt();
                speci.setText(tempH[one]);
                one = roll.nextInt();
                weakn.setText(tempI[one]);
                one = roll.nextInt();
                desir.setText(tempJ[one]);
            }
        });

        Button returnBtn = (Button) findViewById(R.id.Pback);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PersonalityActivity.this,MainActivity.class));
                PersonalityActivity.this.finish();
            }
        });
    }

}