import java.util.ArrayList;

public class ControlePredial{
    private ArrayList<Modulo> modulos;
    
    //construtor
    public ControlePredial(){
        this.modulos = new ArrayList<>();

    }

    //metodo adicionar módulo
    public void adicionarModulo(Modulo m){
        modulos.add(m);    
    }

    //metodo exibir módulos
    public void exibirModulos(){
        for(int i=0; i<modulos.size();i++){
            Modulo m = modulos.get(i);
            System.out.println(m);
        }
    }   

    //metodo ativar módulo
    public void ativarModulo(String id){
        for(int i=0; i<modulos.size();i++)
        //compara o Id do módulo atual x Id descrito
        {
            Modulo m = modulos.get(i);
            if(m.getId().equals(id)){
                //ativa o módulo se for igual
                m.ativar();
                break;
            }

        }        
    }

    //metodo desativar módulo
    public void desativarModulo(String id){
        for(int i=0; i<modulos.size();i++){
            Modulo m = modulos.get(i);
            if(m.getId().equals(id)){
                m.desativar();
                break;
            }
        }
    }

    //método para exibir modulo ativo por tipo
    public void exibirModuloAtivoPorTipo(){
        System.out.print("\nEnergia: ");
        for(int i=0; i<modulos.size(); i++){
            Modulo m = modulos.get(i);
            if(m instanceof Energia && m.getAtivo()){
                System.out.println(m);
            }
        }

        System.out.print("\nAmbiente: ");
        for(int i=0; i<modulos.size(); i++){
            Modulo m = modulos.get(i);
            if(m instanceof Ambiente && m.getAtivo()){
                System.out.println(m);
            }
        } 
        
        System.out.print("\nAcesso: ");
        for(int i=0; i<modulos.size(); i++){
            Modulo m = modulos.get(i);
            if(m instanceof Acesso && m.getAtivo()){
                System.out.println(m);
            }
        }        
    }

}