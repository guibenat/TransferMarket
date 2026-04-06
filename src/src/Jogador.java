public class Jogador {
    private String nomeJogador;
    private int idade;
    private double valor;
    private String posicao;
    private int over;

    public Jogador(String nomeJogador, int idade, double valor, String posicao, int over) {
        this.nomeJogador = nomeJogador;
        this.idade = idade;
        this.valor = valor;
        this.posicao = posicao;
        this.over = over;
    }

    public String getNomeJogador(){return nomeJogador;}
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getidade(){
        return idade;
    }
    public void setNomeJogador(int idade) {
        this.idade = idade;
    }

    public double getvalor(){
        return valor;
    }
    public void setvalor(double valor) {
        this.valor = valor;
    }

    public String getposicao(){
        return posicao;
    }
    public void setposicao(String posicao) {
        this.posicao = posicao;
    }

    public int getover(){return over;}
    public void setover(int over) {
        this.over = over;
    }
}
