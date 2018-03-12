
import java.util.Scanner;
// ||

public class main {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        boolean calculo = true;
        while (calculo) {
            System.out.print("¿Que operación desea realizar? \n1 = Suma \n2 = Resta \n3 = Multiplicacion \n4 = Division \n");
            String n = scanner.nextLine();
            int valorN = Integer.parseInt(n);
            switch (valorN) {
                case 1: {
                    int[] operandos = obtenerOperandos();
                    System.out.println("El resultado es " + (operandos[0] + operandos[1]));
                    break;
                }
                case 2: {
                    int[] operandos = obtenerOperandos();
                    System.out.println("El resultado es " + (operandos[0] - operandos[1]));
                    break;
                }
                case 3: {
                    int[] operandos = obtenerOperandos();
                    System.out.println("El resultado es " + (operandos[0] * operandos[1]));
                    break;
                }
                case 4: {
                    int[] operandos = obtenerOperandos();
                    System.out.println("El resultado es " + (operandos[0] / operandos[1]));
                    break;

                }

            }
            {
                System.out.println("¿Desea realizar otra operacion? \n1= Si  \n2= No\n");
                String a = scanner.nextLine();
                int newA = Integer.parseInt(a);
                if (newA == 1) {
                    calculo = true;
                } else {
                    calculo = false;
                    return;
                }
            }
        }
    }

    private static int[] obtenerOperandos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa A: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa B: ");
        int b = scanner.nextInt();
        return new int[]{a, b};
    }
}
