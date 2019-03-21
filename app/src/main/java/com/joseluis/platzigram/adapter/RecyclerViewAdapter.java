package com.joseluis.platzigram.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.joseluis.platzigram.R;
import com.joseluis.platzigram.model.PictureCard;
import com.joseluis.platzigram.view.PictureDetailActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private ArrayList<PictureCard> pictures;
    private int resource;
    private Activity activity;

    public RecyclerViewAdapter(ArrayList<PictureCard> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(resource, viewGroup, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {
        PictureCard pictureCard = pictures.get(i);

        recyclerViewHolder.textUsername.setText(pictureCard.getCardusername());
        recyclerViewHolder.textTime.setText(pictureCard.getCardLikeTime());
        recyclerViewHolder.textLikeNumber.setText(pictureCard.getCardLikeNumber());
        //
        Picasso.with(
                activity).load(pictureCard.getCardimage()).into(recyclerViewHolder.imageView);
        recyclerViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, PictureDetailActivity.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textUsername;
        private TextView textFirstWord;
        private TextView textTime;
        private TextView textLikeNumber;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imagepicture_card);
            textUsername = (TextView) itemView.findViewById(R.id.card_userName);
            textTime = (TextView) itemView.findViewById(R.id.card_timeLike);
            textLikeNumber = (TextView) itemView.findViewById(R.id.card_likeNumberCard);
        }
    }
}
