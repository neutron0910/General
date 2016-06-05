//This project is all about the 2*2 and the 3*3 matrix operations 
package com.example.sudarshan.matrixoperations;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView matrix2View,matrix3View;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        matrix2View = (ImageView) findViewById(R.id.matrix2View);
        matrix3View=(ImageView)findViewById(R.id.matrix3View);
        onTouchEffect(matrix2View,Color.BLUE,Color.parseColor("#7c130000"));
        onTouchEffect(matrix3View,Color.GREEN,Color.parseColor("#151c69"));


    }
    //adding the touch effects when a image button is pressed we will see some colour while touching the image 
    private void onTouchEffect(ImageView v, final int pressedColor, final int unPressedColor){
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d("test", "istdown");
                    v.setBackgroundColor(pressedColor);
                    v.setAlpha(0.5f);

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d("test", "ist up");
                    v.setBackgroundColor(unPressedColor);
                    v.setAlpha(1.0f);
                    if (v.getId() == R.id.matrix2View)
                        startActivity(new Intent(getApplicationContext(),Matrix2Activity.class));
                    else if(v.getId()==R.id.matrix3View)
                        startActivity(new Intent(getApplicationContext(),Matrix3Activity.class));

                }
                return true;
            }
        });

    }
}

