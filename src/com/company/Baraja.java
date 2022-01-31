package com.company;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> listaCartas;

    public Baraja() {
        listaCartas = new ArrayList<>();
        crearBaraja();
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.listaCartas = cartas;
    }

    public ArrayList<Carta> getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(ArrayList<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }

    //metodos proprios

    public void imprimirBaraja() {
        //para comprobar que está bien
        for (Carta c : listaCartas) {
            c.imprimir();
        }
    }

    public void crearBaraja() {
        //añadir a la lista todas las cartas
        String[] numeros = {"AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] palos = {"corazones", "diamantes", "treboles", "picas"};
        int[] valor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                listaCartas.add(new Carta(numeros[j], palos[i], valor[j]));
            }
        }
    }

    public Carta sacarCarta() {
     /*  aleatoriamente sacar un numero,
        Eliminar la carta que este en la posición del numero
        Devolver la carta eliminada  */

        int aleatorio;
        Carta carta;

        aleatorio = (int) (Math.random() * listaCartas.size());
        carta = listaCartas.get(aleatorio);
        listaCartas.remove(aleatorio);

        return carta;
    }
}
