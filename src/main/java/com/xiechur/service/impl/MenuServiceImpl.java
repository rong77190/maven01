package com.xiechur.service.impl;

import com.xiechur.dao.MenuDaoI;
import com.xiechur.model.TMenu;
import com.xiechur.pageModel.Menu;
import com.xiechur.service.MenuServiceI;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by dell on 2016/4/4.
 */
@Service("menuService")
public class MenuServiceImpl implements MenuServiceI {
    private static final Logger logger = Logger.getLogger(MenuServiceImpl.class);

    private MenuDaoI menuDaoI;

    public MenuDaoI getMenuDaoI() {
        return menuDaoI;
    }

    @Autowired
    public void setMenuDaoI(MenuDaoI menuDaoI) {
        this.menuDaoI = menuDaoI;
    }


    @Override
    public List<Menu> getTreeNode(int id) {
        List<Menu> nl = new ArrayList<Menu>();
        String hql = null;
        Map<String, Object> params = new HashMap<String, Object>();
        String idStr = String.valueOf(id);
        if (idStr == null && idStr.equals("")) {
//            查询所有根节点
            hql = "from TMenu t where t.tMenu is null";
        } else {
//            异步加载当前id下的子节点
            hql = "from TMenu t where t.tMenu.id = :id ";//
            params.put("id", id);
        }
        logger.info(hql);
        List<TMenu> l = menuDaoI.find(hql, params);
        if (l != null && l.size() > 0) {
            for (TMenu t : l) {
                Menu menu = new Menu();
                BeanUtils.copyProperties(t, menu);
                Set<TMenu> tMenuSet = t.getTmenus();
                if (tMenuSet != null && !tMenuSet.isEmpty()) {
                    menu.setState("closed");// 节点以文件夹的形式体现
                } else {
                    menu.setState("open");// 节点以文件的形式体现
                }
                nl.add(menu);
            }
        }
        return nl;
    }

    @Override
    public List<Menu> getAllTreeNode() {
        List<Menu> nl = new ArrayList<Menu>();
        String hql = "from TMenu t";
        List<TMenu> l = menuDaoI.find(hql);
        if (l != null && l.size() > 0) {
            for (TMenu t : l) {
                Menu menu = new Menu();
                BeanUtils.copyProperties(t, menu);
                Map<String, Object> attributes = new HashMap<String, Object>();
                attributes.put("url", t.getUrl());
                menu.setAttributes(attributes);
                TMenu tMenu = t.gettMenu();//获得当前节点的父节点对象
                if (tMenu != null) {
                    menu.setPid(tMenu.getId());
                }
                nl.add(menu);
            }
        }
        return nl;
    }

    @Override
    public List<Menu> getTree(int id) {
        List<Menu> nl = new ArrayList<Menu>();
        List<TMenu> l = menuDaoI.find("from TMenu t where t.tMenu is null");
        if (l != null && l.size() > 0) {
            for (TMenu t : l) {
                Menu menu = new Menu();
                BeanUtils.copyProperties(t, menu);
                Set<TMenu> tMenuSet = t.getTmenus();
                if (tMenuSet != null && !tMenuSet.isEmpty()) {
                    menu.setState("closed");// 节点以文件夹的形式体现
                } else {
                    menu.setState("open");// 节点以文件的形式体现
                }
                nl.add(menu);
            }
        }
        return nl;
    }
}
