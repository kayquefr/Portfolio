import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
    String nome = "Kepler";
    String tipoConta = "Corrente";
    Double saldo = 2000.00;
    Integer opcao= 0;
        System.out.println("##############################" );
        System.out.println("\nA conta de: " + nome);
        System.out.println("Conta é do tipo: " +tipoConta);
        System.out.println("e o saldo é de: " +saldo);
        System.out.println("\n##############################" );

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println(saldo);
            } else if (opcao == 2 ){
                System.out.println("Quanto deseja transferir?\n");
                Double transferencia = leitura.nextDouble();
                if (transferencia > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= transferencia;
                    System.out.println("O novo saldo é de" + saldo);
                }
                } else if (opcao == 3) {
                    System.out.println("Digite o valor a ser recebido\n");
                    Double recebido = leitura.nextDouble();
                    saldo += recebido;
                    System.out.println("O novo saldo é de: " +saldo);
                } else if (opcao != 4) {
                System.out.println("Opção inválida\n");
                
            }

        }

            }
        }



