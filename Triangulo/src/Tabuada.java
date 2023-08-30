import javax.swing.JOptionPane;
public class Tabuada {
    public static void main (String[] arg) {
        int i, numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número"));

        for (i = 0; i<=10; i++) {
            System.out.println(numero * i);
        }
    }
}
