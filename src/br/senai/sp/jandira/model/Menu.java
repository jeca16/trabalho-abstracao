package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    public void executarMenu(){
        boolean continuar = true;
        do {
            System.out.println("-------------------------------- Menu-----------------------------");
            System.out.println(" Escolha a sua area [1- Gerente, 2- Progamador]");
            System.out.println("------------------------------------------------------------------");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Gerencia gerencia = new Gerencia();
                    gerencia.gerencia();
                    break;

                case 2:

                    break;
            }

        }while (continuar);
    }
}
