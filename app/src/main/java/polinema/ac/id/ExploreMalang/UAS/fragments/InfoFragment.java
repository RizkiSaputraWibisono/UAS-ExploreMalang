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
    TextView jarakInfo;
    TextView tiketInfo;
    TextView deskripsiInfo;


    List<Info> itemInfo = new ArrayList<>();

    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Info info = new Info("Coban Rondo",R.drawable.cobanrondo,"Jarak dari Malang Kota : 27 Km","Tiket Masuk : Rp. 25.000","Air Terjun Coban Rondo merupakan air terjun yang terletak di Kecamatan Pujon, Kota Batu, Kabupaten Malang, Jawa Timur. Air terjun ini mudah dijangkau oleh kendaraan umum. Akses yang paling mudah adalah melalui jalan raya dari Malang ke Batu dari sebelah timur atau dari Kediri ke Pare menuju Malang dari arah barat.");
        itemInfo.add(info);

        view = inflater.inflate(R.layout.fragment_info, container, false);

        recyclerView = view.findViewById(R.id.Info);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        infoAdapter = new InfoAdapter(getActivity(),itemInfo);
        recyclerView.setAdapter(infoAdapter);
        Toast.makeText(getActivity(), String.valueOf(itemInfo.size()), Toast.LENGTH_SHORT).show();
        return view;
    }

}
