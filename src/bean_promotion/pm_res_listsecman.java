package bean_promotion;

public class pm_res_listsecman {
    private String secman_code;
    private String secman_name;
    private String sec_name;
    private String user_id;
    
	public pm_res_listsecman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_listsecman(String secman_code, String secman_name,
			String sec_name, String user_id) {
		super();
		this.secman_code = secman_code;
		this.secman_name = secman_name;
		this.sec_name = sec_name;
		this.user_id = user_id;
	}

	public String getSecman_code() {
		return secman_code;
	}

	public void setSecman_code(String secman_code) {
		this.secman_code = secman_code;
	}

	public String getSecman_name() {
		return secman_name;
	}

	public void setSecman_name(String secman_name) {
		this.secman_name = secman_name;
	}

	public String getSec_name() {
		return sec_name;
	}

	public void setSec_name(String sec_name) {
		this.sec_name = sec_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
    
    
}
