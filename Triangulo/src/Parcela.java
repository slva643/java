import javax.swing.JOptionPane;
public class Parcela {
    public static void main(String[] arg) {
        double valor_parcelado, valor_compra, valor_final;
        int qtde_parcelas, juros;
        valor_compra = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o valor da compra"));
        qtde_parcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolhe a quantidade de parcelas: 2x, 4x, 8x"));

        switch(qtde_parcelas) {
            case 2: juros = 3;
                break;
            case 4: juros = 9;
                break;
            case 8: juros = 12;
                break;
            default: juros = -1;
        }

        if(juros == -1) {
            JOptionPane.showMessageDialog(null,"Número de parcelas incorreto");
        }else {
            valor_final = valor_compra + valor_compra *juros / 100;
            valor_parcelado = valor_final/ qtde_parcelas;
            JOptionPane.showMessageDialog(null, "O valor da cada parcela é " + valor_parcelado);
        }
    }
}
