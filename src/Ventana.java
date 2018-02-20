import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame  {
    private JTextField equipoATextField;
    private JTextField textField2;
    private JTextField equipoBTextField;
    private JTextField textField4;
    private JButton actualizarButton;
    private JPanel panelVentana;
    private Visor visor;

    public Ventana(Visor visor){
        this.visor=visor;
        this.setContentPane(panelVentana);


        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visor.setPuntajeA(textField2.getText());
                visor.setPuntajeB(textField4.getText());

            }
        });
    }
}
