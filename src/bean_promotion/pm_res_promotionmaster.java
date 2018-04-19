package bean_promotion;

import java.util.List;

import bean_center.ct_res_response;

public class pm_res_promotionmaster {
	ct_res_response resp;
	List<pm_res_listpromotionmaster> list_pm;
	
	public pm_res_promotionmaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_promotionmaster(ct_res_response resp,
			List<pm_res_listpromotionmaster> list_pm) {
		super();
		this.resp = resp;
		this.list_pm = list_pm;
	}

	public ct_res_response getResp() {
		return resp;
	}

	public void setResp(ct_res_response resp) {
		this.resp = resp;
	}

	public List<pm_res_listpromotionmaster> getList_pm() {
		return list_pm;
	}

	public void setList_pm(List<pm_res_listpromotionmaster> list_pm) {
		this.list_pm = list_pm;
	}

}
