package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

//数据库对象关系模型ORM
public class Province extends LitePalSupport {
    //字段区
    private int id;//实体类的字段id
    private String provinceName;//记录省的名字
    private int provinceCode;//记录省的代号

    //方法区
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
