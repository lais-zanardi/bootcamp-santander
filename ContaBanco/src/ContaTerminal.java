import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta: ");
        int numero = sc.nextInt();
        System.out.println();

        System.out.println("Por favor, digite o numero da Agencia: ");
        String agencia = sc.next();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nome = sc.nextLine();
        sc.nextLine();

        System.out.println("Por favor, digite o Saldo: ");
        double saldo = sc.nextDouble();
        System.out.println();

        System.out.println("" +
                "Olá " + nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numero +
        " e seu saldo " + saldo +
        " já está disponível para saque."
        );


    }

}
