package id.ac.unpas.sab.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.DashboardHolder> {
    private ArrayList<SetterGetter> listdata;

    public DashBoardAdapter(ArrayList<SetterGetter> listdata){
        this.listdata = listdata;
    }
    @NonNull
    @Override
    public DashBoardAdapter.DashboardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard, parent, false);
        DashboardHolder holder = new DashboardHolder(view);
        return holder;
    }


    public void onBindViewHolder(@NonNull DashBoardAdapter.DashboardHolder holder, int position) {
        final SetterGetter getData = listdata.get(position);
        String titlemenu = getData.getTitle();
        String logomenu  = getData.getImg();

        holder.titleMenu.setText(titlemenu);

        if (logomenu.equals("logomenu1")){
            holder.imgMenu.setImageResource(R.drawable.paket);
        }else if (logomenu.equals("logomenu2")){
            holder.imgMenu.setImageResource(R.drawable.listrik);
        }else if (logomenu.equals("logomenu3")){
            holder.imgMenu.setImageResource(R.drawable.ojek);
        }else if (logomenu.equals("logomenu4")){
            holder.imgMenu.setImageResource(R.drawable.isi_pulsa);
        }else if (logomenu.equals("logomenu5")){
            holder.imgMenu.setImageResource(R.drawable.berita);
        }else if (logomenu.equals("logomenu6")){
            holder.imgMenu.setImageResource(R.drawable.makanan);
        }else if (logomenu.equals("logomenu7")){
            holder.imgMenu.setImageResource(R.drawable.pijat);
        }else if (logomenu.equals("logomenu8")){
            holder.imgMenu.setImageResource(R.drawable.tiket);
        }else if (logomenu.equals("logomenu9")){
            holder.imgMenu.setImageResource(R.drawable.liburan);
        }
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DashboardHolder extends  RecyclerView.ViewHolder {

        TextView titleMenu;
        ImageView imgMenu;

        public DashboardHolder(@NonNull View itemView){
            super(itemView);

            titleMenu = itemView.findViewById(R.id.iv_title_menu);
            imgMenu = itemView.findViewById(R.id.iv_logo_menu);
        }
    }
}
