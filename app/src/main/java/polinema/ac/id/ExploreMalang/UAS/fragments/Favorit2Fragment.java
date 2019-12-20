package polinema.ac.id.ExploreMalang.UAS.fragments;


import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import polinema.ac.id.ExploreMalang.R;
import polinema.ac.id.ExploreMalang.UAS.adapters.FavoritAdapter;
import polinema.ac.id.ExploreMalang.UAS.models.Request;

/**
 * A simple {@link Fragment} subclass.
 */
public class Favorit2Fragment extends Fragment {
    private List<Request> itemRequest;
    private DatabaseReference database;
    private RecyclerView recyclerView;
    private FavoritAdapter favoritAdapter;


    public Favorit2Fragment() {
        // Required empty public constructo
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_favorit2, container, false);

        database = FirebaseDatabase.getInstance().getReference();
        recyclerView = view.findViewById(R.id.Favorit);

        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayout);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        database.child("Colection").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                itemRequest = new ArrayList<>();
                if (dataSnapshot.exists()) {
                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        Request r = ds.getValue(Request.class);
                        r.setKey(ds.getKey());
                        itemRequest.add(r);
                    }
                }
//
                FavoritAdapter pm = new FavoritAdapter(getActivity(), itemRequest);
                recyclerView.setAdapter(pm);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        return view;
    }
}


