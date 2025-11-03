public class Ambiente extends Modulo {
    private String tipoControle;
    private int nivelAtuacao;
    
    //Construtor
    public Ambiente(String id,String tipoControle, int nivelAtuacao, boolean ativo){
        super(id,ativo);
        this.tipoControle = tipoControle;
        this.nivelAtuacao = nivelAtuacao;
    }

    @Override
    public String toString(){
        return "\nTipo de controle: " + tipoControle + "\nNivel de atuacao: " + nivelAtuacao + "\nStatus: " + super.toString();
    }

    //getters e setters
    public String getTipoControle(){
        return tipoControle;
    }
    public void setNivelAtuacao(String tipoControle){
        this.tipoControle = tipoControle;
    }

    public int getNivelAtuacao(){
        return nivelAtuacao;
    }
    public void setNivelAtuacao(int nivelAtuacao){
        this.nivelAtuacao = nivelAtuacao;
    }

}
