package ui.component;

import ui.component.model.FormModel;
import ui.component.view.FormView;

public class FormViewModel extends FormView {

    private FormModel formModel;

    public FormViewModel(FormModel formModel){
        super();
        this.formModel = formModel;
    }

    public void run(){
        setVisible(true);
    }
}
