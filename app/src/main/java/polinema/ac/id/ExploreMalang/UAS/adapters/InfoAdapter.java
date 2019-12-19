package polinema.ac.id.ExploreMalang.UAS.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import polinema.ac.id.ExploreMalang.R;
import polinema.ac.id.ExploreMalang.UAS.models.Detail;
import polinema.ac.id.ExploreMalang.UAS.models.Info;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.MyViewHolder> {

    LayoutInflater layoutInflater;
    public List<Info> itemInfo;
    Context c;

    public InfoAdapter(Context c, List<Info> itemInfo) {
        this.c = c;
        this.layoutInflater = LayoutInflater.from(this.c);
        this.itemInfo = itemInfo;
    }

    @NonNull
    @Override
    public InfoAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View infoView = layoutInflater.inflate(R.layout.info_layout,parent,false);
        return new MyViewHolder(infoView);
    }


    @Override
    public void onBindViewHolder(@NonNull InfoAdapter.MyViewHolder holder, int position) {

        Info info = itemInfo.get(position);
        holder.gambarInfo.setImageResource(info.getGambarInfo());
        holder.namaInfo.setText(info.getNamaInfo());

    }

    @Override
    public int getItemCount() {
        return (itemInfo != null) ? itemInfo.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambarInfo;
        public TextView namaInfo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarInfo = itemView.findViewById(R.id.gambarInfo);
            namaInfo = itemView.findViewById(R.id.namaInfo);
        }
    }
}
