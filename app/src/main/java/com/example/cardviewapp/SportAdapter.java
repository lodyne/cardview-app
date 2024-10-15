package com.example.cardviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.ViewHolder> {

    public List<Sport> sportList;
    public static SportListener sportListener;

    public void setSportListener(SportListener sportListener) {
        SportAdapter.sportListener = sportListener;
    }

    public SportAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_list_layout,
                parent,
                false
        );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Sport sport = sportList.get(position);
        holder.sportName.setText(sport.getSportName());
        holder.sportImage.setImageResource(sport.getSportImage());

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView sportImage;
        TextView sportName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sportImage = itemView.findViewById(R.id.imgView);
            sportName = itemView.findViewById(R.id.txtView1);

            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            if (sportListener != null){
                sportListener.onClickSportListener(v,getAdapterPosition());
            }

        }
    }

}
