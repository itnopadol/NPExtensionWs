package bean_promotion;

public class pm_res_listpromoitem {
	private String item_code;
	private String item_name;
	private String unit_code;
	private double normal_price;
	private double from_qty;
	private double to_qty;
	private double discount;
	private String discount_type;
	private String discount_word;
	private double promotion_price;
	private String my_description;
	private int is_cancel;
	private int line_number;
	private int is_brochure;
	private int is_member;
	private String promo_type;
	private String hot_price;
	
	public pm_res_listpromoitem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pm_res_listpromoitem(String item_code, String item_name,
			String unit_code, double normal_price, double from_qty,
			double to_qty, double discount, String discount_type,
			String discount_word, double promotion_price,
			String my_description, int is_cancel, int line_number,
			int is_brochure, int is_member, String promo_type, String hot_price) {
		super();
		this.item_code = item_code;
		this.item_name = item_name;
		this.unit_code = unit_code;
		this.normal_price = normal_price;
		this.from_qty = from_qty;
		this.to_qty = to_qty;
		this.discount = discount;
		this.discount_type = discount_type;
		this.discount_word = discount_word;
		this.promotion_price = promotion_price;
		this.my_description = my_description;
		this.is_cancel = is_cancel;
		this.line_number = line_number;
		this.is_brochure = is_brochure;
		this.is_member = is_member;
		this.promo_type = promo_type;
		this.hot_price = hot_price;
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

	public double getNormal_price() {
		return normal_price;
	}

	public void setNormal_price(double normal_price) {
		this.normal_price = normal_price;
	}

	public double getFrom_qty() {
		return from_qty;
	}

	public void setFrom_qty(double from_qty) {
		this.from_qty = from_qty;
	}

	public double getTo_qty() {
		return to_qty;
	}

	public void setTo_qty(double to_qty) {
		this.to_qty = to_qty;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDiscount_type() {
		return discount_type;
	}

	public void setDiscount_type(String discount_type) {
		this.discount_type = discount_type;
	}

	public String getDiscount_word() {
		return discount_word;
	}

	public void setDiscount_word(String discount_word) {
		this.discount_word = discount_word;
	}

	public double getPromotion_price() {
		return promotion_price;
	}

	public void setPromotion_price(double promotion_price) {
		this.promotion_price = promotion_price;
	}

	public String getMy_description() {
		return my_description;
	}

	public void setMy_description(String my_description) {
		this.my_description = my_description;
	}

	public int getIs_cancel() {
		return is_cancel;
	}

	public void setIs_cancel(int is_cancel) {
		this.is_cancel = is_cancel;
	}

	public int getLine_number() {
		return line_number;
	}

	public void setLine_number(int line_number) {
		this.line_number = line_number;
	}

	public int getIs_brochure() {
		return is_brochure;
	}

	public void setIs_brochure(int is_brochure) {
		this.is_brochure = is_brochure;
	}

	public int getIs_member() {
		return is_member;
	}

	public void setIs_member(int is_member) {
		this.is_member = is_member;
	}

	public String getPromo_type() {
		return promo_type;
	}

	public void setPromo_type(String promo_type) {
		this.promo_type = promo_type;
	}

	public String getHot_price() {
		return hot_price;
	}

	public void setHot_price(String hot_price) {
		this.hot_price = hot_price;
	}
	
	
}
