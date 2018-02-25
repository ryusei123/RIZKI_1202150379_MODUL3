package com.example.kyky.rizki_1202150379_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    //deklarasi variable yang akan digunakan
    Button LogIn;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //set title bar menjadi log in
        setTitle("Log In");

        //mengakses edit text dan button yang terdapat pada layout
        LogIn = (Button) findViewById(R.id.buttonLogin);
        user = (EditText) findViewById(R.id.editUser);
        pass = (EditText) findViewById(R.id.editPass);
    }

    //method yang akan dieksekusi ketika button log in di klik
    public void login(View view) {
        //mendapatkan inputan dari user berupa username dan password kemudian merubahnya menjadi string
        String usr = user.getText().toString();
        String pwd = pass.getText().toString();

        //kondisi ketika username dan password yang dimasukkan benar
        if (usr.equals("EAD") && pwd.equals("MOBILE")) {
            //berpindah ke Daftar Menu
            startActivity(new Intent(Login.this, DaftarMenu.class));
            //akan menampilkan toast bahwa login telah berhasil dilakukan
            Toast.makeText(this, "Login Succeed!", Toast.LENGTH_SHORT).show();

            //kondisi ketika field password dan username tidak di isi
        } else if (usr.isEmpty() && pwd.isEmpty()) {
            //menampilkan toast bawha login telah gagal
            Toast.makeText(this, "Login Failed! Please complete the field!", Toast.LENGTH_LONG).show();

            //kondisi ketika username dan password yang dimasukkan tidak cocok
        } else if (!usr.equals("EAD") && !pwd.equals("MOBILE")) {
            //akan menampilkan toast bawha login gagal
            Toast.makeText(this, "Login Failed! Password and username not match", Toast.LENGTH_LONG).show();
        }
    }
}
