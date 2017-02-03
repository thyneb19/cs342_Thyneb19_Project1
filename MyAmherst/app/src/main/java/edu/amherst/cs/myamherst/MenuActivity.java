package edu.amherst.cs.myamherst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Creates Breakfast button. Button will display breakfast menu on click.
        Button breakfastButton = (Button) findViewById(R.id.BreakfastButton);
        breakfastButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                startActivity(new Intent(MenuActivity.this, MenuListActivity.class));
            }
        });

        //Creates Lunch button. Button will display lunch menu on click.
        Button lunchButton = (Button) findViewById(R.id.LunchButton);
        lunchButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                startActivity(new Intent(MenuActivity.this, MenuListActivity.class));
            }
        });

        //Creates Dinner button. Button will display dinner menu on click.
        Button dinnerButton = (Button) findViewById(R.id.DinnerButton);
        dinnerButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                startActivity(new Intent(MenuActivity.this, MenuListActivity.class));
            }
        });
    }
}
