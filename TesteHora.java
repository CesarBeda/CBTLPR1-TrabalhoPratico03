/**
 * Classe TesteHora para testar a classe Hora.
 */
public class TesteHora {
    /**
     * O método principal que executa o teste.
     *
     * @param args Os argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Testando o construtor padrão e os métodos get
        Hora hora1 = new Hora();
        System.out.println("Hora1: " + hora1.getHora1());
        System.out.println("Hora1 (AM/PM): " + hora1.getHora2());
        System.out.println("Segundos desde meia-noite: " + hora1.getSegundos());
        System.out.println("Hora: " + hora1.getHor());
        System.out.println("Minutos: " + hora1.getMin());
        System.out.println("Segundos: " + hora1.getSeg());

        // Testando o construtor com parâmetros e os métodos set
        Hora hora2 = new Hora(13, 15, 30);
        System.out.println("\nHora2: " + hora2.getHora1());
        System.out.println("Hora2 (AM/PM): " + hora2.getHora2());
        System.out.println("Segundos desde meia-noite: " + hora2.getSegundos());

        hora2.setHor(15);
        hora2.setMin(30);
        hora2.setSeg(45);
        System.out.println("Hora2 após ajustes: " + hora2.getHora1());
        System.out.println("Hora2 (AM/PM) após ajustes: " + hora2.getHora2());
        System.out.println("Segundos desde meia-noite após ajustes: " + hora2.getSegundos());
    }
}