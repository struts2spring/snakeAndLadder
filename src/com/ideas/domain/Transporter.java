package com.ideas.domain;

public class Transporter {
	private int startPoint;
	private int endPoint;
	private String typeOfTransporter;

	public Transporter() {
	}

	public Transporter(int startPoint, int endPoint, String typeOfTransporter) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.typeOfTransporter = typeOfTransporter;
	}

	public int getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}

	public String getTypeOfTransporter() {
		return typeOfTransporter;
	}

	public void setTypeOfTransporter(String typeOfTransporter) {
		this.typeOfTransporter = typeOfTransporter;
	}

	@Override
	public String toString() {
		return "Transporter [startPoint=" + startPoint + ", endPoint=" + endPoint + ", typeOfTransporter=" + typeOfTransporter + "]";
	}

}
