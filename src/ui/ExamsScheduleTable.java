package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingUtilities;

import ui.Menu;


public class ExamsScheduleTable extends JFrame {

    DefaultTableModel model = new DefaultTableModel();

    public static JTable jTabSchedule;
    public static JScrollPane jscrlp;

    public ExamsScheduleTable() {
        jTabSchedule = new JTable(model);
        model.addColumn("Дисципліна");
        model.addColumn("Рік навчання");
        model.addColumn("Дата");
        model.addColumn("Викладач");
        model.addColumn("Аудиторія");
        model.addRow(new Object[] { "ТМ", "4", "20.04.2017", "А. О. Афонін", "2-214" });
        model.addRow(new Object[] { "ІС", "4", "24.04.2017", "О. П. Жежерун", "1-223" });
        model.addRow(new Object[] { "УПП", "4", "28.04.2017",  "В. С. Проценко", "1-310" });
        jscrlp = new JScrollPane(jTabSchedule);
        jTabSchedule.setPreferredScrollableViewportSize(new Dimension(350, 200));
        JButton addRow = new JButton("Додати рядок");
        Menu.mainFrm.getContentPane().add(jscrlp);
        Menu.mainFrm.getContentPane().add(addRow);
        Menu.mainFrm.setVisible(true);
        addRow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[] { "Дисципліна", "Рік навчання", "Дата", "Викладач", "Аудиторія" });
            }
        });
    }

}
