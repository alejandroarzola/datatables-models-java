package com.arzplanet.datatables.models.java.input;

import java.util.ArrayList;

public class InputParameters {
	private int draw;
	private int start;
	private int length;
	private Search search;
	private ArrayList<Order> order;
	private ArrayList<Column> columns;
	
	public ArrayList<Column> getColumns() {
		return columns;
	}
	public void setColumns(ArrayList<Column> columns) {
		this.columns = columns;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public ArrayList<Order> getOrder() {
		return order;
	}
	public void setOrder(ArrayList<Order> order) {
		this.order = order;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Search getSearch() {
		return search;
	}
	public void setSearch(Search search) {
		this.search = search;
	}
	
}
