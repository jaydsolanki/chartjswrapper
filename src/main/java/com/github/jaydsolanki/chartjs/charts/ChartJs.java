package com.github.jaydsolanki.chartjs.charts;

import org.json.JSONArray;
import org.json.JSONObject;

import com.github.jaydsolanki.chartjs.options.ChartJsOptions;

public abstract class ChartJs {

	protected JSONObject chartDataSet;
	protected JSONArray chartArraySet;
	protected JSONObject chartOptionSet;

	public Object getChartDataSet() {
		if(chartDataSet!=null){
			return chartDataSet;
		}
		return chartArraySet;
	}

	public JSONObject getChartOptionSet() {
		return chartOptionSet;
	}
	
	public abstract <T extends ChartJsOptions>T getOptions();

}
