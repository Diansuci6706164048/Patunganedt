package org.d3ifcool.patungan_edt;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Font font;
    TextView titleTextView, mottoTextView;
    //Typeface coquette, gothamRoundedLight;
    Button registerButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.app.ActionBar actionBar = this.getActionBar();
        actionBar.hide();

        // create font object
        font = new Font();

        // add fonts
        font.addFont(new Font(
                Typeface.createFromAsset(getAssets(), "fonts/coquette.ttf"), "coquette"
        ));
        font.addFont(new Font(
                Typeface.createFromAsset(getAssets(), "fonts/GothamRoundedLight.ttf"), "gothamRoundedLight"
        ));

        titleTextView  = (TextView) findViewById(R.id.title_textview);
        mottoTextView = (TextView) findViewById(R.id.motto_textview);
        registerButton = (Button) findViewById(R.id.register_button);
        loginButton = (Button) findViewById(R.id.login_button);

        titleTextView.setTypeface(font.getFont("coquette"));
        mottoTextView.setTypeface(font.getFont("gothamRoundedLight"), Typeface.BOLD);

        /*
            set on click for register button
         */
        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent regIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(regIntent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}
