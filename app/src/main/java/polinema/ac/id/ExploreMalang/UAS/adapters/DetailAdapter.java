package polinema.ac.id.ExploreMalang.UAS.adapters;

import android.content.Context;
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
import polinema.ac.id.ExploreMalang.UAS.fragments.DetailFragment;
import polinema.ac.id.ExploreMalang.UAS.fragments.InfoFragment;
import polinema.ac.id.ExploreMalang.UAS.models.Detail;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.MyViewHolder> {

    LayoutInflater layoutInflater;
    public List<Detail> itemDetail;
    Context c;

    public DetailAdapter(Context c, List<Detail> itemDetail) {
        this.c = c;
        this.layoutInflater = LayoutInflater.from(this.c);
        this.itemDetail = itemDetail;
    }

    @NonNull
    @Override
    public DetailAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View detailView = layoutInflater.inflate(R.layout.detail_layout,parent,false);
        return new MyViewHolder(detailView);
    }


    @Override
    public void onBindViewHolder(@NonNull DetailAdapter.MyViewHolder holder, final int position) {

        Detail detail = itemDetail.get(position);
        holder.gambarDetail.setImageResource(detail.getGambarDetail());
        holder.namaDetail.setText(detail.getNamaDetail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0) {

                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment myFragment = new InfoFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, myFragment).addToBackStack(null).commit();

                } else if (position == 1) {


                }else if (position == 2) {

                }else if (position == 3) {
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return (itemDetail != null) ? itemDetail.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambarDetail;
        public TextView namaDetail;
        public CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarDetail = itemView.findViewById(R.id.gambarDetail);
            namaDetail = itemView.findViewById(R.id.namaDetail);
            cardView = itemView.findViewById(R.id.cardViewDetail);
        }
    }
}
