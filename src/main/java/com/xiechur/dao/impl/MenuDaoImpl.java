package com.xiechur.dao.impl;

import com.xiechur.dao.MenuDaoI;
import com.xiechur.model.TMenu;
import org.springframework.stereotype.Repository;

/**
 * Created by dell on 2016/4/4.
 */
@Repository("menuDao")
public class MenuDaoImpl extends BaseDaoImpl<TMenu> implements MenuDaoI {

}
