package front;

import back.Biblioteca;
import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {
    Biblioteca biblioteca;

    public DashboardFrame() {
        setTitle("Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);
        setVisible(true);

        GridBagConstraints constraints = new GridBagConstraints();

        JLabel text = new JLabel("Menu");
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(text, constraints);
        JButton buttonLocar = new JButton("Locar Livro");
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(buttonLocar, constraints);
        JButton buttonDevolver = new JButton("Devolver Livro");
        constraints.gridx = 1;
        constraints.gridy = 2;
        add(buttonDevolver, constraints);
        JButton buttonConsultar = new JButton("Consultar Livro");
        constraints.gridx = 1;
        constraints.gridy = 3;
        add(buttonConsultar, constraints);
        JButton buttonSair = new JButton("Sair");
        constraints.gridx = 1;
        constraints.gridy = 4;
        add(buttonSair, constraints);
    }
}