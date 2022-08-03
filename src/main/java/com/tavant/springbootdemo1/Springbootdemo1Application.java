package com.tavant.springbootdemo1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.tavant.springbootdemo1.entity.Contact;

@SpringBootApplication // == @configuration + @componnentscan + @enableautoconfiguratble
public class Springbootdemo1Application {
	static JdbcTemplate jdbcTemplateObj;
    static SimpleDriverDataSource dataSourceObj;
 
    // Database Configuration Parameters
    static String DB_USERNAME = "postgres";
    static String DB_PASSWORD = "anubhav@2000";
    static String DB_URL = "jdbc:postgresql://localhost:5432/Banking";

	public static SimpleDriverDataSource getDatabaseConnection() throws SQLException  {
        dataSourceObj = new SimpleDriverDataSource();
        dataSourceObj.setDriverClass(org.postgresql.Driver.class);
		dataSourceObj.setUrl(DB_URL);
		dataSourceObj.setUsername(DB_USERNAME);
		dataSourceObj.setPassword(DB_PASSWORD);
        return dataSourceObj;
    }
	public static void main(String[] args) throws SQLException {
		// Code To Set Driver Class Name, Database URL, Username & Password
        jdbcTemplateObj = new JdbcTemplate(getDatabaseConnection());
 
        if(null != jdbcTemplateObj) {
 
            // SQL Operation #1 - SQL INSERT Operation
            String sqlInsertQuery = "INSERT INTO contact (name, email, address, telephone) VALUES (?, ?, ?, ?)";
            for(int j=101; j<106; j++) {
                jdbcTemplateObj.update(sqlInsertQuery, "Editor " + j, "editor" + j +"@javacodegeek.com", "Greece", "0123456789");
            }
 
            // SQL Operation #2 - SQL UPDATE Operation
            String sqlUpdateQuery = "UPDATE contact set email=? where name=?";
            jdbcTemplateObj.update(sqlUpdateQuery, "administrator101@javacodegeek.com", "Editor 101");
 
            // SQL Operation #3 - SQL READ Operation
            String sqlSelectQuery = "SELECT name, email, address, telephone FROM contact";
            List listContacts = jdbcTemplateObj.query(sqlSelectQuery, new RowMapper() {
                public Contact mapRow(ResultSet result, int rowNum) throws SQLException {
                    Contact contactObj = new Contact();
                    contactObj.setName(result.getString("name"));
                    contactObj.setEmail(result.getString("email"));
                    contactObj.setAddress(result.getString("address"));
                    contactObj.setPhone(result.getString("telephone"));
                    return contactObj;
                }
            });
 
            // Displaying The SQL Records
            for (Object contactDetail : listContacts) {
                System.out.println(((Contact)contactDetail).toString());
            }
 
            // SQL Operation #4 - SQL DELETE Operation
            String sqlDeleteQuery = "DELETE FROM contact where name=?";
            jdbcTemplateObj.update(sqlDeleteQuery, "Editor 104");
        } else {
            System.out.print("Application Is Not Able To Bind With The Database! Please Check!");
        }
		SpringApplication.run(Springbootdemo1Application.class, args);

	}

}
