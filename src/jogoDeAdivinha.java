import java.util.Scanner;
import java.util.Random;


public class jogoDeAdivinha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100); // Numero aleatorio de 0 - 100
        int tentativas = 0;

        System.out.println("Bem vindo ao jogo *QUE NUMERO É ESSE*.");
        System.out.println("Você tem 5 tentativas para saber qual o numero aleatorio, o jogo vai lhe dizer dicas se esta para mais ou menos.");

        // Essa proxima parte é para boas vindas e explicando o jogo
        while (tentativas < 5) {
            System.out.println("Digite o numero entre 0 a 100 para começar o jogo, sera que você acerta de primeira?");
            int numeroEscrito = leitor.nextInt();
            tentativas++;

            // Codigo do jogo
            if (numeroEscrito == numeroAleatorio) {
                System.out.println("Parabens, você acertou o número em " + tentativas + " tentativas");
                break;
            } else if (numeroEscrito < numeroAleatorio) {
                System.out.println(" O numero escolhido e maior que o número que você escolheu ");
            } else {
                System.out.println(" O numero escolhido é menor que o número que você escolheu ");
            }


        }

        if (tentativas == 5) {
            System.out.println("Que pena, não foi dessa vez, o número criado era " + numeroAleatorio);

        }

    }
}