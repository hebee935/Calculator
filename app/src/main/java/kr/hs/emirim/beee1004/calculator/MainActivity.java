package kr.hs.emirim.beee1004.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button_plus, button_min, button_mul, button_div;
    EditText edit_num1,edit_num2;
    TextView text_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_plus = (Button)findViewById(R.id.button_plus);
        button_min = (Button)findViewById(R.id.button_min);
        button_mul = (Button)findViewById(R.id.button_mul);
        button_div = (Button)findViewById(R.id.button_div);
        edit_num1 = (EditText)findViewById(R.id.edit_num1);
        edit_num2 = (EditText)findViewById(R.id.edit_num2);
        text_result = (TextView)findViewById(R.id.text_result);
        button_plus.setOnClickListener(this);
        button_min.setOnClickListener(this);
        button_mul.setOnClickListener(this);
        button_div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //2개의 EditText 에 입력된 값을 반환받는다.
        int num1 = Integer.parseInt(edit_num1.getText().toString());
        int num2 = Integer.parseInt(edit_num2.getText().toString());
        double result = 0;
        switch (view.getId()){
            case R.id.button_plus : result = num1+num2; break;
            case R.id.button_min : result = num1-num2; break;
            case R.id.button_mul : result = num1*num2; break;
            case R.id.button_div : result = (double)num1/num2; break;
        }
        text_result.setText("*계산 결과 : "+result);

    }
}
