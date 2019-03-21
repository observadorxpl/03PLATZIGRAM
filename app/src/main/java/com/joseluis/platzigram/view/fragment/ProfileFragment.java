package com.joseluis.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joseluis.platzigram.R;
import com.joseluis.platzigram.adapter.RecyclerViewAdapter;
import com.joseluis.platzigram.model.PictureCard;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.picture_recyclerview_profile);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(buildPictures(), R.layout.cardview_picture, getActivity());
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }
    public ArrayList<PictureCard> buildPictures(){
        ArrayList<PictureCard> pictures = new ArrayList<>();
        pictures.add(new PictureCard("https://www.educationquizzes.com/library/KS3-Geography/river-1-1.jpg", "Uriel Vargas", "10 días", "15 Me gusta"));
        pictures.add(new PictureCard("https://mott.pe/noticias/wp-content/uploads/2016/11/Janette-Asche-8.jpg", "Pedro Picapiedra", "1 días", "25 Me gusta"));
        pictures.add(new PictureCard("https://farm5.staticflickr.com/4411/36845314562_55ca9d2ff6.jpg", "Anna Lucia", "14 días", "21 Me gusta"));
        return pictures;
    }

}
