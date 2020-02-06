package com.example.khalid.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_add, btn_sub, btn_mul, btn_div;
    EditText et_number1, et_number2;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);

        et_number1 = (EditText) findViewById(R.id.number1);
        et_number2 = (EditText) findViewById(R.id.number2);
        tv_result = (TextView) findViewById(R.id.result);

    }
    public void addition(View view)
    {
        int num1 = Integer.parseInt(et_number1.getText().toString());
        int num2 = Integer.parseInt(et_number2.getText().toString());
        int result = num1 + num2;
        tv_result.setText(Integer.toString(result));
    }

    public void subtraction(View view)
    {
        int num1 = Integer.parseInt(et_number1.getText().toString());
        int num2 = Integer.parseInt(et_number2.getText().toString());
        int result = num1 - num2;
        tv_result.setText(Integer.toString(result));
    }

    public void multiplication(View view)
    {
        int num1 = Integer.parseInt(et_number1.getText().toString());
        int num2 = Integer.parseInt(et_number2.getText().toString());
        int result = num1 * num2;
        tv_result.setText(Integer.toString(result));
    }

    public void division(View view)
    {
        int num1 = Integer.parseInt(et_number1.getText().toString());
        int num2 = Integer.parseInt(et_number2.getText().toString());
        int result = num1 / num2;
        tv_result.setText(Integer.toString(result));
    }
}
