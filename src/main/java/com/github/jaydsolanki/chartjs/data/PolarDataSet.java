package com.github.jaydsolanki.chartjs.data;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;

import com.github.jaydsolanki.color.ChartJsColor;

public class PolarDataSet extends DataSet {

	public PolarDataSet(double dataPoint, ChartJsColor fillColor,
			ChartJsColor highlightFillColor) {
		this.dataset = new JSONObject();
		/*
		 * Populating the Defaults
		 */
		setLabel("Chart "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.format(new Date()));
		setFillColor(fillColor);
		setHighlightFill(highlightFillColor);
		setData(dataPoint);
	}

	public PolarDataSet(String label, double dataPoint,
			ChartJsColor fillColor,
			ChartJsColor highlightFillColor) {
		this.dataset = new JSONObject();
		/*
		 * Populating the Defaults
		 */
		setLabel(label);
		setFillColor(fillColor);
		setHighlightFill(highlightFillColor);
		setData(dataPoint);
	}

	/**
	 * Sets label for the chart, default is current date time
	 * 
	 * @param label
	 *            the label to be set
	 */
	public String getLabel() {
		try {
			if (dataset.has("label")) {
				return dataset.getString("label");
			}
		} catch (JSONException je) {
		}
		return "";
	}

	/**
	 * Gets the label
	 * 
	 * @return label
	 */
	public void setLabel(String label) {
		try {
			dataset.put("label", label);
		} catch (JSONException je) {
		}
	}

	/**
	 * Sets the fill color, default is ChartJsRgbaColor(220, 220, 220, 0.2)
	 * 
	 * @param fillColor
	 */
	public void setFillColor(ChartJsColor fillColor) {
		try {
			dataset.put("color", fillColor.getColorValue());
		} catch (JSONException je) {
		}
	}

	/**
	 * Gets the fill color
	 * 
	 * @return fill color
	 */
	public String getFillColor() {
		try {
			if (dataset.has("color")) {
				return dataset.get("color").toString();
			}
		} catch (JSONException je) {
		}
		return null;
	}

	/**
	 * Sets the Highlight Fill, default is ChartJsHexColor(StoredColors.WHITE)
	 * 
	 * @param pointHighlightFill
	 *            point Highlight Fill Color
	 */
	public void setHighlightFill(ChartJsColor pointHighlightFill) {
		try {
			dataset.put("highlight",
					pointHighlightFill.getColorValue());
		} catch (JSONException je) {
		}
	}

	/**
	 * Gets the Highlight Fill
	 * 
	 * @return Highlight Fill
	 */
	public String getHighlightFill() {
		try {
			if (dataset.has("highlight")) {
				return dataset.get("highlight").toString();
			}
		} catch (JSONException je) {
		}
		return null;
	}

	/**
	 * Gets the data
	 * 
	 * @return
	 */
	public String getData() {
		try {
			if (dataset.has("value")) {
				return dataset.get("value").toString();
			}
		} catch (JSONException je) {
		}
		return null;
	}

	/**
	 * Set the y axis values
	 * 
	 * @param plottingPoints
	 */
	public void setData(double data) {
		try {
			dataset.put("value", data);
		} catch (JSONException je) {
		}
	}

	public void appendNewDataOptions(String key, Object value) {
		try {
			dataset.put(key, value);
		} catch (JSONException je) {
		}
	}

}
