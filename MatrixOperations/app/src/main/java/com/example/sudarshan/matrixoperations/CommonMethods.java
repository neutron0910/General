package com.example.sudarshan.matrixoperations;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by sudarshan on 12/3/16.
 */
public class CommonMethods  {
    public static EditText a11,a12,a13,a21,a22,a23,a31,a32,a33,b11,b12,b13,b21,b22,b23,b31,b32,b33;
    public static boolean returnData=false;
     //This method will check whether any EditText is empty or not
    public static boolean checkEmpty(EditText editText) {
        return editText.getText().toString().isEmpty();

    }


    //this method will convert the values in the Edittext which are present as string data  to double data
    public static double convertToDouble(EditText editText) {

        return (double) Integer.parseInt(editText.getText().toString());

    }
    //method for showing the toast message
    public static void showToastMessage(Context context, String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();

    }

}
