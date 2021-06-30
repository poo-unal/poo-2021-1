package paquete;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener{

    JPanel panel;
    JButton boton,boton2;
    JLabel texto;
    JTextField input;

    public Ventana()
    {
        panel = new JPanel();
        boton = new JButton("Oprimir");
        boton2 = new JButton("Oprimir");
        texto = new JLabel();
        input = new JTextField("Escribe aquí");

        this.add(panel);

        panel.add(boton);
        panel.add(boton2);
        panel.add(input);
        panel.add(texto);

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        this.boton.addActionListener(this);
        this.boton2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(boton))
            {
            this.texto.setText(this.input.getText());
            }

        if(e.getSource().equals(boton2))
            {
            this.texto.setText("Oprimiste el botón 2");
            }
            
    }
}