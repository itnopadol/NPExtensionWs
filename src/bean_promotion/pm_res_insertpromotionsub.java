package bean_promotion;

import bean_center.ct_res_response;

public class pm_res_insertpromotionsub {
	ct_res_response resp;
	private String doc_no;
	private String item_code;
	private String item_name;
	private String unit_code;
	private double normal_price;
	private double promotion_price;
	private int is_cancel;
	private int line_number;
	private int is_brochure;
	private String promo_type;
	
	
	public pm_res_insertpromotionsub() {
		super();
		// TODO Auto-generated constructor stub
	}


	public pm_res_insertpromotionsub(ct_res_response resp, String doc_no,
			String item_code, String item_name, String unit_code,
			double normal_price, double promotion_price, int is_cancel,
			int line_number, int is_brochure, String promo_type) {
		super();
		this.resp = resp;
		this.doc_no = doc_no;
		this.item_code = item_code;
		this.item_name = item_name;
		this.unit_code = unit_code;
		this.normal_price = normal_price;
		this.promotion_price = promotion_price;
		this.is_cancel = is_cancel;
		this.line_number = line_number;
		this.is_brochure = is_brochure;
		this.promo_type = promo_type;
	}


	public ct_res_response getResp() {
		return resp;
	}


	public void setResp(ct_res_response resp) {
		this.resp = resp;
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


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getUnit_code() {
		return unit_code;
	}


	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}


	public double getNormal_price() {
		return normal_price;
	}


	public void setNormal_price(double normal_price) {
		this.normal_price = normal_price;
	}


	public double getPromotion_price() {
		return promotion_price;
	}


	public void setPromotion_price(double promotion_price) {
		this.promotion_price = promotion_price;
	}


	public int getIs_cancel() {
		return is_cancel;
	}


	public void setIs_cancel(int is_cancel) {
		this.is_cancel = is_cancel;
	}


	public int getLine_number() {
		return line_number;
	}


	public void setLine_number(int line_number) {
		this.line_number = line_number;
	}


	public int getIs_brochure() {
		return is_brochure;
	}


	public void setIs_brochure(int is_brochure) {
		this.is_brochure = is_brochure;
	}


	public String getPromo_type() {
		return promo_type;
	}


	public void setPromo_type(String promo_type) {
		this.promo_type = promo_type;
	}
	
	

}
