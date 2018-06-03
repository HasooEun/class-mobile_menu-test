package com.example.hasoo.menutest;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout = null;
    Button button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Options Menu Test");
        linearLayout = findViewById(R.id.linearLayout);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId() == R.id.item) linearLayout.setBackgroundColor(Color.RED);
        else if(item.getItemId() == R.id.item2) linearLayout.setBackgroundColor(Color.BLUE);
        else if(item.getItemId() == R.id.item3) linearLayout.setBackgroundColor(Color.YELLOW);
        else if(item.getItemId() == R.id.menuRotate) button.setRotation(45f);
        else if(item.getItemId() == R.id.menuScale) button.setScaleX(10f);
        return super.onOptionsItemSelected(item);
    }
}
