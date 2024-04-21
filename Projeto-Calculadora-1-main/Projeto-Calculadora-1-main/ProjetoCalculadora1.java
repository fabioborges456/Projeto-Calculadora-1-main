package projetocalculadora1;
import java.util.Scanner;
public class ProjetoCalculadora1 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        float numero1 = scanner.nextFloat();

        System.out.println("Digite o segundo número:");
        float numero2 = scanner.nextFloat();
        
        System.out.println("Digite a operação ( + , - , * , / ):");
        char operacao = scanner.next().charAt(0);

        scanner.close();

        float resultado;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro! Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Erro! Operação inválida.");
                return;
        }

        System.out.println("O resultado é: " + resultado);
    }
}