package org.d3ifcool.patungan_edt;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class RegisterActivity extends AppCompatActivity {

    TextView emailNotifHintTextView;
    EditText emailEditText, fullNameEditText, passwordEditText;
    Button nextStepButton;
    Typeface gothamRounded;
//    FirebaseAuth mAuth;

//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        updateUI(currentUser);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Get Firebase auth instance
  //      mAuth = FirebaseAuth.getInstance();

        emailNotifHintTextView = (TextView) findViewById(R.id.emailNotifHint_textview);
        emailEditText = (EditText) findViewById(R.id.email_editText);
        fullNameEditText = (EditText) findViewById(R.id.fullname_editText);
        passwordEditText = (EditText) findViewById(R.id.password_editText);

        gothamRounded = Typeface.createFromAsset(getAssets(), "fonts/GothamRoundedLight.ttf");

        emailEditText.setTypeface(gothamRounded, Typeface.BOLD);
        fullNameEditText.setTypeface(gothamRounded, Typeface.BOLD);
        passwordEditText.setTypeface(gothamRounded, Typeface.BOLD);



    }

    public void makeUser(View view) {
        Toast.makeText(RegisterActivity.this, "User Created Successfully!",
                Toast.LENGTH_LONG).show();
    }
}
