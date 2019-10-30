package proo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class compras extends JFrame implements ActionListener {
    JButton boton;
    public compras() {
        String blah = "POLONIA";
        String[] colNames = {"ID", "Nombre", "job"};
        DefaultTableModel model = new DefaultTableModel(colNames, 0);
        JTable table = new JTable(model);
        
        boton=new JButton("Finalizar");
        boton.setBounds(300,250,100,30);
        add(boton);
        boton.addActionListener(this);

        String[] lines = blah.split("\\$");   // escape the $
        for (String line : lines) {
            model.addRow(line.split("#"));
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(table));
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new  compras();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}