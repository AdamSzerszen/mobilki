package com.example.adam.akproj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by Adam on 2020-11-05.
 */
public class ImageDetail extends Activity {

    private RatingBar ratingBar;
    private View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.big_photo);

        Intent intentes2 = getIntent();
        final int position = (int) intentes2.getExtras().get("id");

        ImageView iv = (ImageView)findViewById(R.id.imageView);
        iv.setImageResource(ImageAdapter.Images[position]);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        Button button = (Button)findViewById(R.id.button);
        TextView text = (TextView)findViewById(R.id.textView);

        text.setText("Description: "+ImageAdapter.description[position]);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                Votes.getInstance().setOnPosition(position,rating);
                ratingBar.setEnabled(false);


            }
        });

        if(Votes.getInstance().getRatePos(position)!=0.0)
        {
            ratingBar.setEnabled(false);
            ratingBar.setRating(Votes.getInstance().getRatePos(position));
            button.setEnabled(false);
        }
        else
        {
            ratingBar.setEnabled(true);
            button.setEnabled(true);
        }

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();

            }

        });


    }
}
