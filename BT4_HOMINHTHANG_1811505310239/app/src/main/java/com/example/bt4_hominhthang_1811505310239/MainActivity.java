package com.example.bt4_hominhthang_1811505310239;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtuser, edtpassword;
    Button btndangnhap, btndangky;
    String ten,mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog=new Dialog(MainActivity.this);
                dialog.setTitle("HỘP THOẠI");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.customdialog);
                EditText edttk=(EditText)dialog.findViewById(R.id.edttk);
                EditText edtmk=(EditText)dialog.findViewById(R.id.edtmk);
                Button btnhuy=(Button)dialog.findViewById(R.id.buttonhuy);
                Button btndongy=(Button)dialog.findViewById(R.id.buttondongy);
                btndongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten=edttk.getText().toString().trim();
                        mk=edtmk.getText().toString().trim();
                        edtuser.setText(ten);
                        edtmk.setText(mk);
                        dialog.cancel();
                    }
                });
                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();

            }
        });
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtuser.getText().length()!=0&&edtpassword.getText().length()!=0){
                    if(edtuser.getText().toString().equals(ten)&&edtpassword.getText().toString().equals(mk)){
                        Toast.makeText(MainActivity.this,"BẠN ĐÃ ĐĂNGN NHẬP THÀNH CÔNG",Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }
                    else
                    if(edtuser.getText().toString().equals("thang")&&edtpassword.getText().toString().equals("123")){
                        Toast.makeText(MainActivity.this,"BẠN ĐÃ ĐĂNGN NHẬP THÀNH CÔNG",Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this,"BẠN ĐÃ ĐĂNGN NHẬP THẤT BẠI",Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"HẢY ĐIỀN ĐỦ THÔNG TIN",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void Anhxa(){
        edtuser=(EditText) findViewById(R.id.edittextdangnhap);
        edtpassword=(EditText) findViewById(R.id.edittextmatkhau);
        btndangnhap=(Button) findViewById(R.id.buttondangnhap);
        btndangky=(Button) findViewById(R.id.buttondangky);
    }
}