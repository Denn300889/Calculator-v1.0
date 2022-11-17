package com.example.calc;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView_result_2, textView_result_1;
    Button btn_7, btn_8, btn_9, btn_4, btn_5, btn_6, btn_1, btn_2, btn_3, btn_0, btn_plus, btn_minus, btn_result, btn_poin, btn_multiply, btn_percent, btn_1divX, btn_sqr, btn_sqrt, btn_plus_minus, btn_C, btn_div;
    Double num_1 = null, num_2; //, num_result;
    int serialNum=1; // Счётчики
    int mathOperation=0; // математические операции 0 - нет операций, 1 - +, 2 - -, 3 - *, 4 - /, 5 - %

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_result_1 = (TextView) findViewById(R.id.textView_result_1);
        textView_result_2 = (TextView) findViewById(R.id.textView_result_2);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_result = (Button) findViewById(R.id.btn_result);
        btn_poin = (Button) findViewById(R.id.btn_poin);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_percent = (Button) findViewById(R.id.btn_percent);
        btn_1divX = (Button) findViewById(R.id.btn_1divX);
        btn_sqr = (Button) findViewById(R.id.btn_sqr);
        btn_sqrt = (Button) findViewById(R.id.btn_sqrt);
        btn_plus_minus = (Button) findViewById(R.id.btn_plus_minus);
        btn_C = (Button) findViewById(R.id.btn_C);
        btn_div = (Button) findViewById(R.id.btn_div);
    }

    public void clickBtn_0(View view){
        textView_result_2.setText((String)textView_result_2.getText()+btn_0.getText());
        textView_result_1.setText((String)textView_result_1.getText()+btn_0.getText());
    }
    public void clickBtn_1(View view){
        textView_result_2.setText((String)textView_result_2.getText()+btn_1.getText());
        textView_result_1.setText((String)textView_result_1.getText()+btn_1.getText());
    }
    public void clickBtn_2(View view){
        textView_result_2.setText((String)textView_result_2.getText()+btn_2.getText());
        textView_result_1.setText((String)textView_result_1.getText()+btn_2.getText());
    }
    public void clickBtn_3(View view){
        textView_result_2.setText((String)textView_result_2.getText()+btn_3.getText());
        textView_result_1.setText((String)textView_result_1.getText()+btn_3.getText());
    }
    public void clickBtn_4(View view){
        textView_result_2.setText((String)textView_result_2.getText()+btn_4.getText());
        textView_result_1.setText((String)textView_result_1.getText()+btn_4.getText());
    }
    public void clickBtn_5(View view){
        textView_result_2.setText((String)textView_result_2.getText()+btn_5.getText());
        textView_result_1.setText((String)textView_result_1.getText()+btn_5.getText());
    }
    public void clickBtn_6(View view){
        textView_result_1.setText((String)textView_result_1.getText()+btn_6.getText());
        textView_result_2.setText((String)textView_result_2.getText()+btn_6.getText());
    }
    public void clickBtn_7(View view){
        textView_result_1.setText((String)textView_result_1.getText()+btn_7.getText());
        textView_result_2.setText((String)textView_result_2.getText()+btn_7.getText());
    }
    public void clickBtn_8(View view){
        textView_result_1.setText((String)textView_result_1.getText()+btn_8.getText());
        textView_result_2.setText((String)textView_result_2.getText()+btn_8.getText());
    }
    public void clickBtn_9(View view){
        textView_result_1.setText((String)textView_result_1.getText()+btn_9.getText());
        textView_result_2.setText((String)textView_result_2.getText()+btn_9.getText());
    }
    public void clickBtn_poin(View view){
        if (textView_result_2.getText()==""){
            textView_result_1.setText("0"+textView_result_1.getText()+btn_poin.getText());
            textView_result_2.setText("0"+textView_result_2.getText()+btn_poin.getText());
        } else {
            textView_result_1.setText((String)textView_result_1.getText()+btn_poin.getText());
            textView_result_2.setText(((String)textView_result_2.getText())+btn_poin.getText());
        }
    }
    public void clickBtn_plus(View view){
        textView_result_1.setText((String)textView_result_1.getText()+btn_plus.getText());
        mathOperation=1;
        if (textView_result_2.getText()=="") textView_result_2.setText(String.valueOf(Double.valueOf("0")));
        num_1 = Double.valueOf(String.valueOf(textView_result_2.getText()));
        textView_result_2.setText("");

//            serialNim=2;
//        if (serialNim==1){
//            num_1 = Double.valueOf(String.valueOf(textView_result_2.getText()));
//            textView_result_2.setText("");
//            serialNim=2;
//        } else {
//            num_2 = Double.valueOf(String.valueOf(textView_result_2.getText()));
//            textView_result_2.setText("");
//        }
//        if ((num_1!=null)&&(num_2!=null)){
//            num_1=num_1+num_2;
//            textView_result_2.setText(String.valueOf(num_1));
//        }
    }
    public void clickBtn_minus(View view){
        textView_result_1.setText((String)textView_result_1.getText()+btn_minus.getText());
        mathOperation=2;
        if (textView_result_2.getText()=="") textView_result_2.setText(String.valueOf(Double.valueOf("0")));
        num_1 = Double.valueOf(String.valueOf(textView_result_2.getText()));
        textView_result_2.setText("");
    }
    public void clickBtn_multiply(View view){
        textView_result_1.setText((String)textView_result_1.getText()+btn_multiply.getText());
        mathOperation=3;
        if (textView_result_2.getText()=="") textView_result_2.setText(String.valueOf(Double.valueOf("0")));
        num_1 = Double.valueOf(String.valueOf(textView_result_2.getText()));
        textView_result_2.setText("");
    }
    public void clickBtn_div(View view){
        textView_result_1.setText((String)textView_result_1.getText()+btn_div.getText());
        mathOperation=4;
        if (textView_result_2.getText()=="") textView_result_2.setText(String.valueOf(Double.valueOf("0")));
        num_1 = Double.valueOf(String.valueOf(textView_result_2.getText()));
        textView_result_2.setText("");
    }
    public void clickBtn_percent(View view){
        textView_result_1.setText((String)textView_result_1.getText()+btn_percent.getText());
        mathOperation = 5;
        if (textView_result_2.getText()=="") textView_result_2.setText(String.valueOf(Double.valueOf("0")));
        num_1=Double.valueOf((String) textView_result_2.getText());
        Toast.makeText(MainActivity.this,"Сколько % от "+num_1+"?",Toast.LENGTH_SHORT).show();
        textView_result_2.setText("");
    }
    public void clickBtn_result(View view){

        if (mathOperation==1) {
            if (textView_result_2.getText()=="") num_2= Double.valueOf(0);
            else num_2=Double.valueOf(String.valueOf(textView_result_2.getText()));
            textView_result_2.setText(String.valueOf(Double.valueOf(num_1+num_2)));
            textView_result_1.setText((String)textView_result_1.getText()+"\n"+btn_result.getText()+(String) textView_result_2.getText()+"\n");
        }
        if (mathOperation==2){
            if (textView_result_2.getText()=="") num_2= Double.valueOf(0);
            else num_2=Double.valueOf(String.valueOf(textView_result_2.getText()));
            textView_result_2.setText(String.valueOf(Double.valueOf(num_1-num_2)));
            textView_result_1.setText((String)textView_result_1.getText()+"\n"+btn_result.getText()+(String) textView_result_2.getText()+"\n");
        }
        if (mathOperation==3){
            if (textView_result_2.getText()=="") num_2= Double.valueOf(0);
            else num_2=Double.valueOf(String.valueOf(textView_result_2.getText()));
            textView_result_2.setText(String.valueOf(Double.valueOf(num_1*num_2)));
            textView_result_1.setText((String)textView_result_1.getText()+"\n"+btn_result.getText()+(String) textView_result_2.getText()+"\n");
        }
        if (mathOperation==4){
            if (textView_result_2.getText()=="") num_2= Double.valueOf(0);
            else num_2=Double.valueOf(String.valueOf(textView_result_2.getText()));
            if (num_2==0) {
                Toast.makeText(MainActivity.this,"Запрещенная математическия операция: x/0",Toast.LENGTH_SHORT).show();
                textView_result_2.setText("");
            } else {
                textView_result_2.setText(String.valueOf(Double.valueOf(num_1/num_2)));
                textView_result_1.setText((String)textView_result_1.getText()+"\n"+btn_result.getText()+(String) textView_result_2.getText()+"\n");
            }
        }
        if (mathOperation==5){
            if (textView_result_2.getText()=="") num_2= Double.valueOf(0);
            else num_2=Double.valueOf(String.valueOf(textView_result_2.getText()));
            textView_result_2.setText(String.valueOf(Double.valueOf((num_1/100)*num_2)));
            textView_result_1.setText((String)textView_result_1.getText()+"\n"+btn_result.getText()+(String) textView_result_2.getText()+"\n");
        }
    }
    public void clickBtn_1divX(View view){
        if (textView_result_2.getText()=="") textView_result_2.setText(String.valueOf(Double.valueOf("0")));
        if (Double.valueOf((String)textView_result_2.getText())==0) Toast.makeText(MainActivity.this,"Запрещенная математическия операция: x/0",Toast.LENGTH_SHORT).show();
        else textView_result_2.setText(String.valueOf(1/(Double.valueOf((String)textView_result_2.getText()))));
    }
    public void clickBtn_sqr(View view){
        if (textView_result_2.getText()=="") {
            textView_result_2.setText(String.valueOf(Double.valueOf("0")));
            textView_result_1.setText(textView_result_1.getText()+"0²"+"\n="+textView_result_2.getText()+"\n");
            textView_result_2.setText(null);
        }else{
            textView_result_2.setText(String.valueOf(pow(Double.valueOf((String) textView_result_2.getText()),2)));
            textView_result_1.setText(textView_result_1.getText()+"²"+"\n="+textView_result_2.getText()+"\n");
            textView_result_2.setText(null);
        }
    }
    public void clickBtn_sqrt(View view){
        if (textView_result_2.getText()=="") textView_result_2.setText(String.valueOf(Double.valueOf("0")));
        if (Double.valueOf(String.valueOf(textView_result_2.getText()))<0) Toast.makeText(MainActivity.this,"Запрещенная математическия операция: √(-x)",Toast.LENGTH_SHORT).show();
        else textView_result_2.setText(String.valueOf(sqrt(Double.valueOf((String) textView_result_2.getText()))));
    }
    public void clickBtn_plus_minus(View view){
        if ((textView_result_2.getText()=="")||(Double.valueOf((String) textView_result_2.getText())==0)) Toast.makeText(MainActivity.this, "0 не могжет быть отрицательным", Toast.LENGTH_SHORT).show();
        else {
            textView_result_2.setText(String.valueOf(Double.valueOf((-1)*(Double.valueOf(String.valueOf(textView_result_2.getText()))))));
            textView_result_1.setText(textView_result_1.getText()+"*(-1)");
        }
    }
    public void clickBtn_C(View view){
        textView_result_2.setText(null);
        textView_result_1.setText(null);
        mathOperation=0;
        num_1= null;
        num_2= null;
    }


}