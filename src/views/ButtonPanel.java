package views;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
    public JButton calcButton;

public ButtonPanel() {
    calcButton = new JButton("Számol");
    }

public void addComponent() {
    add(this.calcButton);
}
}

