package bean_promotion;

public class pm_req_insertrequest {
	private String access_token;
    private int check_Job;
    private String new_docno;
    private String start_promo;
    private String sec_name;
    private String promotion_code;
    private String user_id;
    
	public pm_req_insertrequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_req_insertrequest(String access_token, int check_Job,
			String new_docno, String start_promo, String sec_name,
			String promotion_code, String user_id) {
		super();
		this.access_token = access_token;
		this.check_Job = check_Job;
		this.new_docno = new_docno;
		this.start_promo = start_promo;
		this.sec_name = sec_name;
		this.promotion_code = promotion_code;
		this.user_id = user_id;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getCheck_Job() {
		return check_Job;
	}

	public void setCheck_Job(int check_Job) {
		this.check_Job = check_Job;
	}

	public String getNew_docno() {
		return new_docno;
	}

	public void setNew_docno(String new_docno) {
		this.new_docno = new_docno;
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

	public String getPromotion_code() {
		return promotion_code;
	}

	public void setPromotion_code(String promotion_code) {
		this.promotion_code = promotion_code;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	
}
