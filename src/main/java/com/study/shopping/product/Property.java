package com.study.shopping.product;

public class Property {

    private String DB_PATH = "jdbc:sqlite:resources/shopping.db";

    public String getDB_PATH() {
        return DB_PATH;
    }

    public void setDB_PATH(String DB_PATH) {
        this.DB_PATH = DB_PATH;
    }
}
