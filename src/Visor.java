import javax.swing.*;
import java.awt.*;

public class Visor extends JFrame  {
    private JPanel panel1;
    private JLabel puntajeA;
    private JLabel puntajeB;
    private JLabel vs;
    private JLabel eb;
    private JLabel ea;

    public Visor() {
        setLayout(null);
        this.setContentPane(panel1);
        setBounds(0,0,200,200);
        ea.setBounds(50,20,20,20);
        eb.setBounds(150,20,20,20);
        vs.setBounds(100,20,20,20);
        puntajeA.setBounds(50,120,20,20);
        puntajeB.setBounds(150,120,20,20);
        panel1.add(ea);
        panel1.add(eb);
        panel1.add(vs);
        panel1.add(puntajeA);
        panel1.add(puntajeB);
        panel1.setVisible(true);
        setVisible(true);
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JLabel getPuntajeA() {
        return puntajeA;
    }

    public JLabel getPuntajeB() {
        return puntajeB;
    }

    public JLabel getVs() {
        return vs;
    }

    public JLabel getEb() {
        return eb;
    }

    public JLabel getEa() {
        return ea;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public void setPuntajeA(String nuevoPuntaje) {
        this.puntajeA.setText(nuevoPuntaje);
        puntajeA.updateUI();
    }

    public void setPuntajeB(String nuevoPuntaje) {
        this.puntajeB.setText(nuevoPuntaje);
        puntajeB.updateUI();
    }

    public void setVs(JLabel vs) {
        this.vs = vs;
    }

    public void setEb(JLabel eb) {
        this.eb = eb;
    }

    public void setEa(JLabel ea) {
        this.ea = ea;
    }
}
