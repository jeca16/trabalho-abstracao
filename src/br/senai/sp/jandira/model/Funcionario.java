package br.senai.sp.jandira.model;

abstract class Funcionario extends Gerencia {
    private double salarioBase = 1.320;
     String nome;
    int id;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(){
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}

