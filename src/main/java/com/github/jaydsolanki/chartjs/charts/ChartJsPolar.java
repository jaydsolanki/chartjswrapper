package com.github.jaydsolanki.chartjs.charts;

import org.json.JSONArray;
import org.json.JSONObject;

import com.github.jaydsolanki.chartjs.data.PolarDataSet;
import com.github.jaydsolanki.chartjs.options.ChartJsPolarOptions;

public class ChartJsPolar extends ChartJs {

	// Loads the default options
	private ChartJsPolarOptions polarOptions = new ChartJsPolarOptions();

	public ChartJsPolar(PolarDataSet polarDataSet) {
		// chartDataSet = new JSONObject();
		chartArraySet = new JSONArray();
		chartOptionSet = new JSONObject();
		chartOptionSet = polarOptions.getChartOptionSet();
		addDataSet(polarDataSet);
	}

	public void addDataSet(PolarDataSet polarDataSet) {
		chartArraySet.put(polarDataSet.getDataset());
	}

	@Override
	public ChartJsPolarOptions getOptions() {
		return polarOptions;
	}

}
