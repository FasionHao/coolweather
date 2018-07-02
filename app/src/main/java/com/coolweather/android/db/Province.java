package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport{
    private int id ;
    private String provinceName;
    private  int provinceCode;

    public int getId() {
        return id;
    }
    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
