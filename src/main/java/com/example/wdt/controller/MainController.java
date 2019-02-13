package com.example.wdt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
@RequestMapping("api")
public class MainController {
    @GetMapping("test")
    public String test(@RequestParam(value = "title")String title) {

        //SpringApplication.run(WdtApplication.class, args);
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://dbpadinstance.cdpfajomg88b.ap-northeast-2.rds.amazonaws.com:1433;databaseName=DBPAD_DEV_MEMBER;user=myuser;password=1q2w3e4r";
        String result = "";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM [DBPAD_DEV_MEMBER].[dbo].[TB_Member_Info]";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                result += rs.getString("Member_Number") + " " + rs.getString("ID");
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
