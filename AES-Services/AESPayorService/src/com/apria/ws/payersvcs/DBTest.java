package com.apria.ws.payersvcs;

import javax.naming.*;
import javax.sql.*;
import java.sql.*;

public class DBTest {

  String foo = "Not Connected";
  int bar = -1;
  Connection conn = null;
  
  
  public void init() {
    try{
      Context ctx = new InitialContext();
      if(ctx == null ) 
          throw new Exception("KaBoom - No Context");

      DataSource ds = 
            (DataSource)ctx.lookup(
               "java:comp/env/jdbc/PPI");

      if (ds != null) {
        conn = ds.getConnection();
              
        if(conn != null)  {
            foo = "Got Connection "+conn.toString();
            
            String sql = "select PPI.M_PYR_BNFT.PYR_BNFT_UNQ_SK, PPI.M_PYR_BNFT.PYR_BNFT_ID from PPI.M_PYR_BNFT where PPI.M_PYR_BNFT.PYR_BNFT_ID = ?";
            PreparedStatement ps = conn.prepareStatement( sql );
            ps.setString(1, "*CT99");
            ResultSet rst = ps.executeQuery();
            
            PayorBenefitsLogger.log(foo);

            if(rst.next()) {
            	PayorBenefitsLogger.log(rst.getString("PYR_BNFT_UNQ_SK"));
            	PayorBenefitsLogger.log(rst.getString("PYR_BNFT_ID"));
            	
            	foo=rst.getString(1);
            	bar=rst.getInt(2);
            }

        }
      }

    }catch(Exception e) {
      e.printStackTrace();
    } finally {
    	if( conn != null )
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    }
 }

 public String getFoo() {
	 return foo; 
	 }
 public int getBar() { return bar;}
}