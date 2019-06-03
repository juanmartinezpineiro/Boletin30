package boletin30;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin30 {

    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> selec=new ArrayList<>();
        SeleccionFutbol futbolista=new Futbolista(29,"lateral",7,22,"Sergio","Bus Quets");
        SeleccionFutbol entrenador=new Entrenador(2,2,38,"Del","Bos Que");
        SeleccionFutbol masajista=new Masajista("fisio",20,5,52,"Juan José","García Cota");
        SeleccionFutbol seleccionador=new Seleccionador(2,38,"Del","Bos Que");
        futbolista.concentrarse();
        entrenador.concentrarse();
        masajista.concentrarse();
        seleccionador.concentrarse();
        selec.add(futbolista);
        selec.add(entrenador);
        selec.add(masajista);
        selec.add(seleccionador);
        for(SeleccionFutbol f: selec){
            JOptionPane.showMessageDialog(null,f);
        }
    }
    
}
