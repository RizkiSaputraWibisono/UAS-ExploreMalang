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
        Bundle b = getArguments();
        int pos1 = b.getInt("num");
        int pos = b.getInt("posit");

        if(pos1 == 0){
            if (pos == 0){
                Info info = new Info("Coban Rondo",R.drawable.cobanrondo,"Jarak dari Malang Kota : 27 Km","Tiket Masuk : Rp. 25.000","Air Terjun Coban Rondo merupakan air terjun yang terletak di Kecamatan Pujon, Kota Batu, Kabupaten Malang, Jawa Timur. Air terjun ini mudah dijangkau oleh kendaraan umum. Akses yang paling mudah adalah melalui jalan raya dari Malang ke Batu dari sebelah timur atau dari Kediri ke Pare menuju Malang dari arah barat.");
                itemInfo.add(info);
            }

            else if (pos == 1){
                Info info = new Info("Coban Jodo",R.drawable.cobanjodo,"Jarak dari Malang Kota : 25 Km","Tiket Masuk : Rp. 10.000","Coban jodo terletak di desa bendolawang kec.jabung kab.malang atau kita bisa mengunjungi coban yang satu ini melewati desa benjor kec.tumpang kab.malang\n" +
                        "\n" +
                        "Untuk kali ini saya akan menceritakan rute menuju coban jodo melewati desa bendolawang.\n" +
                        "\n" +
                        "Untuk rute menuju tempat ini bila dari malang kota ambil arah menuju tumpang bila belum tau arah bisa cek di google maps dan arahkan ke desa bendolawang kec.tumpang");
                itemInfo.add(info);
            }

            if (pos == 2){
                Info info = new Info("Coban Pelangi",R.drawable.cobanpelangi,"Jarak dari Malang Kota : 27 Km","Tiket Masuk : Rp. 5.000","Rute menuju air terjun coban pelangi dari kota malang langsung  menuju ke wilayah Tumpang, perjalanan diteruskan ke arahDesa Gubug Klakah. Diharapakan pengunjung berhari-hati karena medan jalan menanjak dan licin.  Air terjun coban pelangi  berlokasi sebelum masuk persimpangan desa Jemplang . yaitu jalur untuk ke Gunung Semeru dan Gunung Bromo. Setelah pengunjung melalui Desa Gubuk Klakah disebelah kanan jalan sudah terdapat papan bertulisan “Air Terjun Coba Pelangi”.");
                itemInfo.add(info);
            }
        }

        view = inflater.inflate(R.layout.fragment_info, container, false);

        recyclerView = view.findViewById(R.id.Info);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        infoAdapter = new InfoAdapter(getActivity(),itemInfo);
        recyclerView.setAdapter(infoAdapter);
        Toast.makeText(getActivity(), String.valueOf(pos1), Toast.LENGTH_SHORT).show();
        return view;
    }

}
