package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MySQL {
    public static void main(String[] args) throws Exception {
        String auroraHost = args[0];
        String user = args[1];
        String password = args[2];

        //Connection conn = DriverManager.getConnection("jdbc:mysql://"+ auroraHost + "?user=" + user + "&password=" + password + "&useSSL=false");
        Connection conn = DriverManager.getConnection("jdbc:mysql://"+ auroraHost + "?user=" + user + "&password=" + password + "&useSSL=true");
        PreparedStatement ps0 = conn.prepareStatement("select 1");
        ResultSet rs1 = ps0.executeQuery();
        rs1.clearWarnings();
        ps0.close();
        conn.close();
    }
}
