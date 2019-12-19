package polinema.ac.id.ExploreMalang.UAS.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import polinema.ac.id.ExploreMalang.R;
import polinema.ac.id.ExploreMalang.UAS.activities.Kategori;

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
    public void onBindViewHolder(@NonNull KategoriAdapter.MyViewHolder holder, int position) {

        Kategori kategori = itemKategori.get(position);
        holder.gambarKategori.setImageResource(kategori.getGambarKategori());
        holder.namaKategori.setText(kategori.getNamaKategori());
        holder.keteranganKategori.setText(kategori.getKetKategori());
    }

    @Override
    public int getItemCount() {
        return (itemKategori != null) ? itemKategori.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambarKategori;
        public TextView namaKategori;
        public TextView keteranganKategori;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarKategori = itemView.findViewById(R.id.gambarKategori);
            namaKategori = itemView.findViewById(R.id.namaKategori);
            keteranganKategori = itemView.findViewById(R.id.keteranganKategori);
        }
    }
}