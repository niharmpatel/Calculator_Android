package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

public class ViewData extends AppCompatActivity {
    boolean addition;
    float valueOne;
    float valueTwo;
    boolean subtract ;
    boolean multiplication;
    boolean division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btnMinus = (Button) findViewById(R.id.btnMinus);
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        Button btnDivde = (Button) findViewById(R.id.btnDivde);
        Button btnDot = (Button) findViewById(R.id.btnDot);
        Button btnC = (Button) findViewById(R.id.btnC);
        Button btnEqual = (Button) findViewById(R.id.Equal);
        Button btnDelete = (Button) findViewById(R.id.delete);
        final TextView textView = (TextView) findViewById(R.id.textView2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textView.getText().toString().contains(".")) {
                    textView.setText(textView.getText() + ".");
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textView.getText() == "") {
                    textView.setText("");
                } else {
                    valueOne = Float.parseFloat(textView.getText() + "");
                    addition = true;
                    textView.setText("");
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textView.getText() == "") {
                    textView.setText("");
                } else {
                    valueOne = Float.parseFloat(textView.getText() +  "");
                    subtract = true;
                    textView.setText("");
                }
            }
        });

        btnDivde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textView.getText() == "") {
                    textView.setText("");
                } else {
                    valueOne = Float.parseFloat(textView.getText() +  "");
                    division = true;
                    textView.setText("");
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textView.getText() == "") {
                    textView.setText("");
                } else {
                    valueOne = Float.parseFloat(textView.getText() +  "");
                    multiplication = true;
                    textView.setText(null);
                }
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!textView.getText().toString().contains(""))
                valueTwo = Float.parseFloat(textView.getText() + "");

                if (addition == true) {
                    textView.setText(valueOne + valueTwo + "");
                    addition = false;
                }

                if (subtract == true) {
                    textView.setText(valueOne - valueTwo + "");
                    subtract = false;
                }

                if (multiplication == true) {
                    textView.setText(valueOne * valueTwo + "");
                    multiplication = false;
                }

                if (division == true) {
                    textView.setText(valueOne / valueTwo + "");
                    division = false;
                }


            }
        });





        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText() != null && textView.getText() .length() > 0 ) {
                    textView.setText(textView.getText().toString().substring(0, textView.getText() .length() - 1));
                }
            }
        });
    }
}
