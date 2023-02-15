package com.tatiana.ejemplospring;

import com.tatiana.ejemplospring.model.Colors;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ColorsController {

    private static List<Colors>colores=new ArrayList<>();

    public ColorsController(){
        colores.add(new Colors(1,"negro", "01.01.01"));
        colores.add(new Colors(2,"rojo","0.0.0"));
    }
    @GetMapping("/colores")
    public List<Colors>getAllColors(){
        return colores;
    }
    @GetMapping("/colores/{id}")
    public Colors getColorsById(@PathVariable("id")Integer id){
        return colores.stream()
                .filter(c -> c.getIdcolors().equals(id))
                .findFirst()
                .get();
    }

    @GetMapping("/colores/{id}/{name}")
    public String getColorsById(@PathVariable("id")Integer id, @PathVariable("name") String name){
        return colores.stream()
                .filter(c -> c.getIdcolors().equals(id))
                .filter(c -> c.getDescription().equals(name))
                .findFirst()
                .get()
                .getRgb();
    }
    @GetMapping("/coloresQuery")
    public String getColorsById(@RequestParam("name")String name){
        return colores.stream()
                .filter(c -> c.getDescription().equals(name))
                .findFirst()
                .get()
                .getRgb();
    }
    @PostMapping("/colores")
    public String saveColors(@RequestBody Colors colors){
        colores.add(colors);
        return ("usted guardo color:Id: " + colors.getIdcolors() + " Description " + colors.getDescription());
    }
    @PutMapping("/colores/{id}")
    public String updateColors(@PathVariable("id") Integer id, @RequestBody Colors colors){

        colores.stream()
                .filter(c -> c.getIdcolors().equals(id))
                .findFirst()
                .get()
                .setDescription(colors.getDescription());
        return ("usted Acutilizó color:Id: " + colors.getIdcolors() + " con la Description " + colors.getDescription());
    }

    @DeleteMapping("/colores/{id}")
    public String deleteColors(@PathVariable("id") Integer id){

        Colors colorsToDelete = colores.stream()
                .filter(c -> c.getIdcolors().equals(id))
                .findFirst()
                .get();
                colores.remove(colorsToDelete);
        return ("usted elimino el color:Id: " + colorsToDelete.getIdcolors() + " con la Description "
                + colorsToDelete.getDescription());
    }


}
