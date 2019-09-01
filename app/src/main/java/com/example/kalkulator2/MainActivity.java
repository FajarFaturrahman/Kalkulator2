package com.example.kalkulator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnTambah, btnKurang, btnBagi, btnKali, btnSamaDengan, btnClear, btnKoma;

    TextView txtHasil;

    float mValue1, mValue2;

    boolean tambah, kurang, kali, bagi,angkaTerakhir,lastDot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnTambah = findViewById(R.id.btn_tambah);
        btnKurang = findViewById(R.id.btn_kurang);
        btnBagi = findViewById(R.id.btn_bagi);
        btnKali = findViewById(R.id.btn_kali);
        btnSamaDengan = findViewById(R.id.btn_samaDengan);
        btnClear = findViewById(R.id.btnAc);
        btnKoma = findViewById(R.id.btn_koma);
        txtHasil = findViewById(R.id.txtHasil);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnSamaDengan.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnKoma.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_0:
                    txtHasil.append("0");
                break;
            case R.id.btn_1:
                txtHasil.append("1");
                break;
            case R.id.btn_2:
                txtHasil.append("2");
                break;
            case R.id.btn_3:
                txtHasil.append("3");
                break;
            case R.id.btn_4:
                txtHasil.append("4");
                break;
            case R.id.btn_5:
                txtHasil.append("5");
                break;
            case R.id.btn_6:
                txtHasil.append("6");
                break;
            case R.id.btn_7:
                txtHasil.append("7");
                break;
            case R.id.btn_8:
                txtHasil.append("8");
                break;
            case R.id.btn_9:
                txtHasil.append("9");
                break;
            case R.id.btn_tambah:
                        txtHasil.append("+");
                        angkaTerakhir = false;
//                        tambah = true;
                break;
            case R.id.btn_kurang:

                    txtHasil.append("-");
                    angkaTerakhir = false;
//                    kurang = true;

                break;
            case R.id.btn_kali:

                    txtHasil.append("*");
                    angkaTerakhir = false;
//                    kali = true;

                break;
            case R.id.btn_bagi:

                    txtHasil.append("/");
                    angkaTerakhir = false;
//                    bagi = true;

                break;
            case R.id.btnAc:
                txtHasil.setText("");
                break;
            case R.id.btn_koma:

                    txtHasil.append(".");
                    angkaTerakhir = false;
                    lastDot = false;

                break;
            case R.id.btn_samaDengan:
                String txt = txtHasil.getText().toString();

                Expression expression = new ExpressionBuilder(txt).build();

                try {
                    double hasil =expression.evaluate();
                    txtHasil.setText(Double.toString(hasil));
                    lastDot = true;
                }catch (ArithmeticException ae){
                    txtHasil.setText("Error");
                    angkaTerakhir = true;
                }
                break;
        }
    }

//    private void samaDengan(){
//        if(angkaTerakhir){
//
//        }
//    }
}
