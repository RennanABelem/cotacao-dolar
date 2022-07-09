package com.api.moedas.moeda.response;

public class USDBRL {

	public String code;
	public String codein;
	public String name;
	public String high;
	public String low;
	public String varBid;
	public String pctChange;
	public String bid;
	public String ask;
	public String timestamp;
	public String create_date;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodein() {
		return codein;
	}

	public void setCodein(String codein) {
		this.codein = codein;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getVarBid() {
		return varBid;
	}

	public void setVarBid(String varBid) {
		this.varBid = varBid;
	}

	public String getPctChange() {
		return pctChange;
	}

	public void setPctChange(String pctChange) {
		this.pctChange = pctChange;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getAsk() {
		return ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "USDBRL [code=" + code + ", codein=" + codein + ", name=" + name + ", high=" + high + ", low=" + low
				+ ", varBid=" + varBid + ", pctChange=" + pctChange + ", bid=" + bid + ", ask=" + ask + ", timestamp="
				+ timestamp + ", create_date=" + create_date + "]";
	}

}
