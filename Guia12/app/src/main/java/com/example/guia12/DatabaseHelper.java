package com.example.guia12;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Clase envoltura para el gestor de Bases de datos
 */
class DatabaseHelper extends SQLiteOpenHelper {


    public DatabaseHelper(Context context,
                          String name,
                          SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, name, factory, version);
    }

    public void onCreate(SQLiteDatabase database) {
        createTable(database); // Crear la tabla "students"
        loadDummyData(database); // Cargar 5 datos de prueba
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Actualizaciones
    }



    private void createTable(SQLiteDatabase database) {
        String cmd = "CREATE TABLE " + com.example.guia12.StudentsContract.STUDENTS + " (" +
                com.example.guia12.StudentsContract.Columnas._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                com.example.guia12.StudentsContract.Columnas.NOMBRE + " TEXT, " +
                com.example.guia12.StudentsContract.Columnas.APELLIDO + " TEXT, " +
                com.example.guia12.StudentsContract.Columnas.CARNET + " TEXT);";
        database.execSQL(cmd);
    }


    private void loadDummyData(SQLiteDatabase database) {

        ContentValues values = new ContentValues();
        values.put(com.example.guia12.StudentsContract.Columnas.NOMBRE, "Hugo");
        values.put(com.example.guia12.StudentsContract.Columnas.APELLIDO, "Valencia");
        values.put(com.example.guia12.StudentsContract.Columnas.CARNET, "GV050221");
        database.insert(com.example.guia12.StudentsContract.STUDENTS, null, values);

        values = new ContentValues();
        values.put(com.example.guia12.StudentsContract.Columnas.NOMBRE, "Hugo2");
        values.put(com.example.guia12.StudentsContract.Columnas.APELLIDO, "Valencia");
        values.put(com.example.guia12.StudentsContract.Columnas.CARNET, "GV050222");
        database.insert(com.example.guia12.StudentsContract.STUDENTS, null, values);


        values = new ContentValues();
        values.put(com.example.guia12.StudentsContract.Columnas.NOMBRE, "Hugo3");
        values.put(com.example.guia12.StudentsContract.Columnas.APELLIDO, "Valencia");
        values.put(com.example.guia12.StudentsContract.Columnas.CARNET, "GV050223");
        database.insert(com.example.guia12.StudentsContract.STUDENTS, null, values);


        values = new ContentValues();
        values.put(com.example.guia12.StudentsContract.Columnas.NOMBRE, "Hugo4");
        values.put(com.example.guia12.StudentsContract.Columnas.APELLIDO, "Valencia");
        values.put(com.example.guia12.StudentsContract.Columnas.CARNET, "GV050224");
        database.insert(com.example.guia12.StudentsContract.STUDENTS, null, values);


        values = new ContentValues();
        values.put(com.example.guia12.StudentsContract.Columnas.NOMBRE, "Hugo5");
        values.put(com.example.guia12.StudentsContract.Columnas.APELLIDO, "Valencia");
        values.put(com.example.guia12.StudentsContract.Columnas.CARNET, "GV050225");
        database.insert(com.example.guia12.StudentsContract.STUDENTS, null, values);

    }
}