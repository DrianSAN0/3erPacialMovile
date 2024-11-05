package activities;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class ListFormScreen {

    public TextBox listTittleTxtBx = new TextBox(By.id("com.vrproductiveapps.whendo:id/categoryTitle"));

    public Button colorListButton = new Button(By.id("com.vrproductiveapps.whendo:id/color_select7"));

    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public Button deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));

    //Delete alerta
    public Button acceptDeleteButton = new Button(By.id("android:id/button1"));

}
