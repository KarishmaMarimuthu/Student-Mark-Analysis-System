
package mas;
import java.sql.*;

public class MAS {
    private static Connection connection=null;
    
    public static void main(String[] args) {
       try{
           Class.forName("org.apache.derby.jdbc.ClientDriver"); 
           new FrontPage().setVisible(true);
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
    public static Connection getConnection(){
        try{
            if(connection==null){
                connection=DriverManager.getConnection("jdbc:derby://localhost:1527/mas","root","root");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;                
    }
            
    
}
