package com.example.guia12;


import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private StudentsAdapter adaptador;

    Button btnAddStudent;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adaptador = new StudentsAdapter(this);

        btnAddStudent = findViewById(R.id.btnAddStudent);
        btnAddStudent.setOnClickListener(v -> {
            Intent intent = new Intent(getBaseContext(), AddStudentActivity.class);
            startActivity(intent);
        });

        list = findViewById(R.id.list);
        list.setAdapter(adaptador);

        retrieveStudents();
    }

    @Override
    protected void onResume() {
        super.onResume();

        retrieveStudents();
    }

    public void retrieveStudents() {
       String URL = "content://com.example.guia12/students";
        Uri students = Uri.parse(URL);
        Cursor c = getContentResolver().query(students, null, null, null, null);

        adaptador.swapCursor(c);
        adaptador.notifyDataSetChanged();
    }

    protected void activityAddStudent() {
        Intent intent = new Intent(getBaseContext(), AddStudentActivity.class);
        startActivity(intent);
    }
}

