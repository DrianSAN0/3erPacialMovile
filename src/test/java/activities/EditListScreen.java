package activities;

import controls.Button;
import org.openqa.selenium.By;

public class EditListScreen {

    public Button addListButton = new Button(By.id("com.vrproductiveapps.whendo:id/addCategoryItem"));

    public Button seeNewListButton = new Button(By
            .xpath("//android.widget.ListView[@resource-id=\"com.vrproductiveapps.whendo:id/" +
                    "categoriesList\"]/android.view.ViewGroup[2]/android.widget.LinearLayout\n"));


}
