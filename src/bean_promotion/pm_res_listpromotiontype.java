package bean_promotion;

public class pm_res_listpromotiontype {
    private String code;
    private String name;
    private String my_description;
    
	public pm_res_listpromotiontype() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_listpromotiontype(String code, String name,
			String my_description) {
		super();
		this.code = code;
		this.name = name;
		this.my_description = my_description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMy_description() {
		return my_description;
	}

	public void setMy_description(String my_description) {
		this.my_description = my_description;
	}
    
	
    
}
