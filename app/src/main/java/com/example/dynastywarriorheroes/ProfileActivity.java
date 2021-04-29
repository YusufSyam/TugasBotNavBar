package com.example.dynastywarriorheroes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    private Hero hero= new Hero();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        ImageView hero_image= findViewById(R.id.iv_hero);
        TextView hero_name= findViewById(R.id.tv_hero_name);
        TextView hero_detail= findViewById(R.id.tv_hero_detail);
        TextView hero_forces= findViewById(R.id.tv_hero_forces);
        TextView hero_gender= findViewById(R.id.tv_hero_gender);
        TextView hero_weapon= findViewById(R.id.tv_hero_weapon);
        TextView hero_height= findViewById(R.id.tv_hero_height);
        TextView hero_born= findViewById(R.id.tv_hero_born);
        TextView hero_type= findViewById(R.id.tv_hero_type);

        Bundle extras= getIntent().getExtras();
        if(extras!=null) {
            int index= extras.getInt("index");
            hero= HeroDataSource.getHeroData(index);

            hero_image.setImageResource(hero.getPhoto());
            hero_name.setText(hero.getName());
            hero_detail.setText(hero.getDetail());
            hero_forces.setText(hero.getForces());
            hero_type.setText(hero.getType());
            hero_gender.setText(hero.getGender());
            hero_weapon.setText(hero.getWeapon());
            hero_height.setText(hero.getHeight());
            hero_born.setText(hero.getBorn());
        }

    }

    public void back(View view) {
        finish();
    }
}
