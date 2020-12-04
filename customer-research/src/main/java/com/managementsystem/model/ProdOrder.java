package com.managementsystem.model;

import java.util.Date;

public class ProdOrder {
    private String uuid;
    private String order_id;
    private String name;
    private String wechat_no;
    private String tel;
    private String prod_name;
    private String prod_price;
    private String order_date;
    private Date update_datetime;
    private String num;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWechat_no() {
        return wechat_no;
    }

    public void setWechat_no(String wechat_no) {
        this.wechat_no = wechat_no;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_price() {
        return prod_price;
    }

    public void setProd_price(String prod_price) {
        this.prod_price = prod_price;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public Date getUpdate_datetime() {
        return update_datetime;
    }

    public void setUpdate_datetime(Date update_datetime) {
        this.update_datetime = update_datetime;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ProdOrder{" +
                "uuid='" + uuid + '\'' +
                ", order_id='" + order_id + '\'' +
                ", name='" + name + '\'' +
                ", wechat_no='" + wechat_no + '\'' +
                ", tel='" + tel + '\'' +
                ", prod_name='" + prod_name + '\'' +
                ", prod_price='" + prod_price + '\'' +
                ", order_date='" + order_date + '\'' +
                ", update_datetime=" + update_datetime +
                ", num='" + num + '\'' +
                '}';
    }
}
