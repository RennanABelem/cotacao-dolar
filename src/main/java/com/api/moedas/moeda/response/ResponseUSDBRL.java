package com.api.moedas.moeda.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseUSDBRL {

	@JsonProperty("USDBRL")
	public USDBRL uSDBRL;

	public USDBRL getuSDBRL() {
		return uSDBRL;
	}

	public void setuSDBRL(USDBRL uSDBRL) {
		this.uSDBRL = uSDBRL;
	}

	@Override
	public String toString() {
		return "ResponseUSDBRL [uSDBRL=" + uSDBRL + "]";
	}

}
