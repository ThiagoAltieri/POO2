interface InterfaceTransporte {
     default void controleDeCarga(double peso, int distancia) {
        System.out.println("Controlando carga");
    };

     default void calcularRota(String[] pontosDeEntrega) {
        System.out.println("Calculando rota");
    };
}
