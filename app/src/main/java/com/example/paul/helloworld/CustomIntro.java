package com.example.paul.helloworld;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by paul on 29/07/15.
 */
public class CustomIntro extends AppIntro {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(AppIntroFragment.newInstance("paulo", "Description here...\nYeah, I've added this fragment programmatically",
                R.drawable.drunk, R.color.material_blue_grey_800));
        addSlide(AppIntroFragment.newInstance("paulo", "Description here...\nYeah, I've added this fragment programmatically",
                R.drawable.dog, R.color.background_floating_material_dark));
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));
        showSkipButton(false);
        setVibrate(true);
        setVibrateIntensity(30);
    }
    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onSkipPressed() {
        loadMainActivity();
    }
    @Override
    public void onDonePressed() {
        loadMainActivity();
    }
    public void getStarted(View v){
        loadMainActivity();
    }
}

