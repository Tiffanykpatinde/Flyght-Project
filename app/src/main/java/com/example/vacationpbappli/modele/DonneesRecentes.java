package com.example.vacationpbappli.modele;

public class DonneesRecentes {
    String place;
    String pays;
    String prix;
    Integer imageUrl;

    public DonneesRecentes(String place, String pays, String prix, Integer imageUrl) {
        this.place = place;
        this.pays = pays;
        this.prix = prix;
        this.imageUrl = imageUrl;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}

