package com.ardublock.ui.listener;

import com.ardublock.core.Context;
import com.ardublock.ui.OpenblocksFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImportButtonListener implements ActionListener {
    private OpenblocksFrame parentFrame;

    public ImportButtonListener(OpenblocksFrame frame) {
        Context.getContext();
        this.parentFrame = frame;
    }

    public void actionPerformed(ActionEvent e)
    {
        parentFrame.doImportArduBlockFile();
    }

}
