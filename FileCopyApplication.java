import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileCopyApplication extends JFrame implements ActionListener {
    private JTextField sourceTextField, destinationTextField;
    private JButton browseButton, copyButton;

    public FileCopyApplication() {
        setTitle("File Copy Application");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel sourceLabel = new JLabel("Source File:");
        sourceTextField = new JTextField(20);
        browseButton = new JButton("Browse");
        browseButton.addActionListener(this);

        JLabel destinationLabel = new JLabel("Destination File:");
        destinationTextField = new JTextField(20);

        copyButton = new JButton("Copy");
        copyButton.addActionListener(this);

        // Layout components
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(sourceLabel);
        panel.add(sourceTextField);
        panel.add(browseButton);
        panel.add(destinationLabel);
        panel.add(destinationTextField);
        panel.add(copyButton);

        // Add panel to frame
        getContentPane().add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == browseButton) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                sourceTextField.setText(selectedFile.getAbsolutePath());
            }
        } else if (e.getSource() == copyButton) {
            String sourceFileName = sourceTextField.getText();
            String destinationFileName = destinationTextField.getText();

            File sourceFile = new File(sourceFileName);
            File destinationFile = new File(destinationFileName);

            try {
                copyFile(sourceFile, destinationFile);
                JOptionPane.showMessageDialog(this, "File copied successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: Unable to copy file.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void copyFile(File sourceFile, File destinationFile) throws IOException {
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FileCopyApplication::new);
    }
}

