package polinema.ac.id.ExploreMalang.UAS.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import polinema.ac.id.ExploreMalang.R;
import polinema.ac.id.ExploreMalang.UAS.models.Detail;
import polinema.ac.id.ExploreMalang.UAS.adapters.DetailAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    RecyclerView recyclerView;
    View view;
    DetailAdapter detailAdapter;

    TextView namaDetail;
    ImageView gambarDetail;

    List<Detail> itemDetail = new ArrayList<>();

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Detail detail = new Detail("Coban Rondo",R.drawable.cobanrondo);
        itemDetail.add(detail);
        detail = new Detail("Coban Jodo",R.drawable.cobanjodo);
        itemDetail.add(detail);
        detail = new Detail("Coban Pelangi",R.drawable.cobanpelangi);
        itemDetail.add(detail);
        detail = new Detail("Coban Glotak",R.drawable.cobanglotak);
        itemDetail.add(detail);
        detail = new Detail("Coban Sumberpitu",R.drawable.sumberpitu);
        itemDetail.add(detail);

        view = inflater.inflate(R.layout.fragment_detail, container, false);

//        namaDetail = view.findViewById(R.id.gambarDetail);
//        namaDetail


        recyclerView = view.findViewById(R.id.Detail);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        detailAdapter = new DetailAdapter(getActivity(),itemDetail);
        recyclerView.setAdapter(detailAdapter);
        Toast.makeText(getActivity(), String.valueOf(itemDetail.size()), Toast.LENGTH_SHORT).show();

        return view;
    }

}
