package io.solo.squash.ui;

import javax.swing.*;

public class ProjectConfigGUI {
    private JPanel panelRoot;
    private JTextField textProcessName;
    private JTextField textRemotePath;
    private JTextField textRequestTimeout;

    public JPanel getPanelRoot() {
        return panelRoot;
    }

    public String getTextProcessName() {
        return textProcessName.getText();
    }

    public void setTextProcessName(String textProcessName) {
        this.textProcessName.setText(textProcessName);
    }

    public String getTextRemotePath() {
        return textRemotePath.getText();
    }

    public void setTextRemotePath(String textRemotePath) {
        this.textRemotePath.setText(textRemotePath);
    }


    public int getTextRequestTimeout() {
        try {
            return Integer.parseInt(textRequestTimeout.getText());
        }
        catch (NumberFormatException ex) {
            return 0;
        }
    }

    public void setTextRequestTimeout(int textRequestTimeout) {
        this.textRequestTimeout.setText(String.valueOf(textRequestTimeout));
    }
}
