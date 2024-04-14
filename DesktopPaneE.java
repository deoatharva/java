import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesktopPaneE extends JFrame implements ActionListener {
    private JDesktopPane desktopPane;
    private JRadioButton redButton, greenButton, blueButton;

    public DesktopPaneE() {
        setTitle("JDesktopPane Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create a desktop pane
        desktopPane = new JDesktopPane();
        add(desktopPane);

        // Create radio buttons
        redButton = new JRadioButton("Red");
        greenButton = new JRadioButton("Green");
        blueButton = new JRadioButton("Blue");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(greenButton);
        group.add(blueButton);

        // Add action listeners
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        // Create a panel for radio buttons
        JPanel radioPanel = new JPanel(new FlowLayout());
        radioPanel.add(redButton);
        radioPanel.add(greenButton);
        radioPanel.add(blueButton);

        // Add panel to the content pane
        getContentPane().add(radioPanel, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            desktopPane.setBackground(Color.RED);
        } else if (e.getSource() == greenButton) {
            desktopPane.setBackground(Color.GREEN);
        } else if (e.getSource() == blueButton) {
            desktopPane.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DesktopPaneE example = new DesktopPaneE();
            example.setVisible(true);
        });
    }
}

