/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author juanc
 */
class JOpcionPane {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Porfa este dospuntos: fiu fiu  fiou fiufiuafiq");
        JOptionPane.showMessageDialog(null, texto);
        String apellido = JOptionPane.showInputDialog("Empeza a hacerme caso");
        JOptionPane.showMessageDialog(null, apellido);
        JOptionPane.showMessageDialog(null, "Pushea:)");
    }

}
