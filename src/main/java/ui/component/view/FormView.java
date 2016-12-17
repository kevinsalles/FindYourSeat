package ui.component.view;

import ui.Form;

import javax.swing.*;
import java.awt.*;

public abstract class FormView extends JFrame implements Form{

    public FormView(){
        super("Mon app");
        setBounds(500,200,700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        initialize();
        setResizable(false);
        setSize(700,600);
    }

    private void initialize(){
        setContentPane(new PanelPlane());
    }
}
