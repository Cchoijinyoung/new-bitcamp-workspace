package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberListCommand implements Command {

  @Override
  public void execute() {
    System.out.println("회원목록");
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, name, email, tel, cdt"
                + " from pms_member"
                + " order by no desc")) {
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          rs.getInt("no"),
          rs.getString("name"),

        }
      }
  } catch(Exception e) {
    System.out.println("");
  }
}
}
