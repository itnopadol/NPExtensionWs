package bean_conn;

public class conn_req_serverdatabean {
	private String server_name;
	private String database_name;
	
	public conn_req_serverdatabean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public conn_req_serverdatabean(String server_name, String database_name) {
		super();
		this.server_name = server_name;
		this.database_name = database_name;
	}

	public String getServer_name() {
		return server_name;
	}

	public void setServer_name(String server_name) {
		this.server_name = server_name;
	}

	public String getDatabase_name() {
		return database_name;
	}

	public void setDatabase_name(String database_name) {
		this.database_name = database_name;
	}
	
	
}
