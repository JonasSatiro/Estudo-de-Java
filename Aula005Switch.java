public class Aula005Switch {
        public static void main(String[] args) {
            int numero = 2;
    
            // Usando If-Else
            if (numero == 1) {
                System.out.println("Número é 1");
            } else if (numero == 2) {
                System.out.println("Número é 2");
            } else {
                System.out.println("Número desconhecido");
            }
    
            // Usando Switch
            switch (numero) {
                case 1:
                    System.out.println("Número é 1");
                    break;
                case 2:
                    System.out.println("Número é 2");
                    break;
                default:
                    System.out.println("Número desconhecido");
            }
        }
    }
    

