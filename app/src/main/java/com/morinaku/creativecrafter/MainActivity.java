package com.morinaku.creativecrafter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button personality,form,costume,prompt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        personality = (Button) findViewById(R.id.perso);
        form = (Button) findViewById(R.id.form);
        costume = (Button) findViewById(R.id.costu);
        prompt = (Button) findViewById(R.id.promp);

        personality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PersonalityActivity.class));
                MainActivity.this.finish();
            }
        });

        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Not Ready Yet", Toast.LENGTH_SHORT).show();
                //startActivity(new Intent(MainActivity.this,FormActivity.class));
                //MainActivity.this.finish();
            }
        });

        costume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Not Ready Yet", Toast.LENGTH_SHORT).show();
                //startActivity(new Intent(MainActivity.this,CostumeActivity.class));
                //MainActivity.this.finish();
            }
        });

        prompt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Not Ready Yet", Toast.LENGTH_SHORT).show();
                //startActivity(new Intent(MainActivity.this,PromptActivity.class));
                //MainActivity.this.finish();
            }
        });
    }
}
