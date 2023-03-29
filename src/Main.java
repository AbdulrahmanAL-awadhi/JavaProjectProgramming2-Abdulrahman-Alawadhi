import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Department Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DepartmentManagementPanel panel = new DepartmentManagementPanel();
        frame.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
