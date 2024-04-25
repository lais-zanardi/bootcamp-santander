import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean inputValido = false;
        int numero = 0;
        String agencia = "";
        String nome = "";
        double saldo = 0;

        do {
            try {
                System.out.println("Por favor, digite o numero da Conta: ");
                numero = sc.nextInt();
                sc.nextLine();

                System.out.println("\nPor favor, digite o numero da Agencia: ");
                agencia = sc.next();
                sc.nextLine();

                System.out.println("\nPor favor, digite o nome do Cliente: ");
                nome = sc.nextLine();
                sc.nextLine();

                System.out.println("Por favor, digite o Saldo: ");
                saldo = sc.nextDouble();
                sc.nextLine();

                inputValido = true;

            } catch (InputMismatchException e) {
                System.err.println("Erro ao ler dados. Por favor, tente novamente.");
                sc.next();
            }
        } while (!inputValido);
        sc.close();
        String mensagem = String.format("\n" +
                "Olá, %s!\n" +
                "Obrigado por criar uma conta em nosso banco.\n" +
                "Sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.\n", nome, agencia, numero, saldo);

        System.out.println(mensagem);
    }

    }
