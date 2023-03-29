import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DepartmentManagementPanel extends JPanel {
    private JButton addDepartmentButton;
    private JTextField departmentIdField;
    private JTextField departmentNameField;
    private JTextArea departmentListTextArea;

    public DepartmentManagementPanel() {
        initComponents();
        initEventHandlers();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Initialize UI components
        addDepartmentButton = new JButton("Add Department");
        departmentIdField = new JTextField(10);
        departmentNameField = new JTextField(10);
        departmentListTextArea = new JTextArea(10, 30);

        // Layout and add components to the panel
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Department ID:"));
        inputPanel.add(departmentIdField);
        inputPanel.add(new JLabel("Department Name:"));
        inputPanel.add(departmentNameField);
        inputPanel.add(addDepartmentButton);

        departmentListTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(departmentListTextArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void initEventHandlers() {
        addDepartmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String departmentId = departmentIdField.getText().trim();
                String departmentName = departmentNameField.getText().trim();

                if (!departmentId.isEmpty() && !departmentName.isEmpty()) {
                    // You should use a proper data structure to store departments.
                    // This example just appends the information to the text area.
                    departmentListTextArea.append("Department ID: " + departmentId + ", Department Name: " + departmentName + "\n");

                    // Clear input fields
                    departmentIdField.setText("");
                    departmentNameField.setText("");
                } else {
                    JOptionPane.showMessageDialog(DepartmentManagementPanel.this,
                            "Both Department ID and Department Name are required.",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
