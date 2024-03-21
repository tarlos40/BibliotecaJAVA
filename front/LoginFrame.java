package front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Faça Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null); 
        setVisible(true);

        GridBagConstraints constraints = new GridBagConstraints();

        JLabel usernameLabel = new JLabel("Usuario:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(usernameLabel, constraints);

        usernameField = new JTextField(15);
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(usernameField, constraints);

        JLabel passwordLabel = new JLabel("Senha:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(passwordLabel, constraints);

        passwordField = new JPasswordField(15);
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(passwordField, constraints);

        JButton loginButton = new JButton("LOGIN");
        constraints.gridx = 1;
        constraints.gridy = 2;
        add(loginButton, constraints);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if ("admin".equals(username) && "admin".equals(password)) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Login concluido!");
                    new DashboardFrame().setVisible(true);
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Usuario ou senhas incorretas");
                }
            }
        });
    }
}