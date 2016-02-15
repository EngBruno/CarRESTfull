package br.com.ifce.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
	private String status;
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private String msg;
	
	public Response(){
		
	}
	
	public static Response Ok(String string){
		Response response = new Response();
		response.setStatus("Ok");
		response.setMsg(string);
		return response;
	}
	
	public static Response Erro(String string){
		Response response = new Response();
		response.setStatus("Erro");
		response.setMsg(string);
		return response;
	}
}
