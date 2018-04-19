package bean_promotion;

import bean_center.ct_res_response;

public class pm_res_itemdetails {
	ct_res_response resp;
	private String item_code;
	private String item_name;
	private String unit_code;
	private Double sale_price;
	private String comm_name;
	private String comm_begindate;
	private String comm_enddate;
	private double comm_retail;
	private double comm_wholesale;
	
	public pm_res_itemdetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_itemdetails(ct_res_response resp, String item_code,
			String item_name, String unit_code, Double sale_price,
			String comm_name, String comm_begindate, String comm_enddate,
			double comm_retail, double comm_wholesale) {
		super();
		this.resp = resp;
		this.item_code = item_code;
		this.item_name = item_name;
		this.unit_code = unit_code;
		this.sale_price = sale_price;
		this.comm_name = comm_name;
		this.comm_begindate = comm_begindate;
		this.comm_enddate = comm_enddate;
		this.comm_retail = comm_retail;
		this.comm_wholesale = comm_wholesale;
	}

	public ct_res_response getResp() {
		return resp;
	}

	public void setResp(ct_res_response resp) {
		this.resp = resp;
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

	public Double getSale_price() {
		return sale_price;
	}

	public void setSale_price(Double sale_price) {
		this.sale_price = sale_price;
	}

	public String getComm_name() {
		return comm_name;
	}

	public void setComm_name(String comm_name) {
		this.comm_name = comm_name;
	}

	public String getComm_begindate() {
		return comm_begindate;
	}

	public void setComm_begindate(String comm_begindate) {
		this.comm_begindate = comm_begindate;
	}

	public String getComm_enddate() {
		return comm_enddate;
	}

	public void setComm_enddate(String comm_enddate) {
		this.comm_enddate = comm_enddate;
	}

	public double getComm_retail() {
		return comm_retail;
	}

	public void setComm_retail(double comm_retail) {
		this.comm_retail = comm_retail;
	}

	public double getComm_wholesale() {
		return comm_wholesale;
	}

	public void setComm_wholesale(double comm_wholesale) {
		this.comm_wholesale = comm_wholesale;
	}
	
	
}
