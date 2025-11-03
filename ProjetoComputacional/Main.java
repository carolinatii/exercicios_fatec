public class Main {
    public static void main(String[] args){
        ControlePredial cp = new ControlePredial();
        
        //Módulo Energia
        cp.adicionarModulo(new Energia ("Energia1", "Iluminacao", 120.0, true));    //começa ligada
        cp.adicionarModulo(new Energia("Energia2", "Tomadas", 90.0, false));     //começa desligada
        cp.adicionarModulo(new Energia("Energia3", "Equipamentos", 100.0,false));   //começa desligada

        //Módulo Ambiente
        cp.adicionarModulo(new Ambiente("Ambiente1", "Persianas", 3, false));   //começa desligada
        cp.adicionarModulo(new Ambiente("Ambiente2", "Ventilacao natural", 2, true));   //começa ligada
        cp.adicionarModulo(new Ambiente("Ambiente3", "Iluminacao natural", 1, true));   //começa ligada

        //Módulo Acesso
        cp.adicionarModulo(new Acesso( "Acesso1","Leitor biometrico","Area restrita", true));   //começa ligada
        cp.adicionarModulo(new Acesso("Acesso2", "Cartao RFID", "Sala de reunioes", true)); //começa ligada
        cp.adicionarModulo(new Acesso("Acesso3", "Fechadura eletronica", "Setor administrativo", true));    //começa ligada

        System.out.print("Estado  inicial: ");
        cp.exibirModulos();

        //Modificar modulos
        cp.ativarModulo("Energia3");   //Ativa Equipamentos
        cp.ativarModulo("Ambiente1");   //Ativa Persianas
        cp.desativarModulo("Acesso2");  //Desativa Cartão RFID
        cp.desativarModulo("Acesso3");  //Desativa Fechadura eletrônica

        System.out.print("\nApos alteracoes: ");
        cp.exibirModulos();

        System.out.println("\nModulos ativos por tipo: ");
        cp.exibirModuloAtivoPorTipo();

    }
}
