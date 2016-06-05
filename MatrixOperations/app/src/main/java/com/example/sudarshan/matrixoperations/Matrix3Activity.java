package com.example.sudarshan.matrixoperations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Matrix3Activity extends AppCompatActivity {
    private double m11, m12, m13, m21, m22, m23, m31, m32, m33, n11, n12, n13, n21, n22, n23, n31, n32, n33;
    private double result11, result12,result13, result21, result22,result23,result31,result32,result33;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix3);
        CommonMethods.a11 = initializeBoxes(R.id.a11);
        CommonMethods.a12 = initializeBoxes(R.id.a12);
        CommonMethods.a13 = initializeBoxes(R.id.a13);
        CommonMethods.a21 = initializeBoxes(R.id.a21);
        CommonMethods.a22 = initializeBoxes(R.id.a22);
        CommonMethods.a23 = initializeBoxes(R.id.a23);
        CommonMethods.a31 = initializeBoxes(R.id.a31);
        CommonMethods.a32 = initializeBoxes(R.id.a32);
        CommonMethods.a33 = initializeBoxes(R.id.a33);
        CommonMethods.b11 = initializeBoxes(R.id.b11);
        CommonMethods.b12 = initializeBoxes(R.id.b12);
        CommonMethods.b13 = initializeBoxes(R.id.b13);
        CommonMethods.b21 = initializeBoxes(R.id.b21);
        CommonMethods.b22 = initializeBoxes(R.id.b22);
        CommonMethods.b23 = initializeBoxes(R.id.b23);
        CommonMethods.b31 = initializeBoxes(R.id.b31);
        CommonMethods.b32 = initializeBoxes(R.id.b32);
        CommonMethods.b33 = initializeBoxes(R.id.b33);

    }

    private EditText initializeBoxes(int i) {

        return (EditText) findViewById(i);
    }

    public void addMatrix3(View view) {
        if (initialization()) {
            result11 = m11 + n11;
            result12 = m12 + n12;
            result13=  m13 + n13;
            result21 = m21 + n21;
            result22 = m22 + n22;
            result23 = m23 + n23;
            result31 = m31 + n31;
            result32 = m32 + n32;
            result33 = m33 + n33;
        callActivity();
        }
        else {
            announceEmpty();
        }
    }

    public void multiplyMatrix3(View view) {
        if(initialization()) {
            result11 = m11 * n11 + m12 * n21 + m13 * m31;
            result12 = m11 * n12 + m12 * n22 + m13 * n31;
            result13 = m11 * n13 + m12 * n23 + m13 * n33;
            result21 = m21 * n11 + m22 * n21 + m23 * n21;
            result22 = m21 * n12 + m22 * n22 + m23 * n32;
            result23 = m21 * n13 + m22 * n23 + m23 * n33;
            result31 = m31 * n11 + m32 * n21 + m33 * n31;
            result32 = m31 * n12 + m32 * n22 + m33 * n32;
            result33 = m31 * n13 + m32 * n23 + m33 * n33;
            callActivity();
        }
        else {
            announceEmpty();
        }
    }

    public void substractMatrix3(View view) {
        if(initialization()) {
            result11 = m11 - n11;
            result12 = m12 - n12;
            result13 = m13 - n13;
            result21 = m21 - n21;
            result22 = m22 - n22;
            result23 = m23 - n23;
            result31 = m31 - n31;
            result32 = m32 - n32;
            result33 = m33 - n33;
            callActivity();
        }
        else {
            announceEmpty();
        }
    }

    private boolean initialization() {
        boolean validation = false;
        boolean isEmpty = true;
        int flag = 0;
        EditText[] editTexts = {CommonMethods.a11, CommonMethods.a12,CommonMethods.a13, CommonMethods.a21, CommonMethods.a22,CommonMethods.a23,CommonMethods.a31,CommonMethods.a32,CommonMethods.a33, CommonMethods.b11, CommonMethods.b12,CommonMethods.b13, CommonMethods.b21, CommonMethods.b22,CommonMethods.b23,CommonMethods.b31,CommonMethods.b32,CommonMethods.b33};
        for (EditText editText : editTexts) {
            isEmpty = CommonMethods.checkEmpty(editText);
            if (!isEmpty) {
                flag++;
            } else {
                break;
            }
        }

        if (flag == 18) {
            m11 = CommonMethods.convertToDouble(CommonMethods.a11);
            m12 = CommonMethods.convertToDouble(CommonMethods.a12);
            m13 = CommonMethods.convertToDouble(CommonMethods.a13);
            m21 = CommonMethods.convertToDouble(CommonMethods.a21);
            m22 = CommonMethods.convertToDouble(CommonMethods.a22);
            m23 = CommonMethods.convertToDouble(CommonMethods.a23);
            m31 = CommonMethods.convertToDouble(CommonMethods.a31);
            m32 = CommonMethods.convertToDouble(CommonMethods.a32);
            m33 = CommonMethods.convertToDouble(CommonMethods.a33);
            n11 = CommonMethods.convertToDouble(CommonMethods.b11);
            n12 = CommonMethods.convertToDouble(CommonMethods.b12);
            n13 = CommonMethods.convertToDouble(CommonMethods.b13);
            n21 = CommonMethods.convertToDouble(CommonMethods.b21);
            n22 = CommonMethods.convertToDouble(CommonMethods.b22);
            n23 = CommonMethods.convertToDouble(CommonMethods.b23);
            n31 = CommonMethods.convertToDouble(CommonMethods.b31);
            n32 = CommonMethods.convertToDouble(CommonMethods.b32);
            n33 = CommonMethods.convertToDouble(CommonMethods.b33);
            validation = true;

        }


       return validation;
    }
    private void clearData(){
        EditText[] editTexts = {CommonMethods.a11, CommonMethods.a12,CommonMethods.a13, CommonMethods.a21, CommonMethods.a22,CommonMethods.a23,CommonMethods.a31,CommonMethods.a32,CommonMethods.a33, CommonMethods.b11, CommonMethods.b12,CommonMethods.b13, CommonMethods.b21, CommonMethods.b22,CommonMethods.b23,CommonMethods.b31,CommonMethods.b32,CommonMethods.b33};
        for(EditText editText:editTexts)
            editText.setText("");
    }
    private void announceEmpty()

    {
        CommonMethods.showToastMessage(getApplicationContext(), "please fill the fields");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        if(CommonMethods.returnData){
            clearData();
            CommonMethods.returnData=false;
        }
    }
    private void callActivity(){
        intent = new Intent(getApplicationContext(), ResultMatrix3Activity.class);
        intent.putExtra("ResultMatrix3", new double[]{result11, result12,result13, result21, result22,result23,result31,result32,result33});
        startActivity(intent);
    }
    public void clear(View view){
        clearData();

    }

}
