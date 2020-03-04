package com.example.demo.Controller;
import com.example.demo.Model.ListaRegistros;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("")
public class RegistroController {

    private final ListaRegistros lista = new ListaRegistros();

    public RegistroController() throws IOException {
    }
    @RequestMapping("")
    public String index(Model modelo) {
        modelo.addAttribute("registros",lista.getRegistros());
        modelo.addAttribute("dias_por_mes",lista.getDias_por_mes());
        modelo.addAttribute("promedio_temperatura",lista.sacarPromediosPorMes(1));
        modelo.addAttribute("promedio_PM2_5",lista.sacarPromediosPorMes(2));
        modelo.addAttribute("promedio_PM10",lista.sacarPromediosPorMes(3));
        return "index";
    }
}
