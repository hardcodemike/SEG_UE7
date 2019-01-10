import javax.swing.*;

public class Aufgabe4 {
    public static void main(String[] args) {
        try {
            int zahl1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte gib eine Zahl ein"));
            if(zahl1<0){
                throw new Exception();
            }
        }catch (NumberFormatException ex){
            ex.printStackTrace(); // wird gefangen, wenn man z.B. 5.5 eingibt
        } catch (Exception e) {
            System.err.println("Keine negativen Zahlen!!");
            e.printStackTrace(); // wird gefangen, wenn man eine negative Zahl eingibt
        }

        try {
            String eingabe = JOptionPane.showInputDialog(null, "Bitte gib ein Wort ein");
            if(eingabe.length()<10){
                throw new Exception();
            }
        }catch (Exception ex){
            System.err.println("Das Wort muss mindestens 10 Zeichen lang sein");
            ex.printStackTrace();
        }

        try{
            String eingabe2 = JOptionPane.showInputDialog(null, "Bitte gib Hallo ein");
            if(!eingabe2.equals("Hallo")){
                throw new Exception();
            }
        }catch (Exception ex){
            System.err.println("Das Wort muss 'Hallo' sein");
            ex.printStackTrace();
        }

        try{
            int eingabe3 = JOptionPane.showConfirmDialog(null, "Bitte click auf Nein");
            if(eingabe3 == 0){
                throw new Exception();
            }
        }catch (Exception ex){
            System.err.println("Nicht auf Nein geklickt");
            ex.printStackTrace();
        }
    }
}
