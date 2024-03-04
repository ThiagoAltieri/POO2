interface InterfaceEletrica {
     default void ativarModoEco(){
          System.out.println("Ativando modo ECO");
     }
     default void carregar(int voltagem){
          System.out.println("Carregando com voltagem " + voltagem);
     }
}

