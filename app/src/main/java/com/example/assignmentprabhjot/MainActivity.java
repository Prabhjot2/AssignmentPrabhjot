package com.example.assignmentprabhjot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random generate_random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Variables :

        Button higher_button = (Button) findViewById(R.id.button1);
        Button lower_button = (Button) findViewById(R.id.button2);
        TextView displayResult = (TextView) findViewById(R.id.Result);
        ImageView diceImg_user= (ImageView) findViewById(R.id.imageView1);
        ImageView diceImg_computer = (ImageView) findViewById(R.id.imageView2);

        //Higher Button Click event
        higher_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generate_random = new Random();
                int generate_user = generate_random.nextInt(6) + 1;
                int generate_computer = generate_random.nextInt(6) + 1;

                String output = randomCompare(generate_user, generate_computer, 'h');

                switch (generate_user){
                    case 1:
                        //computer_diceImg.setImageResource();
                        diceImg_user.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        diceImg_user.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        diceImg_user.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        diceImg_user.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        diceImg_user.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        diceImg_user.setImageResource(R.drawable.dice6);
                        break;

                }

                switch (generate_computer){
                    case 1:
                        //computer_diceImg.setImageResource();
                        diceImg_computer.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        diceImg_computer.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        diceImg_computer.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        diceImg_computer.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        diceImg_computer.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        diceImg_computer.setImageResource(R.drawable.dice6);
                        break;

                }

                displayResult.setText(output);
            }
        });

        //Lower Button click event
        lower_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generate_random = new Random();
                int generate_user = generate_random.nextInt(6) + 1;
                int generate_computer = generate_random.nextInt(6) + 1;

                String output = randomCompare(generate_user, generate_computer, 'l');

                switch (generate_user){
                    case 1:
                        //computer_diceImg.setImageResource();
                        diceImg_user.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        diceImg_user.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        diceImg_user.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        diceImg_user.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        diceImg_user.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        diceImg_user.setImageResource(R.drawable.dice6);
                        break;

                }

                switch (generate_computer){
                    case 1:
                        //computer_diceImg.setImageResource();
                        diceImg_computer.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        diceImg_computer.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        diceImg_computer.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        diceImg_computer.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        diceImg_computer.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        diceImg_computer.setImageResource(R.drawable.dice6);
                        break;

                }

                displayResult.setText(output);
            }
        });
    }

    public  String randomCompare(int user_dice, int computer_dice, char to_do){
        String final_result = "";
        if(to_do == 'h'){
            if(user_dice == computer_dice){
                //Tie
                final_result = "It’s a tie";
            }else if (user_dice < computer_dice){
                //loose
                final_result = "Computer Win!";
            }else {
                //Win
                final_result = "User Win!";
            }
        }
        if(to_do == 'l'){
            if(user_dice == computer_dice){
                //Tie
                final_result = "It’s a tie";
            }else if (user_dice > computer_dice){
                //loose
                final_result = "Computer Win!";
            }else {
                //Win
                final_result = "User Win!";
            }
        }
        return  final_result;
    }

}