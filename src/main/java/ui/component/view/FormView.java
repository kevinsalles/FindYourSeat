package ui.component.view;

import ui.Form;

import javax.swing.*;

public abstract class FormView extends JFrame implements Form{

    public FormView(){
        super("Mon app");
        initialize();
        setSize(700,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private void initialize(){
    }
}
