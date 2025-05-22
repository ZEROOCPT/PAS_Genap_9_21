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
public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {

    private List<Schedule> scheduleList;

    // Constructor menerima list
    public ScheduleAdapter(List<Schedule> Schedule) {
        this.scheduleList = Schedule;
    }

    @Override
    public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_schedule, parent, false);
        return new ScheduleViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ScheduleViewHolder holder, int position) {
        Schedule schedule = scheduleList.get(position);


        holder.textcountrysname.setText(schedule.getStrEvent());//ganti nanti

        // Gunakan Glide untuk memuat gambar logo tim ke ImageView
        Glide.with(holder.itemView.getContext())
                .load(schedule.getStrThumb()) // URL gambar badge
                .into(holder.rvimage);
    }


    @Override
    public int getItemCount() {
        return scheduleList.size();
    }


    public static class ScheduleViewHolder extends RecyclerView.ViewHolder {
        TextView textcountrysname, textSchedule;
        ImageView rvimage;

        public ScheduleViewHolder(View itemView) {
            super(itemView);
            // Hubungkan komponen UI dari layout item_team.xml
            textcountrysname = itemView.findViewById(R.id.textTeamName);
            rvimage = itemView.findViewById(R.id.rvBadge);
            textSchedule = itemView.findViewById(R.id.textSchedule);
        }
    }
}
