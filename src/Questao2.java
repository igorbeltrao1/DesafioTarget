import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A brincadeira é a seguinte: me diga um número e lhe direi se ele pertence a sequência de Fibonacci. Vamos lá?");
        Thread.sleep(1000);


        System.out.print("Informe um número e iremos ver se ele pertence a sequência ");
        int numeroDado = scanner.nextInt();

        boolean pertence = verificaSePertence(numeroDado);

        if (pertence) {
            System.out.println(numeroDado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroDado + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificaSePertence(int numero) {
        int anterior = 0;
        int atual = 1;

        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual == numero;
    }
}
