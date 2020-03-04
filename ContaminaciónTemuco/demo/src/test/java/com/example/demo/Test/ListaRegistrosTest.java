package com.example.demo.Test;

import com.example.demo.Model.ListaRegistros;
import com.example.demo.Model.Registro;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ListaRegistrosTest {

    private ListaRegistros lista;

    @Before
    public void setUp() throws IOException {
        lista = new ListaRegistros();
    }

    @Test
    public void crearRegistros() throws IOException {
        ArrayList<Registro> registros = lista.getRegistros();
        System.out.println(registros.get(0).getMp2_5());
    }

    @Test
    void contar_dias_por_mes() {
    }

    @Test
    public void sacarPromediosPorMes() throws IOException {
        ListaRegistros lista1 = new ListaRegistros();
        ArrayList<Double> prom_mes = lista1.sacarPromediosPorMes(1);
        System.out.println(prom_mes.size());
        System.out.println();
        for(int i = 0; i < prom_mes.size(); i++){
            System.out.println(prom_mes.get(i));
        }
    }

    @Test
    void getRegistros() {
    }

    @Test
    void getDias_por_mes() {
    }
}