package dao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DateTime extends JPanel {
    private JLabel lblHora;
    private JLabel lblData;

    public DateTime() {
        initComponents();
        iniciarRelogio();
    }

    private void initComponents() {
        lblHora = new JLabel();
        lblData = new JLabel();

        lblHora.setText("");
        lblData.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addComponent(lblHora))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(lblHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData)
                .addGap(1, 1, 1))
        );
    }

    private void iniciarRelogio() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarHoraData();
            }
        });
        timer.start();
    }

    private void atualizarHoraData() {
        SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
        lblHora.setText(sdfHora.format(new Date()));
        lblData.setText(sdfData.format(new Date()));
    }
}
