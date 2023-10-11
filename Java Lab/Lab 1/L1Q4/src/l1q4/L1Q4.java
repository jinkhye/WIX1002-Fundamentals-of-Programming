
package l1q4;

import javax.swing.JFrame;

public class L1Q4 {

    public static void main(String[] args) {
        CreateChart CC = new CreateChart("Pie Chart Test", "Total Sales of Product A");
        CC.pack();
        CC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CC.setVisible(true);
    }
    
}
