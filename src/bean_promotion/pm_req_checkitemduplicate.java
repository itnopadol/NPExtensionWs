package bean_promotion;

public class pm_req_checkitemduplicate {
	private String access_token;
    private String promotion_code;
    private String item_code;
    private String unit_code;
    
	public pm_req_checkitemduplicate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_req_checkitemduplicate(String access_token,
			String promotion_code, String item_code, String unit_code) {
		super();
		this.access_token = access_token;
		this.promotion_code = promotion_code;
		this.item_code = item_code;
		this.unit_code = unit_code;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getPromotion_code() {
		return promotion_code;
	}

	public void setPromotion_code(String promotion_code) {
		this.promotion_code = promotion_code;
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
