package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static Baraja mibaraja = new Baraja();

    static Jugador jugador = new Jugador();
    static Jugador crupier = new Jugador();


    public static void main(String[] args) {

        final int BLACKJACK = 21;

        repartirCartasIniciales();

       turnoJugador();


      //  turnoCrupier();

      //  compararResultado();

    }

    private static void compararResultado() {
        /*Si el crupier se ha pasado
Si el jugador se ha pasado
No gana nadie
sino
Gana Jugador

Sino
Si el jugador se ha pasado
Gana Croupier
sino
Si el jugador tiene mas puntos que el crupier
Gana Jugador
Sino
Si el jugador y el crupier tienen los mismos puntos
Empate
Sino
Gana Croupier*/
    }

    private static void turnoCrupier() {
        /*Mientras los puntos de la mano sean menores a 17
Sacar una carta de la baraja y añadirla a la mano del crupier
Enseñar la mano y los puntos*/
    }

    private static void turnoJugador() {
        /* /*METODOS
       JUGADOR: anyadirCarta, puntosTotales, mostrarMano
       BARAJA: imprimirBaraja, crearBaraja, sacarCarta
       CARTA: imprimir*/
        /*1->Plantarse
Enseñar resumen, cartas, puntos
2->Pedir Carta
Sacar una carta de la baraja y añadirla en la mano del jugador
Enseñar la mano y los puntos
Si los puntos son mayores BLACKJACKàte has pasado
Le toca al crupier

Si los puntos son iguales BLACKJACKàhas ganado

Le toca al crupier*/
        int eleccion;
        Carta c;

        System.out.println("TURNO JUGADOR");
        System.out.println("Elige una accioón: 1.Plantarse 2.Pedir Carta");
        eleccion = sc.nextInt();
        switch (eleccion){
            case 1:
                c = mibaraja.sacarCarta();
                jugador.anyadirCarta(c);
                jugador.mostrarMano();

                break;
            case 2:
                break;
            default:
                System.out.println("Error al elegir");
        }



    }

    private static void repartirCartasIniciales() {
        Carta c;
        int ronda = 1;

        //DOS RONDAS
        while(ronda<=2){
            System.out.println("JUGADOR RONDA "+ronda);
            c= mibaraja.sacarCarta();
            jugador.anyadirCarta(c);
            jugador.mostrarMano();

            c= mibaraja.sacarCarta();
            crupier.anyadirCarta(c);
            if (ronda == 1){
                System.out.println("CRUPIER RONDA "+ronda);
                crupier.mostrarMano();
            }
            ronda++;
        }

      // mibaraja.imprimirBaraja();
    }

}
