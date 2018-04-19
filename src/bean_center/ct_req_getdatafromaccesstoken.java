package bean_center;

public class ct_req_getdatafromaccesstoken {
	private String company_code;
	private String sale_code;
	private String sale_password;
	
	public ct_req_getdatafromaccesstoken() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ct_req_getdatafromaccesstoken(String company_code, String sale_code,
			String sale_password) {
		super();
		this.company_code = company_code;
		this.sale_code = sale_code;
		this.sale_password = sale_password;
	}

	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}

	public String getSale_code() {
		return sale_code;
	}

	public void setSale_code(String sale_code) {
		this.sale_code = sale_code;
	}

	public String getSale_password() {
		return sale_password;
	}

	public void setSale_password(String sale_password) {
		this.sale_password = sale_password;
	}
	
	
}
