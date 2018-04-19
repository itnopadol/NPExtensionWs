package bean_promotion;

import java.util.List;

import bean_center.ct_res_response;

public class pm_res_promotiondetails {
	ct_res_response resp;
    private String doc_no;
    private String start_promo;
    private String sec_name;
    private String promotion_Code;
    private String date_start;
    private String date_end;
    private int is_cancel;
    private int is_confirm;
    private String user_id;
    List<pm_res_listpromoitem>list_item;
    
	public pm_res_promotiondetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_promotiondetails(ct_res_response resp, String doc_no,
			String start_promo, String sec_name, String promotion_Code,
			String date_start, String date_end, int is_cancel, int is_confirm,
			String user_id, List<pm_res_listpromoitem> list_item) {
		super();
		this.resp = resp;
		this.doc_no = doc_no;
		this.start_promo = start_promo;
		this.sec_name = sec_name;
		this.promotion_Code = promotion_Code;
		this.date_start = date_start;
		this.date_end = date_end;
		this.is_cancel = is_cancel;
		this.is_confirm = is_confirm;
		this.user_id = user_id;
		this.list_item = list_item;
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

	public String getStart_promo() {
		return start_promo;
	}

	public void setStart_promo(String start_promo) {
		this.start_promo = start_promo;
	}

	public String getSec_name() {
		return sec_name;
	}

	public void setSec_name(String sec_name) {
		this.sec_name = sec_name;
	}

	public String getPromotion_Code() {
		return promotion_Code;
	}

	public void setPromotion_Code(String promotion_Code) {
		this.promotion_Code = promotion_Code;
	}

	public String getDate_start() {
		return date_start;
	}

	public void setDate_start(String date_start) {
		this.date_start = date_start;
	}

	public String getDate_end() {
		return date_end;
	}

	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}

	public int getIs_cancel() {
		return is_cancel;
	}

	public void setIs_cancel(int is_cancel) {
		this.is_cancel = is_cancel;
	}

	public int getIs_confirm() {
		return is_confirm;
	}

	public void setIs_confirm(int is_confirm) {
		this.is_confirm = is_confirm;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public List<pm_res_listpromoitem> getList_item() {
		return list_item;
	}

	public void setList_item(List<pm_res_listpromoitem> list_item) {
		this.list_item = list_item;
	}

	
}
