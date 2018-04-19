package connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean_center.ct_req_getdatafromaccesstoken;
import bean_center.ct_res_dataaccesstoken;
import bean_conn.conn_req_serverdatabean;

import connection.SQLConnect;

public class SQLExecute {
	private SQLConnect ds = SQLConnect.INSTANCE;
	private Integer isSuccess;
	public Integer isSuccess() {
		return isSuccess;
	}
	public void setSuccess(Integer isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	public Integer executeSql(conn_req_serverdatabean db,String sql) {
		
		try {
			Statement stmt = ds.getSqlStatement(db.getServer_name(), db.getDatabase_name());
	
			stmt.execute(sql);
			if (stmt != null) {
				stmt.close();
			}
			isSuccess=1;
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			isSuccess=0;
		} finally {
			
			ds.close();
			
		}
		
		return isSuccess;
	}
	
	conn_req_serverdatabean db = new conn_req_serverdatabean();
	ct_res_dataaccesstoken data_conn = new ct_res_dataaccesstoken();
	public ct_res_dataaccesstoken dataConnect(String access_token){
		String vQuery;

		db.setDatabase_name("bcnp");
		db.setServer_name("192.168.0.7");
		
		try {
			Statement st = ds.getSqlStatement(db.getServer_name(), db.getDatabase_name());
			vQuery = "exec dbo.USP_NP_SearchTokenData '"+access_token+"'";
			ResultSet rs = st.executeQuery(vQuery);
			while(rs.next()){
				data_conn.setDatabase_name(rs.getString("databasename"));
				data_conn.setServer_name(rs.getString("servername"));
				data_conn.setUser_id(rs.getString("userid"));
				data_conn.setSale_code(rs.getString("salecode"));
			}
			
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally{
			ds.close();
		}
		
		return data_conn;
	}
}
