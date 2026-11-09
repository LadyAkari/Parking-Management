import javax.swing.*;

public class ParkingManagementSystem {
    private JPanel mainPnl;
    private JButton entryBtn;
    private JButton slotBtn;
    private JButton exitBtn;
    private JPanel nameBar;
    private JPanel navBar;
    private JPanel entryPnl;
    private JPanel entryLeft;
    private JPanel entryRight;
    private JTextField platenumTF;
    private JTextField vehicleType;
    private JButton parkBtn;
    private JTextField vehicleParked;
    private JTextField slotNum;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Character Counter");
        frame.setContentPane(new ParkingManagementSystem().mainPnl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,400);
        frame.setVisible(true);
    }
}
