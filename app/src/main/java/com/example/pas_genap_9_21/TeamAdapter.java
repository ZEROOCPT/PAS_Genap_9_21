package com.example.pas_genap_9_21;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;


public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    private List<Team> teamList;


    public TeamAdapter(List<Team> teamList) {
        this.teamList = teamList;
    }


    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_team, parent, false);
            return new TeamViewHolder(view);
    }


    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        Team team = teamList.get(position);

        // Set nama tim dan nama stadion ke TextView
        holder.textTeamName.setText(team.getStrTeam());
        holder.textStadium.setText(team.getStrStadium());

        // Glide gambar logo tim ke ImageView
        Glide.with(holder.itemView.getContext())
                .load(team.getStrTeamBadge())

                .into(holder.rvBadge);
    }


    @Override
    public int getItemCount() {
        return teamList.size();
    }


    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView textTeamName, textStadium;
        ImageView rvBadge;

        public TeamViewHolder(View itemView) {
            super(itemView);

            textTeamName = itemView.findViewById(R.id.textTeamName); //nama
            textStadium = itemView.findViewById(R.id.textStadium);   //stadium
            rvBadge = itemView.findViewById(R.id.rvBadge);           //gambar
        }
    }
}
