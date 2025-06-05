package org.example.cash;

import org.example.app.AbstractManager;
import org.example.app.AbstractView;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class CashTransactionView implements AbstractView {
    private AbstractManager manager;

    public CashTransactionView(AbstractManager manager) {
        this.manager = manager;
    }

    public void show() {
        JFrame frame = new JFrame("現金記帳系統");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 400);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        JTextField typeField = new JTextField();
        JTextField descField = new JTextField();
        JTextField amountField = new JTextField();

        JButton addBtn = new JButton("新增紀錄");
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);

        panel.add(new JLabel("類型 (收入/支出):"));
        panel.add(typeField);
        panel.add(new JLabel("描述:"));
        panel.add(descField);
        panel.add(new JLabel("金額:"));
        panel.add(amountField);
        panel.add(addBtn);

        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(new JScrollPane(displayArea), BorderLayout.CENTER);

        addBtn.addActionListener(e -> {
            try {
                String type = typeField.getText();
                String desc = descField.getText();
                double amount = Double.parseDouble(amountField.getText());
                CashTransaction tx = new CashTransaction(type, desc, amount, LocalDate.now());
                manager.addEntry(tx);
                displayArea.append(type + " - " + desc + " - $" + amount + "\n");
                typeField.setText("");
                descField.setText("");
                amountField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "請輸入正確的金額格式", "錯誤", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}