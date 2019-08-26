package com.aprianto.bookookoo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*

    clv = card list view
    cgv = card grid view

     */

    //deklarasi recycle view
    private RecyclerView rv_home;

    //deklarasi arraylist untuk menampilkan data list/grid
    private ArrayList<buku_model> bm = new ArrayList<>();

    //deklarasi dan inisialisasi id untuk menampilkan adapter mana yang tampil (grid/list)
    String id_mode = "1"; //default = 1 = list

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profile,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem  item) {
        switch (item.getItemId()){
            case R.id.profil: //intent ke halaman profil ketika action bar profil diklik
                Intent intent = new Intent(MainActivity.this, buku_profile.class);
                startActivity(intent);
                return true;

            case R.id.mode_grid: //intent ke tampilan awal dengan
                switch (id_mode){
                    case "1":
                        ModeCardGrid(); //saat di list ketika di tekan akan berubah menjadi grid
                        break;
                    case "2":
                        ModeCardList(); //saat di grid ketika di tekan akan berubah menjadi list
                        break;
                    default:
                        ModeCardList(); //default akan tampil list
                        break;
                }
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi recyclerview
        rv_home = findViewById(R.id.rv_home);
        rv_home.setHasFixedSize(true);

        //mengisi data ke setiap list
        bm.addAll(buku_data.getListData());

        //memulai tampilan list
        ModeCardList();
    }

    //method untuk memulai tampilan list
    private void ModeCardList(){
        id_mode = "1";
        rv_home.setLayoutManager(new LinearLayoutManager(this));
        buku_clvAdapter clv = new buku_clvAdapter(bm);
        rv_home.setAdapter(clv);
    }

    //method untuk memulai tampilan grid
    private void ModeCardGrid(){
        id_mode = "2";
        rv_home.setLayoutManager(new GridLayoutManager(this,2));
        buku_cgvAdapter cgv = new buku_cgvAdapter(bm);
        rv_home.setAdapter(cgv);
    }
}
