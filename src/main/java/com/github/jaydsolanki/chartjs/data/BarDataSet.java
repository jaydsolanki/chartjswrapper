package com.github.jaydsolanki.chartjs.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.github.jaydsolanki.color.ChartJsColor;
import com.github.jaydsolanki.color.ChartJsHexColor;
import com.github.jaydsolanki.color.ChartJsRgbaColor;

public class BarDataSet extends DataSet {

	public BarDataSet(List<?> dataSet) {
		this.dataset = new JSONObject();
		/*
		 * Populating the Defaults
		 */
		setLabel("Chart "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.format(new Date()));
		setFillColor(new ChartJsRgbaColor(151, 187, 205, 0.2));
		setStrokeColor(new ChartJsRgbaColor(151, 187, 205, 1));
		setHighlightFill(new ChartJsHexColor(ChartJsColor.StoredColors.WHITE));
		setHighlightStroke(new ChartJsRgbaColor(151, 187, 205, 1));
		setData(dataSet);
	}

	/**
	 * Sets label for the chart, default is current date time
	 * 
	 * @param label
	 *            the label to be set
	 */
	public void setLabel(String label) {
		try {
			dataset.put("label", label);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the label
	 * 
	 * @return label
	 */
	public String getLabel() {
		try {
			if (dataset.has("label")) {
				return dataset.getString("label");
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Sets the fill color, default is ChartJsRgbaColor(151, 187, 205, 0.2)
	 * 
	 * @param fillColor
	 */
	public void setFillColor(ChartJsColor fillColor) {
		try {
			dataset.put("fillColor", fillColor.getColorValue());
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the fill color
	 * 
	 * @return fill color
	 */
	public String getFillColor() {
		try {
			if (dataset.has("fillColor")) {
				return dataset.get("fillColor").toString();
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Sets the stroke color, default is ChartJsRgbaColor(151, 187, 205, 1)
	 * 
	 * @param strokeColor
	 *            stroke color
	 */
	public void setStrokeColor(ChartJsColor strokeColor) {
		try {
			dataset.put("strokeColor", strokeColor.getColorValue());
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the stroke color
	 * 
	 * @return stroke color
	 */
	public String getStrokeColor() {
		try {
			if (dataset.has("strokeColor")) {
				return dataset.get("strokeColor").toString();
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Sets the highlight Fill deafult is ChartJsHexColor(StoredColors.WHITE)
	 * 
	 * @param highlightFill
	 *            highlight Fill
	 */
	public void setHighlightFill(ChartJsColor highlightFill) {
		try {
			dataset.put("highlightFill", highlightFill.getColorValue());
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the highlight fill
	 * 
	 * @return highlight fill
	 */
	public String getHighlightFill() {
		try {
			if (dataset.has("highlightFill")) {
				return dataset.get("highlightFill").toString();
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Sets the highlight Stroke, default is ChartJsRgbaColor(151, 187, 205,1)
	 * 
	 * @param highlightStroke
	 *            highlight Stroke Color
	 */
	public void setHighlightStroke(ChartJsColor highlightStroke) {
		try {
			dataset.put("highlightStroke",
					highlightStroke.getColorValue());
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the highlight stroke
	 * 
	 * @return highlight stroke
	 */
	public String getHighlightStroke() {
		try {
			if (dataset.has("highlightStroke")) {
				return dataset.get("highlightStroke").toString();
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Gets the data
	 * @return
	 */
	public String getData() {
		try {
			if (dataset.has("data")) {
				return dataset.get("data").toString();
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Set the y axis values
	 * @param plottingPoints
	 */
	public void setData(List<?> plottingPoints) {
		try {
			JSONArray data = new JSONArray();
			for (Object plottingPoint : plottingPoints) {
				data.put(plottingPoint);
			}
			dataset.put("data", data);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	public void appendNewDataOptions(String key, Object value) {
		try {
			dataset.put(key, value);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

}
