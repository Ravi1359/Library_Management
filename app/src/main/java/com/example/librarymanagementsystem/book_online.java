package com.example.librarymanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class book_online extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_online);
    }

    public void cn(View view) {
        String value = "https://csc-knu.github.io/sys-prog/books/Andrew%20S.%20Tanenbaum%20-%20Computer%20Networks.pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));
        startActivity(intent);
    }

    public void os(View view) {
        String value = "https://drive.uqu.edu.sa/_/mskhayat/files/MySubjects/2017SS%20Operating%20Systems/Abraham%20Silberschatz-Operating%20System%20Concepts%20(9th,2012_12).pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));
        startActivity(intent);
    }

    public void db(View view) {
        String value = "https://mrcet.com/downloads/digital_notes/ECE/III%20Year/DATABASE%20MANAGEMENT%20SYSTEMS.pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));
        startActivity(intent);
    }

    public void ds(View view) {
        String value = "https://www.cs.bham.ac.uk/~jxb/DSA/dsa.pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));
        startActivity(intent);
    }

    public void md(View view) {
        String value = "https://www.cs.cmu.edu/~bam/uicourse/830spring09/BFeiginMobileApplicationDevelopment.pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));
        startActivity(intent);
    }

    public void oo (View view) {
        String value = "https://www.cl.cam.ac.uk/teaching/1011/OpSystems/os1a-slides.pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));
        startActivity(intent);
    }

    public void un(View view) {
        String value = "https://www.tutorialspoint.com/unix/unix_tutorial.pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));
        startActivity(intent);
    }
}