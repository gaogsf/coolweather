package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

//数据库对象关系模型ORM
public class City extends LitePalSupport {
    //字段区
    private int id;
    private String cityName;//记录市的名字
    private int cityCode;//记录市的代号
    private int provinceId;//记录当前市所属省的id值

    //方法区
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
