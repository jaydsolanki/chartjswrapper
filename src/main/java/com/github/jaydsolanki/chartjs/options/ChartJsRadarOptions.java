package com.github.jaydsolanki.chartjs.options;

import org.json.JSONException;

import com.github.jaydsolanki.color.ChartJsColor;
import com.github.jaydsolanki.color.ChartJsHexColor;
import com.github.jaydsolanki.color.ChartJsRgbaColor;

public class ChartJsRadarOptions extends ChartJsOptions {

	public ChartJsRadarOptions() {
		/*
		 * Populating defaults
		 */
		super();
		setScaleShowLine(true);
		setAngleShowLineOut(true);
		setScaleShowLabels(false);
		setScaleBeginAtZero(true);
		setAngleLineColor(new ChartJsRgbaColor(0, 0, 0, 0.1));
		setAngleLineWidth(1.0);
		setPointLabelFontFamily("'Arial'");
		setPointLabelFontStyle("normal");
		setPointLabelFontSize(10.0);
		setPointLabelFontColor(new ChartJsHexColor("#666"));
		setPointDot(true);
		setPointDotRadius(3.0);
		setPointDotStrokeWidth(1.0);
		setPointHitDetectionRadius(4.0);
		setDatasetStroke(true);
		setDatasetStrokeWidth(2.0);
		setDatasetFill(true);
		setLegendTemplate("<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>");
	}

	/**
	 * Sets whether to show lines for each scale point, default is true
	 * 
	 * @param choice
	 *            true to show, false otherwise
	 */
	public void setScaleShowLine(Boolean choice) {
		try {
			getChartOptionSet().put("scaleShowLine", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getScaleShowLine() {
		try {
			if (getChartOptionSet().has("scaleShowLine")) {
				return getChartOptionSet().getBoolean("scaleShowLine");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setAngleShowLineOut(Boolean choice) {
		try {
			getChartOptionSet().put("angleShowLineOut", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getAngleShowLineOut() {
		try {
			if (getChartOptionSet().has("angleShowLineOut")) {
				return getChartOptionSet().getBoolean("angleShowLineOut");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setScaleShowLabels(Boolean choice) {
		try {
			getChartOptionSet().put("scaleShowLabels", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getScaleShowLabels() {
		try {
			if (getChartOptionSet().has("scaleShowLabels")) {
				return getChartOptionSet().getBoolean("scaleShowLabels");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setScaleBeginAtZero(Boolean choice) {
		try {
			getChartOptionSet().put("scaleBeginAtZero", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getScaleBeginAtZero() {
		try {
			if (getChartOptionSet().has("scaleBeginAtZero")) {
				return getChartOptionSet().getBoolean("scaleBeginAtZero");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setAngleLineColor(ChartJsColor color) {
		try {
			getChartOptionSet().put("angleLineColor", color.getColorValue());
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public String getAngleLineColor() {
		try {
			if (getChartOptionSet().has("angleLineColor")) {
				return getChartOptionSet().get("angleLineColor").toString();
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setAngleLineWidth(Double value) {
		try {
			getChartOptionSet().put("angleLineWidth", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getAngleLineWidth() {
		try {
			if (getChartOptionSet().has("angleLineWidth")) {
				return getChartOptionSet().getDouble("angleLineWidth");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setPointLabelFontFamily(String optionValue) {
		try {
			getChartOptionSet().put("pointLabelFontFamily", optionValue);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public String getPointLabelFontFamily() {
		try {
			if (getChartOptionSet().has("pointLabelFontFamily")) {
				return getChartOptionSet().get("pointLabelFontFamily")
						.toString();
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setPointLabelFontStyle(String optionValue) {
		try {
			getChartOptionSet().put("pointLabelFontStyle", optionValue);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public String getPointLabelFontStyle() {
		try {
			if (getChartOptionSet().has("pointLabelFontStyle")) {
				return getChartOptionSet().get("pointLabelFontStyle")
						.toString();
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setPointLabelFontSize(Double value) {
		try {
			getChartOptionSet().put("pointLabelFontSize", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getPointLabelFontSize() {
		try {
			if (getChartOptionSet().has("pointLabelFontSize")) {
				return getChartOptionSet().getDouble("pointLabelFontSize");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setPointLabelFontColor(ChartJsColor color) {
		try {
			getChartOptionSet().put("pointLabelFontColor",
					color.getColorValue());
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public String getPointLabelFontColor() {
		try {
			if (getChartOptionSet().has("pointLabelFontColor")) {
				return getChartOptionSet().get("pointLabelFontColor")
						.toString();
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setPointDot(Boolean choice) {
		try {
			getChartOptionSet().put("pointDot", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getPointDot() {
		try {
			if (getChartOptionSet().has("pointDot")) {
				return getChartOptionSet().getBoolean("pointDot");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setPointDotRadius(Double value) {
		try {
			getChartOptionSet().put("pointDotRadius", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getPointDotRadius() {
		try {
			if (getChartOptionSet().has("pointDotRadius")) {
				return getChartOptionSet().getDouble("pointDotRadius");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setPointDotStrokeWidth(Double value) {
		try {
			getChartOptionSet().put("pointDotStrokeWidth", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getPointDotStrokeWidth() {
		try {
			if (getChartOptionSet().has("pointDotStrokeWidth")) {
				return getChartOptionSet().getDouble("pointDotStrokeWidth");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setPointHitDetectionRadius(Double value) {
		try {
			getChartOptionSet().put("pointHitDetectionRadius", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getPointHitDetectionRadius() {
		try {
			if (getChartOptionSet().has("pointHitDetectionRadius")) {
				return getChartOptionSet().getDouble("pointHitDetectionRadius");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setDatasetStroke(Boolean choice) {
		try {
			getChartOptionSet().put("datasetStroke", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getDatasetStroke() {
		try {
			if (getChartOptionSet().has("datasetStroke")) {
				return getChartOptionSet().getBoolean("datasetStroke");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setDatasetStrokeWidth(Double value) {
		try {
			getChartOptionSet().put("datasetStrokeWidth", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getDatasetStrokeWidth() {
		try {
			if (getChartOptionSet().has("datasetStrokeWidth")) {
				return getChartOptionSet().getDouble("datasetStrokeWidth");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setDatasetFill(Boolean choice) {
		try {
			getChartOptionSet().put("datasetFill", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getDatasetFill() {
		try {
			if (getChartOptionSet().has("datasetFill")) {
				return getChartOptionSet().getBoolean("datasetFill");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setLegendTemplate(String optionValue) {
		try {
			getChartOptionSet().put("legendTemplate", optionValue);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public String getLegendTemplate() {
		try {
			if (getChartOptionSet().has("legendTemplate")) {
				return getChartOptionSet().get("legendTemplate").toString();
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

}
