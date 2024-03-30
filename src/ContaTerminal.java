import java.util.Scanner;

public class ContaTerminal {
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Conta c1;

        System.out.print("Digite o número da conta: ");
        int numero = SCAN.nextInt();
        SCAN.nextLine();
        System.out.print("Digite a agência da conta: ");
        String agencia = SCAN.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = SCAN.nextLine();
        System.out.print("Digite seu saldo: R$");
        double saldo = SCAN.nextDouble();

        c1 = new Conta(numero, agencia, nome, saldo);
        c1.apresentacaoBoasVindas();

    }
}
