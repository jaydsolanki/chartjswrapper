package com.github.jaydsolanki.chartjs.options;

import org.json.JSONException;

import com.github.jaydsolanki.color.ChartJsColor;
import com.github.jaydsolanki.color.ChartJsHexColor;

public class ChartJsPieDoughnutOptions extends ChartJsOptions {

	public ChartJsPieDoughnutOptions() {
		/*
		 * Populating defaults
		 */
		super();
		setSegmentShowStroke(true);
		setSegmentStrokeColor(new ChartJsHexColor("#fff"));
		setSegmentStrokeWidth(2.0);
		setPercentageInnerCutout(50.0);
		setAnimationSteps(100);
		setAnimationEasing("easeOutBounce");
		setAnimateRotate(true);
		setAnimateScale(false);
		setLegendTemplate("<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>");
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

	public void setPercentageInnerCutout(Double value) {
		try {
			getChartOptionSet().put("percentageInnerCutout", value);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	public Double getPercentageInnerCutout() {
		try {
			if (getChartOptionSet().has("percentageInnerCutout")) {
				return getChartOptionSet().getDouble("percentageInnerCutout");
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
