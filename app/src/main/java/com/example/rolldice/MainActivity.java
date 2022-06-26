package com.example.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.rolldice.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityMainBinding.inflate(LayoutInflater.from(this));
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

       
       binding.btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Random random=new Random();
               int rand=random.nextInt(6)+1;
               if(rand==6){
                   binding.imageView6.setImageResource(R.drawable.dice6);
               }
               else if(rand==5){
                   binding.imageView6.setImageResource(R.drawable.dice5);

               }
               else if(rand==4){
                   binding.imageView6.setImageResource(R.drawable.dice4);
               }
               else if(rand==3){
                   binding.imageView6.setImageResource(R.drawable.dice3);
               }
               else if(rand==2){
                   binding.imageView6.setImageResource(R.drawable.dice2);
               }
               else if(rand==1){
                   binding.imageView6.setImageResource(R.drawable.dice1);
               }
               Toast.makeText(MainActivity.this, rand+" ", Toast.LENGTH_SHORT).show();

           }
       });
    }
}