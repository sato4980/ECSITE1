package com.internousdev.ECSITE.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSITE.dao.UserCreateComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateComplateAction extends ActionSupport implements SessionAware {

	/**
	 *
	 */
	private static final long serialVersionUID = 6186958642400469057L;
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String, Object> session;
	private UserCreateComplateDAO userCreateComplateDAO = new UserCreateComplateDAO();

	public String execute() throws SQLException {

		userCreateComplateDAO.cerateUser(session.get("loginUserId").toString(), session.get("loginPassword").toString(),
				session.get("userName").toString());

		String result = SUCCESS;
		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
