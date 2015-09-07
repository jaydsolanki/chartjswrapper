package com.github.jaydsolanki.chartjs.charts;

import org.json.JSONArray;
import org.json.JSONObject;

import com.github.jaydsolanki.chartjs.data.PieDoughnutDataSet;
import com.github.jaydsolanki.chartjs.options.ChartJsPieDoughnutOptions;

public class ChartJsPieDoughnut extends ChartJs {

	// Loads the default options
	private ChartJsPieDoughnutOptions pieDoughnutOptions = new ChartJsPieDoughnutOptions();

	public ChartJsPieDoughnut(PieDoughnutDataSet pieDoughnutDataSet) {
		// chartDataSet = new JSONObject();
		chartArraySet = new JSONArray();
		chartOptionSet = new JSONObject();
		chartOptionSet = pieDoughnutOptions.getChartOptionSet();
		addDataSet(pieDoughnutDataSet);
	}

	public void addDataSet(PieDoughnutDataSet pieDoughnutDataSet) {
		chartArraySet.put(pieDoughnutDataSet.getDataset());
	}

	@Override
	public ChartJsPieDoughnutOptions getOptions() {
		return pieDoughnutOptions;
	}

}
