import javax.swing.JOptionPane;

public class ExemploWhile2 {
    public static void main(String[] args) {
        double num, media, soma = 0;
        int  qtde=0;
        char resp='s';

        while (resp =='s' || resp == 'S') {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
            soma = num;
            qtde++;
            resp = JOptionPane.showInputDialog("Deseja contiuar?").charAt(0);
        }
        media = soma / qtde;
        JOptionPane.showMessageDialog(null, "A média dos números digitados é: "+ media);
    }
}

