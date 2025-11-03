public class Acesso extends Modulo {
    private String tipoDispositivo;
    private String areaControlada;

    //Construtor
    public Acesso(String id, String tipoDispositivo, String areaControlada, boolean ativo){
        super(id,ativo);   
        this.tipoDispositivo = tipoDispositivo;
        this.areaControlada = areaControlada;
     
    }
    @Override
    public String toString(){
        return "\nTipo de dispositivo: " + tipoDispositivo + "\nArea controlada: " + areaControlada + "\nStatus: " + super.toString();
    }

    //getters e setters
    public String getTipoDispositivo(){
        return tipoDispositivo;
    }
    public void setTipoDispositivo(String tipoDispositivo){
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getAreaControlada(){
        return areaControlada;
    }
    public void setAreaControlada(String areaControlada){
        this.areaControlada = areaControlada;
    }


}
