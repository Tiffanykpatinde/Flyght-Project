package com.example.vacationpbappli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vacationpbappli.adapter.AdaptationsRecentes;
import com.example.vacationpbappli.adapter.AdaptationsTopPlaces;
import com.example.vacationpbappli.modele.DonneesRecentes;
import com.example.vacationpbappli.modele.DonneesTopPlaces;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    AdaptationsRecentes adaptationsRecentes;
    AdaptationsTopPlaces adaptationsTopPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Maintenant, nous allons ajouter ici des données factices dans notre classe de modèle

        List<DonneesRecentes> donneesRecentesList = new ArrayList<>();
        donneesRecentesList.add(new DonneesRecentes("AM Lake", "India", "From $200", R.drawable.recentimage1));
        donneesRecentesList.add(new DonneesRecentes("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));
        donneesRecentesList.add(new DonneesRecentes("AM Lake", "India", "From $200", R.drawable.recentimage1));
        donneesRecentesList.add(new DonneesRecentes("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));
        donneesRecentesList.add(new DonneesRecentes("AM Lake", "India", "From $200", R.drawable.recentimage1));
        donneesRecentesList.add(new DonneesRecentes("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));

        setRecentRecycler(donneesRecentesList);

        List<DonneesTopPlaces> donneesTopPlacesList = new ArrayList<>();
        donneesTopPlacesList.add(new DonneesTopPlaces("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        donneesTopPlacesList.add(new DonneesTopPlaces("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        donneesTopPlacesList.add(new DonneesTopPlaces("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        donneesTopPlacesList.add(new DonneesTopPlaces("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        donneesTopPlacesList.add(new DonneesTopPlaces("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));

        setTopPlacesRecycler(donneesTopPlacesList);

    }

    private void setRecentRecycler(List<DonneesRecentes> donneesRecentesList){

        recentRecycler=findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(LayoutManager);
        adaptationsRecentes = new AdaptationsRecentes(this, donneesRecentesList);
        recentRecycler.setAdapter(adaptationsRecentes);
    }

    private void setTopPlacesRecycler(List<DonneesTopPlaces> donneesTopPlacesList){

        topPlacesRecycler=findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(LayoutManager);
        adaptationsTopPlaces = new AdaptationsTopPlaces(this, donneesTopPlacesList);
        topPlacesRecycler.setAdapter(adaptationsTopPlaces);
    }
}