package com.example.pas_genap_9_21;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

// Adapter untuk menghubungkan data Team ke RecyclerView
public class ScheduleAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    private List<Schedule> scheduleList;

    // Constructor menerima list
    public ScheduleAdapter(List<Schedule> countries) {
        this.scheduleList = Schedule;
    }


    @Override
    public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_country, parent, false);
        return new ScheduleViewHolder(view);
    }


    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        Schedule schedule = scheduleList.get(position);


        holder.countrysname.setText(schedule.getname_en());//ganti nanti

        // Gunakan Glide untuk memuat gambar logo tim ke ImageView
        Glide.with(holder.itemView.getContext())
                .load(schedule.getStrThumb()) // URL gambar badge
                .into(holder.rvimage);
    }


    @Override
    public int getItemCount() {
        return scheduleList.size();
    }


    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView textcountrysname, textcountrysflag;
        ImageView rvimage;

        public TeamViewHolder(View itemView) {
            super(itemView);
            // Hubungkan komponen UI dari layout item_team.xml
            textcountrysname = itemView.findViewById(R.id.textCountrysname);
            rvimage = itemView.findViewById(R.id.rvImage);
        }
    }
}
