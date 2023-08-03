import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int operacao = 0;
        int saldo = 0;
        String menu = """
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        while (operacao != 4) {
            System.out.println(menu);
            operacao = leitura.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Saldo Atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    int valorRecebido = leitura.nextInt();
                    saldo += valorRecebido;
                    System.out.println("Valor recebido com sucesso. Saldo Atual: " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir: ");
                    int valorTransferencia = leitura.nextInt();
                    if( saldo < valorTransferencia){
                        System.out.println("Não há saldo suficiente para fazer essa transferencia");
                        break;
                    }
                    saldo -= valorTransferencia;
                    System.out.println("Valor recebido transferido com sucesso. Saldo Atual: " + saldo);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcão inválida. Escolha novamente.");
            }
        }
    }
}
