import utils;


public class void main(String[] arg)
{
 String username = "steve";
String password = "blue";
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                  "user=" + uname + "&password=" + password); // Sensitive
}
