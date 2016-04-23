package com.xiechur.service;

import com.xiechur.pageModel.Menu;

import java.util.List;

/**
 * Created by dell on 2016/4/4.
 */
public interface MenuServiceI {

    public List<Menu> getTreeNode(int id);

    public List<Menu> getAllTreeNode();

}
