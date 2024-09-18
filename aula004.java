import java.util.Scanner;

public class Aula004 {
    public static  void  main(String[] args) {
        //Operadores numericos
        // Soma (+), Subtração (-), Multiplicação (*), Divisão (/), Módulo (%)
        int valor;
        int multiplicador;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu numero de preferencia: ");
        valor = teclado.nextInt();

        System.out.println("Digite um multiplicador:");
        multiplicador = teclado.nextInt();

        System.out.println(valor/multiplicador);

        System.out.println(valor*multiplicador);
 
        System.out.println(valor-multiplicador);

        System.out.println(valor+multiplicador);
        
        System.out.println(valor%multiplicador);
    }
}
