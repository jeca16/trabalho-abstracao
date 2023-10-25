package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Programador {

    int horas;

    Scanner scanner = new Scanner(System.in);
    public void programador(){
        System.out.println(" Digite o quanto você ganhou de horas extras:");
        horas = scanner.nextInt();
        scanner.nextLine();


    }
}
