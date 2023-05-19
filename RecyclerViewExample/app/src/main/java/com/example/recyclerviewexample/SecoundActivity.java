package com.example.recyclerviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecoundActivity extends AppCompatActivity {

    private Button showButton;
    private EditText inputEditText;

    @Override
    protected void onCreate(Bundle savedInstaanceState){
        super.onCreate(savedInstaanceState);
        setContentView(R.layout.activity_secound_activity);

        TextView itemNumberTextView = findViewById(R.id.itemNumberTextView);

        Intent intent =getIntent();
        int itemNumber = intent.getIntExtra("item_number",-1);

        itemNumberTextView.setText("Item Number: " + itemNumber);



        showButton = findViewById(R.id.showButton);
        inputEditText = findViewById(R.id.inputEditText);

        showButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String inputText = inputEditText.getText().toString();
                Toast.makeText(v.getContext(), "Input : " + inputText, Toast.LENGTH_SHORT).show();
            }


        });
    }


}
