package com.example.innoguidesjava;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;

public class InfoWindow extends DialogFragment {

    private String name;
    private double rating;

    public InfoWindow(String name, double rating){
        this.name=name;
        this.rating=rating;
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Place Info")
                .setView(R.layout.activity_info_window)
                .setPositiveButton("OK", null)
                .setMessage("Name: " + this.name+"\nRating: "+this.rating)
                .create();
    }
}