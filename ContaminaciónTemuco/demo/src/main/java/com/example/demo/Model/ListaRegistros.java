package com.example.demo.Model;

import com.example.demo.Services.GestorArchivos;

import java.io.IOException;
import java.util.ArrayList;

public class ListaRegistros {

    public ListaRegistros() throws IOException {
        crearRegistros("src\\main\\java\\com\\example\\demo\\Files\\2019.csv");
        contar_dias_por_mes();
    }

    private ArrayList<Integer> dias_por_mes = new ArrayList<>();
    private ArrayList<Registro> registros = new ArrayList<>();

    public void crearRegistros(String ubicacionArchivo) throws IOException {
        GestorArchivos g = new GestorArchivos();
        ArrayList<String[]> datos = g.leerDatos(ubicacionArchivo);
        for(int i = 0; i < datos.size(); i++){
            registros.add(new Registro(datos.get(i)[0],Integer.parseInt(datos.get(i)[1]),Integer.parseInt(datos.get(i)[2]),Double.parseDouble(datos.get(i)[3]),Double.parseDouble(datos.get(i)[4]),Double.parseDouble(datos.get(i)[5])));
        }
    }

    public void contar_dias_por_mes(){
        int contador = 0;
        int mesTemp = registros.get(0).getMes();
        for(int i = 0; i < registros.size(); i++){
            if(i == registros.size()-1){
                contador = contador + 5;
                dias_por_mes.add(contador/5);
                System.out.println(contador/5);
                contador = 0;
            }
            else if(mesTemp != registros.get(i).getMes()){
                mesTemp = registros.get(i).getMes();
                dias_por_mes.add(contador/5);
                System.out.println(contador/5);
                contador = 0;
            }
            contador++;
        }
    }

    public ArrayList<Double> sacarPromediosPorMes(int n){
        ArrayList<Double> promedio_por_meses = new ArrayList<>();
        double contador = 0;
        int i = 0;
        for(int j = 0; j < dias_por_mes.size(); j++){
            for(int k = 0; k < 5; k++){
                for(int p = 0; p < dias_por_mes.get(j); p++){
                    if(n == 1){
                        contador = contador + registros.get(i).getTemperatura();
                    }
                    else if(n == 2){
                        contador = contador + (int)registros.get(i).getMp2_5();
                    }
                    else if(n == 3){
                        contador = contador + (int)registros.get(i).getMp10();
                    }
                    i++;
                }
                contador = contador / dias_por_mes.get(j);
                promedio_por_meses.add(contador);
                contador = 0;
            }
        }
        return promedio_por_meses;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public ArrayList<Integer> getDias_por_mes() {
        return dias_por_mes;
    }
}

