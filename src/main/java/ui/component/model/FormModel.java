package ui.component.model;


import core.service.AssignationSeat;
import core.service.AssignationSeatImpl;

public class FormModel{

    private AssignationSeat assignationSeat;

    public FormModel(){
        assignationSeat = new AssignationSeatImpl();
    }

    public Object[][] getDataTable(){
        Object[][] data = {
                {"Cysboy", "28 ans", "1.80 m"},
                {"BZHHydde", "28 ans", "1.80 m"},
                {"IamBow", "24 ans", "1.90 m"},
                {"FunMan", "32 ans", "1.85 m"}
        };;
        return data;
    }
}
