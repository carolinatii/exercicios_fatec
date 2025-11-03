public class Energia extends Modulo{
    private String tipoConsumo;
    private double consumoAtual;

    //Construtor
    public Energia(String id,String tipoConsulmo, double consumoAtual, boolean ativo){
        super(id,ativo);
        this.tipoConsumo = tipoConsulmo;
        this.consumoAtual = consumoAtual;
    }

    @Override
    public String toString(){
        return "\nTipo de consumo: " + tipoConsumo + "\nConsumo atual: " + consumoAtual + "kWh\nStatus: " + super.toString();
    }

    //getters e setters
    public String getTipoConsumo(){
        return tipoConsumo;
    }
    public void setTipoConsumo(String tipoConsumo){
        this.tipoConsumo = tipoConsumo;
    }

    public double getConsumoAtual(){
        return consumoAtual;
    }
    public void setConsumoAtual(int consumoAtual){
        this.consumoAtual = consumoAtual;
    }


}