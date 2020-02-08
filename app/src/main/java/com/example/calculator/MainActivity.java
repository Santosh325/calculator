package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button div,mul,sub,add,equal;
    Button ac,arrow;
    TextView first,second;

    String num1, num2,operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.zero);
        button1 = findViewById(R.id.one);
        button2 = findViewById(R.id.two);
        button3 = findViewById(R.id.three);
        button4 = findViewById(R.id.four);
        button5 = findViewById(R.id.five);
        button6 = findViewById(R.id.six);
        button7 = findViewById(R.id.seven);
        button8 = findViewById(R.id.eight);
        button9 = findViewById(R.id.nine);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        sub = findViewById(R.id.minus);
        add = findViewById(R.id.plus);
        equal = findViewById(R.id.equal);
        ac=findViewById(R.id.ac);
        arrow=findViewById(R.id.arrow);
        first = findViewById(R.id.input);
        second = findViewById(R.id.output);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(first.getText().toString().equals("0")) {
                   first.setText("0");
               } else {
                   first.append("0");
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("0")) {
                    first.setText("1");
                } else {
                    first.append("1");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("0")) {
                    first.setText("2");
                } else {
                    first.append("2");
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("0")) {
                    first.setText("3");
                } else {
                    first.append("3");
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("0")) {
                    first.setText("4");
                } else {
                    first.append("4");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("0")) {
                    first.setText("5");
                } else {
                    first.append("5");
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("0")) {
                    first.setText("6");
                } else {
                    first.append("6");
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("0")) {
                    first.setText("7");
                } else {
                    first.append("7");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("0")) {
                    first.setText("8");
                } else {
                    first.append("8");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("0")) {
                    first.setText("9");
                } else {
                    first.append("9");
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText("0");
                second.setText("0");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = first.getText().toString();
                operator = "/";
                first.setText("0");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = first.getText().toString();
                operator = "+";
                first.setText("0");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = first.getText().toString();
                operator = "-";
                first.setText("0");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = first.getText().toString();
                operator = "*";
                first.setText("0");
            }
        });
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=first.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    first.setText(str);
                } else if (str.length() <=1 ) {
                    first.setText("0");
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = first.getText().toString();
                calculate(num1,num2,operator);
            }
        });



    }
    void calculate(String num1, String num2, String operator) {
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        switch (operator) {
            case "+":
                second.setText(String.valueOf(a + b));
                break;
            case "-":
                second.setText(String.valueOf(a - b));
                break;
            case "*":
                second.setText(String.valueOf(a * b));
                break;
            case "/":
                second.setText(String.valueOf(a / b));
                break;
        }
    }
}
