package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.13.​ Parašykite programą kuri paprašytų vartotojo įvesti skaičių kvadrato skaičiavimui.
        // Skaičiavimams sukurkite naują klasę. Skaičiavimas turi būti atliekas kitame metode ir
        // grąžintu rezultatą. Jį spausdinti ekrane. Naudokite formulę rezultatas = a^2 bei MATH
        // BIBLIOTEKA return Math.pow(a, 2);
        // 1.14​. Papildykite 1.13​. Programą nauju metodu kuris apskaičiuotu stačiakampio plotą.
        // Rezultatą spausdinti ekrane. Formulė rezultatas =a*b​.
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        double sk1 = sc.nextDouble();
        Skaiciavimas.kvadratas(sk1);
        System.out.println("Iveskite du skaicius plotui skaiciuoti: ");
        double sk2 = sc.nextDouble();
        double sk3 = sc.nextDouble();
        Skaiciavimas.plotas(sk2, sk3);
    }
}
