import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator3 extends JFrame implements ActionListener {

    JLabel l_a, l_b, l_result;
    JButton b_adding, b_subtraction, b_multiplication, b_splitting, b_power, b_square_root, b_cbrt;
    JTextField t_a, t_b;
    double a, b, wynik;

    public Kalkulator3() {
        setSize(800, 600);
        setTitle("Kalkulator");
        setLayout(null);

        initLabels();
        initButtons();
        initTextFields();
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 16));
    }

    private void initLabels() {
        l_result = new JLabel("Wynik:");
        l_result.setFont(new Font("Courier", Font.PLAIN, 20));
        l_result.setBounds(350, 50, 200, 20);
        add(l_result);

        l_a = new JLabel("a");
        l_a.setFont(new Font("Courier", Font.PLAIN, 20));
        l_a.setBounds(30, 150, 50, 50);
        add(l_a);

        l_b = new JLabel("b");
        l_b.setFont(new Font("Courier", Font.PLAIN, 20));
        l_b.setBounds(30, 200, 50, 50);
        add(l_b);
    }

    private void initButtons() {
        b_adding = createButton("+", 570, 150, "Dodawanie");
        b_subtraction = createButton("-", 570, 200, "Odejmowanie");
        b_multiplication = createButton("*", 500, 150, "Mnożenie");
        b_splitting = createButton("/", 500, 200, "Dzielenie");
        b_power = createButton("^", 500, 250, "Potęgowanie");
        b_square_root = createButton("√", 570, 250, "Pierwiastek kwadratowy");
        b_cbrt = createButton("√3", 500, 300, "Pierwiastek sześcienny");
    }

    private JButton createButton(String text, int x, int y, String toolTipText) {
        JButton button = new JButton(text);
        button.setFont(new Font("Courier", Font.PLAIN, 20));
        button.setBounds(x, y, 70, 50);
        button.addActionListener(this);
        button.setToolTipText(toolTipText);
        add(button);
        return button;
    }

    private void initTextFields() {
        t_a = new JTextField("");
        t_a.setBounds(50, 150, 50, 50);
        add(t_a);

        t_b = new JTextField("");
        t_b.setBounds(50, 200, 50, 50);
        add(t_b);
    }


    public static void main(String[] args) {
        Kalkulator3 main_window = new Kalkulator3();
        main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_window.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (!validateInputs()) return;

        try {
            a = Double.parseDouble(t_a.getText());
            b = Double.parseDouble(t_b.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Niepoprawny format liczby!");
            return;
        }

        String operacja = e.getActionCommand();
        switch (operacja) {
            case "+":
                wynik = a + b;
                break;
            case "-":
                wynik = a - b;
                break;
            case "*":
                wynik = a * b;
                break;
            case "/":
                if (b == 0) {
                    JOptionPane.showMessageDialog(this, "Nie można dzielić przez zero!");
                    return;
                }
                wynik = a / b;
                break;
            case "^":
                wynik = Math.pow(a, b);
                break;
            case "√":
                wynik = Math.sqrt(a);
                break;
            case "√3":
                wynik = Math.cbrt(a);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Nieznana operacja!");
                return;
        }
        l_result.setText("Wynik:" + wynik);
    }

    public boolean validateInputs() {
        String tekstA = t_a.getText();
        String tekstB = t_b.getText();
        if (tekstA.isEmpty() || tekstB.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Wprowadź wartość do obu pól!");
            return false;
        }
        return true;
    }
}
