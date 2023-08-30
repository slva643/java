import javax.swing.JOptionPane;

public class Triangulo {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de c: "));

        if ((a<b+c) && (b<a+c) && (c<a+b)) {
            JOptionPane.showMessageDialog(null,"Estes valores forma um triangulo");
            if ((a==b) && (b==c)) {
                JOptionPane.showMessageDialog(null,"Triangulo Equilátero");
            } else if ((a==b) || (b==c) || a==c) {
                JOptionPane.showMessageDialog(null,"Triangulo Isósceles");
            } else {
                JOptionPane.showMessageDialog(null,"Triangulo Escaleno");
            }
        }else {
            JOptionPane.showMessageDialog(null,"Estes valores não formam um triangulo");
        }
    }
}
