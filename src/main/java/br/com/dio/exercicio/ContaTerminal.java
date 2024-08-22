package desafio.com.dio.exercicio;

import java.util.Scanner;

public class ContaTerminal {

    public static Conta pegaInputUsario(){
        String porFavor = "Por favor, digite o ";
        Scanner scanner = new Scanner(System.in);

        System.out.println(porFavor + "número da agência !");
        String agencia = scanner.nextLine();

        System.out.println(porFavor + "número da conta !");
        int numeroConta = scanner.nextInt();

        System.out.println(porFavor + "nome do Cliente !");
        String nomeCliente = scanner.next();

        System.out.println(porFavor + "saldo da conta !");
        double saldo = scanner.nextDouble();
        return new Conta(numeroConta, agencia, nomeCliente, saldo);
    }

    public static void mensagemDeNovaConta(Conta conta){
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e saldo %.2f já esta disponível para saque.",
                        conta.getNomeCliente(), conta.getAgencia(), conta.getNumeroDaConta(), conta.getSaldo());
        System.out.println("\n" + mensagem);
    }

}
