import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}