import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int tal1 = Integer.parseInt(JOptionPane.showInputDialog(null, "pick a Number"));
        int i  = 0;
        do {
            System.out.println(tal1*i);
            i++;
        } while( i <= 10);

    }
}
