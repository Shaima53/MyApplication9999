package com.example.shyom.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class welcome1 extends AppCompatActivity {
    TextView t;
    TextView t2;
    Button ebdabtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome1);
        t=(TextView)findViewById(R.id.textViewHi);



        Typeface myCustomeFont=Typeface.createFromAsset(getAssets(),"fonts/sego.ttf");
        t.setTypeface(myCustomeFont ,Typeface.BOLD );



        t2=(TextView)findViewById(R.id.textViewEnterName);
        Typeface myCustomeFont2=Typeface.createFromAsset(getAssets(),"fonts/sego.ttf");
        t2.setTypeface(myCustomeFont2   );


        t2.setShadowLayer(9,1,1,Color.GREEN);//shorog this is the shadow code



        ebdabtn=(Button)findViewById(R.id.buttonEnterName);
        Typeface myCustomeFont3=Typeface.createFromAsset(getAssets(),"fonts/sego.ttf");
        ebdabtn.setTypeface(myCustomeFont2   );


        final Intent next=new Intent(getApplicationContext(),welcome1.class);

        ebdabtn.setOnClickListener(new View.OnClickListener() {
            //editText4

            EditText txt4 = (EditText) findViewById(R.id.editTextEnterName);
            public String nameContent = String.valueOf(txt4);

            @Override
            public void onClick(View v) {

                if (txt4.getText().toString().isEmpty())
                    txt4.setError("أدخل إسمك من فضلك");
                else
                {
                    next.putExtra("com.example.shyom.myapplication.Something", txt4.getText().toString()+"");
                    startActivity(next);

                }//end of onClick method
            }});
        }
    }






