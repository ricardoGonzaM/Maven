package com.devpredator.practicajsf.services;
import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

public class RestauranteService {
public List <Restaurante> consultarRestaurantes(){
	List <Restaurante> restaurantes = new ArrayList<Restaurante>();
	
	Restaurante r1 = new Restaurante();
    Restaurante r2 = new Restaurante();
    Restaurante r3 = new Restaurante();
    Restaurante r4 = new Restaurante();
    Restaurante r5 = new Restaurante();

    Gerente g1 = new Gerente();
    Gerente g2 = new Gerente();
    Gerente g3 = new Gerente();
    Gerente g4 = new Gerente();
    Gerente g5 = new Gerente();

    g1.setNombre("Javier");
    g1.setPrimerApellido("Panigua");
    g1.setSegundoApellido("Lopez");
    r1.setNombre("Doca");
    r1.setDireccion("Direccion 1");
    r1.setPais("Estados Unidos");

    g2.setNombre("Misael");
    g2.setPrimerApellido("Guerrero");
    g2.setSegundoApellido("Lopez");
    r2.setNombre("La Pepa");
    r2.setDireccion("Direccion 2");
    r2.setPais("Argentina");

    g3.setNombre("Elizabeth");
    g3.setPrimerApellido("López");
    g3.setSegundoApellido("Romero");
    r3.setNombre("La Veranda");
    r3.setDireccion("Direccion 3");
    r3.setPais("Chile");

    g4.setNombre("Aura");
    g4.setPrimerApellido("Guerrero");
    g4.setSegundoApellido("Gómez");
    r4.setNombre("Ritual");
    r4.setDireccion("Direccion 5");
    r4.setPais("Colombia");


    g5.setNombre("Martin");
    g5.setPrimerApellido("López");
    g5.setSegundoApellido("Romero");
    r5.setNombre("Wings");
    r5.setDireccion("Direccion 4");
    r5.setPais("España");

    r1.setGerente(g1);
    r2.setGerente(g2);
    r3.setGerente(g3);
    r4.setGerente(g4);
    r5.setGerente(g5);

    restaurantes.add(r1);
    restaurantes.add(r2);
    restaurantes.add(r3);
    restaurantes.add(r4);
    restaurantes.add(r5);

    return restaurantes;
}
}
