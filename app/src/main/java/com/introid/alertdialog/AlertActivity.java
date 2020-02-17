package com.introid.alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;


import androidx.appcompat.app.AppCompatDialogFragment;

import com.like.LikeButton;
import com.like.OnLikeListener;

public class AlertActivity extends AppCompatDialogFragment {
    LikeButton likeButton;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context;
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater= getActivity().getLayoutInflater();
        View view = inflater.inflate( R.layout.alert_dialog,null );
        builder.setView( view );
        return builder.create();


    }
}
