package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;


import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        int value = Integer.parseInt(meuTituloOmdb.year().replaceAll("[^0-9]", ""));
        this.anoDeLancamento = value;
        if(meuTituloOmdb.runtime().equals("N/A")){
            this.duracaoEmMinutos = 0;
        }else{
            this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
        }


    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de Lanacameto: "+ anoDeLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;

    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome='" + nome + '\'' + ", anoDeLancamento= " + anoDeLancamento + ", "+ "Duracao em minutos: "+ duracaoEmMinutos + ")";
    }
}
