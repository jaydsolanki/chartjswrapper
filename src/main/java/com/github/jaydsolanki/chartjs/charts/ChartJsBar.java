package com.github.jaydsolanki.chartjs.charts;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.github.jaydsolanki.chartjs.data.BarDataSet;
import com.github.jaydsolanki.chartjs.options.ChartJsBarOptions;

public class ChartJsBar extends ChartJs {

	private JSONArray datasets;

	private ChartJsBarOptions barOptions = new ChartJsBarOptions();

	public ChartJsBar(List<?> xAxisLabels, BarDataSet barDataSet) {
		datasets = new JSONArray();
		chartDataSet = new JSONObject();
		chartOptionSet = new JSONObject();
		chartOptionSet = barOptions.getChartOptionSet();
		setXAxisLabels(xAxisLabels);
		addDataSet(barDataSet);
	}

	public void setXAxisLabels(List<?> xAxisLabels) {
		JSONArray labels = new JSONArray();
		for (Object xAxisLabel : xAxisLabels) {
			labels.put(xAxisLabel);
		}
		try {
			chartDataSet.put("labels", labels);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	public void addDataSet(BarDataSet lineDataSet) {
		try {
			datasets.put(lineDataSet.getDataset());
			chartDataSet.put("datasets", datasets);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	@Override
	public ChartJsBarOptions getOptions() {
		return barOptions;
	}

	public String getChartData() {
		return this.chartDataSet + "";
	}

	public String getChartOptions() {
		return this.chartOptionSet + "";
	}

}
