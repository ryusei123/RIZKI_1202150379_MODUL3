package com.example.kyky.rizki_1202150379_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



        //inisialisasi waktu selama 3 detik
        private static int splashInterval = 3000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_main);

            //menjadwalkan kapan di eksekusi dan lama penundaan sampai runnable di eksekusi
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //berpindah dari splashscreen ke menu utama
                    startActivity(new Intent(MainActivity.this, Login.class));
                    //menampilkan toast
                    Toast.makeText(MainActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();
                    finish();
                }
            },splashInterval);

        }
    }
