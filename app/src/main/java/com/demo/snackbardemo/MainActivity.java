package com.demo.snackbardemo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private View rootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootLayout = findViewById(R.id.root_layout);
        //Show Toast
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Co loi xay ra", Toast.LENGTH_LONG).show();
            }
        });
        //Show Simple SnackBar
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(rootLayout, "Da co loi xay ra", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });
        //Show SnackBar with callback
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(rootLayout, "Hay click vao nut bam", Snackbar.LENGTH_LONG).setAction("Buttton", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(rootLayout, "Button da duoc click", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
                snackbar.show();
            }
        });
    }
}
