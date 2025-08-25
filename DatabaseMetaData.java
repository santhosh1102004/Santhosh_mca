import java.sql.connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseMeta{
public static void main(String[]args){
string url="jdbc://localhost:3306/db":
string username="root":
string password="';
try(connection connection=Driver Manager.get connection(url,username,password)){
System.out.println("conneted to the database successfully!"):
database MataData metadata=connection.get MetaData();
System.out.println("Database Product Name:'+metadata.getDatabaseProductName();
System.out.println("Database Product Vertion:"+metadata.get DatabaseProductVersion());
System.out.println("DriverName:"+metadata.getDriverName());
System.out.println("DriverVertion:"metadata.getDriverVersion));
System.out.println("JDBC Major vertion:"+metadata.getJDBCMajor version());
System.out.println("JDBCMinor vertion:"+metaData.JDBCMajor version));
System.out.println("user Name:"+metadata.getuserName));
} 
catch(SQL Exception e)
{
System.err.println("connection failed:"+e.getmessage());
}
}
}
	