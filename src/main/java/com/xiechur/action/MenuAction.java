package com.xiechur.action;

import com.opensymphony.xwork2.ModelDriven;
import com.xiechur.pageModel.Menu;
import com.xiechur.service.MenuServiceI;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dell on 2016/4/4.
 */

@Action(value = "menuAction")
public class MenuAction extends BaseAction implements ModelDriven<Menu> {
    private static final Logger logger = Logger.getLogger(MenuAction.class);
    private MenuServiceI menuServiceI;
    private Menu menu = new Menu();
    private MenuServiceI menuService;

    public MenuServiceI getMenuServiceI() {
        return menuServiceI;
    }

    @Autowired
    public void setMenuServiceI(MenuServiceI menuServiceI) {
        this.menuServiceI = menuServiceI;
    }

    @Override
    public Menu getModel() {
        return menu;
    }


    /**
     * 异步获取树节点
     */
    public void getTreeNode() {
        logger.info(menu.getId());
        super.writeJson(menuServiceI.getTreeNode(menu.getId()));
    }
    public void getAllTreeNode() {
        super.writeJson(menuService.getAllTreeNode());
    }

}
