import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GUIInputValidationExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Input Validation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1));

        // Input validation panel
        JPanel inputPanel = new JPanel();
        JTextField userInputField = new JTextField(20);
        JButton validateButton = new JButton("Validate Input");
        JLabel resultLabel = new JLabel();
        inputPanel.add(userInputField);
        inputPanel.add(validateButton);
        inputPanel.add(resultLabel);

        // File handling panel
        JPanel filePanel = new JPanel();
        JTextField filePathField = new JTextField(20);
        JButton readFileButton = new JButton("Read File");
        JTextArea fileContentArea = new JTextArea(10, 30);
        fileContentArea.setEditable(false);
        filePanel.add(filePathField);
        filePanel.add(readFileButton);

        // Add panels to the frame
        frame.add(inputPanel);
        frame.add(filePanel);
        frame.add(new JScrollPane(fileContentArea));

        // Validate Input button action
        validateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = userInputField.getText();
                if (userInput.trim().isEmpty()) {
                    resultLabel.setText("Input cannot be empty.");
                } else {
                    resultLabel.setText("Input is valid: " + userInput);
                }
            }
        });

        // Read File button action
        readFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = filePathField.getText();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(filePath));
                    StringBuilder content = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    reader.close();
                    fileContentArea.setText(content.toString());
                } catch (IOException ex) {
                    fileContentArea.setText("An error occurred while reading the file.");
                }
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
