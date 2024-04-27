package application;

import domain.BankAccount;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a agência: ");
        String agency = sc.nextLine();
        System.out.print("Digite o saldo da conta: ");
        Double balance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o seu nome: ");
        String name = sc.nextLine();

        BankAccount bankAccount = new BankAccount(number, agency, name, balance);
        System.out.println(bankAccount);
    }
}
