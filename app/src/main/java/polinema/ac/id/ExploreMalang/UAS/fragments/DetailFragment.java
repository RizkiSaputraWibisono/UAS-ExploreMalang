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

        Bundle b = getArguments();
        int pos = b.getInt("pos");

        if(pos == 0){
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
        }
        else if(pos == 1){
            Detail detail = new Detail("Pantai Teluk Asmoro",R.drawable.telukasmara);
            itemDetail.add(detail);
            detail = new Detail("Pantai Balekambang",R.drawable.blk);
            itemDetail.add(detail);
            detail = new Detail("Pantai Ngeliyep",R.drawable.ngeliyep);
            itemDetail.add(detail);
            detail = new Detail("Pantai Sendang Biru",R.drawable.sendangbiru);
            itemDetail.add(detail);
            detail = new Detail("Pantai Ngudel",R.drawable.ngudel);
            itemDetail.add(detail);
        }

        else if(pos == 2){
            Detail detail = new Detail("Museum Angkut",R.drawable.museumangkut);
            itemDetail.add(detail);
            detail = new Detail("Museum Brawijaya",R.drawable.brawijaya);
            itemDetail.add(detail);
            detail = new Detail("Candi Singosari",R.drawable.candisingasari);
            itemDetail.add(detail);
            detail = new Detail("Candi Jawar Ombo",R.drawable.jawarombo);
            itemDetail.add(detail);
            detail = new Detail("Museum Omah Munir",R.drawable.munir);
            itemDetail.add(detail);
        }

        else if(pos == 3){
            Detail detail = new Detail("Alun-Alun Kota Malang",R.drawable.alun);
            itemDetail.add(detail);
            detail = new Detail("Taman Krida Budaya",R.drawable.kridabudaya);
            itemDetail.add(detail);
            detail = new Detail("Taman Buring",R.drawable.buring);
            itemDetail.add(detail);
            detail = new Detail("Taman Merbabu / Nivea",R.drawable.nivea);
            itemDetail.add(detail);
            detail = new Detail("Hutan Kota Malabar",R.drawable.malabar);
            itemDetail.add(detail);
        }

        else if(pos == 4){
            Detail detail = new Detail("Wisata Pujon Kidul",R.drawable.pujon);
            itemDetail.add(detail);
            detail = new Detail("Taman Langit G.Banyak",R.drawable.banyak);
            itemDetail.add(detail);
            detail = new Detail("Kampung Warna-Warni Jodipan",R.drawable.jodipan);
            itemDetail.add(detail);
            detail = new Detail("Batu Flower Garden",R.drawable.bfg);
            itemDetail.add(detail);
            detail = new Detail("Bukit Kuneer",R.drawable.kuneer);
            itemDetail.add(detail);
        }

        else if(pos == 5){
            Detail detail = new Detail("Hawai Waterpark",R.drawable.hawai);
            itemDetail.add(detail);
            detail = new Detail("Kolam Renang Sengkaling",R.drawable.sengkaling);
            itemDetail.add(detail);
            detail = new Detail("Kusuma Waterpark",R.drawable.kusuma);
            itemDetail.add(detail);
            detail = new Detail("Kolam Renang Selecta",R.drawable.selecta);
            itemDetail.add(detail);
            detail = new Detail("Waterpark Tirta Sani",R.drawable.tirtasani);
            itemDetail.add(detail);
        }

        else if(pos == 6){
            Detail detail = new Detail("Sumber Jenon",R.drawable.jenon);
            itemDetail.add(detail);
            detail = new Detail("Sumber Maron",R.drawable.maron);
            itemDetail.add(detail);
            detail = new Detail("Sumber Sirah",R.drawable.sirah);
            itemDetail.add(detail);
            detail = new Detail("Sumber Pitu",R.drawable.pitu);
            itemDetail.add(detail);
            detail = new Detail("Sumber Krabyakan",R.drawable.krabyakan);
            itemDetail.add(detail);
        }

        else if(pos == 7){
            Detail detail = new Detail("Jatim Park 1",R.drawable.jatim1);
            itemDetail.add(detail);
            detail = new Detail("Eco Green Park",R.drawable.ecogreen);
            itemDetail.add(detail);
            detail = new Detail("Kusuma Agro Wisata",R.drawable.kusuma);
            itemDetail.add(detail);
            detail = new Detail("Bunga Arboretum",R.drawable.bunga);
            itemDetail.add(detail);
            detail = new Detail("Batu Secret Zoo",R.drawable.secretzoo);
            itemDetail.add(detail);
        }

        view = inflater.inflate(R.layout.fragment_detail, container, false);

        recyclerView = view.findViewById(R.id.Detail);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        detailAdapter = new DetailAdapter(getActivity(),itemDetail, pos);
        recyclerView.setAdapter(detailAdapter);
        Toast.makeText(getActivity(), "Detail " + String.valueOf(pos), Toast.LENGTH_SHORT).show();

        return view;
    }

}
