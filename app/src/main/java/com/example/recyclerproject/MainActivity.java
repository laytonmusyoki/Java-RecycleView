package com.example.recyclerproject;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<BlogModel> blogList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initData();
        initRecylerView();


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @SuppressLint("NotifyDataSetChanged")
    private void initRecylerView() {
        recyclerView=findViewById(R.id.recycler);
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new Adapter(blogList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        blogList.add(new BlogModel("Nairobi gossip","Flood detected at Nairobi County","All residents at Nairobi county are advised to stay indoors at this El-nino rains "));
        blogList.add(new BlogModel("Nairobi gossip","Flood detected at Nairobi County","All residents at Nairobi county are advised to stay indoors at this El-nino rains "));
        blogList.add(new BlogModel("Nairobi gossip","Flood detected at Nairobi County","All residents at Nairobi county are advised to stay indoors at this El-nino rains "));
        blogList.add(new BlogModel("Nairobi gossip","Flood detected at Nairobi County","All residents at Nairobi county are advised to stay indoors at this El-nino rains "));
        blogList.add(new BlogModel("Nairobi gossip","Flood detected at Nairobi County","All residents at Nairobi county are advised to stay indoors at this El-nino rains "));
    }
}