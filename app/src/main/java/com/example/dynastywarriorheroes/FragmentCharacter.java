package com.example.dynastywarriorheroes;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FragmentCharacter extends Fragment implements OnItemClickListener<Hero>{

    private RecyclerView recyclerView;
    private List<Hero> heroes;

    @Override
    public void onClick(Hero hero, int position) {
        Intent intent= new Intent(getContext(), ProfileActivity.class);
        intent.putExtra("index", (heroes.size()-position-1));
        startActivity(intent);
    }

    public static FragmentCharacter newInstance() {
        FragmentCharacter fragment = new FragmentCharacter();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.activity_fragment_character, container, false);

        recyclerView= (RecyclerView) view.findViewById(R.id.rv_hero);
        recyclerView.setHasFixedSize(true);
        heroes= new ArrayList<>();
        heroes.addAll(HeroDataSource.getListData());
        Collections.reverse(heroes);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListHeroAdapter adapter= new ListHeroAdapter(heroes);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }
}