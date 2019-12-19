package polinema.ac.id.ExploreMalang.UAS.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import polinema.ac.id.ExploreMalang.R;
import polinema.ac.id.ExploreMalang.UAS.models.Kategori;
import polinema.ac.id.ExploreMalang.UAS.fragments.DetailFragment;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.MyViewHolder> {

    LayoutInflater layoutInflater;
    public List<Kategori> itemKategori;
    Context c;

    public KategoriAdapter(Context c, List<Kategori> itemKategori) {
        this.c = c;
        this.layoutInflater = LayoutInflater.from(this.c);
        this.itemKategori = itemKategori;
    }

    @NonNull
    @Override
    public KategoriAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View kategoriView = layoutInflater.inflate(R.layout.kategori_layout,parent,false);
        return new MyViewHolder(kategoriView);
    }

    @Override
    public void onBindViewHolder(@NonNull KategoriAdapter.MyViewHolder holder, final int position) {
        final Bundle b =new Bundle();
        Kategori kategori = itemKategori.get(position);
        holder.gambarKategori.setImageResource(kategori.getGambarKategori());
        holder.namaKategori.setText(kategori.getNamaKategori());
        holder.keteranganKategori.setText(kategori.getKetKategori());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    b.putInt("pos",position);
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment myFragment = new DetailFragment();
                    myFragment.setArguments(b);
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, myFragment).addToBackStack(null).commit();


            }
        });
    }

    @Override
    public int getItemCount() {
        return (itemKategori != null) ? itemKategori.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambarKategori;
        public TextView namaKategori;
        public TextView keteranganKategori;
        public CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarKategori = itemView.findViewById(R.id.gambarKategori);
            namaKategori = itemView.findViewById(R.id.namaKategori);
            keteranganKategori = itemView.findViewById(R.id.keteranganKategori);
            cardView = itemView.findViewById(R.id.cardViewKategori);
        }
    }
}
