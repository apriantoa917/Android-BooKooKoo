package com.aprianto.bookookoo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class buku_profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_profile);

        //set open email di textview email
        TextView email = findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mailto = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","apriantoa917@gmail.com", null));
                mailto.putExtra(Intent.EXTRA_SUBJECT, "Aplikasi BooKooKoo");
                view.getContext().startActivity(Intent.createChooser(mailto,"Kirim email"));
            }
        });

        //set link web untuk textview github
        LinearLayout github = findViewById(R.id.link_github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent github = new Intent(Intent.ACTION_VIEW);
                github.setData(Uri.parse("https://github.com/apriantoa917"));
                startActivity(github);
            }
        });

        //set link web untuk textview instagram
        LinearLayout instagram = findViewById(R.id.link_instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instagram = new Intent(Intent.ACTION_VIEW);
                instagram.setData(Uri.parse("https://www.instagram.com/aprianto.si/"));
                startActivity(instagram);
            }
        });

        //set link web untuk textview blog
        LinearLayout blog = findViewById(R.id.link_blog);
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blog = new Intent(Intent.ACTION_VIEW);
                blog.setData(Uri.parse("https://sites.google.com/view/apriantosi/beranda"));
                startActivity(blog);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //set tombol back
        getSupportActionBar().setTitle("Profil"); //judul toolbar
    }

}
