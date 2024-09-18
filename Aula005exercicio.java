import java.util.Scanner;


public class Aula005exercicio {
    public static void main(String[] args) {
        
        double nota1, nota2, nota3, media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        nota1 = teclado.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        nota2 = teclado.nextDouble();
        

        System.out.println("Digite sua terceira nota: ");
        nota3 = teclado.nextDouble();
        
        media = (nota1+nota2+nota3)/3;

        System.out.println("Sua media e: "+ media);

        if (media >=9)
            System.out.println("Voce esta aprovado com louvor!");

            else {
                if (media > 7)
                System.out.println("Aprovado na Media, melhore futuramente!");

                    else{
                        System.out.println("Reprovado infelizmente!!");
                    }
            }
    }
}
