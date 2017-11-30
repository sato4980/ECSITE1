package com.internousdev.ECSITE.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSITE.dao.LoginDAO;
import com.internousdev.ECSITE.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 *
	 */
	private static final long serialVersionUID = -1753276814692489137L;
	private String loginUserId;
	private String loginPassword;

	public Map<String, Object> session;

	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();

	public String execute() {
		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", loginDTO);
		if (((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;
			session.put("login_user_id", loginDTO.getLoginId());
			return result;
		}
		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPaasword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
