import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int palpite = 0;
        int tentativas = 0;
        int aleatorio = new Random().nextInt(20);

        while (tentativas < 5) {
            System.out.println("Digite seu palpite ou -1 para encerrar o jogo: ");
            palpite = leitura.nextInt();
            tentativas++;

            if (palpite == aleatorio) {
                System.out.println("Parabéns, voce Acertou o número!");
                break;
            } else if (palpite < aleatorio) {
                System.out.println("O Número digitado é menor do que o número gerado.");
            } else {
                System.out.println("O Número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5){
            System.out.println("Voce não conseguiu adivinha o número em 5 tentativas. O número era " + aleatorio);
        }
    }
}
