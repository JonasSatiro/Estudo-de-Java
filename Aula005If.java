
import java.util.Scanner;

public class Aula005If {
    // Operadores relacionais: == igual, =! diferente <Menor, >Maior, <= menor ou igual, >= maior ou igual

    /**
     * @param args
     */
    public static void main(String[] args) {
        int valor1;
        int valor2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um valor inteiro: ");
        valor1 = teclado.nextInt();

        System.out.println("Insira o segundo valor inteiro: ");
        valor2 = teclado.nextInt();

        System.out.println(valor1==valor2);
        System.err.println(valor1!=valor2);
        System.out.println(valor1<=valor2);
        System.out.println(valor1>=valor2);
        System.out.println(valor1<valor2);
        System.out.println(valor1>valor2);

        if (valor1==valor2) {
            System.out.println("Os valores sao iguais ");
        }
        else 
            if (valor1<valor2){
            System.out.println("O valor1 e menor");
        }
            else {
                System.out.println("Valor1 maior");
        }

        
    }
}
