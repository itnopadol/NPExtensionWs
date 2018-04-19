package bean_promotion;

public class pm_res_listpromotionmaster {
    private String pm_code;
    private String pm_name;
    private String date_start;
    private String date_end;
    private String creator_code;
    private String create_date;
    private int is_cancel;
    private String pm_name1;
    
	public pm_res_listpromotionmaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_listpromotionmaster(String pm_code, String pm_name,
			String date_start, String date_end, String creator_code,
			String create_date, int is_cancel, String pm_name1) {
		super();
		this.pm_code = pm_code;
		this.pm_name = pm_name;
		this.date_start = date_start;
		this.date_end = date_end;
		this.creator_code = creator_code;
		this.create_date = create_date;
		this.is_cancel = is_cancel;
		this.pm_name1 = pm_name1;
	}

	public String getPm_code() {
		return pm_code;
	}

	public void setPm_code(String pm_code) {
		this.pm_code = pm_code;
	}

	public String getPm_name() {
		return pm_name;
	}

	public void setPm_name(String pm_name) {
		this.pm_name = pm_name;
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

	public String getCreator_code() {
		return creator_code;
	}

	public void setCreator_code(String creator_code) {
		this.creator_code = creator_code;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public int getIs_cancel() {
		return is_cancel;
	}

	public void setIs_cancel(int is_cancel) {
		this.is_cancel = is_cancel;
	}

	public String getPm_name1() {
		return pm_name1;
	}

	public void setPm_name1(String pm_name1) {
		this.pm_name1 = pm_name1;
	}

}
