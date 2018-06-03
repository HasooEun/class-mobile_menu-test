package com.example.hasoo.menutest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView = null;
    EditText editText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Options Menu Test 2");

        imageView = findViewById(R.id.imageView);
        editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu2, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.itemRotateImg) imageView.setRotation(Integer.parseInt(editText.getText().toString()));
        else if(item.getItemId() == R.id.itemJellyFish) {
            imageView.setImageResource(R.drawable.img1);
            item.setChecked(true);
        } else if(item.getItemId() == R.id.itemMountain) {
            imageView.setImageResource(R.drawable.img2);
            item.setChecked(true);
        } else if(item.getItemId() == R.id.itemFlower) {
            imageView.setImageResource(R.drawable.img3);
            item.setChecked(true);
        }
        return super.onOptionsItemSelected(item);
    }
}
