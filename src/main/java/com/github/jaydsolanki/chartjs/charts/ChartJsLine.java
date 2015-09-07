package com.github.jaydsolanki.chartjs.charts;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.github.jaydsolanki.chartjs.data.LineDataSet;
import com.github.jaydsolanki.chartjs.options.ChartJsLineOptions;

public class ChartJsLine extends ChartJs {

	private JSONArray datasets;
	// Loads the default options
	private ChartJsLineOptions lineOptions = new ChartJsLineOptions();

	public ChartJsLine(List<?> xAxisLabels, LineDataSet lineDataSet) {
		datasets = new JSONArray();
		chartDataSet = new JSONObject();
		chartOptionSet = new JSONObject();
		chartOptionSet = lineOptions.getChartOptionSet();
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

	public void addDataSet(LineDataSet lineDataSet) {
		try {
			datasets.put(lineDataSet.getDataset());
			chartDataSet.put("datasets", datasets);
		} catch (JSONException e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public ChartJsLineOptions getOptions() {
		return lineOptions;
	}

}
