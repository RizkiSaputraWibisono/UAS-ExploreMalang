package polinema.ac.id.ExploreMalang.UAS.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import polinema.ac.id.ExploreMalang.R;
import polinema.ac.id.ExploreMalang.UAS.activities.Kategori;
import polinema.ac.id.ExploreMalang.UAS.adapters.KategoriAdapter;

public class KategoriFragment extends Fragment {

    RecyclerView recyclerView;
    View view;
    KategoriAdapter kategoriAdapter;

    List<Kategori> itemKategori = new ArrayList<>();

    public KategoriFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Kategori kategori = new Kategori();
        kategori.setGambarKategori(R.drawable.sun_umbrella);
        kategori.setNamaKategori("Pantai");
        kategori.setKetKategori("Pantai yang harus kamu explore!");

        itemKategori.add(kategori);
        view = inflater.inflate(R.layout.fragment_favorit, container, false);

        recyclerView = view.findViewById(R.id.Kategori);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        kategoriAdapter = new KategoriAdapter(getActivity(),itemKategori);
        recyclerView.setAdapter(kategoriAdapter);

        return view;
    }

}
