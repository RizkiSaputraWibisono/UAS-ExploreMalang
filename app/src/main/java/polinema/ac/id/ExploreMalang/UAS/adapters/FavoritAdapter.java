package polinema.ac.id.ExploreMalang.UAS.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import polinema.ac.id.ExploreMalang.R;
import polinema.ac.id.ExploreMalang.UAS.fragments.DetailFragment;
import polinema.ac.id.ExploreMalang.UAS.fragments.InfoFragment;
import polinema.ac.id.ExploreMalang.UAS.models.Info;
import polinema.ac.id.ExploreMalang.UAS.models.Request;

public class FavoritAdapter extends RecyclerView.Adapter<FavoritAdapter.MyViewHolder> {


    LayoutInflater layoutInflater;
    List<Request> itemKategori;
    Context c;
    View view;

    public FavoritAdapter(Context c, List<Request> itemKategori) {
        this.itemKategori = itemKategori;
        this.c = c;
        this.layoutInflater = LayoutInflater.from(this.c);
    }

    @NonNull
    @Override
    public FavoritAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = layoutInflater.inflate(R.layout.favorit_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoritAdapter.MyViewHolder holder, final int position) {
        final Request detail = itemKategori.get(position);

        final Bundle b = new Bundle();

        holder.gambarDetail.setImageResource(detail.getGambarInfo());
        holder.namaDetail.setText(detail.getNamaInfo());

        holder.gambarDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = detail.getNamaInfo();
                int img = detail.getGambarInfo();
                String jarak = detail.getJarakInfo();
                String tiket = detail.getTiketInfo();
                String desc = detail.getDeskripsiInfo();

                b.putString("name", nama);
                b.putInt("img", img);
                
                b.putInt("status", 1);
                b.putString("jarak", jarak);
                b.putString("tiket", tiket);
                b.putString("desc", desc);

                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment myFragment = new InfoFragment();
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
        public ImageView gambarDetail;
        public TextView namaDetail;
        public CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarDetail = itemView.findViewById(R.id.gambarDetail1);
            namaDetail = itemView.findViewById(R.id.namaDetail1);
            cardView = itemView.findViewById(R.id.cardViewDetail1);
        }
    }
}
