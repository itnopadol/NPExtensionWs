package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean_center.ct_req_accesstoken;
import bean_center.ct_res_dataaccesstoken;
import bean_center.ct_res_response;
import bean_conn.conn_req_serverdatabean;
import bean_promotion.pm_req_checkitemduplicate;
import bean_promotion.pm_req_insertrequest;
import bean_promotion.pm_req_insertrequestsub;
import bean_promotion.pm_req_search;
import bean_promotion.pm_req_searchitem;
import bean_promotion.pm_req_searchitemdocno;
import bean_promotion.pm_res_gennewdocno;
import bean_promotion.pm_res_insertpromotion;
import bean_promotion.pm_res_insertpromotionsub;
import bean_promotion.pm_res_itemdetails;
import bean_promotion.pm_res_listitem;
import bean_promotion.pm_res_listpromoitem;
import bean_promotion.pm_res_listpromotion;
import bean_promotion.pm_res_listpromotionmaster;
import bean_promotion.pm_res_listpromotiontype;
import bean_promotion.pm_res_listsecman;
import bean_promotion.pm_res_promotion;
import bean_promotion.pm_res_promotiondetails;
import bean_promotion.pm_res_promotionmaster;
import bean_promotion.pm_res_promotiontype;
import bean_promotion.pm_res_searchitem;
import bean_promotion.pm_res_secman;

import connection.SQLConnect;
import connection.SQLExecute;


public class promotion_controller {
	
	private final SQLConnect sql_conn = SQLConnect.INSTANCE;
	
	SQLExecute exec = new SQLExecute();
	ct_res_response resp = new ct_res_response();
	pm_res_gennewdocno doc_no = new pm_res_gennewdocno();
	
	String vQuery;
	String vQuerySub;
	
