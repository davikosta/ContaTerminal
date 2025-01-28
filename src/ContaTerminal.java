import java.util.Scanner;

public class ContaTerminal {
    public static String numeroConta;

    public static String numeroAgencia;

    public static String nomeCliente;

    public static float saldoInicial;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao terminal Insira as informações solicitadas e pressione enter para criar a sua conta");

        System.out.println("Por favor, insira o número da sua conta:");

        setNumeroConta(scanner.nextLine());

        System.out.println("Insira o número da agência");

        setNumeroAgencia(scanner.nextLine());

        System.out.println("Insira o seu nome completo");

        setNomeCliente(scanner.nextLine());

        System.out.println("Quase lá! Agora insira o saldo inicial da sua conta");

        setSaldoInicial(scanner.nextFloat());

        //%s String, %d double, %.2f float
        //Nome > agência > conta> saldo
        System.out.printf("Olá %s," +
                " obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %s" +
                " e seu de saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldoInicial);

    }

    public static void setNumeroConta(String numero) {
        numeroConta = numero;
    }

    public static void setNumeroAgencia(String numero) {
        numeroAgencia = numero;
    }

    public static void setNomeCliente(String nome) {
        nomeCliente = nome;
    }

    public static void setSaldoInicial(float saldo) {
        saldoInicial = saldo;
    }


}