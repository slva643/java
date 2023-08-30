import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        float sal[] = new float[10];
        float soma = 0, media, maior;
        int i, quant=0;
        Scanner leia = new Scanner(System.in);

        for (i=0;i<10;i++) {
            System.out.println("Digite o salário do trabalhador " + (i+1) + ":");
            sal[i] = leia.nextFloat();
        }
        for (i=0;i<10;i++) {
            soma += sal[i];
        }
        media = soma /10;
        System.out.println("A média dos sálario é R$" + media);
        maior = sal[0];
        for (i=0;i<10;i++) {
            if (sal[i] > maior) {
                maior = sal[i];
            }
        }
        System.out.println("O maior salário é R$" + maior);
        for (i=0;i<10;i++) {
            if (sal[i] <850) {
                quant ++;
            }
        }
        System.out.println("Quantidade de salários < R$850: " +quant);

    }
}
