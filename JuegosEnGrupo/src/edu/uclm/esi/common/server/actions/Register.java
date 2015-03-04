package edu.uclm.esi.common.server.actions;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;

import edu.uclm.esi.common.jsonMessages.ErrorMessage;
import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.jsonMessages.OKMessage;
import edu.uclm.esi.common.server.domain.User;
import edu.uclm.esi.common.server.utils.ValidatorUtil;

@SuppressWarnings("serial")
public class Register extends JSONAction {
	private String email;
	private String pwd1, pwd2;
	
	public String postExecute() {
		try {
			User.insert(email, pwd1);
			return SUCCESS;
		} catch (Exception e) {
			ActionContext.getContext().getSession().put("exception", e);
			this.exception=e;
			return ERROR;
		}
	}
	
	@Override
	public void validate() {
		
	}

	@Override
	public void setCommand(String cmd) {
		try {
			JSONObject jso=new JSONObject(cmd);
			this.email=jso.get("email").toString();
			this.pwd1=jso.get("pwd1").toString();
			this.pwd2=jso.get("pwd2").toString();
		} catch (JSONException e) {
			this.exception=e;
		}	
	}

	@Override
	public String getResultado() {
		JSONMessage jso;
		if (this.exception!=null)
			jso=new ErrorMessage(this.exception.getMessage());
		else
			jso=new OKMessage();
		return jso.toJSONObject().toString();
	}
}
