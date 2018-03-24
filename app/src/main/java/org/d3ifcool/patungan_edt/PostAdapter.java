package org.d3ifcool.patungan_edt;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class PostAdapter extends ArrayAdapter<Post> {

    public PostAdapter(@NonNull Context context, @NonNull List<Post> posts) {
        super(context, 0, posts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_timeline, parent, false);
        }

        Post currentPost = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_textview);
        titleTextView.setText(currentPost.getPostTitle());
        //titleTextView.setTypeface(null, Typeface.ITALIC);

        TextView dueDateTextView = (TextView) listItemView.findViewById(R.id.duedate_textview);
        dueDateTextView.setText("Due Date : 12/12/2017");

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price_textview);
        priceTextView.setText("Price : Rp 1.250.000");

        ImageView imgImageView = (ImageView) listItemView.findViewById(R.id.foto);
        imgImageView.setImageResource(currentPost.getImg());

        TextView detailsButton = (TextView) listItemView.findViewById(R.id.details_textview);
        detailsButton.setText("Details");

        return listItemView;
    }
}
