package bean;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

public class VisitEventBean {
	public static enum VisitEventType {
		VIEW,CART,PURCHASE
	}
	
	String day;
	String bid;
	VisitEventBean eventType;
	
	public VisitEventBean(String day, String bid, VisitEventBean eventType) {
		super();
		this.setDay(day);
		this.setBid(bid);
		this.setEventType(eventType);
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public VisitEventBean getEventType() {
		return eventType;
	}
	public void setEventType(VisitEventBean eventType) {
		this.eventType = eventType;
	}
	
	public JsonObjectBuilder toJsonObjectBuilder() {
		return Json.createObjectBuilder()
				.add("day", this.getDay())
				.add("bid", this.getBid())
				.add("eventtype", this.getEventType().toString());
	}
	
	@Override
	public String toString() {
		return this.toJsonObjectBuilder().build().toString();
	}
	
	
}