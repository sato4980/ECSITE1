package com.internousdev.ECSITE.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECSITE.dao.BuyItemDAO;
import com.internousdev.ECSITE.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SelectItem extends ActionSupport implements SessionAware {
	/**
	 *
	 */
	private static final long serialVersionUID = 5569802724589634284L;
	public Map<String, Object> session;
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	public String id;
	public String getId() {
		return id;
	}
	public String execute() {
		String result = SUCCESS;
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo(id);
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());
			session.put("picture",buyItemDTO.getPicture());
			return result;
		}

	public void setId(String id) {
		this.id = id;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
