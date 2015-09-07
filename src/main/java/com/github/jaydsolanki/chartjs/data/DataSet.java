package com.github.jaydsolanki.chartjs.data;

import org.json.JSONObject;

public abstract class DataSet {

	protected JSONObject dataset;

	public JSONObject getDataset() {
		return dataset;
	}

	@Override
	public String toString() {
		return dataset.toString();
	}

}
