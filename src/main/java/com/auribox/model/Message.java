package com.auribox.model;

public class Message {
	
	private String header;
	private String payload;
	
	public Message(){
		//constructor vacio
	}
	
	public Message(String header) {
		this.header=header;
	}
	
	public void initMethodEstela() {
		System.out.println("Dentro del metodo initMethod");
	}
	
	public void closeMethodEstela() {
		System.out.println("Close dentro del metodo initMethod");
	}
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	@Override
	public String toString() {
		return "Mensaje [header=" + header + ", payload=" + payload + "]";
	}

}
