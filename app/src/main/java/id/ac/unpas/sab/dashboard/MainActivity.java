package id.ac.unpas.sab.dashboard;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    Atribut
    RecyclerView recyclerView;
    ArrayList<SetterGetter> datamenu;
    GridLayoutManager gridLayoutManager;
    DashBoardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_menu);
        addData();;
        gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new DashBoardAdapter(datamenu);
        recyclerView.setAdapter(adapter);

    }

    public void addData(){
        datamenu = new ArrayList<>();
        datamenu.add(new SetterGetter("Paket", "logomenu1"));
        datamenu.add(new SetterGetter("Listrik", "logomenu2"));
        datamenu.add(new SetterGetter("Ojek", "logomenu3"));
        datamenu.add(new SetterGetter("Isi Pulsa", "logomenu4"));
        datamenu.add(new SetterGetter("Berita", "logomenu5"));
        datamenu.add(new SetterGetter("Makanan", "logomenu6"));
        datamenu.add(new SetterGetter("Pijat", "logomenu7"));
        datamenu.add(new SetterGetter("Tiket", "logomenu8"));
        datamenu.add(new SetterGetter("Liburan", "logomenu9"));

    }
}
