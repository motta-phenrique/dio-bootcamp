import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc1.next();

        System.out.println("Digite sua conta: ");
        int conta = sc1.nextInt();

        System.out.println("Digite sua agência: ");
        String agencia = sc1.next();

        System.out.println("Digite seu saldo: ");
        Double saldo = sc1.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar a conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para seu saque");

        sc1.close();
    }
}
