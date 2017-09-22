package com.example.akshit.calculator;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bdiv,bmul,bc,bdot;
    TextView result;
    boolean mul,div,add,sub;
    double a=0,pnum = 0;
    int dotnum = 0,intnum = 0,floatnum = 0;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.button0);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        badd = (Button) findViewById(R.id.buttonadd);
        bsub = (Button) findViewById(R.id.buttonsub);
        bdiv = (Button) findViewById(R.id.buttondiv);
        bc = (Button) findViewById(R.id.buttonC);
        bmul = (Button) findViewById(R.id.buttonmul);
        bdot = (Button) findViewById(R.id.buttondot);
        result = (TextView) findViewById(R.id.editText);
    }
    public void put0(View V)
    {
        if(dotnum<2&&intnum>0)
        {
            result.setText(result.getText()+"0");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void put1(View V)
    {
        if(dotnum<2)
        {
            result.setText(result.getText()+"1");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void put2(View V)
    {
        if(dotnum<2)
        {
            result.setText(result.getText()+"2");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void put3(View V)
    {
        if(dotnum<2)
        {
            result.setText(result.getText()+"3");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void put4(View V)
    {
        if(dotnum<2)
        {
            result.setText(result.getText()+"4");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void put5(View V)
    {
        if(dotnum<2)
        {
            result.setText(result.getText()+"5");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void put6(View V)
    {
        if(dotnum<2)
        {
            result.setText(result.getText()+"6");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void put7(View V)
    {
        if(dotnum<2)
        {
            result.setText(result.getText()+"7");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void put8(View V)
    {
        if(dotnum<2)
        {
            result.setText(result.getText()+"8");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void put9(View V)
    {
        if(dotnum<2)
        {
            result.setText(result.getText()+"9");
            if(dotnum==1) floatnum++;
            else intnum++;
        }
    }
    public void putdot(View V)
    {
        if(dotnum==0)
        {
            result.setText(result.getText()+".");
            dotnum++;
        }
    }
    public void clear(View V)
    {
        result.setText(" ");
        pnum = 0;
        add = false;
        mul = false;
        sub = false;
        div = false;
    }
    public void add(View V)
    {
        String x;
        if(result.getText().toString().equals("")) x = "l";
        else
        {
            x = result.getText().toString();
            a = Double.parseDouble(x);
        }
        if(div)
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum/a;
            }
        }
        else if(sub)
        {
            if(!x.equals("l"))pnum = pnum-a;
            sub = false;
        }
        else if(mul)
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum*a;
            }            if(pnum==0) pnum = a;
            mul = false;
        }
        else
        {
            if(!x.equals("l"))pnum = pnum+a;
            add = false;
        }
        result.setText("");
        add = true;
        mul = false;
        sub = false;
        div = false;
    }
    public void sub(View V)
    {

        String x;
        if(result.getText().toString().equals("")) x = "l";
        else x = result.getText().toString();
        a = Double.parseDouble(x);
        if(add)
        {
            if(!x.equals("l"))pnum = pnum+a;
            add = false;
        }
        else if(div)
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum/a;
            }
        }
        else if(mul)
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum*a;
            }            mul = false;
        }
        else
        {
            if(!x.equals("l"))pnum = pnum-a;
            sub = false;
        }
        result.setText("");
        add = false;
        mul = false;
        sub = true;
        div = false;

    }
    public void mul(View V)
    {
        String x;
        if(result.getText().toString().equals("")) x = "l";
        else x = result.getText().toString();
        a = Double.parseDouble(x);
        if(add)
        {
            if(!x.equals("l"))pnum = pnum+a;
            add = false;
        }
        else if(sub)
        {
            if(!x.equals("l"))pnum = pnum-a;
            sub = false;
        }
        else if(div)
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum/a;
            }
        }
        else
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum*a;
            }
        }
        result.setText("");
        add = false;
        mul = true;
        sub = false;
        div = false;

    }
    public void div(View V)
    {

        String x;
        if(result.getText().toString().equals("")) x = "l";
        else x = result.getText().toString();
        a = Double.parseDouble(x);
        if(add)
        {
            if(!x.equals("l"))pnum = pnum+a;
        }
        else if(sub)
        {
            if(!x.equals("l"))pnum = pnum-a;
        }
        else if(mul)
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum*a;
            }        }
        else
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum/a;
            }
        }
        result.setText("");
        add = false;
        mul = false;
        sub = false;
        div = true;

    }
    public void equate(View V)
    {
        String x;
        if(result.getText().toString().equals("")) x = "l";
        else
        {
            x = result.getText().toString();
            a = Double.parseDouble(x);
        }
        if(add)
        {
            if(!x.equals("l"))pnum = pnum+a;
            add = false;
        }
        else if(sub)
        {
            if(!x.equals("l"))pnum = pnum-a;
            sub = false;
        }
        else if(mul)
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum*a;
            }            mul = false;
        }
        else
        {
            if(!x.equals("l"))
            {
                if(pnum==0) pnum = a;
                else pnum = pnum/a;
            }            div = false;
        }
        result.setText(Double.toString(pnum));
        pnum = 0;
    }

}

