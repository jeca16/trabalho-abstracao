package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Gerencia {
    int bonus;

    public Gerencia () {
        Scanner scanner = new Scanner(System.in);
        public void gerencia () {
            System.out.println(" Digite o quanto você ganhou de bônus:");
            bonus = scanner.nextInt();
            scanner.nextLine();


        }
    }
}
