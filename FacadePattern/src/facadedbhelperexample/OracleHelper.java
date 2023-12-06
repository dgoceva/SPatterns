/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadedbhelperexample;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection(){
		//get Oracle DB connection using connection parameters
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("generate Oracle PDF Report");
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		//get data from table and generate html report
		System.out.println("generate Oracle HTML Report");
	}
	
}