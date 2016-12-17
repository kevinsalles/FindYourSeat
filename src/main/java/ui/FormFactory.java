package ui;

import ui.component.FormViewModel;
import ui.component.model.FormModel;
import ui.component.view.FormView;

/**
 * Created by Kévin on 2016-12-16.
 */
public class FormFactory {
    public static Form getInstance(){
        FormModel formModel = new FormModel();
        FormView formView = new FormViewModel(formModel);
        return formView;
    }
}
