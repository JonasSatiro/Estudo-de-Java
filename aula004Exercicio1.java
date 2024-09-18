import java.util.Scanner;

public class aula004Exercicio1 {
    public static void main(String[] args) {
        int num1;
        double num2;
        float multiplicador;
        
        Scanner teclado = new Scanner(System.in);

        // Entrada do número inteiro
        System.out.println("Insira um número inteiro: ");
        num1 = teclado.nextInt();

        // Entrada do número real
        System.out.println("Insira um número real (double ou float): ");
        num2 = teclado.nextDouble();

        // Entrada do multiplicador
        System.out.println("Insira um número multiplicador: ");
        multiplicador = teclado.nextFloat();

        // Exibindo o resultado da soma
        System.out.println("O número " + num1 + " somado com o número " + num2 + " é igual a: " + (num1 + num2));

        // Exibindo o resultado da multiplicação
        System.out.println("Os números " + num1 + " e " + num2 + " multiplicados pelo número " + multiplicador + " são respectivamente: "
                + (num1 * multiplicador) + " e " + (num2 * multiplicador));
    }
}
