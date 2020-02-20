package com.example.regoli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //linearlayouts
    private LinearLayout first_layout, second_layout, third_layout, fourth_layout, fifth_layout, sixth_layout,seventh_lauout, eigth_layout;


    //First Layout
    private Button signin,create_account;



    //Second Layout
    private EditText input_phnnumber;
    private ImageButton btn_phnnumber;


    //Third Layout
    private ProgressBar progressBar;

    //Fourth Layout
    private EditText verified_number;
    private ImageButton btn_verified;

    //Fifth Layout
    //Sixth Layout
    //Seventh Layout
    //eighth Layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        first_layout=(LinearLayout) findViewById(R.id.first_layout);
        second_layout=(LinearLayout) findViewById(R.id.second_layout);
        third_layout=(LinearLayout) findViewById(R.id.third_layout);
        fourth_layout=(LinearLayout) findViewById(R.id.fourth_layouts);
        fifth_layout=(LinearLayout) findViewById(R.id.fifth_layouts);
        sixth_layout=(LinearLayout) findViewById(R.id.sixth_layouts);
        seventh_lauout=(LinearLayout) findViewById(R.id.seventh_layouts);
        eigth_layout=(LinearLayout) findViewById(R.id.eight_layouts);



        first_layout.setVisibility(View.VISIBLE);

        //******

        signin = (Button)findViewById(R.id.signin);
        create_account=(Button)findViewById(R.id.create_account);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "signIn", Toast.LENGTH_SHORT).show();
            }
        });
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_layout.setVisibility(View.GONE);
                second_layout.setVisibility(View.VISIBLE);
            }
        });


        //****

        btn_phnnumber=(ImageButton)findViewById(R.id.btn_phnnumber);
        input_phnnumber=(EditText)findViewById(R.id.edit_phnnumber);

        //store phone Number
        String number = input_phnnumber.getText().toString();

        btn_phnnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second_layout.setVisibility(View.GONE);
                third_layout.setVisibility(View.VISIBLE);

            }
        });

        //******
        progressBar =(ProgressBar)findViewById(R.id.progress_circular);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                third_layout.setVisibility(View.GONE);
                fourth_layout.setVisibility(View.VISIBLE);

            }
        },10000);


        //******
        verified_number=(EditText)findViewById(R.id.verified_number);
        btn_verified =(ImageButton)findViewById(R.id.btn_verified);

        //store verification Code (OTP)

        String verification_code =  verified_number.getText().toString();

        btn_verified.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fourth_layout.setVisibility(View.GONE);
                first_layout.setVisibility(View.VISIBLE);
            }
        });




    }
}
