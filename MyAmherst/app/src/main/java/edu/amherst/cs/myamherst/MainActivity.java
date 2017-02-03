package edu.amherst.cs.myamherst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button diningButton = (Button) findViewById(R.id.DiningButton);
        diningButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        });
    }
}