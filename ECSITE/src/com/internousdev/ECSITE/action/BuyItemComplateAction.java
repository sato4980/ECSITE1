package com.internousdev.ECSITE.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemComplateAction extends ActionSupport implements SessionAware {

	/**
	 *
	 */
	private static final long serialVersionUID = 7450883314960947739L;
	public Map<String, Object> session;



	public String execute() {

		String result = SUCCESS;
		return result;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
