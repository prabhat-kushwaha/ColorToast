package com.prabhatkuswaha.colortoast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.prabhatkuswaha.cutomtoast.Constants;
import com.prabhatkuswaha.cutomtoast.ToastMessage;

import static com.prabhatkuswaha.cutomtoast.Constants.TOP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.btSuccessMessage)).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                ToastMessage.showSuccessMessage(getApplicationContext(), "hello", Toast.LENGTH_LONG);
            }
        });
        ((Button) findViewById(R.id.btFailureMessage)).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                ToastMessage.showFailureMessage(getApplicationContext(), "hello", Toast.LENGTH_LONG);
            }
        });
        ((Button) findViewById(R.id.btDoneMessage)).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                ToastMessage.showDoneMessage(getApplicationContext(), "hello", Toast.LENGTH_LONG);
            }
        });
        ((Button) findViewById(R.id.btWarningMessage)).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                ToastMessage.showWaringMessage(getApplicationContext(), "hello", Toast.LENGTH_LONG);
            }
        });
        ((Button) findViewById(R.id.btErrorMessage)).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                ToastMessage.showErrorMessage(getApplicationContext(), "hello", Toast.LENGTH_LONG);
            }
        });

        ((Button) findViewById(R.id.btDoneMessage)).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                ToastMessage.showDoneMessage(getApplicationContext(), "hello", Toast.LENGTH_LONG);
            }
        });

        ((Button) findViewById(R.id.btCustomeMessage)).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                ToastMessage.showCustomMessage(getApplicationContext(), "hello", Toast.LENGTH_LONG, getColor(R.color.colorPrimaryDark), getResources().getDrawable(R.drawable.ic_done_black_24dp), TOP);
            }
        });

    }
}
