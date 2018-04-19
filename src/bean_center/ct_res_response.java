package bean_center;

public class ct_res_response {
	private boolean success;
	private boolean error;
	private String message;
	
	public ct_res_response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ct_res_response(boolean success, boolean error, String message) {
		super();
		this.success = success;
		this.error = error;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
