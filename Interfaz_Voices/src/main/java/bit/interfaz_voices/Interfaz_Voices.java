

package bit.interfaz_voices;

import Vista.Inter_Vis;

public class Interfaz_Voices {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
        Inter_Vis ventana = new Inter_Vis();
        
        ventana.setVisible(true);
        }
        });
    }
}
