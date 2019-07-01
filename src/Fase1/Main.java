package Fase1;

import Fase1.Coet;

public class Main {

    public static void main(String[] args) {
        Coet coet1 = new Coet();
        coet1.setNombre("32WESSDS");

        coet1.setNumpropulsor(3);

        Coet coet2 = new Coet();
        coet2.setNombre("LDSFJA32");

        coet2.setNumpropulsor(6);

        System.out.println(" El coet 1 amb nom " + coet1.getNombre() + " té " + coet1.getNumpropulsor() + " propulsors");
        System.out.println(" El coet 2 amb nom " + coet2.getNombre() + " té " + coet2.getNumpropulsor() + " propulsors");



    }
}