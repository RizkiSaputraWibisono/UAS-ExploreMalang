package polinema.ac.id.ExploreMalang.UAS.fragments;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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
    Button button3;


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

        int st = b.getInt("status");
        int gb = b.getInt("img");
        String nm = b.getString("name");
        String jrk = b.getString("jarak");
        String tkt = b.getString("tiket");


        if(st == 1){
            Info inf = new Info();
            inf.setGambarInfo(gb);
            inf.setNamaInfo(nm);
            inf.setJarakInfo(jrk);
            inf.setTiketInfo(tkt);
            itemInfo.add(inf);
        }
        else{
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

                else if (pos == 2){
                    Info info = new Info("Coban Pelangi",R.drawable.cobanpelangi,"Jarak dari Malang Kota : 32 Km","Tiket Masuk : Rp. 5.000","Rute menuju air terjun coban pelangi dari kota malang langsung  menuju ke wilayah Tumpang, perjalanan diteruskan ke arahDesa Gubug Klakah. Diharapakan pengunjung berhari-hati karena medan jalan menanjak dan licin.  Air terjun coban pelangi  berlokasi sebelum masuk persimpangan desa Jemplang . yaitu jalur untuk ke Gunung Semeru dan Gunung Bromo. Setelah pengunjung melalui Desa Gubuk Klakah disebelah kanan jalan sudah terdapat papan bertulisan “Air Terjun Coba Pelangi”.");
                    itemInfo.add(info);
                }

                else if (pos == 3){
                    Info info = new Info("Coban Glotak",R.drawable.cobanglotak,"Jarak dari Malang Kota : 15-20 Km","Tiket Masuk : Rp. 5.000","Cara untuk menuju lokasi air terjun Coban Glotak ini tidaklah terlalu sulit. Lokasinya sendiri memiliki jarak tempuh yakni sekitar 15 km ke arah barat menuju Kota Malang. Atau kurang lebih sekitar 4 km dari Desa Bedalisodo dengan kondisi jalanan yang cukup kurang bagus (sebagian ada yang makadam dan sebagian lagi berupa tanah liat).");
                    itemInfo.add(info);
                }

                else if (pos == 4){
                    Info info = new Info("Coban Sumberpitu",R.drawable.sumberpitu,"Jarak dari Malang Kota : 27,3 Km","Tiket Masuk : Rp. 10.000","Air terjun Sumber Pitu ini bisa dibilang masih begitu alami serta lokasinya agak tersembunyi di tengah hutan. Masyarakat Pujon Kidul sendiri biasa menyebut air terjun di Malang ini dengan Sumber Pitu atau air terjun Tujuh. Cara menuju Coban Gerojokan Pitu atau nama lain Sumber Pitu ini adalah searah dengan jalur menuju menuju Coban Rondo. Yaitu melewati jalan utama Malang – Jombang – Kediri. Ikuti saja jalur tadi hingga kalian melihat ada sebuah pertigaan jalan di sebelah utara Patung Sapi Pujon. Persimpangan itu adalah jalur masuk menuju Dusun Tulungrejo (Desa Pujon Kidul), tempat dimana Coban Gerojokan Pitu berada.");
                    itemInfo.add(info);
                }
            }

            else if (pos1 == 1){
                if (pos == 0){
                    Info info = new Info("Pantai Teluk Asmara",R.drawable.asmara4,"Jarak dari Malang Kota : 70 Km","Tiket Masuk : Rp. 10.000","Pantai ini terletak di Desa Tambakrejo, Kecamatan Sumbermanjing Wetan, Kabupaten Malang, Provinsi Jawa Timur. Kalau dari kota Malang, Pantai ini berjarak sekitar 73 kilometer ke Selatan. Untuk kesana dibutuhkan waktu perjalanan sekitar 3 hingga 4 jam perjalanan.\n" +
                            "\n" +
                            "Walaupun berdekatan dengan Pantai Goa Cina, anda akan melewati jalan yang relatif jauh jika mengikuti jalur ke Pantai Goa Cina. Dari kota Malang, ambil jalan menuju Selatan ke Kecamatan Bululawang. Kemudian pergi ke pertigaan tempat Pabrik Gula Krebet. Dari sini, lanjutkan perjalanan ke Pantai Sendang Biru.");
                    itemInfo.add(info);
                } else if (pos == 1){
                    Info info = new Info("Pantai Balekambang",R.drawable.blk,"Jarak dari Malang Kota : 59 Km","Tiket Masuk : Rp. 15.000","Pantai Balekambang adalah sebuah pantai di pesisir selatan yang terletak di tepi Samudera Indonesia secara administratif masuk wilayah Dusun Sumber Jambe, Desa Srigonco, Kecamatan Bantur, Kabupaten Malang, Jawa Timur dan merupakan salah satu wisata andalan Kabupaten Malang sejak 1985 hingga kini");
                    itemInfo.add(info);
                } else if (pos == 2){
                    Info info = new Info("Pantai Ngliyep",R.drawable.ngeliyep,"Jarak dari Malang Kota : 62 Km","Tiket Masuk : Rp. 15.000","Pantai Ngliyep adalah sebuah pantai di pesisir selatan yang terletak di tepi Samudera Hindia tepatnya di Desa Kedungsalam, Kecamatan Donomulyo, Kabupaten Malang, Jawa Timur sekitar 62 km arah selatan dari Kota Malang.");
                    itemInfo.add(info);
                } else if (pos == 3){
                    Info info = new Info("Pantai 3 Warna",R.drawable.sendang2,"Jarak dari Malang Kota : 77 Km","Tiket Masuk : Rp. 5.000","Keunikan utama Pantai Tiga Warna Malang adalah warna airnya yang berbeda-beda. Biru-Hijau-Putih. Perbedaan warna ini disebabkan oleh kedalaman air laut. Selain itu, ombak di pantai ini sangat tenang, karena ombak besar dari Samudera Hindia terhalang oleh Pulau Sempu..");
                    itemInfo.add(info);
                } else if (pos == 4){
                    Info info = new Info("Pantai Ngudel",R.drawable.ngudel,"Jarak dari Malang Kota : 61 Km","Tiket Masuk : Rp. 1.000","Nama Pantai Ngudel tentu saja cukup unik dan terdengar aneh ya. Ternyata, nama “ngudel” ini sendiri berasal dari sebuah batu yang bentuknya menyerupai “udel” atau yang dalam bahasa Indonesianya memiliki arti pusar. Lokasinya batu ini tidak jauh dari bibir pantai, bisa dilihat dengan jelas. Biasanya batu ini yang menjadi spot favorit para traveler yang datang. Dan pantai ini termasuk pantai di malang yang aman untuk berenang, kamu bisa berenang di belangkang batu udel tanpa perlu khawatir terbawa ombak.");
                    itemInfo.add(info);
                }
            }

            else if (pos1 == 2){
                if (pos == 0){
                    Info info = new Info("Museum Angkut",R.drawable.angkut,"Jarak dari Malang Kota : 15 Km","Tiket Masuk \nWeekday: Rp. 70.000 \nWeekend: Rp. 100.000","\nMuseum Angkut dengan luas sekitar 3,7 hektar ini termasuk museum transportasi terlengkap di Asia. Hebat ‘kan? Dan kalau kamu memang hobi berat dengan bidang otomotif, dipastikan nggak bakalan kecewa saat mengunjungi Museum Angkut Batu. Di tempat ini kamu bisa mendapat informasi lengkap tentang jenis alat transportasi yang mungkin belum pernah didengar atau bahkan pernah booming." +
                            "\nKoleksi Museum Angkut Batu asli dari Indonesia juga lengkap, mulai dari perahu, sepeda onthel, dokar, pedati, dan becak. Ada juga kapal terbang dan kapal laut. Koleksi yang disediakan mulai dari yang original, modifikasi dan replika. Bahkan kamu bisa menyaksikan alat transportasi mini beserta foto-foto baru dan lama tentang alat angkut.");
                    itemInfo.add(info);
                } else if (pos == 1) {
                    Info info = new Info("Museum Brawijaya", R.drawable.brawijaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "Malang juga memiliki sebuah museum yang khusus digunakan untuk menyimpan banyak sekali benda-benda sejarah yang berhubungan dengan perebutan kemerdekaan Indonesia di Kota Malang. Itulah museum Brawijaya Malang yang terletak di salah satu bagian jantung Kota Malang. Letak museum yang di tengah kota ini sering kali membuat museum ini ramai dikunjungi oleh para pengunjung yang ingin melihat bagaimana sejarah perebutan kemerdekaan Indonesia di Malang.");
                    itemInfo.add(info);
                } else if (pos == 2) {
                    Info info = new Info("Candi Singosari", R.drawable.singosari6, "Jarak dari Malang Kota : 10,6 Km", "Tiket Masuk : Rp. Sukarela", "Candi di Indonesia tersebar di berbagai daerah, kebanyakan berada di Pulau Jawa. Malang adalah salah satu tempat yang memiliki candi terkenal, yaitu Candi Singosari. Candi ini merupakan peninggalan kerajaan yang besar pada masanya.\n" +
                            "\n" +
                            "\n" +
                            " \n" +
                            "Bangunan budaya bersejarah ini terkenal karena tersohornya seorang tokoh bernama Ken Arok. Sayangnya, hanya sedikit yang tersisa dari kerajaan besar ini. Candinya pun tidak sebesar Borobudur ataupun Prambanan.");
                    itemInfo.add(info);
                } else if (pos == 3) {
                    Info info = new Info("Candi Jawar Ombo", R.drawable.jawarombo, "Jarak dari Malang Kota : 70 Km", "Tiket Masuk : Rp. 5.000", "Terletak jauh dari keramaian, berdiri sebuah situs Candi Jawar Ombo, pertama kali ditemukan penduduk setempat tahun 1983 dalam kondisi masih terpendam tanah. Hingga kini candi Jawar Ombo masih penuh dengan misteri lantaran belum banyak kajian sejarah yang terungkap darinya.\n" +
                            "\n" +
                            "Sebagai sebuah peninggalan purbakala, bangunan candi jawar Ombo menyimpan nilai estetika yang tinggi. Candi yang menghadap ke arah Gunung Semeru ini, memiliki alas berbentuk bujur sangkar berukuran 6x6 meter dan tinggi 60 sentimeter. Lantai alas candi terdapat empat umpak batu yang lubang pada bagian tengah. Dilihat dari bentuknya, ini diperkirakan sebagai tempat berdirinya tiang kayu dengan atap rumbia atau ijuk.");
                    itemInfo.add(info);
                } else if (pos == 4) {
                    Info info = new Info("Museum Omah Munir", R.drawable.munir1, "Jarak dari Malang Kota : 24,4 Km", "Tiket Masuk : Rp. -", "Omah Munir adalah museum pertama di Indonesia yang dalam hal koleksi dan tema mengangkat masalah-masalah Hak Asasi Manusia. Museum ini berangkat dari sebuah agenda kerja untuk menjadikan sosok paling  berharga dalam sejarah perjuangan penegakkan HAM di Indonesia, yaitu Munir Said Thalib (1965-2004), menjadi medium pendidikan HAM di Indonesia. Omah Munir dibangun di rumah pribadi Suciwati Munir di Kota Batu, Jawa Timur, dalam wilayah wisata kota Batu. Museum ini menyimpan ragam koleksi pribadi almarhum Munir, kisah-kisah perjuangannya sejak mengawali karir sebagai pengacara di kantor LBH Malang & Surabaya, sampai dengan masa \u2028akhir hidupnya di Jakarta dalam beragam aktivitas yang dilakukannya.");
                    itemInfo.add(info);
                }
            }

            else if (pos1 == 3){
                if (pos == 0){
                    Info info = new Info("Alun-Alun Kota Malang",R.drawable.alun2,"Jarak dari Malang Kota : 0 Km","Tiket Masuk: Rp. 0","Alun-Alun Kota Malang | Keindahan Wisata Jawa Timur. Alun-Alun Kota Malang –  Kota Malang memiliki dua alun-alun yang terletak di pusat kota, dintaranya yaitu Alun-Alun Malang Merdeka dan Alun-Alun Tugu. Alun-alun Kota Malang (Malang Merdeka) terletak di jalan Merdeka atau berada tepat di depan Masjid Agung Jami’. Sedangkan untuk alun-alun Tugu berlokasi di depan kantor Balai Kota Malang. Pada kesempatan kali ini ilhamteguh.com akan mengupas tuntas terkait segala hal yang ada di alun alun Kota Malang. Alun-alun Kota Malang dibangun pada tahun 1882. Tempat ini menjadi lokasi favorit tempat berkumpulnya warga dan juga merupakan destinasi rekreasi yang seru. Terutama setelah diadakan renovasi besar-besaran pada tahun 2015 lalu.");
                    itemInfo.add(info);
                } else if (pos == 1) {
                    Info info = new Info("Taman Krida Budaya", R.drawable.kridabudaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 2) {
                    Info info = new Info("Taman Terompet", R.drawable.buring, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 3) {
                    Info info = new Info("Taman Merbabu", R.drawable.nivea, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 4) {
                    Info info = new Info("Hutan Kota Malabar", R.drawable.malabar2, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                }
            }

            else if (pos1 == 4){
                if (pos == 0){
                    Info info = new Info("Wisata Pujon Kidul",R.drawable.pujon,"Jarak dari Malang Kota : 37 Km","Tiket Masuk: Rp. 0","Desa Wisata Pujon Kidul adalah salah satu destinasi unggulan di Kecamatan Pujon, Malang, Jawa Timur. Dari pusat kota, kawasan ini bisa dijangkau melalui beberapa jalur alternatif. Pertama, wisatawan bisa mengakses lewat Jalan Ir. Soekarno, dengan jarak tempuh sekitar 38,5 km, atau lebih kurang 2 jam perjalanan.");
                    itemInfo.add(info);
                } else if (pos == 2) {
                    Info info = new Info("Taman Langit Gunung Banyak", R.drawable.banyak2, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 2) {
                    Info info = new Info("Kampung Warna-Warni Jodipan", R.drawable.jodipan, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 2) {
                    Info info = new Info("Batu Flower Garden", R.drawable.bfg, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 2) {
                    Info info = new Info("Bukit Kuneer", R.drawable.kuneer, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                }
            }

            else if (pos1 == 5){
                if (pos == 0){
                    Info info = new Info("Hawai Waterpark",R.drawable.hawai,"Jarak dari Malang Kota : 37 Km","Tiket Masuk: Rp. 0","");
                    itemInfo.add(info);
                } else if (pos == 1) {
                    Info info = new Info("Kolam Renang Sengkaling", R.drawable.sengkaling, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 2) {
                    Info info = new Info("Kusuma Waterpark", R.drawable.kusuma, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 3) {
                    Info info = new Info("Kolam Renang Selecta", R.drawable.selecta, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 4) {
                    Info info = new Info("Waterpark Tirta Sani", R.drawable.tirtasani, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                }
            }

            else if (pos1 == 6){
                if (pos == 0){
                    Info info = new Info("Wisata Pujon Kidul",R.drawable.pujon,"Jarak dari Malang Kota : 37 Km","Tiket Masuk: Rp. 0","");
                    itemInfo.add(info);
                } else if (pos == 1) {
                    Info info = new Info("Museum Brawijaya", R.drawable.brawijaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 2) {
                    Info info = new Info("Museum Brawijaya", R.drawable.brawijaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 3) {
                    Info info = new Info("Museum Brawijaya", R.drawable.brawijaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 4) {
                    Info info = new Info("Museum Brawijaya", R.drawable.brawijaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                }
            }

            else if (pos1 == 7){
                if (pos == 0){
                    Info info = new Info("Wisata Pujon Kidul",R.drawable.pujon,"Jarak dari Malang Kota : 37 Km","Tiket Masuk: Rp. 0","");
                    itemInfo.add(info);
                } else if (pos == 1) {
                    Info info = new Info("Museum Brawijaya", R.drawable.brawijaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 2) {
                    Info info = new Info("Museum Brawijaya", R.drawable.brawijaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 3) {
                    Info info = new Info("Museum Brawijaya", R.drawable.brawijaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                } else if (pos == 4) {
                    Info info = new Info("Museum Brawijaya", R.drawable.brawijaya, "Jarak dari Malang Kota : 3,3 Km", "Tiket Masuk : Rp. 5.000", "");
                    itemInfo.add(info);
                }
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

