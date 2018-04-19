package bean_promotion;

public class pm_req_searchitemdocno {
	private String access_token;
	private String doc_no;
	private String item_code;
	private String unit_code;
	
	public pm_req_searchitemdocno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_req_searchitemdocno(String access_token, String doc_no,
			String item_code, String unit_code) {
		super();
		this.access_token = access_token;
		this.doc_no = doc_no;
		this.item_code = item_code;
		this.unit_code = unit_code;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getDoc_no() {
		return doc_no;
	}

	public void setDoc_no(String doc_no) {
		this.doc_no = doc_no;
	}

	public String getItem_code() {
		return item_code;
	}

	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}

	public String getUnit_code() {
		return unit_code;
	}

	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}
	
	
}
