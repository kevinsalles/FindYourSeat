package ui;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormFactoryTest {

    @Test
    public void whenIGetInstance_thenHaveAFormInstance(){
        Form form = new FormFactory().getInstance();
        assertNotNull(form);
    }
}