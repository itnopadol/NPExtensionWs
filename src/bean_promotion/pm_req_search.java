package bean_promotion;

public class pm_req_search {
	private String access_token;
	private String search;
	
	public pm_req_search() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_req_search(String access_token, String search) {
		super();
		this.access_token = access_token;
		this.search = search;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
	
}
