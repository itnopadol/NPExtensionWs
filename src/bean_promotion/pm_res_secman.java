package bean_promotion;

import java.util.List;

import bean_center.ct_res_response;

public class pm_res_secman {
	ct_res_response resp;
	List<pm_res_listsecman>list_secman;
	
	public pm_res_secman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_secman(ct_res_response resp,
			List<pm_res_listsecman> list_secman) {
		super();
		this.resp = resp;
		this.list_secman = list_secman;
	}

	public ct_res_response getResp() {
		return resp;
	}

	public void setResp(ct_res_response resp) {
		this.resp = resp;
	}

	public List<pm_res_listsecman> getList_secman() {
		return list_secman;
	}

	public void setList_secman(List<pm_res_listsecman> list_secman) {
		this.list_secman = list_secman;
	}
	
	
}
