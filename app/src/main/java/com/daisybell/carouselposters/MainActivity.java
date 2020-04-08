package com.daisybell.carouselposters;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button bt_back, bt_next, bt_like;
    ImageView iv_poster;
    boolean like = false;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

       final int posters[] = {R.drawable.sao_1, R.drawable.sao_2, R.drawable.sao_3,
               R.drawable.sao_4, R.drawable.sao_5, R.drawable.sao_6, R.drawable.sao_7,
               R.drawable.sao_8, R.drawable.sao_9, R.drawable.sao_10};

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i == 0){
                    i = 10;
                }
                i--;
                iv_poster.setImageResource(posters[i]);
            }
        });

       bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(i == 9){
                        i = -1;
                    }
                    i++;
                    iv_poster.setImageResource(posters[i]);
            }
        });

        bt_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!like)
                    bt_like.setBackgroundColor(getResources().getColor(R.color.like));
                else
                    bt_like.setBackgroundColor(getResources().getColor(R.color.no_like));
                like = !like;
            }
        });
    }

    public void init() {
        bt_back = findViewById(R.id.bt_back);
        bt_like = findViewById(R.id.bt_like);
        bt_next = findViewById(R.id.bt_next);
        iv_poster = findViewById(R.id.iv_poster);
    }
}
