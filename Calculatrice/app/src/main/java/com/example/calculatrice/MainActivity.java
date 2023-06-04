package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button un,deux,trois,quatre,cinque,six,sept,huit,neuf,zero;
        ImageView plus,moin,div,egale,fois,clear,delete;
        EditText input,inputt,operation;
        //les buttons des nombres


        un = findViewById(R.id.un);
        deux = findViewById(R.id.deux);
        trois = findViewById(R.id.trois);
        quatre = findViewById(R.id.quatre);
        cinque = findViewById(R.id.cinque);
        six = findViewById(R.id.six);
        sept = findViewById(R.id.sept);
        huit = findViewById(R.id.huit);
        neuf = findViewById(R.id.neuf);
        zero = findViewById(R.id.zero);

        //les buttons des operation

        plus = findViewById(R.id.plus);
        moin = findViewById(R.id.moin);
        div = findViewById(R.id.div);
        fois = findViewById(R.id.fois);
        egale = findViewById(R.id.egale);
        clear = findViewById(R.id.clear);
        delete = findViewById(R.id.delete);
        // champ d'écriture
        input = findViewById(R.id.input);
        inputt = findViewById(R.id.secoundinpunt);
        operation = findViewById(R.id.operation);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("") == false){
                    String chain = input.getText().toString();
                    input.setText(chain.substring(0,chain.length()-1));
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                inputt.setText("");
                operation.setText("");
            }
        });
        inputt.setText("");
        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"1");

            }
        });
        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"2");

            }
        });
        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"3");

            }
        });
        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"4");

            }
        });
        cinque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"6");

            }
        });
        sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"7");

            }
        });
        huit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"8");

            }
        });
        neuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"9");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chain = input.getText().toString();
                input.setText(chain+"0");

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputt.getText().toString().equals("") == false){
                    operation.setText("+");
                }
                else{
                    String chain = input.getText().toString();
                    inputt.setText(chain);
                    input.setText("");
                    operation.setText("+");
                }


            }
        });
        moin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputt.getText().toString().equals("") == false){
                    operation.setText("-");
                }
                else{
                    String chain = input.getText().toString();
                    inputt.setText(chain);
                    input.setText("");
                    operation.setText("-");
                }
            }
        });
        fois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputt.getText().toString().equals("") == false){
                    operation.setText("*");
                }
                else{
                    String chain = input.getText().toString();
                    inputt.setText(chain);
                    input.setText("");
                    operation.setText("*");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputt.getText().toString().equals("") == false){
                    operation.setText("/");
                }
                else{
                    String chain = input.getText().toString();
                    inputt.setText(chain);
                    input.setText("");
                    operation.setText("/");
                }
            }
        });

        egale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ch = operation.getText().toString();

                switch (ch) {
                    case ("+"): {
                        int x = Integer.parseInt(inputt.getText().toString());
                        int y = Integer.parseInt(input.getText().toString());
                        Number z = x + y;
                        input.setText("");
                        inputt.setText(z.toString());
                        break;
                    }
                    case ("-"): {
                        int x = Integer.parseInt(inputt.getText().toString());
                        int y = Integer.parseInt(input.getText().toString());
                        Number z = x - y;
                        input.setText("");
                        inputt.setText(z.toString());
                        break;
                    }
                    case ("*"): {
                        int x = Integer.parseInt(inputt.getText().toString());
                        int y = Integer.parseInt(input.getText().toString());
                        Number z = x * y;
                        input.setText("");
                        inputt.setText(z.toString());
                        break;
                    }
                    case ("/"): {
                        int x = Integer.parseInt(inputt.getText().toString());
                        int y = Integer.parseInt(input.getText().toString());
                        Number z = x / y;
                        input.setText("");
                        inputt.setText(z.toString());
                        break;
                    }
                }
            }
        });
    }
}