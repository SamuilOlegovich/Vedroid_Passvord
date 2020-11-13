package com.samuilolegovich.vedroid_loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


// при правиьном пароле и логине меняем картинку
public class MainActivity extends AppCompatActivity {
    private static ImageView imageView;
    private EditText password;
    private EditText email;
    private Button button;

    private static final String emailTxt = "sos@me.com";
    private static final String passwordTxt = "12345";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    private void login() {
        imageView = (ImageView) findViewById(R.id.imageView2);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        button = (Button) findViewById(R.id.enter);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (String.valueOf(email.getText()).equals(emailTxt)
                                && String.valueOf(password.getText()).equals(passwordTxt)) {
                            imageView.setImageResource(R.drawable.q3);
                        } else if (String.valueOf(email.getText()).equals("")
                                && String.valueOf(password.getText()).equals("")) {
                            imageView.setImageResource(R.drawable.q2);
                        } else {
                            imageView.setImageResource(R.drawable.q4);
                            new TimerIm(imageView).start();

                        }
                    }
                }
        );
    }

    public static void end() {
        imageView.setImageResource(R.drawable.q2);
    }
}