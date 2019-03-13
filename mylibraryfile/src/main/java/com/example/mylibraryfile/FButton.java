package com.example.mylibraryfile;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class FButton extends LinearLayout
{

    Context con;

    public FButton(Context context)
    {
        super(context);
        this.con = context;
        init();
    }

    public FButton(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        this.con = context;
        init();
    }

    private void init()
    {

        this.setOrientation(VERTICAL);
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        this.setLayoutParams(params);
        this.setGravity(Gravity.CENTER);

        final Button Btn = new Button(con);
       Btn.setBackgroundColor(Color.parseColor("#000000"));
       Btn.setTextColor(Color.parseColor("#FFFFFF"));
       Btn.setText("Click Here");
       Btn.setTextSize(18);
       Btn.setPadding(10,0,10,0);
        RelativeLayout layout = new RelativeLayout(con);
        layout.setLayoutParams(params);

        RelativeLayout.LayoutParams btn_params= new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        btn_params.addRule(RelativeLayout.CENTER_IN_PARENT);
        btn_params.setMargins(0,0,15 , 15);
        Btn.setLayoutParams(btn_params);

        Btn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v) {
                try
                {
                    Toast.makeText(con, "Hello", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });



        layout.addView(Btn);

        this.addView(layout);


    }






}