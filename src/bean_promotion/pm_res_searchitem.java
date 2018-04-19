package bean_promotion;

import java.util.List;

import bean_center.ct_res_response;

public class pm_res_searchitem {
	ct_res_response resp;
	List<pm_res_listitem>list_item;
	
	public pm_res_searchitem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_searchitem(ct_res_response resp,
			List<pm_res_listitem> list_item) {
		super();
		this.resp = resp;
		this.list_item = list_item;
	}

	public ct_res_response getResp() {
		return resp;
	}

	public void setResp(ct_res_response resp) {
		this.resp = resp;
	}

	public List<pm_res_listitem> getList_item() {
		return list_item;
	}

	public void setList_item(List<pm_res_listitem> list_item) {
		this.list_item = list_item;
	}
	
	
}
