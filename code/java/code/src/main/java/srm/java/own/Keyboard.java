package srm.java.own;

import static srm.java.own.System.out.println;
import static srm.java.own.System.out.println;
import java.util.Scanner;

public class Keyboard {
    private Keyboard() {
        /////
    }

    public static Scanner sc = new Scanner(System.in);

    /**
     * Leer números enteros por teclado
     * 
     * @param message String. Mensaje que será mostrado al usuario como información
     * @return int. Entero "capturado" por teclado
     */
    public static int readI(String message) {
        winfo(message);
        int number = sc.nextInt();
        return number;
    }

    /**
     * Leer cadena de texto por teclado
     * 
     * @param message String. Mensaje que será mostrado al usuario como información
     * @return String. Cadena de texto "capturada" por teclado
     */
    public static String readT(String message) {
        winfo(message);
        String str = sc.nextLine();
        return str;
    }

    /**
     * Leer caracter por teclado
     * 
     * @param message String. Mensaje que será mostrado al usuario como información
     * @return String. Cadena de texto "capturada" por teclado
     */
    public static char readC(String message) {
        winfo(message);
        char letter = sc.next().charAt(0);
        return letter;
    }

    /**
     * Leer caracter por teclado
     * 
     * @param message String. Mensaje que será mostrado al usuario como información
     * @return String. Cadena de texto "capturada" por teclado
     */
    public static char readC(String message, char typeLetter) {
        winfo(message);
        char letter = ' ';
        switch (typeLetter) {
            case 'm':
                letter = sc.next().toLowerCase().charAt(0);
                break;
            case 'M':
                letter = sc.next().toUpperCase().charAt(0);
            default:
                werror("Ingrese (m) para minúsculas y (M) para mayúsculas");
        }
        return letter;
    }

    /**
     * Leer números "flotantes" por teclado
     * 
     * @param message String. Mensaje que será mostrado al usuario como información
     * @return float. Número de punto/coma flotante (decimal) "capturado" por
     *         teclado
     */
    public static float readF(String message) {
        winfo(message);
        float number = sc.nextFloat();
        return number;
    }

    /**
     * Leer números decimales con doble presición por teclado
     * 
     * @param message String. Mensaje que será mostrado al usuario como información
     * @return double. Número de punto/coma flotante con doble presición "capturado"
     *         por teclado
     */
    public static double readD(String message) {
        winfo(message);
        double number = sc.nextDouble();
        return number;
    }

    /**
     * Leer números "grandes" por teclado
     * 
     * @param message String. Mensaje que será mostrado al usuario como información
     * @return long. Número de gran longitud "capturado" por teclado
     */
    public static long readL(String message) {
        winfo(message);
        long number = sc.nextLong();
        return number;
    }

    /**
     * Cerrar Scanner
     */
    public static void closeSc() {
        sc.close();
    }
}