	ct_res_dataaccesstoken token = new ct_res_dataaccesstoken();
	public pm_res_gennewdocno genNewDocNo (ct_req_accesstoken req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_RequestNewDocNo";
			System.out.println("Gen New DocNo ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);

			while(rs.next()){
				doc_no.setDoc_no(rs.getString("newdocno"));
			}
		    rs.close();
		    st.close();
		    
			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		doc_no.setResp(resp);
		return doc_no;
	}
	
	pm_res_promotionmaster pm = new pm_res_promotionmaster();
	List<pm_res_listpromotionmaster> listpm = new ArrayList<pm_res_listpromotionmaster>();
	public pm_res_promotionmaster ListCampaign(ct_req_accesstoken req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_Find";
			System.out.println("USP_PM_Find ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);
			
			listpm.clear();
			pm_res_listpromotionmaster evt;
			while(rs.next()){
				evt = new pm_res_listpromotionmaster();
				evt.setCreate_date(rs.getString("createdate"));
				evt.setCreator_code(rs.getString("creatorcode"));
				evt.setDate_end(rs.getString("dateend"));
				evt.setDate_start(rs.getString("datestart"));
				evt.setIs_cancel(rs.getInt("iscancel"));
				evt.setPm_code(rs.getString("pmcode"));
				evt.setPm_name(rs.getString("pmname"));
				evt.setPm_name1(rs.getString("pmname1"));

				listpm.add(evt);
				
			}
		    rs.close();
		    st.close();
		    
			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		
		pm.setList_pm(listpm);
		pm.setResp(resp);
		return pm;
	} 
	
	
	pm_res_secman sm = new pm_res_secman();
	List<pm_res_listsecman> listsm = new ArrayList<pm_res_listsecman>();
	public pm_res_secman ListSecMan(ct_req_accesstoken req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_FindSecMan";
			System.out.println("USP_PM_FindSecMan ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);
			
			listsm.clear();
			pm_res_listsecman evt;
			while(rs.next()){
				evt = new pm_res_listsecman();
				evt.setSec_name(rs.getString("secname"));
				evt.setSecman_code(rs.getString("secmancode"));
				evt.setSecman_name(rs.getString("secmanname"));
				evt.setUser_id(rs.getString("userid"));
				listsm.add(evt);	
			}
		    rs.close();
		    st.close();
		    
			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		
		sm.setList_secman(listsm);
		sm.setResp(resp);
		return sm;
		
	} 
	
	pm_res_promotiontype type = new pm_res_promotiontype();	
	List<pm_res_listpromotiontype> listtype = new ArrayList<pm_res_listpromotiontype>();
	public pm_res_promotiontype ListPromoType(ct_req_accesstoken req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_FindType";
			System.out.println("USP_PM_FindType ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);
			
			listtype.clear();
			pm_res_listpromotiontype evt;
			while(rs.next()){
				evt = new pm_res_listpromotiontype();
				evt.setCode(rs.getString("code"));
				evt.setName(rs.getString("name1"));
				evt.setMy_description(rs.getString("mydescription"));
				listtype.add(evt);	
			}
		    rs.close();
		    st.close();
		    
			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		
		type.setList_promotype(listtype);
		type.setResp(resp);
		return type;
		
	}
	
	pm_res_insertpromotion insert = new pm_res_insertpromotion();
	public pm_res_insertpromotion insertHead(pm_req_insertrequest req){
		Integer isSuccess;
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println("insertHead = "+token.getDatabase_name());
		System.out.println("insertHead = "+token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try {
			Statement st = sql_conn.getSqlStatement(db.getServer_name(), db.getDatabase_name());
			vQuery = "exec dbo.USP_PM_NewInsertRequest "+req.getCheck_Job()+",'"+req.getNew_docno()+"','"+req.getStart_promo()+"','"+req.getSec_name()+"','"+req.getPromotion_code()+"','"+req.getUser_id()+"'";
			System.out.println("vQuery Insert Head=" +vQuery);
			isSuccess = exec.executeSql(db, vQuery);
			
			
			if (isSuccess==1){
				insert.setDoc_no(req.getNew_docno());
				resp.setSuccess(true);
				resp.setError(false);
				resp.setMessage("");
			}else{
				resp.setSuccess(false);
				resp.setError(true);
				resp.setMessage("Can not save header");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
		}
		insert.setResp(resp);
		return insert;
	}
	
	
	public ct_res_response cancelDoc(pm_req_search req){
		Integer isSuccess;
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println("insertHead = "+token.getDatabase_name());
		System.out.println("insertHead = "+token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try {
			Statement st = sql_conn.getSqlStatement(db.getServer_name(), db.getDatabase_name());
			vQuery = "exec dbo.USP_PM_DeletePMRequest '"+req.getSearch()+"'";
			System.out.println("vQuery Cancel Head=" +vQuery);
			isSuccess = exec.executeSql(db, vQuery);
			
			
			if (isSuccess==1){
				resp.setSuccess(true);
				resp.setError(false);
				resp.setMessage("");
			}else{
				resp.setSuccess(false);
				resp.setError(true);
				resp.setMessage("Can not cancel docno");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
		}
		insert.setResp(resp);
		return resp;
	}
	
	
	public ct_res_response cancelItem(pm_req_searchitemdocno req){
		Integer isSuccess;
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println("insertHead = "+token.getDatabase_name());
		System.out.println("insertHead = "+token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try {
			Statement st = sql_conn.getSqlStatement(db.getServer_name(), db.getDatabase_name());
			vQuery = "exec dbo.USP_PM_CancelItemPMRequest '"+req.getDoc_no()+"','"+req.getItem_code()+"','"+req.getUnit_code()+"'";
			System.out.println("vQuery Cancel Head=" +vQuery);
			isSuccess = exec.executeSql(db, vQuery);
			
			
			if (isSuccess==1){
				resp.setSuccess(true);
				resp.setError(false);
				resp.setMessage("");
			}else{
				resp.setSuccess(false);
				resp.setError(true);
				resp.setMessage("Can not cancel item");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
		}
		insert.setResp(resp);
		return resp;
	}
	
	pm_res_insertpromotionsub item_sub = new pm_res_insertpromotionsub();
	pm_req_checkitemduplicate check_duplicate = new pm_req_checkitemduplicate();
	public pm_res_insertpromotionsub insertSub(pm_req_insertrequestsub req){
		Integer isSuccess;
		Integer check_err;
		
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());

		check_duplicate.setAccess_token(req.getAccess_token());
		check_duplicate.setPromotion_code(req.getPromotion_code());
		check_duplicate.setItem_code(req.getItem_code());
		check_duplicate.setUnit_code(req.getUnit_code());
		
		if(req.getError()==0){
			check_err = this.checkitemduplicate(check_duplicate);
		}else{
			check_err = 0;
		}
		if (check_err == 0){

			try {
				Statement st = sql_conn.getSqlStatement(db.getServer_name(), db.getDatabase_name());
				vQuery = "exec dbo.USP_PM_NewInsertRequestSub "+check_err+","+req.getIs_complete_save()+",'"+req.getDoc_no()+"','"+req.getItem_code()+"','"+req.getItem_name()+"','"+req.getUnit_code()+"',"+req.getNormal_price()+","+req.getFrom_qTY()+","+req.getTo_qty()+","+req.getDiscount()+",'"+req.getDiscount_type()+"','"+req.getDiscount_Word()+"',"+req.getPromotion_price()+",'"+req.getMy_description()+"','"+req.getIs_cancel()+"',"+req.getLine_number()+",'"+req.getIs_brochure()+"','"+req.getIs_member()+"','"+req.getPromo_Type()+"','"+req.getHot_price()+"'";
				System.out.println("vQuery Insert Sub=" +vQuery);
				isSuccess = exec.executeSql(db, vQuery);

				if (isSuccess==1){
					
					vQuerySub = "exec dbo.USP_PM_DeleteCheckDuplicatItemLine '"+req.getDoc_no()+"','"+req.getPromotion_code()+"','"+req.getUser_id()+"'";
					isSuccess = exec.executeSql(db, vQuerySub);
					
					item_sub.setDoc_no(req.getDoc_no());
					item_sub.setIs_brochure(req.getIs_brochure());
					item_sub.setIs_cancel(req.getIs_cancel());
					item_sub.setItem_code(req.getItem_code());
					item_sub.setItem_name(req.getItem_name());
					item_sub.setLine_number(req.getLine_number());
					item_sub.setNormal_price(req.getNormal_price());
					item_sub.setPromo_type(req.getPromo_Type());
					item_sub.setPromotion_price(req.getPromotion_price());
					item_sub.setUnit_code(req.getUnit_code());
					resp.setSuccess(true);
					resp.setError(false);
					resp.setMessage("");
				}else{
					resp.setSuccess(false);
					resp.setError(true);
					resp.setMessage("Can not save header");
				}

			} catch (SQLException e) {
				// TODO: handle exception
				resp.setSuccess(false);
				resp.setError(true);
				resp.setMessage(e.getMessage());
			}
		
		}else{
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage("Item duplicate(สินค้าซ้ำ ไม่สามารถเพิ่มข้อมูลได้)");
		}
		
		item_sub.setResp(resp);
		return item_sub;
	}
	
	public int checkitemduplicate(pm_req_checkitemduplicate req){
		int is_error=0;
		
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_ItemDuplicate '"+req.getPromotion_code()+"','"+req.getItem_code()+"','"+req.getUnit_code()+"'";
			System.out.println("USP_PM_ItemDuplicate ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);
			
			
//                vCheckDuplicatePromotion = Trim(vRecordset.Fields("isduplicate").Value)
//                vCheckDuplicateDocno = Trim(vRecordset.Fields("duplicate").Value)

			
			while(rs.next()){
				is_error =rs.getInt("isduplicate");

			}
		    rs.close();
		    st.close();
		    
			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		
		System.out.println("Check Duplicate ="+is_error);
		return is_error;
	}
	
	pm_res_promotiondetails promo = new pm_res_promotiondetails();
	List<pm_res_listpromoitem> list_item = new ArrayList<pm_res_listpromoitem>();
	public pm_res_promotiondetails promotiondetails(pm_req_search req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_RequestSubSearch '"+req.getSearch()+"'";
			System.out.println("USP_PM_RequestSubSearch ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);
			
			list_item.clear();
			pm_res_listpromoitem evt;
			while(rs.next()){
				
				promo.setDoc_no(rs.getString("docno"));
				promo.setIs_cancel(rs.getInt("iscancel"));
				promo.setIs_confirm(rs.getInt("isconfirm"));
				promo.setPromotion_Code(rs.getString("pmcode"));
				promo.setSec_name(rs.getString("secman"));
				promo.setDate_start(rs.getString("datestart"));
				promo.setDate_end(rs.getString("dateend"));
				promo.setStart_promo(rs.getString("datestart"));
				promo.setUser_id(rs.getString("Creatorcode"));
				
				evt = new pm_res_listpromoitem();
				evt.setDiscount(rs.getDouble("discount"));
				evt.setDiscount_type(rs.getString("discounttype"));
				evt.setDiscount_word(rs.getString("discountword"));
				evt.setFrom_qty(rs.getDouble("fromqty"));
				evt.setHot_price(rs.getString("hotprice_branch"));
				evt.setIs_brochure(rs.getInt("isbrochure"));
				evt.setIs_cancel(rs.getInt("iscancel"));
				evt.setIs_member(rs.getInt("promomember"));
				evt.setItem_code(rs.getString("itemcode"));
				evt.setItem_name(rs.getString("itemname"));
				evt.setLine_number(rs.getInt("linenumber"));
				evt.setMy_description(rs.getString("mydescription"));
				evt.setNormal_price(rs.getDouble("price"));
				evt.setPromo_type(rs.getString("promotiontype"));
				evt.setPromotion_price(rs.getDouble("promoprice"));
				evt.setTo_qty(rs.getDouble("toqty"));
				evt.setUnit_code(rs.getString("unitcode"));
				
				list_item.add(evt);	
			}
		    rs.close();
		    st.close();
		    
		    promo.setList_item(list_item);
		    
			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		
		
		promo.setResp(resp);
		
		return promo;
	}
	
	
	pm_res_promotion promotion = new pm_res_promotion();
	List<pm_res_listpromotion> list_promotion = new ArrayList<pm_res_listpromotion>();
	public pm_res_promotion promotion(pm_req_search req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_RequestSearch '"+req.getSearch()+"'";
			System.out.println("USP_PM_RequestSubSearch ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);
			
			list_promotion.clear();
			pm_res_listpromotion evt;
			while(rs.next()){	
				evt = new pm_res_listpromotion();
				evt.setDoc_no(rs.getString("docno"));
				evt.setIs_cancel(rs.getInt("iscancel"));
				evt.setIs_confirm(rs.getInt("isconfirm"));
				evt.setPromotion_Code(rs.getString("pmcode"));
				evt.setSec_name(rs.getString("secman"));
				evt.setDate_start("");
				evt.setDate_end("");
				evt.setStart_promo(rs.getString("docdate"));
				evt.setUser_id("");
				
				list_promotion.add(evt);	
			}
		    rs.close();
		    st.close();
		    
		    promotion.setList_pm(list_promotion);
		    
			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		
		
		promotion.setResp(resp);
		
		return promotion;
	}
	
	pm_res_searchitem item = new pm_res_searchitem();
	List<pm_res_listitem>list_search = new ArrayList<pm_res_listitem>();
	public pm_res_searchitem searchitem(pm_req_search req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_FindItem '"+req.getSearch()+"'";
			System.out.println("USP_PM_FindItem ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);
			
			list_search.clear();
			pm_res_listitem evt;
			while(rs.next()){
				
				evt = new pm_res_listitem();
				evt.setItem_code(rs.getString("itemcode"));
				evt.setItem_name(rs.getString("itemname"));
				evt.setSale_price(rs.getDouble("saleprice1"));
				evt.setUnit_code(rs.getString("unitcode"));
				evt.setComm_name("");
				
				list_search.add(evt);
			}
		    rs.close();
		    st.close();
		    
		    item.setList_item(list_search);
		    
			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		
		
		item.setResp(resp);
		
		return item;
	}
	
	pm_res_itemdetails item_details = new pm_res_itemdetails();
	public pm_res_itemdetails itemdetails(pm_req_searchitem req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_FindItemFixUnit '"+req.getItem_code()+"','"+req.getUnit_code()+"'";
			System.out.println("USP_PM_SearchItemFix ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);
			
			while(rs.next()){
				
				item_details.setComm_begindate(rs.getString("combegindate"));
				item_details.setComm_enddate(rs.getString("comenddate"));
				item_details.setComm_name(rs.getString("comname"));
				item_details.setComm_retail(rs.getDouble("retailcom"));
				item_details.setComm_wholesale(rs.getDouble("wholesalecom"));
				item_details.setItem_code(rs.getString("itemcode"));
				item_details.setItem_name(rs.getString("itemname"));
				item_details.setSale_price(rs.getDouble("saleprice1"));
				item_details.setUnit_code(rs.getString("unitcode"));
				
			}
		    rs.close();
		    st.close();
		     
			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		
		
		item_details.setResp(resp);
		
		return item_details;
	}
	
	public pm_res_itemdetails itembarcode(pm_req_search req){
		conn_req_serverdatabean db = new conn_req_serverdatabean();
		token = exec.dataConnect(req.getAccess_token());
		
		System.out.println(token.getDatabase_name());
		System.out.println(token.getServer_name());
		
		db.setDatabase_name(token.getDatabase_name());
		db.setServer_name(token.getServer_name());
		
		try{
			Statement st = sql_conn.getSqlStatement(db);
			vQuery = "exec dbo.USP_PM_FindBarCode '"+req.getSearch()+"'";
			System.out.println("USP_PM_FindBarCode ="+ vQuery);
			ResultSet rs = st.executeQuery(vQuery);
			
			while(rs.next()){
				
				item_details.setComm_begindate(rs.getString("combegindate"));
				item_details.setComm_enddate(rs.getString("comenddate"));
				item_details.setComm_name(rs.getString("comname"));
				item_details.setComm_retail(rs.getDouble("retailcom"));
				item_details.setComm_wholesale(rs.getDouble("wholesalecom"));
				item_details.setItem_code(rs.getString("itemcode"));
				item_details.setItem_name(rs.getString("itemname"));
				item_details.setSale_price(rs.getDouble("saleprice1"));
				item_details.setUnit_code(rs.getString("unitcode"));
				
			}
		    rs.close();
		    st.close();

			resp.setSuccess(true);
			resp.setError(false);
			resp.setMessage("");
		    
		}catch(SQLException e){
			resp.setSuccess(false);
			resp.setError(true);
			resp.setMessage(e.getMessage());
			
		}finally{
			sql_conn.close();
		}
		
		
		item_details.setResp(resp);
		
		return item_details;
	}
	
}
