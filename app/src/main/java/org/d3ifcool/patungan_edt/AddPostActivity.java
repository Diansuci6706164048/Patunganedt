package org.d3ifcool.patungan_edt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class AddPostActivity extends AppCompatActivity {

    private EditText postTitle, datePostEditText, priceEditText;
    private Button addPostButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);


//        postTitle = (EditText) findViewById(R.id.posttitle_edittext);
//        datePostEditText = (EditText) findViewById(R.id.date_edittext);
//        priceEditText = (EditText) findViewById(R.id.price_edittext);
//        addPostButton = (Button) findViewById(R.id.addpost_button);
//
//        final String title = postTitle.getText().toString();
//        final String datePost = datePostEditText.getText().toString();
//        final long price = Long.parseLong(priceEditText.getText().toString());
//        final int img = R.drawable.userphoto;
//
//        addPostButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Post post = new Post();
//                post.addPost(title, price, datePost, img);
//            }
//        });


    }
}
