package com.hellbilling.kapitola10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Kapitola10 extends Activity{

    RadioGroup activities1;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_kapitola10);

        activities1=(RadioGroup)findViewById(R.id.activities1);
        //activities1.setOnCheckedChangeListener(this);
    }

    public void mcSetActivity(View view) {
        Intent intent;
        switch(activities1.getCheckedRadioButtonId()) {
            case R.id.act1_1:
                Toast.makeText(getApplicationContext(), " activity 1 ", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, activity1.class);
                startActivity(intent);
                break;
            case R.id.act1_2:
                Toast.makeText(getApplicationContext(), " activity 2 ", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, activity2.class);
                startActivity(intent);
                break;
            case R.id.act1_3:
                Toast.makeText(getApplicationContext(), " activity 3 ", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, activity3.class);
                startActivity(intent);
                break;
        }
    }
}