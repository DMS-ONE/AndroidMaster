package com.example.recyclerviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerviewexample.databinding.ActivitySecoundActivityBinding;

public class SecoundActivity extends AppCompatActivity {

    private ActivitySecoundActivityBinding binding;

    private Button showButton;
    private EditText inputEditText;

    @Override
    protected void onCreate(Bundle savedInstaanceState) {
        super.onCreate(savedInstaanceState);
        setContentView(R.layout.activity_secound_activity);

        binding = ActivitySecoundActivityBinding.inflate(getLayoutInflater());
        //View view = binding.getRoot();
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        int itemNumber = intent.getIntExtra("item_number", -1);

        TextView itemNumberTextView = findViewById(R.id.itemNumberTextView);
        //TextView itemNumberTextView = binding.itemNumberTextView;


        itemNumberTextView.setText("Item Number: " + itemNumber);


        //showButton = findViewById(R.id.showButton);
        Button showButton = binding.showButton;
        inputEditText = findViewById(R.id.inputEditText);
        //EditText inputEditText = binding.inputEditText;

        showButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String inputText = inputEditText.getText().toString();
                Toast.makeText(v.getContext(), "Input : " + inputText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
