import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void cadastrarJogador(){
        System.out.println("Bem vindo ao menu de cadastro de jogadores!");
        System.out.println("Comece inserindo o nome do seu Jogador: ");
        String nomeJogador = sc.nextLine();

        System.out.println("Agora insira o over do seu jogador(Nivel de habilidade): ");
        int over = sc.nextInt();
        sc.nextLine();

        System.out.println("Em que posição o seu atleta atua? ");
        String posicao = sc.nextLine();

        System.out.println("Qual idade do seu jogador? ");
        int idade = sc.nextInt();

        System.out.println("Agora informe o valor do seu Jogador: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        Jogador novoJogador = new Jogador(nomeJogador, over, posicao, idade, valor);
        jogadores.add(novoJogador);

        System.out.printf("O jogador %s assinou o contrato.", nomeJogador);
    }
}
