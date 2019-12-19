package polinema.ac.id.ExploreMalang.UAS.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import polinema.ac.id.ExploreMalang.R;
import polinema.ac.id.ExploreMalang.UAS.models.Kategori;
import polinema.ac.id.ExploreMalang.UAS.adapters.KategoriAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class Kategori2Fragment extends Fragment {


    RecyclerView recyclerView;
    View view;
    KategoriAdapter kategoriAdapter;

    List<Kategori> itemKategori = new ArrayList<>();
    public Kategori2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Kategori kategori = new Kategori("Air Terjun / Coban","Air Terjun yang harus kamu explore!",R.drawable.waterfall);
        itemKategori.add(kategori);

        kategori = new Kategori("Pantai","Pantai yang harus kamu explore!",R.drawable.sun_umbrella);
        itemKategori.add(kategori);

        kategori = new Kategori("Situs Budaya / Bersejarah","Situs Bersejarah yang harus kamu explore!",R.drawable.antique_building);
        itemKategori.add(kategori);

        kategori = new Kategori("Family Spot","Taman, Alun-Alun yang harus kamu explore!",R.drawable.park);
        itemKategori.add(kategori);

        kategori = new Kategori("Kekinian","Spot Kekinian yang harus kamu explore!",R.drawable.trend);
        itemKategori.add(kategori);

        kategori = new Kategori("Waterpark","Tempat Renang yang harus kamu explore!",R.drawable.water_slide);
        itemKategori.add(kategori);

        kategori = new Kategori("Sumber Mata Air","Spot Sumber yang harus kamu explore!",R.drawable.therapy);
        itemKategori.add(kategori);

        kategori = new Kategori("Taman Wisata Rekreasi","Education Park yang harus kamu explore!",R.drawable.circus);
        itemKategori.add(kategori);

        view = inflater.inflate(R.layout.fragment_kategori2, container, false);

        recyclerView = view.findViewById(R.id.Kategori);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        kategoriAdapter = new KategoriAdapter(getActivity(),itemKategori);
        recyclerView.setAdapter(kategoriAdapter);
        Toast.makeText(getActivity(), String.valueOf(itemKategori.size()), Toast.LENGTH_SHORT).show();

        return view;
    }

}
