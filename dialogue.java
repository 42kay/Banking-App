package com.example.paysomeoneamount1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatDialogFragment;

public class dialogue extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog( Bundle savedInstanceState) {
        AlertDialog.Builder builder =new AlertDialog.Builder(getActivity());
        builder.setTitle("The Money has been transferred to the beneficiary")
                .setMessage("Press Ok to exit ")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                    }
                });
        return builder.create();



    }


}
