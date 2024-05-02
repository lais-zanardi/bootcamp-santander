import java.sql.SQLOutput;
import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;
//        System.out.println("Bem-vindo(a) ao Banco!\n");

        while (true) {
           // menu();
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                   // System.out.println("Insira o valor do depósito:");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    //  System.out.println("Insira o valor do saque:");
                    double saque = sc.nextDouble();

                    //Verifica se o saldo é suficiente
                    if(saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.err.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void menu() {
        System.out.println("" +
                "Por favor, selecione uma opção:\n\n" +
                "1. Depositar\n" +
                "2. Sacar\n" +
                "3. Consultar saldo\n" +
                "0. Encerrar\n");
}
}

