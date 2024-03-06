import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A brincadeira é a seguinte: me diga uma palavra e irei inverte-la. Vamos lá?");
        Thread.sleep(1000);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra para inverter: ");
        String palavra = scanner.nextLine();

        String invertida = inverterString(palavra);

        System.out.println("String original: " + palavra);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String entrada) {

        char[] caracteres = entrada.toCharArray();
        int comprimento = caracteres.length;


        for (int i = 0; i < comprimento / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[comprimento - 1 - i];
            caracteres[comprimento - 1 - i] = temp;
        }


        return new String(caracteres);
    }
}
