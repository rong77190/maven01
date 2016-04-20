package com.xiechur.service.impl;

import com.xiechur.dao.BaseDaoI;
import com.xiechur.model.TMenu;
import com.xiechur.model.TUser;
import com.xiechur.service.RepairServiceI;
import com.xiechur.util.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service("repairService")
public class RepairServiceImpl implements RepairServiceI {

    private BaseDaoI<TMenu> menuDao;
    private BaseDaoI<TUser> userDao;

    public BaseDaoI<TUser> geTUserDao() {
        return userDao;
    }

    @Autowired
    public void seTUserDao(BaseDaoI<TUser> userDao) {
        this.userDao = userDao;
    }

    public BaseDaoI<TMenu> geTMenuDao() {
        return menuDao;
    }

    @Autowired
    public void seTMenuDao(BaseDaoI<TMenu> menuDao) {
        this.menuDao = menuDao;
    }

    @Override
    public void repair() {

        repairUser();

        repairMenu();

    }

    private void repairMenu() {
        TMenu root = new TMenu();
        root.setId(0);
        root.setText("首页");
        root.setUrl("");
        menuDao.saveOrUpdate(root);

        TMenu xtgl = new TMenu();
        xtgl.setId(1);
        xtgl.settMenu(root);
        xtgl.setText("系统管理");
        xtgl.setUrl("");
        menuDao.saveOrUpdate(xtgl);

        TMenu yhgl = new TMenu();
        yhgl.setId(2);
        yhgl.settMenu(xtgl);
        yhgl.setText("用户管理");
        yhgl.setUrl("/admin/yhgl.jsp");
        menuDao.saveOrUpdate(yhgl);

        TMenu jsgl = new TMenu();
        jsgl.setId(3);
        jsgl.settMenu(xtgl);
        jsgl.setText("角色管理");
        menuDao.saveOrUpdate(jsgl);

        TMenu qxgl = new TMenu();
        qxgl.setId(4);
        qxgl.settMenu(xtgl);
        qxgl.setText("权限管理");
        menuDao.saveOrUpdate(qxgl);

        TMenu cdgl = new TMenu();
        cdgl.setId(5);
        cdgl.settMenu(xtgl);
        cdgl.setText("菜单管理");
        menuDao.saveOrUpdate(cdgl);

        TMenu buggl = new TMenu();
        buggl.setId(6);
        buggl.settMenu(xtgl);
        buggl.setText("BUG管理");
        menuDao.saveOrUpdate(buggl);
    }

    private void repairUser() {
        Map<String, Object> m = new HashMap<String, Object>();
        m.put("userName", "admin");
        TUser t = userDao.get("from TUser t where t.userName = :userName and t.id != 0", m);
        if (t != null) {
            t.setUserName(UUID.randomUUID().toString());
        }

        TUser admin = new TUser();
        admin.setId(0);
        admin.setUserName("admin");
        admin.setPassword(Encrypt.e("admin"));
        admin.setModifyDate(new Date());
        userDao.saveOrUpdate(admin);
    }

}
