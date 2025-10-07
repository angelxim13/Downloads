package prac5;

public class p52 {
    public static void imprimirFactoriales(int numero, int limite) {
        if (numero <= limite) {
            System.out.print(numero + "! = ");

            int resultado = imprimirDesglose(numero);

            System.out.println(" = " + resultado);

            imprimirFactoriales(numero + 1, limite);
        } else {
            System.out.println("Fin de la recursividad");
        }
    }

    public static int imprimirDesglose(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1; 
        } else {
            System.out.print(n + "x");
            return n * imprimirDesglose(n - 1); 
        }
    }

    public static void main(String[] args) {
        imprimirFactoriales(1, 7); 
    }
}

