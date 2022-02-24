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
import com.example.vacationpbappli.modele.DonneesTopPlaces;

import java.util.List;

public class AdaptationsTopPlaces extends RecyclerView.Adapter<AdaptationsTopPlaces.TopPlacesViewholder> {

    Context context;
    List<DonneesTopPlaces> donneesTopPlacesList;

    public AdaptationsTopPlaces(Context context, List<DonneesTopPlaces> donneesRecentesList) {
        this.context = context;
        this.donneesTopPlacesList = donneesRecentesList;
    }

    @NonNull
    @Override
    public TopPlacesViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_places_row_item, parent, false);

        //ici, nous créons un fichier de mise en page d'élément de ligne de vue recycleur
        return new TopPlacesViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPlacesViewholder holder, int position) {

        holder.place.setText(donneesTopPlacesList.get(position).getPlace());
        holder.pays.setText(donneesTopPlacesList.get(position).getPays());
        holder.prix.setText(donneesTopPlacesList.get(position).getPrix());
        holder.placeImage.setImageResource(donneesTopPlacesList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return donneesTopPlacesList.size();
    }

    public static final class TopPlacesViewholder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView place, pays, prix;

        public TopPlacesViewholder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            place = itemView.findViewById(R.id.place);
            pays = itemView.findViewById(R.id.pays);
            prix = itemView.findViewById(R.id.prix);
        }
    }

}
