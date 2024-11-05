package testSuite;

import activities.EditListScreen;
import activities.ListFormScreen;
import activities.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class ListWhenDoTest {

    MainScreen mainScreen = new MainScreen();
    EditListScreen editListScreen = new EditListScreen();
    ListFormScreen listFormScreen = new ListFormScreen();

    @Test
    public void listCRUDTest() throws InterruptedException {
        //create
        mainScreen.menuButton.click();
        mainScreen.editListButton.click();
        editListScreen.addListButton.click();
        String titulo = "ListaExamen";
        listFormScreen.listTittleTxtBx.setText(titulo);
        listFormScreen.colorListButton.click();
        listFormScreen.saveButton.click();

        editListScreen.seeNewListButton.click();
        Assertions.assertEquals(titulo, listFormScreen.listTittleTxtBx.getText(),
                "ERROR no se creó la lista");

        //update
        String tituloUpdate = "ListaExamenActualizado";
        listFormScreen.listTittleTxtBx.clearSetText(tituloUpdate);
        listFormScreen.saveButton.click();

        editListScreen.seeNewListButton.click();
        Assertions.assertEquals(tituloUpdate, listFormScreen.listTittleTxtBx.getText(),
                "ERROR no se actualizó la lista");

        //delete
        listFormScreen.deleteButton.click();
        listFormScreen.acceptDeleteButton.click();

        Assertions.assertFalse(editListScreen.seeNewListButton.isControlDisplayed(),
                "ERROR no se eliminó la lista");

    }

    @AfterEach
    public void close(){
        Session.getInstance().closeApp();
    }

}
