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
import polinema.ac.id.ExploreMalang.UAS.adapters.DetailAdapter;
import polinema.ac.id.ExploreMalang.UAS.adapters.InfoAdapter;
import polinema.ac.id.ExploreMalang.UAS.models.Detail;
import polinema.ac.id.ExploreMalang.UAS.models.Info;


public class InfoFragment extends Fragment {


    RecyclerView recyclerView;
    View view;
    InfoAdapter infoAdapter;

    TextView namaInfo;
    ImageView gambarInfo;

    List<Info> itemInfo = new ArrayList<>();

    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Info info = new Info("Coban Rondo",R.drawable.cobanrondo);
        itemInfo.add(info);
        info = new Info("Coban Jodo",R.drawable.cobanjodo);
        itemInfo.add(info);

        view = inflater.inflate(R.layout.fragment_detail, container, false);

//        namaDetail = view.findViewById(R.id.gambarDetail);
//        namaDetail


        recyclerView = view.findViewById(R.id.Detail);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        infoAdapter = new InfoAdapter(getActivity(),itemInfo);
        recyclerView.setAdapter(infoAdapter);
        Toast.makeText(getActivity(), String.valueOf(itemInfo.size()), Toast.LENGTH_SHORT).show();
        return view;
    }

}
