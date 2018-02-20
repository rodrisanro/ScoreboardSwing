import javax.swing.*;

public class Main {
    public static void main (String[] a){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                Visor visor = new Visor();
                Ventana ventana=new Ventana(visor);
                //ventana.setContentPane(visor.getPanel1());
                ventana.pack();
                ventana.setBounds(100,100,640,480);
                ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                ventana.setVisible(true);
            }
        });
    }
}
