package com.example.vacationpbappli.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vacationpbappli.R;
import com.example.vacationpbappli.modele.DonneesRecentes;

import java.util.List;

public class AdaptationsRecentes extends RecyclerView.Adapter<AdaptationsRecentes.RecentsViewholder> {

    Context context;
    List<DonneesRecentes> donneesRecentesList;

    public AdaptationsRecentes(Context context, List<DonneesRecentes> donneesRecentesList) {
        this.context = context;
        this.donneesRecentesList = donneesRecentesList;
    }

    @NonNull
    @Override
    public RecentsViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recent_row_item, parent, false);

        //ici, nous créons un fichier de mise en page d'élément de ligne de vue recycleur
        return new RecentsViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentsViewholder holder, int position) {

        holder.place.setText(donneesRecentesList.get(position).getPlace());
        holder.pays.setText(donneesRecentesList.get(position).getPays());
        holder.prix.setText(donneesRecentesList.get(position).getPrix());
        holder.placeImage.setImageResource(donneesRecentesList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return donneesRecentesList.size();
    }

    public static final class RecentsViewholder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView place, pays, prix;

        public RecentsViewholder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            place = itemView.findViewById(R.id.place);
            pays = itemView.findViewById(R.id.pays);
            prix = itemView.findViewById(R.id.prix);
        }
    }

}
