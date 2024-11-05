package activities;

import controls.Button;
import org.openqa.selenium.By;

public class MainScreen {

    public Button menuButton = new Button(By
            .xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));

    //En el menú
    public Button editListButton = new Button(By
            .xpath("//android.widget.CheckedTextView[@resource-id=\"com.vrproductiveapps.whendo:id/design_menu_item_text\" and @text=\"Edit Lists\"]"));

}
