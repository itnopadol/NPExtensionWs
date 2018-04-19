package bean_promotion;

import bean_center.ct_res_response;

public class pm_res_gennewdocno {
	ct_res_response resp;
	private String doc_no;

	public pm_res_gennewdocno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_gennewdocno(ct_res_response resp, String doc_no) {
		super();
		this.resp = resp;
		this.doc_no = doc_no;
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

}
