package com.github.jaydsolanki.chartjs.charts;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.github.jaydsolanki.chartjs.data.RadarDataSet;
import com.github.jaydsolanki.chartjs.options.ChartJsPolarOptions;

public class ChartJsRadar extends ChartJs {

	private JSONArray datasets;
	// Loads the default options
	private ChartJsPolarOptions radarOptions = new ChartJsPolarOptions();

	public ChartJsRadar(List<?> xAxisLabels, RadarDataSet lineDataSet) {
		datasets = new JSONArray();
		chartDataSet = new JSONObject();
		chartOptionSet = new JSONObject();
		chartOptionSet = radarOptions.getChartOptionSet();
		setXAxisLabels(xAxisLabels);
		addDataSet(lineDataSet);
	}

	public void setXAxisLabels(List<?> xAxisLabels) {
		JSONArray labels = new JSONArray();
		for (Object xAxisLabel : xAxisLabels) {
			labels.put(xAxisLabel);
		}
		try {
			chartDataSet.put("labels", labels);
		} catch (JSONException e) {
			// TODO: handle exception
		}
	}

	public void addDataSet(RadarDataSet lineDataSet) {
		try {
			datasets.put(lineDataSet.getDataset());
			chartDataSet.put("datasets", datasets);
		} catch (JSONException e) {
			// TODO: handle exception
		}
	}

	@Override
	public ChartJsPolarOptions getOptions() {
		return radarOptions;
	}

}
