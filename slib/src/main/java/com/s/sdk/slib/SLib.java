package com.s.sdk.slib;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.a.sdk.lib.ALib;

public class SLib {
    public SLib(){
    }
    public void showASDKAlert(final Context context){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setMessage("Socure SDK Alert is Showing");
        alertDialogBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        new ALib().showASDKAlert(context);
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        
    }
}
