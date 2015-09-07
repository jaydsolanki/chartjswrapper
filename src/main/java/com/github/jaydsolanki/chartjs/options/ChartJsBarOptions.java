package com.github.jaydsolanki.chartjs.options;

import org.json.JSONException;

import com.github.jaydsolanki.color.ChartJsColor;
import com.github.jaydsolanki.color.ChartJsRgbaColor;

public class ChartJsBarOptions extends ChartJsOptions {

	public ChartJsBarOptions() {
		/*
		 * Populating defaults
		 */
		super();
		setScaleBeginAtZero(true);
		setScaleShowGridLines(true);
		setScaleGridLineColor(new ChartJsRgbaColor(0, 0, 0, 0.05));
		setScaleGridLineWidth(1.0);
		setScaleShowHorizontalLines(true);
		setScaleShowVerticalLines(true);
		setBarShowStroke(true);

		setLegendTemplate("<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>");
	}

	/**
	 * Enables/Disables the grid lines, default is true
	 * 
	 * @param choice
	 *            true to enable the grid lines, false otherwise
	 */
	public void setScaleShowGridLines(Boolean choice) {
		try {
			getChartOptionSet().put("scaleShowGridLines", choice);
		} catch (JSONException e) {
			// Nothing to do
		}
	}

	/**
	 * returns whether the gridlines are enabled or disabled
	 * 
	 * @return true if gridlines are enabled, false otherwise
	 */
	public Boolean getScaleShowGridLine() {
		try {
			if (getChartOptionSet().has("scaleShowGridLines")) {
				return getChartOptionSet().getBoolean("scaleShowGridLines");
			}
		} catch (JSONException e) {
			// Nothing to do
		}
		return false;
	}

	/**
	 * Sets the colors of the Grid Lines, default is ChartJsRgbaColor(0, 0, 0,
	 * 0.05)
	 * 
	 * @param color
	 *            color to be set
	 */
	public void setScaleGridLineColor(ChartJsColor color) {
		try {
			getChartOptionSet().put("scaleShowGridLines", color);
		} catch (JSONException e) {
			// Nothing to do
		}
	}

	/**
	 * Gets the color of the gridline
	 * 
	 * @return the color of the gridline
	 */
	public String getScaleGridLineColor() {
		try {
			if (getChartOptionSet().has("scaleGridLineColor")) {
				return getChartOptionSet().get("scaleGridLineColor").toString();
			}
		} catch (JSONException e) {
			// Nothing to do
		}
		return null;
	}

	/**
	 * Sets the width of the GridLines. Default is 1.0
	 * 
	 * @param width
	 *            width of the GridLines
	 */
	public void setScaleGridLineWidth(Double width) {
		try {
			getChartOptionSet().put("scaleGridLineWidth", width);
		} catch (JSONException e) {
			// Nothing to do
		}
	}

	/**
	 * Gets the width of the Grid Lines
	 * 
	 * @return the width of the Grid Lines
	 */
	public Double getScaleGridLineWidth() {
		try {
			if (getChartOptionSet().has("scaleGridLineWidth")) {
				return getChartOptionSet().getDouble("scaleGridLineWidth");
			}
		} catch (JSONException e) {
			// Nothing to do
		}
		return null;
	}

	/**
	 * Enables/Disables view of Horizontal Lines (parallel to x-axis) default is
	 * true
	 * 
	 * @param choice
	 *            true to enable, otherwise false
	 */
	public void setScaleShowHorizontalLines(Boolean choice) {
		try {
			getChartOptionSet().put("scaleShowHorizontalLines", choice);
		} catch (Exception e) {
			// Nothing to do
		}
	}

	/**
	 * gets whether horizontal lines are enabled or disabled
	 * 
	 * @return whether horizontal lines are enabled or disabled
	 */
	public Boolean getScaleShowHorizontalLines() {
		try {
			if (getChartOptionSet().has("scaleShowHorizontalLines")) {
				return getChartOptionSet().getBoolean(
						"scaleShowHorizontalLines");
			}
		} catch (Exception e) {
			// Nothing to do
		}
		return false;
	}

