package prac5;

public class p51 {
    public static void imprimirGuiones(int cantidad) {
        if (cantidad > 0) {
            System.out.print("_");
            imprimirGuiones(cantidad - 1); 
        }
    }

    public static void imprimir(int numero) {
        if (numero <= 10) {
            System.out.print(numero);

            imprimirGuiones(numero);

            System.out.println();

            imprimir(numero + 1);
        } else {
            System.out.println("Fin de la recursividad");
        }
    }

    public static void main(String[] args) {
        imprimir(1); 
    }
}
