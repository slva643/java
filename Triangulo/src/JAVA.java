import javax.swing.JOptionPane;

public class JAVA {
    public static void main(String[] arg) {
       float[] salario = new float[5];
       for (int i=0;i<5;i++) {
           salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Entre com o salario"));
       }
       for (int i=0; i<5; i++) {
           System.out.println("Funcionário: "+(i+1)+ " Salário: "+ salario[i]);
       }
    }
}



