import javax.swing.*;

public class matriz5x5 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int i, j, soma=0;
        for (i=0;i<5;i++){
            for (j=0;j<5;j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Posição["+ i +"]["+ j +"]"));
            }
        }
        for (i=0; i<5; i++) {
            soma += matriz[i][i];
            JOptionPane.showMessageDialog(null,"A soma deu "+ soma);
        }
    }
}
