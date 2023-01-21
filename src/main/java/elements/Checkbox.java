package elements;

import org.openqa.selenium.By;

public class Checkbox extends WebElementBase {

    public Checkbox(By locator){
        super(locator);
    }

    public boolean isSelected(){
        return isSelectedBase();
    }

    public void unSelect(){
        if (isSelectedBase())
           clickOnElementBase();
    }

    public void select() {
        if(!isSelectedBase())
            clickOnElementBase();
    }

    public void selectUnselect(boolean check) {
        if (check) {
            if (!isSelectedBase())
                clickOnElementBase();
        } else {
            if (isSelectedBase())
                clickOnElementBase();
        }
    }
}