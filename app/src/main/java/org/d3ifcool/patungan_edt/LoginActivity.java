package org.d3ifcool.patungan_edt;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class LoginActivity extends AppCompatActivity {

    TextView loginTitleTextView, forgotPasswordTextView;
    Typeface gothamRounded, gothamRoundedBook, coquette;
    EditText emailEditText, passwordEditText;
    private String username = "raflysyam", password="123123";
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginTitleTextView = (TextView) findViewById(R.id.loginTitle_textview);
        emailEditText = (EditText) findViewById(R.id.email_editText);
        passwordEditText = (EditText) findViewById(R.id.password_editText);
        forgotPasswordTextView = (TextView) findViewById(R.id.forgot_password_textview);
        loginButton = (Button) findViewById(R.id.login_button);


        /*
            load custom fonts from assets
         */
        gothamRounded = Typeface.createFromAsset(getAssets(), "fonts/GothamRoundedMedium.ttf");
        gothamRoundedBook = Typeface.createFromAsset(getAssets(), "fonts/GothamRoundedBook.ttf");
        coquette = Typeface.createFromAsset(getAssets(), "fonts/coquette.ttf");


        /*
            set element with custom fonts.
         */
        emailEditText.setTypeface(gothamRoundedBook);
        passwordEditText.setTypeface(gothamRoundedBook);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameInputed = emailEditText.getText().toString();
                String passwordInputed = passwordEditText.getText().toString();
                if(usernameInputed.equals(username) && passwordInputed.equals(password)) {
                    Intent dashboardIntent = new Intent(LoginActivity.this, DashboardActivity.class);
                    startActivity(dashboardIntent);
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid Username / Password!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}

