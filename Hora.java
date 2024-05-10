import java.util.Scanner;

/**
 * Classe Hora para representar uma hora do dia.
 */
public class Hora {
    private int hora;
    private int min;
    private int seg;

    /**
     * Construtor padrão que solicita ao usuário que insira a hora, os minutos e os segundos.
     */
    public Hora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora:");
        setHor(scanner.nextInt());
        System.out.println("Digite os minutos:");
        setMin(scanner.nextInt());
        System.out.println("Digite os segundos:");
        setSeg(scanner.nextInt());

        scanner.close();
    }

    /**
     * Construtor que inicializa a hora, os minutos e os segundos com os valores fornecidos.
     *
     * @param h A hora.
     * @param m Os minutos.
     * @param s Os segundos.
     */
    public Hora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }

    /**
     * Define a hora.
     *
     * @param h A hora.
     */
    public void setHor(int h) {
        if (h >= 0 && h < 24) {
            this.hora = h;
        } else {
            System.out.println("Hora inválida. Redigite.");
        }
    }

    /**
     * Define os minutos.
     *
     * @param m Os minutos.
     */
    public void setMin(int m) {
        if (m >= 0 && m < 60) {
            this.min = m;
        } else {
            System.out.println("Minuto inválido. Redigite.");
        }
    }

    /**
     * Define os segundos.
     *
     * @param s Os segundos.
     */
    public void setSeg(int s) {
        if (s >= 0 && s < 60) {
            this.seg = s;
        } else {
            System.out.println("Segundo inválido. Redigite.");
        }
    }

    /**
     * Retorna a hora.
     *
     * @return A hora.
     */
    public int getHor() {
        return this.hora;
    }

    /**
     * Retorna os minutos.
     *
     * @return Os minutos.
     */
    public int getMin() {
        return this.min;
    }

    /**
     * Retorna os segundos.
     *
     * @return Os segundos.
     */
    public int getSeg() {
        return this.seg;
    }

    /**
     * Retorna a hora no formato hh:mm:ss.
     *
     * @return A hora no formato hh:mm:ss.
     */
    public String getHora1() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    }

    /**
     * Retorna a hora no formato hh:mm:ss AM/PM.
     *
     * @return A hora no formato hh:mm:ss AM/PM.
     */
    public String getHora2() {
        return String.format("%02d:%02d:%02d %s", (this.hora % 12 == 0 ? 12 : this.hora % 12), this.min, this.seg, (this.hora < 12 ? "AM" : "PM"));
    }

    /**
     * Retorna a quantidade total de segundos desde a meia-noite.
     *
     * @return A quantidade total de segundos desde a meia-noite.
     */
    public int getSegundos() {
        return this.hora * 3600 + this.min * 60 + this.seg;
    }
}