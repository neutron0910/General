package com.example.sudarshan.matrixoperations;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Matrix2Activity extends AppCompatActivity {
   // EditText a11, a12, a21, a22, b11, b12, b21, b22;
    private double m11, m12, m21, m22, n11, n12, n21, n22;
    private double result11, result12, result21, result22;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrixtest);
        CommonMethods.a11 = initializeBoxes(R.id.M3a11);
        CommonMethods.a12 = initializeBoxes(R.id.M3a12);
        CommonMethods.a21 = initializeBoxes(R.id.M3a21);
        CommonMethods.a22 = initializeBoxes(R.id.a22);
        CommonMethods.b11 = initializeBoxes(R.id.b11);
        CommonMethods.b12 = initializeBoxes(R.id.b12);
        CommonMethods.b21 = initializeBoxes(R.id.b21);
        CommonMethods.b22 = initializeBoxes(R.id.b22);
    }

   private EditText initializeBoxes(int i) {

        return (EditText) findViewById(i);
    }

//code to add
    public void addMatrix(View view) {
        if (initialization()) {
            result11 = m11 + n11;
            result12 = m12 + n12;
            result21 = m21 + n21;
            result22 = m22 + n22;
            intent = new Intent(getApplicationContext(), ResultMatrixActivity.class);
            intent.putExtra("additionResultMatrix", new double[]{result11, result12, result21, result22});
            startActivity(intent);
        } else {
            announceIfEmpty();
        }


    }
//code of multiplication
    public void multiplyMatrix(View view) {
        if (initialization()) {
            result11 = m11 * n11 + m12 * n21;
            result12 = m11 * n12 + m12 * n22;
            result21 = m21 * n11 + m22 * n21;
            result22 = m21 * n12 + m22 * n22;
            intent = new Intent(getApplicationContext(), ResultMatrixActivity.class);
            intent.putExtra("additionResultMatrix", new double[]{result11, result12, result21, result22});
            startActivity(intent);
        } else {
            announceIfEmpty();
        }
    }
//code of substraction
    public void substractMatrix(View view) {

        if (initialization()) {
            result11 = m11 - n11;
            result12 = m12 - n12;
            result21 = m21 - n21;
            result22 = m22 - n22;
            intent = new Intent(getApplicationContext(), ResultMatrixActivity.class);
            intent.putExtra("additionResultMatrix", new double[]{result11, result12, result21, result22});
            startActivity(intent);
        } else {
            announceIfEmpty();
        }
    }

    //initializing all the matrix member before operation
    private boolean initialization() {
        boolean validation = false;
        boolean isEmpty = true;
        int flag = 0;
        EditText[] editTexts = {CommonMethods.a11, CommonMethods.a12, CommonMethods.a21, CommonMethods.a22, CommonMethods.b11, CommonMethods.b12, CommonMethods.b21, CommonMethods.b22};
        for (EditText editText : editTexts) {
            isEmpty = CommonMethods.checkEmpty(editText);
            if (!isEmpty) {
                flag++;
            } else {
                break;
            }

        }
        if (flag == 8) {
            m11 = CommonMethods.convertToDouble(CommonMethods.a11);
            m12 = CommonMethods.convertToDouble(CommonMethods.a12);
            m21 = CommonMethods.convertToDouble(CommonMethods.a21);
            m22 = CommonMethods.convertToDouble(CommonMethods.a22);
            n11 = CommonMethods.convertToDouble(CommonMethods.b11);
            n12 = CommonMethods.convertToDouble(CommonMethods.b12);
            n21 = CommonMethods.convertToDouble(CommonMethods.b21);
            n22 = CommonMethods.convertToDouble(CommonMethods.b22);
            validation = true;

        }

        return validation;
    }
// method to clear the data in the boxes
    private void clearData(){
        EditText[] editTexts = {CommonMethods.a11, CommonMethods.a12, CommonMethods.a21, CommonMethods.a22, CommonMethods.b11, CommonMethods.b12, CommonMethods.b21, CommonMethods.b22};
        for(EditText editText:editTexts)
            editText.setText("");
    }


//if any field is left empty this method will be called
    private void announceIfEmpty()

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
    //this method is called when clear button is pressed
    public void clear2(View view){
        clearData();

    }


}

