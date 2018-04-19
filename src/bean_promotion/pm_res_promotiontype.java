package bean_promotion;

import java.util.List;

import bean_center.ct_res_response;

public class pm_res_promotiontype {
	ct_res_response resp;
	List<pm_res_listpromotiontype>list_promotype;
	
	public pm_res_promotiontype() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_promotiontype(ct_res_response resp,
			List<pm_res_listpromotiontype> list_promotype) {
		super();
		this.resp = resp;
		this.list_promotype = list_promotype;
	}

	public ct_res_response getResp() {
		return resp;
	}

	public void setResp(ct_res_response resp) {
		this.resp = resp;
	}

	public List<pm_res_listpromotiontype> getList_promotype() {
		return list_promotype;
	}

	public void setList_promotype(List<pm_res_listpromotiontype> list_promotype) {
		this.list_promotype = list_promotype;
	}
}
