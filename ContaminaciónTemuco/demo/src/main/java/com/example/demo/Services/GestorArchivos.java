package com.example.demo.Services;

import java.io.*;
import java.util.ArrayList;

public class GestorArchivos {

    public ArrayList<String[]> leerDatos(String ubicacionArchivo) throws IOException {
        File f = new File(ubicacionArchivo);
        if(f.exists()){
            ArrayList<String []> datos = new ArrayList<>();
            String linea;
            FileReader fr = new FileReader(ubicacionArchivo);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            while((linea=br.readLine()) != null){
                datos.add(linea.split(","));
            }
            return datos;
        }
        else{
            return null;
        }
    }
}
