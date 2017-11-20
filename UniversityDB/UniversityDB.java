/* Erik Nelson
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitydb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class UniversityDB {
    
    /*mysql.createDB('UniversityDB');
    */
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Driver d = new ClientDriver();
            String url="";
            conn = d.connect(url, null);
            
            Statement stmt = conn.createStatement();
            String qry = "create table STUDENT {id primary key int autoincrement,\n" +
"            name text, graduationDate int foreign key,\n" +
"            major foreign key int null,\n" +
"            adviser foreign key int\n" +
"            };" +
"    \n" +
"    create table ENROLLMENT {id primary key int autoincrement,\n" +
"            student int foreign key,\n" +
"            section foreign key int,\n" +
"            grade text null\n" +
"            };" +
"    create table SECTION {id primary key int autoincrement,\n" +
"            course int foreign key,\n" +
"            instructor foreign key int,\n" +
"            offered foreign key int,\n" +
"            location foregn key int,\n" +
"            startHour time        \n" +
"            };" +
"    \n" +
"    create table SEMESTER {id primary key int autoincrement,\n" +
"            year int,\n" +
"            season text\n" +
"            };" +
"    \n" +
"    create table LOCATION {id primary key int autoincrement,\n" +
"            building text,\n" +
"            room int,\n" +
"            purpose text\n" +
"            };" +
"    \n" +
"    create table COURSE {id primary key int autoincrement,\n" +
"            department int foreign key,\n" +
"            abbreviation text,\n" +
"            number int,\n" +
"            title text,\n" +
"            credits int\n" +
"            };" +
"    \n" +
"    create table FACULTY {id primary key int autoincrement,\n" +
"            name text, department int foreign key,\n" +
"            startDate foreign key int null,\n" +
"            endDate foreign key int null,\n" +
"            office foreign key int\n" +
"            };" +
"    \n" +
"    create table DEPARTMENT {id primary key int autoincrement,\n" +
"            name text,\n" +
"            building text\n" +
"            }\n" +
"    create table MAJOR {id primary key int autoincrement,\n" +
"            department foreign key int,\n" +
"            name text\n" +
"            };";
            ResultSet rs = stmt.executeQuery(qry);
            
        }
        catch(SQLException e) {
            e.printStackTrace();
        
        }
        finally {
            try {
                if (conn != null)
                    conn.close();
            }
        catch (SQLException e) {
            e.printStackTrace();
        }    
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
