package fgu;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tt extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnNhan;

    public tt() {
        setTitle("Nhân 2 số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa màn hình

        // Panel chính
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        panel.add(new JLabel("Số thứ nhất:"));
        txtSo1 = new JTextField();
        panel.add(txtSo1);

        panel.add(new JLabel("Số thứ hai:"));
        txtSo2 = new JTextField();
        panel.add(txtSo2);

        panel.add(new JLabel("Kết quả:"));
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        panel.add(txtKetQua);

        btnNhan = new JButton("Nhân");
        btnNhan.addActionListener(this);
        panel.add(btnNhan);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double so1 = Double.parseDouble(txtSo1.getText());
            double so2 = Double.parseDouble(txtSo2.getText());
            double ketQua = so1 * so2;
            txtKetQua.setText(String.valueOf(ketQua));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new tt().setVisible(true);
        });
    }
}
