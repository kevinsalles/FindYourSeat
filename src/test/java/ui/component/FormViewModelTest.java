package ui.component;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import ui.component.model.FormModel;

import static org.junit.Assert.*;

public class FormViewModelTest {

    @Mock
    private FormModel formModelMock;
    private FormViewModel formViewModel;

    @Before
    public void setUp(){
        formViewModel = new FormViewModel(formModelMock);
    }

    @Test
    public void givenAFormModel_whenCreateFormViewModel_thenShouldCreate(){
        assertNotNull(formViewModel);
    }

    @Test
    public void runTheForm(){
        formViewModel.run();
    }


}