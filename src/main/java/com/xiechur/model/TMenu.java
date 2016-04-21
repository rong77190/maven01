package com.xiechur.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dell on 2016/4/4.
 */
@Entity
@Table(name = "t_menu", schema = "", catalog = "db_jsp01")
public class TMenu {

    private TMenu tMenu;
    private int id;
    private String text;
    private String iconcls;
    private String url;
    private Set<TMenu> tmenus = new HashSet<TMenu>(0);

    public TMenu(TMenu tMenu, int id, String text, String iconcls, String url, Set<TMenu> tmenus) {
        this.tMenu = tMenu;
        this.id = id;
        this.text = text;
        this.iconcls = iconcls;
        this.url = url;
        this.tmenus = tmenus;
    }

    public TMenu() {
    }

    @Id
    @Column(name = "id", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pid")
    public TMenu gettMenu() {
        return this.tMenu;
    }

    public void settMenu(TMenu tMenu) {
        this.tMenu = tMenu;
    }
    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "iconcls")
    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TMenu tMenu = (TMenu) o;

        if (id != tMenu.id) return false;
        if (iconcls != null ? !iconcls.equals(tMenu.iconcls) : tMenu.iconcls != null) return false;
        if (text != null ? !text.equals(tMenu.text) : tMenu.text != null) return false;
        if (url != null ? !url.equals(tMenu.url) : tMenu.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (iconcls != null ? iconcls.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tMenu")
    public Set<TMenu> getTmenus() {
        return this.tmenus;
    }

    public void setTmenus(Set<TMenu> tmenus) {
        this.tmenus = tmenus;
    }
}
