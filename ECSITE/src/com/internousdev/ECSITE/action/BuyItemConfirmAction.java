package com.internousdev.ECSITE.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSITE.dao.BuyItemComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	/**
	 *
	 */
	private static final long serialVersionUID = 1079169278612935855L;

	public Map<String, Object> session;

	private BuyItemComplateDAO buyItemComplateDAO = new BuyItemComplateDAO();

	public String execute() throws SQLException {

		buyItemComplateDAO.buyItemeInfo(
				session.get("id").toString(),
			//	session.get("user_master_id").toString(),
		    	session.get("login_user_id").toString(),
				session.get("total_price").toString(),
				session.get("count").toString(),
				session.get("pay").toString());

		String result = SUCCESS;
		return result;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
