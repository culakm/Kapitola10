package com.hellbilling.kapitola10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Kapitola10 extends Activity
        implements RadioGroup.OnCheckedChangeListener{
    RadioGroup orientation;
    RadioGroup gravity;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_kapitola10);

        orientation=(RadioGroup)findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(this);
        gravity=(RadioGroup)findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.horizontal:
                orientation.setOrientation(LinearLayout.HORIZONTAL);
                break;

            case R.id.vertical:
                orientation.setOrientation(LinearLayout.VERTICAL);
                break;

            case R.id.left:
                gravity.setGravity(Gravity.LEFT);
                break;

            case R.id.center:
                gravity.setGravity(Gravity.CENTER_HORIZONTAL);
                break;

            case R.id.right:
                gravity.setGravity(Gravity.RIGHT);
                break;
        }
    }

    public void mcSetActivity(View view) {

        // Is the button now checked?

        //Intent intent = new Intent(this, activity3.class);
        Toast.makeText(getApplicationContext(), " PAKO  "+ gravity.getId() + " vs. " + R.id.left, Toast.LENGTH_SHORT).show();
        switch(gravity.getCheckedRadioButtonId()) {
            case R.id.left:
              //  if (checked)
                Toast.makeText(getApplicationContext(), " activity 2 ", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, activity2.class);
                startActivity(intent2);
                break;
            case R.id.center:
                //if (checked)
                Toast.makeText(getApplicationContext(), " activity 3 ", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this, activity2.class);
                startActivity(intent3);
                break;
            case R.id.right:
                //if (checked)
                //Intent intent = new Intent(this, activity3.class);
                break;
        }



    }
}