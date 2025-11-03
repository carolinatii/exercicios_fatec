public class Modulo {
    private String id;
    private boolean ativo;

    //construtores com sobrecarga
    public Modulo(String id){
        this.id = id;
    }

    public Modulo(String id, boolean ativo){
        this(id);
        this.ativo = ativo;
    }
    //métodos de acesso: getters
    public String getId(){
        return id;
    }
    public boolean getAtivo(){
        return ativo;
    }

    //métodos
    public void ativar(){
        ativo = true;
    }
    public void desativar(){
        ativo = false;

    }
    public String toString() {
    if (getAtivo()) {
        return "Ativado";
    } else {
        return "Desativado";
    }
}

    
}