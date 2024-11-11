package srm.java.arrays.arrayList;

// Haz un programa genere n números aleatoriamente y se guarden 
//en un arreglo (la cantidad es ingresada por teclado), después de n números, preguntar a usuario
// Si desea agregar más números o no

import java.util.ArrayList;

import srm.java.own.Keyboard;
import srm.java.own.Printer;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean exit = false;
        int n, number, opcion, cont = 1;

        // Do-While para agregar y preguntar indefinidamente solicitudes al usuario
        do {
            // Preguntar al usuario la cantidad de números a agregar
            // Almacenar la cantidad de números a agregar
            n = Keyboard.readI("¿Cuántos números desea agregar?: ");

            // Generar n números aleatorios
            for (int i = 1; i <= n; i++) {
                // Generar número aleatorio entre 10 y 50 -> [10, 50]
                number = (int) (Math.random() * (50 - 10 + 1)) + 10;
                numbers.add(number);
            }

            opcion = Keyboard.readI("¿Deseas agregar más números? (0 = No / 1 = Sí): ");

            switch (opcion) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    exit = false;
                default:
                    Printer.werror("Opción no válida: ");
                    break;
            }

            Printer.wexe("\n-------\nArreglo versión " + cont + ": " + numbers);
            Printer.winfo("El tamaño del arreglo es: " + numbers.size() + "\n-------");
            cont++;
        } while (!exit);

        // Cerrar Scanenr
        Keyboard.closeSc();

        // Imprimir arreglo final
        Printer.wexe("El arreglo final es: " + numbers);
        Printer.winfo("El tamaño del arreglo es: " + numbers.size());
    }
}