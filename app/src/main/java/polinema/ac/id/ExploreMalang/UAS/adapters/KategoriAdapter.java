package polinema.ac.id.ExploreMalang.UAS.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import polinema.ac.id.ExploreMalang.UAS.activities.Kategori;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.MyViewHolder> {

    List<Kategori> itemKategori;

    public KategoriAdapter(List<Kategori> itemKategori) {
        this.itemKategori = itemKategori;
    }

    @NonNull
    @Override
    public KategoriAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull KategoriAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
