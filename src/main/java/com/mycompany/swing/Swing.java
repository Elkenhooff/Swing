
package com.mycompany.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Swing {

    public static void main(String[] args) {
        int tamanhoY = 540; int tamanhoX = 540;
        
        JFrame formPrincipal = new JFrame();
        JButton enviarBtn = new JButton("Enviar formulário");

        formPrincipal.setSize(tamanhoX, tamanhoY);
        formPrincipal.add(enviarBtn, BorderLayout.SOUTH);
        
        JPanel sessaoNome = new JPanel();
        sessaoNome.setLayout(new FlowLayout());
        sessaoNome.add(new JLabel("Nome do Usuário"));
        JTextField txtNome = new JTextField(20);
        sessaoNome.add(txtNome);
        
        JPanel sessaoEmail = new JPanel();
        sessaoEmail.setLayout(new FlowLayout());
        sessaoEmail.add(new JLabel("Email do Usuário"));
        JTextField txtEmail = new JTextField(20);
        sessaoEmail.add(txtEmail);
        
        formPrincipal.add(sessaoNome);
        formPrincipal.add(sessaoEmail);
        
        sessaoNome.setVisible(true);
        sessaoEmail.setVisible(true);
        formPrincipal.setVisible(true);
        
        formPrincipal.setDefaultCloseOperation(formPrincipal.EXIT_ON_CLOSE);
    }
}
