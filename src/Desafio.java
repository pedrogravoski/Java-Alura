import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cliente = "";
        String tipoConta = "Corrente";
        double saldo = 1500.56;
        String menu = """
                **Digite sua opção**
                1- Consultar saldo
                2- Tranferir
                3- Depositar
                4- Sair
                """;
        int opcao = 0;
        int transferir = 0;
        int depositar = 0;

                System.out.println("*******************");
        System.out.println("\nNome do cliente: " + cliente);
        System.out.println("tipo de conta: " + tipoConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("*******************");


        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao > 4){
                System.out.println("NÚMERO INVALIDO!");
            }

            switch (opcao) {
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor desejado");
                    transferir = scanner.nextInt();
                    if(transferir > saldo){
                        System.out.println("Erro! Você não possui valor suficiente");
                    }else {
                        saldo = saldo - transferir;
                        System.out.println("Seu saldo agora é: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Qual o valor valor desejado: ");
                    depositar = scanner.nextInt();
                    saldo = saldo + depositar;
                    System.out.println("Seu saldo agora é: " + saldo);
                    break;
                case 4:
                    System.out.println("Tchau!!!");
                    break;
            }
        }
    }
}
