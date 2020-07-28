package ultil;

import java.sql.*;

public final class MySQLConnection {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/i_note?useSSL=false";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "Hitman996";

    public MySQLConnection() {
    }



    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public boolean execute(String strQuery) throws SQLException {
        Connection conn = null;
        try {
            conn = getConnection();
            Statement st = conn.createStatement();
            st.execute(strQuery);

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            return false;
        } finally {
            conn.close();
        }
        return true;
    }

    public ResultSet query(String strSQL) throws Exception {
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            if (conn != null){
                System.out.println("--------------connection success---------------------");
            }else{
                System.out.println("-------------connection fail--------------");
            }
            Statement st = conn.createStatement();
            rs = st.executeQuery(strSQL);
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

        } finally {

        }
        return rs;
    }

    public boolean executeUpdate(String strQuery) throws SQLException {
        Connection conn = null;
        try {
            conn = getConnection();
            PreparedStatement st = conn.prepareStatement(strQuery);
            st.executeUpdate(strQuery);

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            return false;
        } finally {
            conn.close();
        }
        return true;
    }



}
