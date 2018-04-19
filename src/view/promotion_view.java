package view;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import controller.promotion_controller;

import bean_center.ct_req_accesstoken;
import bean_center.ct_res_response;
import bean_conn.conn_req_serverdatabean;
import bean_promotion.pm_req_insertrequest;
import bean_promotion.pm_req_insertrequestsub;
import bean_promotion.pm_req_search;
import bean_promotion.pm_req_searchitem;
import bean_promotion.pm_req_searchitemdocno;
import bean_promotion.pm_res_gennewdocno;
import bean_promotion.pm_res_insertpromotion;
import bean_promotion.pm_res_insertpromotionsub;
import bean_promotion.pm_res_itemdetails;
import bean_promotion.pm_res_promotion;
import bean_promotion.pm_res_promotiondetails;
import bean_promotion.pm_res_promotionmaster;
import bean_promotion.pm_res_promotiontype;
import bean_promotion.pm_res_searchitem;
import bean_promotion.pm_res_secman;

@Path(value="/promotion")
public class promotion_view {

	@POST 
	@Path("/v1/docno")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public pm_res_gennewdocno genNewDocNo (ct_req_accesstoken req){
		promotion_controller ct = new promotion_controller();
		pm_res_gennewdocno docno = new pm_res_gennewdocno();
		
		docno = ct.genNewDocNo(req);
		
		return docno;
	}
	
	@POST 
	@Path("/v1/campaign")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public pm_res_promotionmaster ListCampaign (ct_req_accesstoken req){
		promotion_controller ct = new promotion_controller();
		pm_res_promotionmaster campaign = new pm_res_promotionmaster();
		
		campaign = ct.ListCampaign(req);
		
		return campaign;
	}
	
	
	@POST 
	@Path("/v1/secman")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public pm_res_secman ListSecMan (ct_req_accesstoken req){
		promotion_controller ct = new promotion_controller();
		pm_res_secman secman = new pm_res_secman();
		
		secman = ct.ListSecMan(req);
		
		return secman;
	}
	
	@POST 
	@Path("/v1/promotype")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public pm_res_promotiontype ListPromoType (ct_req_accesstoken req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		promotion_controller ct = new promotion_controller();
		pm_res_promotiontype type = new pm_res_promotiontype();
		
		type = ct.ListPromoType(req);
		
		return type;
	}
	
	@POST 
	@Path("/v1/insert")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public pm_res_insertpromotion insertHead (pm_req_insertrequest req){
		promotion_controller ct = new promotion_controller();
		pm_res_insertpromotion insert = new pm_res_insertpromotion();
		
		insert = ct.insertHead(req);
		
		return insert;
	}
	
	@POST 
	@Path("/v1/manageitem")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public pm_res_insertpromotionsub insertSub (pm_req_insertrequestsub req){
		promotion_controller ct = new promotion_controller();
		pm_res_insertpromotionsub item = new pm_res_insertpromotionsub();
		
		item = ct.insertSub(req);
		
		return item;
	}
	
	@POST 
	@Path("/v1/cancel")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public ct_res_response cancelDoc (pm_req_search req){
		promotion_controller ct = new promotion_controller();
		ct_res_response resp = new ct_res_response();
		
		resp = ct.cancelDoc(req);
		
		return resp;
	}
	
	@POST 
	@Path("/v1/cancelitem")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public ct_res_response cancelItem (pm_req_searchitemdocno req){
		promotion_controller ct = new promotion_controller();
		ct_res_response resp = new ct_res_response();
		
		resp = ct.cancelItem(req);
		
		return resp;
	}
	
	@POST 
	@Path("/v1/promotion")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public pm_res_promotion promotion (pm_req_search req){
		promotion_controller ct = new promotion_controller();
		pm_res_promotion promotion = new pm_res_promotion();
		
		promotion = ct.promotion(req);
		
		return promotion;
	}
	
	@POST 
	@Path("/v1/promodetails")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public pm_res_promotiondetails promodetails (pm_req_search req){
		promotion_controller ct = new promotion_controller();
		pm_res_promotiondetails promotion = new pm_res_promotiondetails();
		
		promotion = ct.promotiondetails(req);
		
		return promotion;
	}
	
	@POST 
	@Path("/v1/item")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public pm_res_searchitem searchitem (pm_req_search req){
		promotion_controller ct = new promotion_controller();
		pm_res_searchitem item_details = new pm_res_searchitem();
		
		item_details = ct.searchitem(req);
		
		return item_details;
	}
	
	@POST 
	@Path("/v1/itemdetails")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public pm_res_itemdetails itemdetails (pm_req_searchitem req){
		promotion_controller ct = new promotion_controller();
		pm_res_itemdetails item_details = new pm_res_itemdetails();
		
		item_details = ct.itemdetails(req);
		
		return item_details;
	}
	
	@POST 
	@Path("/v1/itembarcode")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public pm_res_itemdetails itembarcode (pm_req_search req){
		promotion_controller ct = new promotion_controller();
		pm_res_itemdetails item_details = new pm_res_itemdetails();
		
		item_details = ct.itembarcode(req);
		
		return item_details;
	}
}
