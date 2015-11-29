package com.arzplanet.datatables.models.java.output;

import java.util.ArrayList;

public class ResultDataWrapper {
	private int draw;
	private int recordsTotal;
    private int recordsFiltered;
    private String error;
    private ArrayList<ResultData>data;
    
    public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	public int getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public ArrayList<ResultData> getData() {
		return data;
	}
	public void setData(ArrayList<ResultData> data) {
		this.data = data;
	}
    
}
