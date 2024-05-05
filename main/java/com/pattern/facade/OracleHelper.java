package main.java.com.pattern.facade;

import java.sql.Connection;

/**
 * @author Hamid Khatami (khatami@caspco.ir)
 * @version 1.0 2024.0416
 * @since 1.0
 */
public  class OracleHelper {
    public static Connection getOracleDBConnection(){
    		//get Oracle DB connection using connection parameters
    		return null;
    	}

    	public void generateOraclePDFReport(String tableName, Connection con){
    		//get data from table and generate pdf report
    	}

    	public void generateOracleHTMLReport(String tableName, Connection con){
    		//get data from table and generate pdf report
    	}
}
