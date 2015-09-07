package com.github.jaydsolanki.chartjs.options;

import org.json.JSONException;

import com.github.jaydsolanki.color.ChartJsColor;
import com.github.jaydsolanki.color.ChartJsRgbaColor;

public class ChartJsLineOptions extends ChartJsOptions {

	public ChartJsLineOptions() {
		/*
		 * Populating defaults
		 */
		super();
		setScaleShowGridLines(true);
		setScaleGridLineColor(new ChartJsRgbaColor(0, 0, 0, 0.05));
		setScaleGridLineWidth(1.0);
		setScaleShowHorizontalLines(true);
		setScaleShowVerticalLines(true);
		setBezierCurve(true);
		setBezierCurveTension(0.4);
		setPointDot(true);
		setPointDotRadius(4.0);
		setPointDotStrokeWidth(1.0);
		setPointHitDetectionRadius(5.0);
		setDatasetStroke(true);
		setDatasetStrokeWidth(2.0);
		setDatasetFill(true);
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
				return getChartOptionSet().getBoolean("scaleShowHorizontalLines");
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
	 * Enables/Disables bezier curve
	 * 
	 * @param choice
	 *            true to enable, false to disable
	 */
	public void setBezierCurve(Boolean choice) {
		try {
			getChartOptionSet().put("bezierCurve", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * get whether bezier curve is enabled or not
	 * 
	 * @return true if enables. false otherwise
	 */
	public Boolean getBezierCurve() {
		try {
			if (getChartOptionSet().has("bezierCurve")) {
				return getChartOptionSet().getBoolean("bezierCurve");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return false;
	}

	/**
	 * Sets the bezier curve tension, or in simple words smoothness factor, more
	 * the smoothness factor more curved is the chart line, default is 0.4.
	 * Values near to 0 will make chart line less curved (0 meaning no
	 * smoothness at all)
	 * 
	 * @param bezierCurveTension
	 *            the tension value to be used
	 */
	public void setBezierCurveTension(Double bezierCurveTension) {
		try {
			getChartOptionSet().put("bezierCurveTension", bezierCurveTension);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the bezier curve tension
	 * 
	 * @return the bezier curve tension
	 */
	public Double getBezierCurveTension() {
		try {
			if (getChartOptionSet().has("bezierCurveTension")) {
				return getChartOptionSet().getDouble("bezierCurveTension");
			}
		} catch (JSONException je) {
			// Nothing to do
		}
		return null;
	}

	/**
	 * Sets whether to show a dot for each point default is true
	 * 
	 * @param choice
	 *            true to show, false otherwise
	 */
	public void setPointDot(Boolean choice) {
		try {
			getChartOptionSet().put("pointDot", choice);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets whether to show a dot for each point default is true
	 * 
	 * @return true if shown, false otherwise
	 */
	public Boolean getPointDot() {
		try {
			if (getChartOptionSet().has("pointDot")) {
				return getChartOptionSet().getBoolean("pointDot");
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return false;
	}

	/**
	 * Sets the radius of the dot, default is 4.0
	 * 
	 * @param pointDotRadius
	 *            the radius of the dot
	 */
	public void setPointDotRadius(Double pointDotRadius) {
		try {
			getChartOptionSet().put("pointDotRadius", pointDotRadius);
		} catch (JSONException je) {

		}
	}

	/**
	 * Gets the radius of the dot
	 * 
	 * @return the radius of the dot
	 */
	public Double getPointDotRadius() {
		try {
			if (getChartOptionSet().has("pointDotRadius")) {
				return getChartOptionSet().getDouble("pointDotRadius");
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Sets the point dot stroke width, default is 1.0
	 * 
	 * @param pointDotStrokeWidth
	 *            the point dot stroke width
	 */
	public void setPointDotStrokeWidth(Double pointDotStrokeWidth) {
		try {
			getChartOptionSet().put("pointDotStrokeWidth", pointDotStrokeWidth);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the point dot stroke width
	 * 
	 * @return the point dot stroke width
	 */
	public Double getPointDotStrokeWidth() {
		try {
			if (getChartOptionSet().has("pointDotStrokeWidth")) {
				return getChartOptionSet().getDouble("pointDotStrokeWidth");
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Sets the point hit detection radius, this is basically the distance
	 * between mouse pointer and the point while hovering over the chart to show
	 * values. If chart is small in dimension this should be set to a lower
	 * value and if a larger chart is used then a larger value should be used.
	 * If the chart is small and large value is used then it may result into
	 * overlapping of adjacent labels while hovering. Default is 4
	 * 
	 * @param pointHitDetectionRadius
	 *            the point hit detection radius
	 */
	public void setPointHitDetectionRadius(Double pointHitDetectionRadius) {
		try {
			getChartOptionSet().put("pointHitDetectionRadius",
					pointHitDetectionRadius);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the point hit detection radius
	 * 
	 * @return the point hit detection radius
	 */
	public Double getPointHitDetectionRadius() {
		try {
			if (getChartOptionSet().has("pointHitDetectionRadius")) {
				return getChartOptionSet().getDouble("pointHitDetectionRadius");
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Sets whether to show a stroke for datasets, default is true
	 * 
	 * @param choice
	 *            true to show, false otherwise
	 */
	public void setDatasetStroke(Boolean choice) {
		try {
			getChartOptionSet().put("datasetStroke", choice);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets where a stroke is shown for datasets
	 * 
	 * @return true if it is shown, false otherwise
	 */
	public Boolean getDatasetStroke() {
		try {
			if (getChartOptionSet().has("datasetStroke")) {
				return getChartOptionSet().getBoolean("datasetStroke");
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return false;
	}

	/**
	 * Sets the dataset stroke width, default is 2.0
	 * 
	 * @param datasetStrokeWidth
	 *            the dataset stroke widths
	 */
	public void setDatasetStrokeWidth(Double datasetStrokeWidth) {
		try {
			getChartOptionSet().put("datasetStrokeWidth", datasetStrokeWidth);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the dataset stroke width
	 * 
	 * @return the dataset stroke widths
	 */
	public Double getDatasetStrokeWidth() {
		try {
			if (getChartOptionSet().has("datasetStrokeWidth")) {
				return getChartOptionSet().getDouble("datasetStrokeWidth");
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * Sets whether to fill the dataset with a color, default is true
	 * 
	 * @param choice
	 *            true to fill the dataset with a color, false otherwise
	 */
	public void setDatasetFill(Boolean choice) {
		try {
			getChartOptionSet().put("datasetFill", choice);
		} catch (JSONException je) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets whether dataset is filled with color or not
	 * 
	 * @return true if yes, false otherwise
	 */
	public Boolean getDatasetFill() {
		try {
			if (getChartOptionSet().has("datasetFill")) {
				return getChartOptionSet().getBoolean("datasetFill");
			}
		} catch (JSONException je) {
			// TODO: handle exception
		}
		return false;
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
