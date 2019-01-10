import javax.swing.*;

public class Aufgabe1 {
    public static void main(String[] args){
        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog(null, "erste Zahl"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog(null, "zweite Zahl"));
        double zahl3;
        if(zahl2==0){
            System.err.println("zahl 2 darf nicht 0 sein");
        }else{
            zahl3 = zahl1/zahl2;
            System.out.println(zahl3);
        }
        // Aufgabe 2

        try{
            zahl3 = zahl1/zahl2;
        }catch(ArithmeticException ex){
            ex.printStackTrace();
        }catch (NullPointerException ex){ // Aufgabe3
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace(); // Aufgabe 3
        }


    }
}
