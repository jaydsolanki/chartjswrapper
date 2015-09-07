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
import com.github.jaydsolanki.color.ChartJsColor.StoredColors;

public class LineDataSet extends DataSet {

	public LineDataSet(List<?> dataSet) {
		this.dataset = new JSONObject();
		/*
		 * Populating the Defaults
		 */
		setLabel("Chart "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.format(new Date()));
		setFillColor(new ChartJsRgbaColor(151, 187, 205, 0.2));
		setStrokeColor(new ChartJsRgbaColor(151, 187, 205, 1));
		setPointColor(new ChartJsRgbaColor(151, 187, 205, 1));
		setPointStrokeColor(new ChartJsHexColor(StoredColors.WHITE));
		setPointHighlightFill(new ChartJsHexColor(StoredColors.WHITE));
		setPointHighlightStroke(new ChartJsRgbaColor(151, 187, 205, 1));
		setData(dataSet);
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
	 * Sets the fill color, default is ChartJsRgbaColor(151, 187, 205, 0.2)
	 * 
	 * @param fillColor
	 */
	public void setFillColor(ChartJsColor fillColor) {
		try {
			dataset.put("fillColor", fillColor.getColorValue());
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
			if (dataset.has("fillColor")) {
				return dataset.get("fillColor").toString();
			}
		} catch (JSONException je) {
		}
		return null;
	}

	/**
	 * Sets the stroke color, default is ChartJsRgbaColor(151, 187, 205, 1)
	 * 
	 * @param strokeColor
	 */
	public void setStrokeColor(ChartJsColor strokeColor) {
		try {
			dataset.put("strokeColor", strokeColor.getColorValue());
		} catch (JSONException je) {
		}
	}

	/**
	 * gets the stroke color
	 * 
	 * @return stroke color
	 */
	public String getStrokeColor() {
		try {
			if (dataset.has("strokeColor")) {
				return dataset.get("strokeColor").toString();
			}
		} catch (JSONException je) {
		}
		return null;
	}

	/**
	 * Sets the point color, default is ChartJsRgbaColor(151, 187, 205, 1)
	 * 
	 * @param pointColor
	 *            point color
	 */
	public void setPointColor(ChartJsColor pointColor) {
		try {
			dataset.put("pointColor", pointColor.getColorValue());
		} catch (JSONException je) {
		}
	}

	/**
	 * Gets the point color
	 * 
	 * @return point color
	 */
	public String getPointColor() {
		try {
			if (dataset.has("pointColor")) {
				return dataset.get("pointColor").toString();
			}
		} catch (JSONException je) {
		}
		return null;
	}

	/**
	 * Sets the point stroke color, default is
	 * ChartJsHexColor(StoredColors.WHITE)
	 * 
	 * @param pointStrokeColor
	 *            point stroke color
	 */
	public void setPointStrokeColor(ChartJsColor pointStrokeColor) {
		try {
			dataset.put("pointStrokeColor", pointStrokeColor.getColorValue());
		} catch (JSONException je) {
		}
	}

	/**
	 * Gets the point stroke color
	 * 
	 * @return point stroke color
	 */
	public String getPointStrokeColor() {
		try {
			if (dataset.has("pointSrokeColor")) {
				return dataset.get("pointSrokeColor").toString();
			}
		} catch (JSONException je) {
		}
		return null;
	}

	/**
	 * Sets the point Highlight Fill, default is
	 * ChartJsHexColor(StoredColors.WHITE)
	 * 
	 * @param pointHighlightFill
	 *            point Highlight Fill Color
	 */
	public void setPointHighlightFill(ChartJsColor pointHighlightFill) {
		try {
			dataset.put("pointHighlightFill",
					pointHighlightFill.getColorValue());
		} catch (JSONException je) {
		}
	}

	/**
	 * Gets the Point Highlight Fill
	 * 
	 * @return Point Highlight Fill
	 */
	public String getPointHighlightFill() {
		try {
			if (dataset.has("pointHighlightFill")) {
				return dataset.get("pointHighlightFill").toString();
			}
		} catch (JSONException je) {
		}
		return null;
	}

	/**
	 * sets the Point Highlight Stroke, default is ChartJsRgbaColor(151, 187, 
	 * 205, 1)
	 * 
	 * @param pointHighlightStroke
	 */
	public void setPointHighlightStroke(ChartJsColor pointHighlightStroke) {
		try {
			dataset.put("pointHighlightStroke",
					pointHighlightStroke.getColorValue());
		} catch (JSONException je) {
		}
	}

	/**
	 * gets the Point Highlight Stroke
	 * 
	 * @return
	 */
	public String getPointHighlightStroke() {
		try {
			if (dataset.has("pointHighlightStroke")) {
				return dataset.get("pointHighlightStroke").toString();
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
			if (dataset.has("data")) {
				return dataset.get("data").toString();
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
	public void setData(List<?> plottingPoints) {
		try {
			JSONArray data = new JSONArray();
			for (Object plottingPoint : plottingPoints) {
				data.put(plottingPoint);
			}
			dataset.put("data", data);
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
