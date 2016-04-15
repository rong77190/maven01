package com.xiechur.action;

import com.opensymphony.xwork2.ModelDriven;
import com.xiechur.model.TMenu;
import com.xiechur.pageModel.Menu;
import com.xiechur.service.MenuServiceI;
import org.apache.struts2.convention.annotation.Action;

/**
 * Created by dell on 2016/4/4.
 */

@Action(value = "menuAction")
public class MenuAction extends BaseAction implements ModelDriven<Menu> {

    private Menu menu = new Menu();
    private MenuServiceI menuService;


    @Override
    public Menu getModel() {
        return menu;
    }
}
