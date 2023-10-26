package com.claudio.aulaii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private List<String> names = new ArrayList<>();
    private RecyclerView recyclerView;
    private NameAdapter nameAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);

        names.add("Claudio");
        names.add("Allan");
        names.add("Vitor");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        nameAdapter = new NameAdapter(names);
        recyclerView.setAdapter(nameAdapter);

        //Atualizacao no meu Adapter
        nameAdapter.notifyItemInserted(names.size() - 1);

        System.out.println("Names: " + names);
    }

    private void addName() {
        names.add("Rogerio");
    }
}