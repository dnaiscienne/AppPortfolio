package com.example.dc.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Context context = getApplicationContext();
        CharSequence appName = "None";
        int duration = Toast.LENGTH_SHORT;
        switch(view.getId()){
            case R.id.spotify:
                appName = getString(R.string.spotify_streamer);
                break;
            case R.id.movies:
                appName = getString(R.string.popular_movies);
                break;
            case R.id.superduo:
                appName = getString(R.string.super_duo);
                break;
            case R.id.build:
                appName = getString(R.string.build_bigger);
                break;
            case R.id.material:
                appName = getString(R.string.material_design);
                break;
            case R.id.capstone:
                appName = getString(R.string.capstone_app);
                break;
        }
        CharSequence text = String.format(getString(R.string.sample_toast), appName);
        Toast.makeText(context, text, duration).show();
    }
}
