package beans;

import java.sql.*;

public class SQLBean  {

    String url = "jdbc:postgresql://localhost:5439/db1";
    String sqlstr = "SELECT name, age, gender FROM student;";
    String result;
    Connection con;
    ResultSet rs;
    Statement st;

    
    public SQLBean() {
    }
    

    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public Connection getCon() {
        return con;
    }


    public void setCon(Connection con) {
        this.con = con;
    }


    public String getSqlstr() {
        doSQL();
        return sqlstr;
    }

 


    public void setSqlstr(String sqlstr) {
        doSQL();
        this.sqlstr = sqlstr;
    }

    
    public void doSQL() 
    {
        
        try 
        {
            Class.forName("org.postgresql.Driver");
        } 
        catch(java.lang.ClassNotFoundException e) 
        {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try
        {        
            con = DriverManager.getConnection(url,"db_1", "pass");
            st = con.createStatement();
            rs = st.executeQuery(sqlstr);
            String s;
//            while(rs.next())
//            {
//                  s  = rs.getString(1);
//                  System.out.print(s);
//                  s  = rs.getString(2);
//                  System.out.print(s);
//                  s  = rs.getString(3);
//                  System.out.print(s);
//                  System.out.println();
//            }
            // System.out.println(mn.gname());
             rs.close();
            st.close();
            con.close();

        } 
        catch(SQLException ex) 
        {
            System.err.println("SQLException: " + ex.getMessage());
        }

    }

}