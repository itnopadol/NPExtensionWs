package bean_center;


public class ct_res_dataaccesstoken {
	ct_res_response resp;
	private String user_id;
	private String sale_code;
	private String access_token;
	private String access_datetime;
	private String database_name;
	private String server_name;
	
	public ct_res_dataaccesstoken() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ct_res_dataaccesstoken(ct_res_response resp, String user_id,
			String sale_code, String access_token, String access_datetime,
			String database_name, String server_name) {
		super();
		this.resp = resp;
		this.user_id = user_id;
		this.sale_code = sale_code;
		this.access_token = access_token;
		this.access_datetime = access_datetime;
		this.database_name = database_name;
		this.server_name = server_name;
	}

	public ct_res_response getResp() {
		return resp;
	}

	public void setResp(ct_res_response resp) {
		this.resp = resp;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getSale_code() {
		return sale_code;
	}

	public void setSale_code(String sale_code) {
		this.sale_code = sale_code;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getAccess_datetime() {
		return access_datetime;
	}

	public void setAccess_datetime(String access_datetime) {
		this.access_datetime = access_datetime;
	}

	public String getDatabase_name() {
		return database_name;
	}

	public void setDatabase_name(String database_name) {
		this.database_name = database_name;
	}

	public String getServer_name() {
		return server_name;
	}

	public void setServer_name(String server_name) {
		this.server_name = server_name;
	}
	
	
}
