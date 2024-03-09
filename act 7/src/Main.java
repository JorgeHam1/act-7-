//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int n = 100; // Atributo tipo entero

    public static void main(String[] args) {

        // Arreglos para almacenar los resultados
        int[] primos = calcularNumerosPrimos(n);
        int[] fibonacci = calcularSucesionFibonacci(n);

        // Imprimir números primos
        System.out.println("Números primos:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
        System.out.println();

        // Imprimir números de la sucesión de Fibonacci
        System.out.println("Sucesión de Fibonacci:");
        for (int numero : fibonacci) {
            System.out.println(numero + " ");
        }
        System.out.println();
    }

    // Método para calcular números primos
    private static int[] calcularNumerosPrimos(int n) {
        int[] numerosPrimos = new int[n];
        int contadorPrimos = 0;

        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                numerosPrimos[contadorPrimos++] = i;
            }
        }

        return numerosPrimos;
    }

    // Método para calcular la sucesión de Fibonacci
    private static int[] calcularSucesionFibonacci(int n) {
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
