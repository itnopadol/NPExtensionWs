package bean_promotion;

public class pm_res_listitem {
	private String item_code;
	private String item_name;
	private String unit_code;
	private Double sale_price;
	private String comm_name;
	
	public pm_res_listitem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_listitem(String item_code, String item_name,
			String unit_code, Double sale_price, String comm_name) {
		super();
		this.item_code = item_code;
		this.item_name = item_name;
		this.unit_code = unit_code;
		this.sale_price = sale_price;
		this.comm_name = comm_name;
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
	
	
}
