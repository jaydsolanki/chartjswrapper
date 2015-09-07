package com.github.jaydsolanki.chartjs.options;

import org.json.JSONException;

import com.github.jaydsolanki.color.ChartJsColor;
import com.github.jaydsolanki.color.ChartJsHexColor;
import com.github.jaydsolanki.color.ChartJsRgbaColor;

public class ChartJsPolarOptions extends ChartJsOptions {

	public ChartJsPolarOptions() {
		/*
		 * Populating defaults
		 */
		super();
		setScaleShowLabelBackdrop(true);
		setScaleBackdropColor(new ChartJsRgbaColor(255, 255, 255, 0.75));
		setScaleBeginAtZero(true);
		setScaleBackdropPaddingY(2.0);
		setScaleBackdropPaddingX(2.0);
		setScaleShowLine(true);
		setSegmentShowStroke(true);
		setSegmentStrokeColor(new ChartJsHexColor("#fff"));
		setSegmentStrokeWidth(2.0);
		setAnimationSteps(100);
		setAnimationEasing("easeOutBounce");
		setAnimateRotate(true);
		setAnimateScale(false);
		setLegendTemplate("<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>");
	}

	public void setScaleShowLabelBackdrop(Boolean choice) {
		try {
			getChartOptionSet().put("scaleShowLabelBackdrop", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getScaleShowLabelBackdrop() {
		try {
			if (getChartOptionSet().has("scaleShowLabelBackdrop")) {
				return getChartOptionSet().getBoolean("scaleShowLabelBackdrop");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setScaleBackdropColor(ChartJsColor color) {
		try {
			getChartOptionSet()
					.put("scaleBackdropColor", color.getColorValue());
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public String getScaleBackdropColor() {
		try {
			if (getChartOptionSet().has("scaleBackdropColor")) {
				return getChartOptionSet().get("scaleBackdropColor").toString();
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
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

	public void setScaleBackdropPaddingY(Double value) {
		try {
			getChartOptionSet().put("scaleBackdropPaddingY", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getScaleBackdropPaddingY() {
		try {
			if (getChartOptionSet().has("scaleBackdropPaddingY")) {
				return getChartOptionSet().getDouble("scaleBackdropPaddingY");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setScaleBackdropPaddingX(Double value) {
		try {
			getChartOptionSet().put("scaleBackdropPaddingX", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getScaleBackdropPaddingX() {
		try {
			if (getChartOptionSet().has("scaleBackdropPaddingX")) {
				return getChartOptionSet().getDouble("scaleBackdropPaddingX");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

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

	public void setSegmentShowStroke(Boolean choice) {
		try {
			getChartOptionSet().put("segmentShowStroke", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getSegmentShowStroke() {
		try {
			if (getChartOptionSet().has("segmentShowStroke")) {
				return getChartOptionSet().getBoolean("segmentShowStroke");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setSegmentStrokeColor(ChartJsColor color) {
		try {
			getChartOptionSet()
					.put("segmentStrokeColor", color.getColorValue());
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public String getSegmentStrokeColor() {
		try {
			if (getChartOptionSet().has("segmentStrokeColor")) {
				return getChartOptionSet().get("segmentStrokeColor").toString();
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setSegmentStrokeWidth(Double value) {
		try {
			getChartOptionSet().put("segmentStrokeWidth", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getSegmentStrokeWidth() {
		try {
			if (getChartOptionSet().has("segmentStrokeWidth")) {
				return getChartOptionSet().getDouble("segmentStrokeWidth");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	public void setAnimateRotate(Boolean choice) {
		try {
			getChartOptionSet().put("animateRotate", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getAnimateRotate() {
		try {
			if (getChartOptionSet().has("animateRotate")) {
				return getChartOptionSet().getBoolean("animateRotate");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	public void setAnimateScale(Boolean choice) {
		try {
			getChartOptionSet().put("animateScale", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Boolean getAnimateScale() {
		try {
			if (getChartOptionSet().has("animateScale")) {
				return getChartOptionSet().getBoolean("animateScale");
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