	/**
	 * Enables/Disables view of Vertical Lines (parallel to y-axis) default is
	 * true
	 * 
	 * @param choice
	 *            true to show verticle lines, otherwise false
	 */
	public void setScaleShowVerticalLines(Boolean choice) {
		try {
			getChartOptionSet().put("scaleShowVerticalLines", choice);

		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets whether vertical lines are visible or not
	 * 
	 * @return true if vertical lines are visible, fasle otherwise
	 */
	public Boolean getScaleShowVerticalLines() {
		try {
			if (getChartOptionSet().has("scaleShowVerticalLines")) {
				return getChartOptionSet().getBoolean("scaleShowVerticalLines");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	/**
	 * Sets the bar show stroke, default is true
	 * 
	 * @param choice
	 *            true to show the bar show stroke, false otherwise
	 */
	public void setBarShowStroke(boolean choice) {
		try {
			getChartOptionSet().put("barShowStroke", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets whether the bar show stroke is shown or not
	 * 
	 * @return true if bar show stroke is shown, false otherwise
	 */
	public Boolean getBarShowStroke() {
		try {
			if (getChartOptionSet().has("barShowStroke")) {
				return getChartOptionSet().getBoolean("barShowStroke");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	/**
	 * Sets the bar Stroke Width. Default is 2.0
	 * 
	 * @param width
	 *            barStrokeWidth width of the GridLines
	 */
	public void setBarStrokeWidth(Double width) {
		try {
			getChartOptionSet().put("barStrokeWidth", width);
		} catch (JSONException e) {
			// Nothing to do
		}
	}

	/**
	 * Gets the bar Stroke Width
	 * 
	 * @return the bar Stroke Width
	 */
	public Double getBarStrokeWidth() {
		try {
			if (getChartOptionSet().has("barStrokeWidth")) {
				return getChartOptionSet().getDouble("barStrokeWidth");
			}
		} catch (JSONException e) {
			// Nothing to do
		}
		return null;
	}

	/**
	 * Sets the bar Value Spacing. Default is 5.0
	 * 
	 * @param width
	 *            bar Value Spacing
	 */
	public void setBarValueSpacing(Double width) {
		try {
			getChartOptionSet().put("barValueSpacing", width);
		} catch (JSONException e) {
			// Nothing to do
		}
	}

	/**
	 * Gets the bar Value Spacing
	 * 
	 * @return bar Value Spacing
	 */
	public Double getBarValueSpacing() {
		try {
			if (getChartOptionSet().has("barValueSpacing")) {
				return getChartOptionSet().getDouble("barValueSpacing");
			}
		} catch (JSONException e) {
			// Nothing to do
		}
		return null;
	}

	/**
	 * Sets the bar Dataset Spacing. Default is 1.0
	 * 
	 * @param width
	 *            bar Dataset Spacing
	 */
	public void setBarDatasetSpacing(Double width) {
		try {
			getChartOptionSet().put("barDatasetSpacing", width);
		} catch (JSONException e) {
			// Nothing to do
		}
	}

	/**
	 * Gets the bar Dataset Spacing
	 * 
	 * @return the bar Dataset Spacing
	 */
	public Double getBarDatasetSpacing() {
		try {
			if (getChartOptionSet().has("barDatasetSpacing")) {
				return getChartOptionSet().getDouble("barDatasetSpacing");
			}
		} catch (JSONException e) {
			// Nothing to do
		}
		return null;
	}

	/**
	 * Sets the legend template
	 * 
	 * @param legendTemplate
	 *            legend template
	 */
	public void setLegendTemplate(String legendTemplate) {
		try {
			getChartOptionSet().put("legendTemplate", legendTemplate);
		} catch (JSONException e) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the legend template
	 * 
	 * @return the legend template
	 */
	public String getLegendTemplate() {
		try {

			if (getChartOptionSet().has("legendTemplate")) {
				return getChartOptionSet().get("legendTemplate").toString();
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

}
