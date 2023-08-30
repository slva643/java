import javax.swing.JOptionPane;

public class Velocidade {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um numero inteiro"));
        switch(num) {
            case 1:
                JOptionPane.showMessageDialog(null,"Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Março");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Maio");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Junho");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Julho");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Setembro");
                break;
            default:  JOptionPane.showMessageDialog(null,"Mês inesistente");
        }
    }
}
