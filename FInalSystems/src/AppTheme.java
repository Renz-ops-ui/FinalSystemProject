import java.awt.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
 
public class AppTheme {
    
    AppTheme(){
        
    }
 
    public static final Color BACKGROUND = new Color(26, 31, 46);
    public static final Color SURFACE = new Color(36, 43, 61);
    public static final Color BORDER = new Color(61, 90, 128);
    public static final Color ACCENT_GREEN = new Color(126, 203, 161);
    public static final Color TEXT_PRIMARY = new Color(232, 237, 245);
    public static final Color TEXT_MUTED = new Color(138, 167, 176);
    public static final Color DANGER = new Color(248, 113, 113);
    public static final Color INPUT_BG = new Color(224, 229, 240);
 
    public static final Color BTN_PRIMARY_BG = ACCENT_GREEN;
    public static final Color BTN_PRIMARY_FG = BACKGROUND;
    public static final Color BTN_DANGER_BG = DANGER;
    public static final Color BTN_DANGER_FG = BACKGROUND;
    public static final Color BTN_SECONDARY_BG = BORDER;
    public static final Color BTN_SECONDARY_FG = TEXT_PRIMARY;
 
    public static final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD, 28);
    public static final Font FONT_SUBTITLE = new Font("Segoe UI", Font.BOLD, 18);
    public static final Font FONT_HEADER = new Font("Segoe UI", Font.BOLD, 14);
    public static final Font FONT_BODY = new Font("Segoe UI", Font.PLAIN, 14);
    public static final Font FONT_SMALL = new Font("Segoe UI", Font.PLAIN, 12);
 
    public static Border panelBorder() {
        return BorderFactory.createLineBorder(BORDER, 1, true);
    }
 
    public static Border paddedBorder(int pad) {
        return BorderFactory.createCompoundBorder(
                panelBorder(),
                BorderFactory.createEmptyBorder(pad, pad, pad, pad));
    }
 
    public static void styleFrame(JFrame frame) {
        frame.getContentPane().setBackground(BACKGROUND);
    }
 
    public static void stylePanel(JPanel panel) {
        panel.setBackground(SURFACE);
        panel.setForeground(TEXT_PRIMARY);
        panel.setBorder(panelBorder());
    }
 
    public static void stylePanelBg(JPanel panel) {
        panel.setBackground(BACKGROUND);
        panel.setForeground(TEXT_PRIMARY);
    }
 
    public static void styleLabel(JLabel label) {
        label.setForeground(TEXT_PRIMARY);
        label.setFont(FONT_BODY);
    }
 
    public static void styleLabelMuted(JLabel label) {
        label.setForeground(TEXT_MUTED);
        label.setFont(FONT_SMALL);
    }
 
    public static void styleLabelTitle(JLabel label) {
        label.setForeground(TEXT_PRIMARY);
        label.setFont(FONT_TITLE);
    }
 
    public static void styleLabelSubtitle(JLabel label) {
        label.setForeground(TEXT_PRIMARY);
        label.setFont(FONT_SUBTITLE);
    }
 
    public static void styleLabelHeader(JLabel label) {
        label.setForeground(ACCENT_GREEN);
        label.setFont(FONT_HEADER);
    }
 
    public static void styleBtnPrimary(JButton btn) {
        btn.setBackground(BTN_PRIMARY_BG);
        btn.setForeground(BTN_PRIMARY_FG);
        btn.setFont(FONT_BODY);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setOpaque(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
 
    public static void styleBtnDanger(JButton btn) {
        btn.setBackground(BTN_DANGER_BG);
        btn.setForeground(BTN_DANGER_FG);
        btn.setFont(FONT_BODY);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setOpaque(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
 
    public static void styleBtnSecondary(JButton btn) {
        btn.setBackground(BTN_SECONDARY_BG);
        btn.setForeground(BTN_SECONDARY_FG);
        btn.setFont(FONT_BODY);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setOpaque(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
 
    public static void styleTextField(JTextField field) {
        field.setBackground(INPUT_BG);
        field.setForeground(BACKGROUND);
        field.setCaretColor(ACCENT_GREEN);
        field.setFont(FONT_BODY);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDER, 1),
                BorderFactory.createEmptyBorder(4, 8, 4, 8)));
    }
 
    public static void stylePasswordField(JPasswordField field) {
        field.setBackground(INPUT_BG);
        field.setForeground(BACKGROUND);
        field.setCaretColor(ACCENT_GREEN);
        field.setFont(FONT_BODY);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDER, 1),
                BorderFactory.createEmptyBorder(4, 8, 4, 8)));
    }
 
    public static void styleComboBox(JComboBox<?> cb) {
        cb.setBackground(BACKGROUND);
        cb.setForeground(TEXT_PRIMARY);
        cb.setFont(FONT_BODY);
    }
 
    public static void styleCheckBox(JCheckBox cb) {
        cb.setBackground(SURFACE);
        cb.setForeground(TEXT_MUTED);
        cb.setFont(FONT_SMALL);
    }
 
    public static void styleRadioButton(JRadioButton rb) {
        rb.setBackground(SURFACE);
        rb.setForeground(TEXT_MUTED);
        rb.setFont(FONT_BODY);
    }
 
    public static void styleTable(JTable table) {
        table.setBackground(SURFACE);
        table.setForeground(TEXT_PRIMARY);
        table.setGridColor(BORDER);
        table.setSelectionBackground(BORDER);
        table.setSelectionForeground(TEXT_PRIMARY);
        table.setFont(FONT_BODY);
        table.setRowHeight(28);
        table.setShowGrid(true);
 
        JTableHeader header = table.getTableHeader();
        header.setBackground(BACKGROUND);
        header.setForeground(ACCENT_GREEN);
        header.setFont(FONT_HEADER);
        header.setBorder(BorderFactory.createLineBorder(BORDER));
 
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.LEFT);
        centerRenderer.setBackground(SURFACE);
        centerRenderer.setForeground(TEXT_PRIMARY);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
 
    public static void styleScrollPane(JScrollPane sp) {
        sp.getViewport().setBackground(SURFACE);
        sp.setBorder(BorderFactory.createLineBorder(BORDER, 1));
    }
 
    public static void styleProgressBar(JProgressBar bar) {
        bar.setBackground(BACKGROUND);
        bar.setForeground(ACCENT_GREEN);
        bar.setBorderPainted(false);
        bar.setFont(FONT_SMALL);
    }
 
    public static void styleTextArea(JTextArea area) {
        area.setBackground(BACKGROUND);
        area.setForeground(TEXT_PRIMARY);
        area.setCaretColor(ACCENT_GREEN);
        area.setFont(FONT_BODY);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
    }
 
    public static void styleSeparator(JSeparator sep) {
        sep.setForeground(BORDER);
        sep.setBackground(BACKGROUND);
    }
 
    public static void styleSpinner(JSpinner sp) {
        sp.setBackground(BACKGROUND);
        sp.setForeground(TEXT_PRIMARY);
        sp.setFont(FONT_BODY);
        JComponent editor = sp.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            JTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();
            tf.setBackground(BACKGROUND);
            tf.setForeground(TEXT_PRIMARY);
            tf.setCaretColor(ACCENT_GREEN);
            tf.setBorder(BorderFactory.createEmptyBorder(2, 4, 2, 4));
        }
    }
 
    public static ImageIcon getLogoIcon(int width, int height) {
        URL url = AppTheme.class.getResource("/Logo.png");
        if (url == null) url = AppTheme.class.getResource("Logo.png");
        if (url == null) return null;
        ImageIcon raw = new ImageIcon(url);
        Image scaled = raw.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }

    public static void applyWindowIcon(JFrame frame) {
        ImageIcon icon = getLogoIcon(64, 64);
        if (icon != null) {
            frame.setIconImage(icon.getImage());
        }
    }

    public static void applyLogoLabel(JLabel label, int width, int height) {
        ImageIcon icon = getLogoIcon(width, height);
        if (icon != null) {
            label.setIcon(icon);
            label.setText("");
        }
    }
 
}