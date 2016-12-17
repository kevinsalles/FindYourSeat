package ui.component.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormModelTest {
    @Test
    public void whenCreateAFormModel_thenShouldCreated(){
        FormModel formModel = new FormModel();
        assertNotNull(formModel);
    }
}