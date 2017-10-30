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
    create table STUDENT {id primary key int autoincrement,
            name text, graduationDate int foreign key,
            major foreign key int null,
            adviser foreign key int
            }
    
    create table ENROLLMENT {id primary key int autoincrement,
            student int foreign key,
            section foreign key int,
            grade text null
            }
    create table SECTION {id primary key int autoincrement,
            course int foreign key,
            instructor foreign key int,
            offered foreign key int,
            location foregn key int,
            startHour time        
            }
    
    create table SEMESTER {id primary key int autoincrement,
            year int,
            season text
            }     
    
    create table LOCATION {id primary key int autoincrement,
            building text,
            room int,
            purpose text
            }
    
    create table COURSE {id primary key int autoincrement,
            department int foreign key,
            abbreviation text,
            number int,
            title text,
            credits int
            }
    
    create table FACULTY {id primary key int autoincrement,
            name text, department int foreign key,
            startDate foreign key int null,
            endDate foreign key int null,
            office foreign key int
            }
    
    create table DEPARTMENT {id primary key int autoincrement,
            name text,
            building text
            }
    create table MAJOR {id primary key int autoincrement,
            department foreign key int,
            name text
            }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
