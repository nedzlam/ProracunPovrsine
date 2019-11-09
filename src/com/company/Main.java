package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a, b, c;
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite duzinu stranice: ");
        a = unos.nextDouble();
        while (a <= 0) {
            System.out.println("Potrebno je unijeti pozitivan broj!");
            System.out.println("Unesite duzinu stranice: ");
            a = unos.nextDouble();
        }
        System.out.println("Unesite sirinu stranice: ");
        b = unos.nextDouble();
        while (b <= 0) {
            System.out.println("Potrebno je unijeti pozitivan broj!");
            System.out.println("Unesite duzinu stranice: ");
            b = unos.nextDouble();
        }
    c = a * b;
        System.out.println("Površina iznosi: " + c);
    }
}
