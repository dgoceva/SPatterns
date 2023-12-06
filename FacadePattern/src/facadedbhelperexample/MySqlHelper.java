/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadedbhelperexample;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getMySqlDBConnection(){
		//get MySql DB connection using connection parameters
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("generate PDF MySQL Report");
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		//get data from table and generate html report
		System.out.println("generate HTML MySQL Report");
	}
}