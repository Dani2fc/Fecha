package ejecutable;

import javax.swing.JOptionPane;

import modelo.FechaDetallada;

public class Test2 {
    public static void main(String[] args) {
        // Input
        int d = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el número del día: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el número del mes: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el número del año: "));

        // Processing
        FechaDetallada miFechaDetallada = new FechaDetallada(d, m, y);
        miFechaDetallada.fechaCompleja(m);
        JOptionPane.showMessageDialog(null, miFechaDetallada.toString(), "FechaDetallada", 1);
    }
}
