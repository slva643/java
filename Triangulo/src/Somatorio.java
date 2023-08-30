import javax.swing.JOptionPane;

public class Somatorio {
    public static void main (String[] arg) {
        int i;
        double soma = 0, n1;

        for (i=1; i<10; i++) {
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número"));
            soma = soma + n1;
        }
        JOptionPane.showMessageDialog(null,"A somatória é "+soma);
    }
}
