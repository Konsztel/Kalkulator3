<<<<<<< Updated upstream
<<<<<<< Updated upstream
//Version 1.10

import java.util.Scanner;
=======
=======
>>>>>>> Stashed changes
// Version 2.1

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator3  extends JFrame implements ActionListener {

    JLabel l_a, l_b, l_result;
    JButton b_adding, b_subtraction, b_multiplication, b_splitting, b_power, b_square_root, b_cbrt;
    JTextField t_a, t_b;
    double a, b, wynik;

<<<<<<< Updated upstream
    public Kalkulator3 () {
=======
    public Kalkulator3() {
>>>>>>> Stashed changes
        setSize(800,600);
        setTitle("Kalkulator");
        setLayout(null);

        l_result = new JLabel("Wynik:");
        l_result.setFont(new Font("Courier",Font.PLAIN, 20));
        l_result.setBounds(350, 50, 200, 20);
        add(l_result);

        l_a = new JLabel("a");
        l_a.setFont(new Font("Courier",Font.PLAIN, 20));
        l_a.setBounds(30, 150,50, 50);
        add(l_a);

        l_b = new JLabel("b");
        l_b.setFont(new Font("Courier",Font.PLAIN, 20));
        l_b.setBounds(30, 200, 50, 50);
        add(l_b);

        b_adding = new JButton("+");
        b_adding.setFont(new Font("Courier",Font.PLAIN, 20));
        b_adding.setBounds(570, 150, 70, 50);
        add(b_adding);
        b_adding.addActionListener(this);
        b_adding.setToolTipText("Dodawanie");

        b_subtraction = new JButton("-");
        b_subtraction.setFont(new Font("Courier",Font.PLAIN, 20));
        b_subtraction.setBounds(570, 200, 70, 50);
        add(b_subtraction);
        b_subtraction.addActionListener(this);
        b_subtraction.setToolTipText("Odejmowanie");

        b_multiplication = new JButton("*");
        b_multiplication.setFont(new Font("Courier",Font.PLAIN, 20));
        b_multiplication.setBounds(500, 150, 70, 50);
        add(b_multiplication);
        b_multiplication.addActionListener(this);
        b_multiplication.setToolTipText("Mnożenie");

        b_splitting = new JButton("/");
        b_splitting.setFont(new Font("Courier",Font.PLAIN, 20));
        b_splitting.setBounds(500, 200, 70, 50);
        add(b_splitting);
        b_splitting.addActionListener(this);
        b_splitting.setToolTipText("Dzielenie");

        b_power = new JButton("^");
        b_power.setFont(new Font("Courier",Font.PLAIN, 20));
        b_power.setBounds(500, 250, 70, 50);
        add(b_power);
        b_power.addActionListener(this);
        b_power.setToolTipText("Potęgowanie");

        b_square_root = new JButton("√");
        b_square_root.setFont(new Font("Courier",Font.PLAIN, 20));
        b_square_root.setBounds(570, 250, 70, 50);
        add(b_square_root);
        b_square_root.addActionListener(this);
        b_square_root.setToolTipText("Pierwiastek kwadratowy");

        b_cbrt = new JButton("√3");
        b_cbrt.setFont(new Font("Courier",Font.PLAIN, 20));
        b_cbrt.setBounds(500, 300, 70, 50);
        add(b_cbrt);
        b_cbrt.addActionListener(this);
        b_cbrt.setToolTipText("Pierwiastek sześcienny");

        t_a = new JTextField("");
        t_a.setBounds(50, 150, 50, 50);
        add(t_a);

        t_b = new JTextField("");
        t_b.setBounds(50, 200, 50, 50);
        add(t_b);
<<<<<<< Updated upstream
=======

        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 16));
    }
>>>>>>> Stashed changes

        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 16));
    }
>>>>>>> Stashed changes

public class Kalkulator3 {

    public static void main(String[] args) {
<<<<<<< Updated upstream
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        double liczba1 = scan.nextDouble();
        //potrzebne, jeśli wczytujemy napis po wczytaniu liczby
        scan.nextLine();

        //Pobranie od użytkownika liczby jakie działanie ma zostać wykonane
        System.out.println("1 - Dodawanie \n2 - Odejmowanie \n3 - Mnożenie \n4 - Dzielenie ");
        System.out.println("Wybierz jakie działanie chcesz wykonać:");
        new Scanner(System.in);
        int operator = scan.nextInt();

        //Zabezpieczenie przed wprowadzaniem złej wartości, powyżej 4
        while (operator>4){
            System.out.println("Podałeś zły operator, podaj prawidłowy operator");
            System.out.println("1 - Dodawanie \n2 - Odejmowanie \n3 - Mnożenie \n4 - Dzielenie ");
            new Scanner(System.in);
            operator = scan.nextInt();
        }

        System.out.println("Podaj drugą liczbę");
        new Scanner(System.in);
        double liczba2 = scan.nextDouble();
        scan.close();

        //Przełącznik do wykonywanych obliczeń
        double suma = 0;
        switch (operator) {
            case 1:
                suma = liczba1 + liczba2;
                break;
            case 2:
                suma = liczba1 - liczba2;
                break;
            case 3:
                suma = liczba1 * liczba2;
                break;
            case 4:
                suma = liczba1 / liczba2;
                break;
        }
        System.out.println("Wynik:" + suma);
=======
        Kalkulator3  main_window = new Kalkulator3 ();
        main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_window.setVisible(true);}

    public void actionPerformed(ActionEvent e) {
        // Sprawdzenie, czy pola nie są puste
        String tekstA = t_a.getText();
        String tekstB = t_b.getText();
        if (tekstA.isEmpty() || tekstB.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Wprowadź wartość do obu pól!");
            return;
        }

        try {
            a = Double.parseDouble(tekstA);
            b = Double.parseDouble(tekstB);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Niepoprawny format liczby!");
            return;
        }

        String operacja = e.getActionCommand();
        switch  (operacja) {
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
                if (b == 0){
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
>>>>>>> Stashed changes
    }
}