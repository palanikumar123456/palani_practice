package com.durgasoft.core;

interface DBDriver {  // provided by sun microsystems
    public default void getDriverClass() {
        System.out.println("sun.jdbc.odbc.JdbcOdbcDriver");
    }
    public default void getDriverURL(){
        System.out.println("jdbc:odbc:dsnName");
    }
    public default void getDefaultPoolSize() {
        System.out.println("15 connections per pool");
    }
}

class OracleDriver implements DBDriver {
    @Override
    public void getDriverClass(){
        System.out.println("oracle.jdbc.OracleDriver");
    }

    @Override
    public void getDriverURL() {
        System.out.println("jdbc:oracle:thin:@localhost:1521:xe");
    }
}

class MySQLDriver implements DBDriver { // MySQL Vendor
    @Override
    public void getDriverClass() {
        System.out.println("com.mysql.jdbc.Driver");
    }

    @Override
    public void getDriverURL() {
        System.out.println("jdbc:mysql://localhost:3306/dbName");
    }
}

class MSAccessDriver implements DBDriver {  // MSAccess vendor
}

public class Test1 {
    public static void main(String[] args) {
        DBDriver oracleDriver = new OracleDriver();
        oracleDriver.getDriverClass();
        oracleDriver.getDriverURL();
        oracleDriver.getDefaultPoolSize();
        System.out.println();

        DBDriver mysqlDriver = new MySQLDriver();
        mysqlDriver.getDriverClass();
        mysqlDriver.getDriverURL();
        mysqlDriver.getDefaultPoolSize();
        System.out.println();

        DBDriver msaccessDriver = new MSAccessDriver();
        msaccessDriver.getDriverClass();
        msaccessDriver.getDriverURL();
        msaccessDriver.getDefaultPoolSize();
    }
}