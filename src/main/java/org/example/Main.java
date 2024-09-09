package org.example;

import Classes.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ContaTerminal Conta = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, digite o número da Agência: ");
        Conta.setAgencia(scanner.nextLine());

        System.out.print("Por favor, digite seu nome: ");
        Conta.setNomeCliente(scanner.nextLine());

        System.out.print("Por favor, digite o número da Conta !: ");
        Conta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o saldo da Conta: ");
        Conta.setSaldo(scanner.nextDouble());

        System.out.println("Olá " + Conta.getNomeCliente() + ", obrigado por criar uma Conta em nosso banco," +
                           " sua agência é " + Conta.getAgencia() + " e seu saldo de R$" + Conta.getSaldo() + " já está" +
                           " disponível para saque.");


    }
}