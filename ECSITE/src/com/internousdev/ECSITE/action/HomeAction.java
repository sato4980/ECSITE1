package com.internousdev.ECSITE.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	/**
	 *
	 */
	private static final long serialVersionUID = -6681823593263321965L;
	public Map<String, Object> session;

	public String execute() {
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}