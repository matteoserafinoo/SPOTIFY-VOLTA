package com.example.volta_spotify_serafino;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> ListaBrani;

    public GestoreBrani()
    {
        ListaBrani = new ArrayList<Brano>();
    }
    //instanziare un oggetto di tipo brano, a partire da dei dati, aggiungerlo all'arraylist
    //visualizzatrackilst : restituisce una stringa tutti di i brani concatenati

    public void addbrano(String titolo)
    {
        Brano b = new Brano(titolo);
        ListaBrani.add(b);
    }

    public void visualiztrackilist()
    {
        StringBuilder stBui = new StringBuilder();
        for (Brano brv : ListaBrani)
        {
            stBui.append(brv.toString());
        }
    }
}
