package com.xiechur.model;

import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by dell on 2016/4/4.
 */
@Entity
@Table(name = "t_memu", schema = "", catalog = "db_jsp01")
public class TMemu implements Serializable {
    private int id;
    private String text;
    private String iconcls;
    private String url;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

        TMemu tMemu = (TMemu) o;

        if (id != tMemu.id) return false;
        if (iconcls != null ? !iconcls.equals(tMemu.iconcls) : tMemu.iconcls != null) return false;
        if (text != null ? !text.equals(tMemu.text) : tMemu.text != null) return false;
        if (url != null ? !url.equals(tMemu.url) : tMemu.url != null) return false;

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
}
