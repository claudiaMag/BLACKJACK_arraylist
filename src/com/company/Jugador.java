package com.company;

import java.util.ArrayList;

public class Jugador {
    private ArrayList <Carta> cartasMano;
    int puntos;

    public Jugador() {
        cartasMano = new ArrayList<>();
        puntos = 0;
    }

    public Jugador(ArrayList<Carta> cartas, int puntos) {
        this.cartasMano = cartas;
        this.puntos = puntos;
    }

    public ArrayList<Carta> getCartasMano() {
        return cartasMano;
    }

    public void setCartasMano(ArrayList<Carta> cartasMano) {
        this.cartasMano = cartasMano;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void anyadirCarta(Carta c){
        //añadir una carta a la lista de cartas)
        cartasMano.add(c);
    }

    public void puntosTotales(){
        /*(recorrer la lista de cartas que forman la mano
          sumar su puntuacion, si hay un as y darle el mejor valor 1 o 11)*/
        int as = 0;

        for (int i = 0; i < cartasMano.size(); i++) {
            puntos += cartasMano.get(i).getValor();
            /*if (cartasMano.get(i).getNumero().equals("AS")){
            }*/
        }
    }

    public void mostrarMano(){
        /* Enseñar la puntuacion total de esas cartas*/

        for (Carta c: cartasMano) {
            c.imprimir();
        }
        System.out.println("Los puntos totales son "+puntos);

    }
}
