package com.example.sudarshan.matrixoperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
//activity for the result of the 3*3 matrix
public class ResultMatrix3Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    TextView answer11,answer12,answer13,answer21,answer22,answer23,answer31,answer32,answer33;
    CheckBox restoreData;
    boolean isChecked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_matrix3);
        answer11=(TextView)findViewById(R.id.M3a11);
        answer12=(TextView)findViewById(R.id.M3a12);
        answer13=(TextView)findViewById(R.id.M3a13);
        answer21=(TextView)findViewById(R.id.M3a21);
        answer22=(TextView)findViewById(R.id.M3a22);
        answer23=(TextView)findViewById(R.id.M3a23);
        answer31=(TextView)findViewById(R.id.M3a31);
        answer32=(TextView)findViewById(R.id.M3a32);
        answer33=(TextView)findViewById(R.id.M3a33);
        //getting the answers from the previous activity and setting them to the respective views
        double[] answer3=getIntent().getDoubleArrayExtra("ResultMatrix3");
        answer11.setText(String.valueOf(answer3[0]) );
        answer12.setText(String.valueOf(answer3[1]) );
        answer13.setText(String.valueOf(answer3[2]) );
        answer21.setText(String.valueOf(answer3[3]) );
        answer22.setText(String.valueOf(answer3[4]) );
        answer23.setText(String.valueOf(answer3[5]) );
        answer31.setText(String.valueOf(answer3[6]) );
        answer32.setText(String.valueOf(answer3[7]) );
        answer33.setText(String.valueOf(answer3[8]) );
        restoreData=(CheckBox)findViewById(R.id.restoreData3);
        restoreData.setChecked(isChecked);
        restoreData.setOnCheckedChangeListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(isChecked) {
            finish();
        }
        else {
            CommonMethods.returnData=true;
            finish();

        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked==true)
            this.isChecked=isChecked;
        else
            this.isChecked=false;
    }
}
