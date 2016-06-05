package com.example.sudarshan.matrixoperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

import android.widget.CompoundButton;
import android.widget.TextView;
//Activity for the result of the 2*2 matrix
public class ResultMatrixActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    TextView answer11,answer12,answer21,answer22;
    CheckBox restoreData;
    boolean isChecked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_matrix2);
        answer11=(TextView)findViewById(R.id.answer11);
        answer12=(TextView)findViewById(R.id.answer12);
        answer21=(TextView)findViewById(R.id.answer21);
        answer22=(TextView)findViewById(R.id.answer22);
        //getting the answers from the previous activity and setting them to required views
        double[] answer=getIntent().getDoubleArrayExtra("additionResultMatrix");
        answer11.setText(String.valueOf(answer[0]) );
        answer12.setText(String.valueOf(answer[1]) );
        answer21.setText(String.valueOf(answer[2]) );
        answer22.setText(String.valueOf(answer[3]) );
        restoreData=(CheckBox)findViewById(R.id.restoreData);
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
            this.isChecked=false;    }
}

