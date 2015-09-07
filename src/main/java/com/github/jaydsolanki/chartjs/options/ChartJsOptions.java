package com.github.jaydsolanki.chartjs.options;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.github.jaydsolanki.color.ChartJsColor;
import com.github.jaydsolanki.color.ChartJsHexColor;
import com.github.jaydsolanki.color.ChartJsRgbaColor;

public abstract class ChartJsOptions {

	protected JSONObject chartOptionSet = new JSONObject();

	public ChartJsOptions() {
		// Initializing Defaults
		setAnimation(true);
		setAnimationSteps(60);
		setAnimationEasing("easeOutQuart");
		setShowScale(true);
		setScaleOverride(false);
		setScaleLineColor(new ChartJsRgbaColor(0, 0, 0, 0.1));
		setScaleLineWidth(1.0);
		setScaleShowLabels(true);
		setScaleLabel("<%=value%>");
		setScaleIntegersOnly(true);
		setScaleBeginAtZero(false);
		setScaleFontFamily("'Helvetica Neue', 'Helvetica', 'Arial', sans-serif");
		setScaleFontSize(12.0);
		setScaleFontStyle("normal");
		setScaleFontColor(new ChartJsHexColor("#666"));
		setResponsive(false);
		setMaintainAspectRatio(true);
		setShowTooltips(true);
		setCustomTooltips(false);
		List<String> tooltipEvents = new ArrayList<String>();
		tooltipEvents.add("mousemove");
		tooltipEvents.add("touchstart");
		tooltipEvents.add("touchmove");
		setTooltipEvents(tooltipEvents);
		setTooltipFillColor(new ChartJsRgbaColor(0, 0, 0, 0.8));
		setTooltipFontFamily("'Helvetica Neue', 'Helvetica', 'Arial', sans-serif");
		setTooltipFontSize(14.0);
		setTooltipFontStyle("normal");
		setTooltipFontColor(new ChartJsHexColor("#fff"));
		setTooltipTitleFontFamily("'Helvetica Neue', 'Helvetica', 'Arial', sans-serif");
		setTooltipTitleFontStyle("bold");
		setTooltipTitleFontColor(new ChartJsHexColor("#fff"));
		setTooltipYPadding(6.0);
		setTooltipXPadding(6.0);
		setTooltipCaretSize(8.0);
		setTooltipCornerRadius(6.0);
		setTooltipXOffset(10.0);
		setTooltipTemplate("<%if (label){%><%=label%>: <%}%><%= value %>");
		setMultiTooltipTemplate("<%= value %>");
	}

	/**
	 * Enables/Disables the animation while loading of webpage, default is true
	 * 
	 * @param choice
	 *            true to enable animation, false to disable animation
	 */
	public void setAnimation(Boolean choice) {
		try {
			getChartOptionSet().put("animation", choice);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Finds whether animation is enabled/disabled
	 * 
	 * @return true if animation is enabled, false if animation is disabled
	 */
	public Boolean getAnimation() {
		try {
			if (getChartOptionSet().has("animation")) {
				return getChartOptionSet().getBoolean("animation");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * Sets the number of animation steps, larger steps means slower animation
	 * and smaller steps means faster animation, default is 60
	 * 
	 * @param animationSteps
	 *            the number of animation steps
	 */
	public void setAnimationSteps(Integer animationSteps) {
		try {
			getChartOptionSet().put("animationSteps", animationSteps);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the animation steps
	 * 
	 * @return the animation steps
	 */
	public Integer getAnimationSteps() {
		try {
			if (getChartOptionSet().has("animationSteps")) {
				return getChartOptionSet().getInt("animationSteps");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets animation easing style, default is easeOutQuart
	 * 
	 * @param animationEasing
	 *            type of animation style
	 */
	public void setAnimationEasing(String animationEasing) {
		try {
			getChartOptionSet().put("animationEasing", animationEasing);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the Animation Easing Style
	 * 
	 * @return the Animation Easing Style
	 */
	public String getAnimationEasing() {
		try {
			if (getChartOptionSet().has("animationEasing")) {
				return getChartOptionSet().get("animationEasing").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Enables/Disables the view of scale, default is true
	 * 
	 * @param showScale
	 *            true to enable showScale, false to disable showScale
	 */
	public void setShowScale(Boolean showScale) {
		try {
			getChartOptionSet().put("showScale", showScale);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Finds whether scale view win enabled/disabled
	 * 
	 * @return true if scale is enabled, false if scale is disabled
	 */
	public Boolean getShowScale() {
		try {
			if (getChartOptionSet().has("showScale")) {
				return getChartOptionSet().getBoolean("showScale");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * Enables/Disables the default scale overriding, default is false
	 * 
	 * @param scaleOverride
	 *            true to override scale, false otherwise
	 */
	public void setScaleOverride(Boolean scaleOverride) {
		try {
			getChartOptionSet().put("scaleOverride", scaleOverride);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * finds whether the scale has been overridden or not
	 * 
	 * @return true if scale has been overridden, false otherwise
	 */
	public Boolean getScaleOverride() {
		try {
			if (getChartOptionSet().has("scaleOverride")) {
				return getChartOptionSet().getBoolean("scaleOverride");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * The number of steps in scale, if the scale has been overridden, default
	 * is null
	 * 
	 * @param scaleSteps
	 *            number of steps in scale
	 */
	public void setScaleSteps(Integer scaleSteps) {
		try {
			getChartOptionSet().put("scaleSteps", scaleSteps);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets number of steps in scale default is null
	 * 
	 * @return number of steps in scale
	 */
	public Integer getScaleSteps() {
		try {
			if (getChartOptionSet().has("scaleSteps")) {
				return getChartOptionSet().getInt("scaleSteps");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * The value jump in the hard coded scale, if the scale has been overridden,
	 * which will basically give the width, default is null
	 * 
	 * @param scaleStepWidth
	 *            The value jump in the hard coded scale
	 */
	public void setScaleStepWidth(Integer scaleStepWidth) {
		try {
			getChartOptionSet().put("scaleStepWidth", scaleStepWidth);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * The value jump in the hard coded scale
	 * 
	 * @return The value jump in the hard coded scale
	 */
	public Integer getScaleStepWidth() {
		try {
			if (getChartOptionSet().has("scaleStepWidth")) {
				return getChartOptionSet().getInt("scaleStepWidth");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * The value of the starting of the scale, if the scale has been overridden
	 * , default is null
	 * 
	 * @param scaleStartValue
	 *            The value of the starting of the scale
	 */
	public void setScaleStartValue(String scaleStartValue) {
		try {
			getChartOptionSet().put("scaleStartValue", scaleStartValue);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the value of the starting of the scale
	 * 
	 * @return The value of the starting of the scale
	 */
	public String getScaleStartValue() {
		try {
			if (getChartOptionSet().has("scaleStartValue")) {
				return getChartOptionSet().get("scaleStartValue").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the Scale Line Color, default is ChartJsRgbaColor(0,0,0,0.1)
	 * 
	 * @param scaleLineColor
	 *            the color to be set
	 */
	public void setScaleLineColor(ChartJsColor scaleLineColor) {
		try {
			getChartOptionSet()
					.put("scaleLineColor", scaleLineColor.toString());
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the scale line color
	 * 
	 * @return the scale line color
	 */
	public String getScaleLineColor() {
		try {
			if (getChartOptionSet().has("scaleLineColor")) {
				return getChartOptionSet().get("scaleLineColor").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Set the scale line width, default is 1
	 * 
	 * @param scaleLineWidth
	 *            the scale Line Width
	 */
	public void setScaleLineWidth(Double scaleLineWidth) {
		try {
			getChartOptionSet().put("scaleLineWidth", scaleLineWidth);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the scale line width
	 * 
	 * @return the scale line width
	 */
	public Double getScaleLineWidth() {
		try {
			if (getChartOptionSet().has("scaleLineWidth")) {
				return getChartOptionSet().getDouble("scaleLineWidth");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Whether to show labels on the scale, default is true
	 * 
	 * @param scaleShowLabels
	 *            true to show labels, false otherwises
	 */
	public void setScaleShowLabels(Boolean scaleShowLabels) {
		try {
			getChartOptionSet().put("scaleShowLabels", scaleShowLabels);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Finds whether labels are showed on the scale
	 * 
	 * @return true if labels are showed on scale, false otherwise
	 */
	public Boolean getScaleShowLabels() {
		try {
			if (getChartOptionSet().has("scaleShowLabels")) {
				return getChartOptionSet().getBoolean("scaleShowLabels");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * Interpolated JS string - can access value, default is <%=value%>
	 * 
	 * @param scaleLabel
	 *            Interpolated JS string - can access value
	 */
	public void setScaleLabel(String scaleLabel) {
		try {
			getChartOptionSet().put("scaleLabel", scaleLabel);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the Interpolated JS string
	 * 
	 * @return the Interpolated JS string
	 */
	public String getScaleLabel() {
		try {
			if (getChartOptionSet().has("scaleLabel")) {
				return getChartOptionSet().get("scaleLabel").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets whether the scale should stick to integers or floats, default is
	 * true
	 * 
	 * @param scaleIntegersOnly
	 *            true to stick to integers, false to go to floats
	 */
	public void setScaleIntegersOnly(Boolean scaleIntegersOnly) {
		try {
			getChartOptionSet().put("scaleIntegersOnly", scaleIntegersOnly);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Finds whether the scale should stick to integers or floats
	 * 
	 * @return true if the scale sticks to Integers, false if to floats as well
	 */
	public Boolean getScaleIntegersOnly() {
		try {
			if (getChartOptionSet().has("scaleIntegersOnly")) {
				return getChartOptionSet().getBoolean("scaleIntegersOnly");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * Sets whether the scale should start with 0 or a larger number, as in case
	 * where only larger numbers have to be shown we could start with a
	 * relatively larger number on y-axis, default is false
	 * 
	 * @param scaleBeginAtZero
	 *            true to forcefully start y-axis from 0, false to start with a
	 *            relatively larger number (as per scale) the selection is
	 *            automatic
	 */
	public void setScaleBeginAtZero(Boolean scaleBeginAtZero) {
		try {
			getChartOptionSet().put("scaleBeginAtZero", scaleBeginAtZero);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * gets whether the scale should start with 0 or a larger number
	 * 
	 * @return true if scale is starting from 0, false otherwise
	 */
	public Boolean getScaleBeginAtZero() {
		try {
			if (getChartOptionSet().has("scaleBeginAtZero")) {
				return getChartOptionSet().getBoolean("scaleBeginAtZero");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * Font Family to be used to show the scale font, default is 'Helvetica
	 * Neue','Helvetica', 'Arial', sans-serif
	 * 
	 * @param scaleFontFamily
	 *            Font Family to be used
	 */
	public void setScaleFontFamily(String scaleFontFamily) {
		try {
			getChartOptionSet().put("scaleFontFamily", scaleFontFamily);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the Font Family used to show the scale font
	 * 
	 * @return the Font Family used to show the scale font
	 */
	public String getScaleFontFamily() {
		try {
			if (getChartOptionSet().has("scaleFontFamily")) {
				return getChartOptionSet().get("scaleFontFamily").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the size of Scale Label default is 12.0
	 * 
	 * @param scaleFontSize
	 */
	public void setScaleFontSize(Double scaleFontSize) {
		try {
			getChartOptionSet().put("scaleFontSize", scaleFontSize);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the size of Scale Label
	 * 
	 * @return the size of Scale Label
	 */
	public Double getScaleFontSize() {
		try {
			if (getChartOptionSet().has("scaleFontSize")) {
				return getChartOptionSet().getDouble("scaleFontSize");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the scale font style, default is normal
	 * 
	 * @param scaleFontStyle
	 *            the scale font style
	 */
	public void setScaleFontStyle(String scaleFontStyle) {
		try {
			getChartOptionSet().put("scaleFontStyle", scaleFontStyle);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * gets the scale font style
	 * 
	 * @return the scale font style
	 */
	public String getScaleFontStyle() {
		try {
			if (getChartOptionSet().has("scaleFontStyle")) {
				return getChartOptionSet().get("scaleFontStyle").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the scale font color default is ChartJsHexColor("#666")
	 * 
	 * @param scaleFontColor
	 *            the scale font color
	 */
	public void setScaleFontColor(ChartJsColor scaleFontColor) {
		try {
			getChartOptionSet()
					.put("scaleFontColor", scaleFontColor.getColorValue());
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the scale font color
	 * 
	 * @return the scale font color
	 */
	public String getScaleFontColor() {
		try {
			if (getChartOptionSet().has("scaleFontColor")) {
				return getChartOptionSet().get("scaleFontColor").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets whether or not the chart should be responsive and resize when the
	 * browser does Default is false
	 * 
	 * @param responsive
	 *            True if the chart should be responsive, false otherwise
	 */
	public void setResponsive(Boolean responsive) {
		try {
			getChartOptionSet().put("responsive", responsive);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets whether or not the chart should be responsive and resize when the
	 * browser does
	 * 
	 * @return True if responsive, otherwise false
	 */
	public Boolean getResponsive() {
		try {
			if (getChartOptionSet().has("responsive")) {
				return getChartOptionSet().getBoolean("responsive");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * Sets whether to maintain the starting aspect ratio or not when
	 * responsive, if set to false, will take up entire container, default is
	 * true
	 * 
	 * @param maintainAspectRatio
	 *            true to maintain the starting aspect ration, false otherwise
	 */
	public void setMaintainAspectRatio(Boolean maintainAspectRatio) {
		try {
			getChartOptionSet().put("maintainAspectRatio", maintainAspectRatio);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets whether to maintain the starting aspect ratio or not when
	 * responsive, if set to false, will take up entire container
	 * 
	 * @return true if starting aspect ratio is maintained, false otherwise
	 */
	public Boolean getMaintainAspectRatio() {
		try {
			if (getChartOptionSet().has("maintainAspectRatio")) {
				return getChartOptionSet().getBoolean("maintainAspectRatio");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * Sets whether to draw tooltips on the canvas or not default is true
	 * 
	 * @param showTooltips
	 *            true to draw tooltips, false otherwise
	 */
	public void setShowTooltips(Boolean showTooltips) {
		try {
			getChartOptionSet().put("showTooltips", showTooltips);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets whether to draw tooltips on the canvas or not
	 * 
	 * @return true of tooltips are drawn, false otherwise
	 */
	public Boolean getShowTooltips() {
		try {
			if (getChartOptionSet().has("showTooltips")) {
				return getChartOptionSet().getBoolean("showTooltips");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * Sets whether to execute the customTooltips function instead of drawing
	 * the built in tooltips (See [Advanced - External
	 * Tooltips](#advanced-usage-custom-tooltips)), default is false
	 * 
	 * @param customTooltips
	 *            true if customtools to be used, false otherwise
	 */
	public void setCustomTooltips(Boolean customTooltips) {
		try {
			getChartOptionSet().put("customTooltips", customTooltips);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets whether to execute the customTooltips function instead of drawing
	 * the built in tooltips
	 * 
	 * @return true if custom tooltips are used, false otherwise
	 */
	public Boolean getCustomTooltips() {
		try {
			if (getChartOptionSet().has("customTooltips")) {
				return getChartOptionSet().getBoolean("customTooltips");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return false;
	}

	/**
	 * Sets the tool tip events, default is ["mousemove", "touchstart",
	 * "touchmove"]
	 * 
	 * @param tooltipEvents
	 *            the tool tip events
	 */
	public void setTooltipEvents(List<String> tooltipEvents) {
		JSONArray tooltipEventsArray = new JSONArray();
		for (String tooltipEvent : tooltipEvents) {
			tooltipEventsArray.put(tooltipEvent);
		}
		try {
			getChartOptionSet().put("tooltipEvents", tooltipEventsArray);
		} catch (JSONException je) {
			// Nothing to do
		}

	}

	/**
	 * Gets the tool tip events
	 * 
	 * @return the tool tip events
	 */
	public List<String> getTooltipEvenets() {
		List<String> tooltipEvents = null;
		try {
			if (getChartOptionSet().has("customTooltips")) {
				JSONArray tooltipEventsArray = (JSONArray) getChartOptionSet()
						.get("customTooltips");
				if (tooltipEventsArray.length() > 0) {
					tooltipEvents = new ArrayList<String>();
					for (int i = 0; i < tooltipEventsArray.length(); i++) {
						tooltipEvents.add(tooltipEventsArray.getString(i));
					}
				}
				return tooltipEvents;
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the Tooltip Fill Color, default is ChartJsRgbaColor(0, 0, 0, 0.8)
	 * 
	 * @param tooltipFillColor
	 *            the Tooltip Fill Color
	 */
	public void setTooltipFillColor(ChartJsColor tooltipFillColor) {
		try {
			getChartOptionSet().put("tooltipFillColor",
					tooltipFillColor.getColorValue());
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the Tooltip Fill Color
	 * 
	 * @return the Tooltip Fill Color
	 */
	public String getTooltipFillColor() {
		try {
			if (getChartOptionSet().has("tooltipFillColor")) {
				return getChartOptionSet().get("tooltipFillColor").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip font family, default is
	 * "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 * 
	 * @param tooltipFontFamily
	 *            the tooltip font family
	 */
	public void setTooltipFontFamily(String tooltipFontFamily) {
		try {
			getChartOptionSet().put("tooltipFontFamily", tooltipFontFamily);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * gets the tooltip font family
	 * 
	 * @return the tooltip font family
	 */
	public String getTooltipFontFamily() {
		try {
			if (getChartOptionSet().has("tooltipFontFamily")) {
				return getChartOptionSet().get("tooltipFontFamily").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip font size, default is 14.0
	 * 
	 * @param tooltipFontSize
	 *            the tooltip font size
	 */
	public void setTooltipFontSize(Double tooltipFontSize) {
		try {
			getChartOptionSet().put("tooltipFontSize", tooltipFontSize);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tooltip font size
	 * 
	 * @return the tooltip font size
	 */
	public Double getTooltipFontSize() {
		try {
			if (getChartOptionSet().has("tooltipFontSize")) {
				return getChartOptionSet().getDouble("tooltipFontSize");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip font style, default is bold
	 * 
	 * @param tooltipFontStyle
	 *            the tooltip font style
	 */
	public void setTooltipFontStyle(String tooltipFontStyle) {
		try {
			getChartOptionSet().put("tooltipFontStyle", tooltipFontStyle);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tooltip font style
	 * 
	 * @return the tooltip font style
	 */
	public String getTooltipFontStyle() {
		try {
			if (getChartOptionSet().has("tooltipFontStyle")) {
				return getChartOptionSet().get("tooltipFontStyle").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip font color, default is ChartJsHexColor("#fff")
	 * 
	 * @param tooltipFontColor
	 *            the tooltip font color
	 */
	public void setTooltipFontColor(ChartJsColor tooltipFontColor) {
		try {
			getChartOptionSet().put("tooltipFontColor",
					tooltipFontColor.getColorValue());
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * the tooltip font color
	 * 
	 * @return the tooltip font color
	 */
	public String getTooltipFontColor() {
		try {
			if (getChartOptionSet().has("tooltipFontColor")) {
				return getChartOptionSet().get("tooltipFontColor").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip font family, default is
	 * "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 * 
	 * @param tooltipTitleFontFamily
	 *            the tooltip font family
	 */
	public void setTooltipTitleFontFamily(String tooltipTitleFontFamily) {
		try {
			getChartOptionSet()
					.put("tooltipTitleFontFamily", tooltipTitleFontFamily);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * the tooltip font family
	 * 
	 * @return the tooltip font family
	 */
	public String getTooltipTitleFontFamily() {
		try {
			if (getChartOptionSet().has("tooltipTitleFontFamily")) {
				return getChartOptionSet().get("tooltipTitleFontFamily")
						.toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip title font size, default is 14.0
	 * 
	 * @param tooltipTitleFontSize
	 *            the tooltip title font size
	 */
	public void setTooltipTitleFontSize(Double tooltipTitleFontSize) {
		try {
			getChartOptionSet().put("tooltipTitleFontSize",
					tooltipTitleFontSize);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tooltip title font size
	 * 
	 * @return the tooltip title font size
	 */
	public Double getTooltipTitleFontSize() {
		try {
			if (getChartOptionSet().has("tooltipTitleFontSize")) {
				return getChartOptionSet().getDouble("tooltipTitleFontSize");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tool tip title font style, default is bold
	 * 
	 * @param tooltipTitleFontStyle
	 *            the tool tip title font style
	 */
	public void setTooltipTitleFontStyle(String tooltipTitleFontStyle) {
		try {
			getChartOptionSet().put("tooltipTitleFontStyle",
					tooltipTitleFontStyle);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tool tip title font style
	 * 
	 * @return the tool tip title font style
	 */
	public String getTooltipTitleFontStyle() {
		try {
			if (getChartOptionSet().has("tooltipTitleFontStyle")) {
				return getChartOptionSet().get("tooltipTitleFontStyle")
						.toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip title font color, default is ChartJsHexColor("#fff")
	 * 
	 * @param tooltipTitleFontColor
	 *            the tooltip title font color
	 */
	public void setTooltipTitleFontColor(ChartJsColor tooltipTitleFontColor) {
		try {
			getChartOptionSet().put("tooltipTitleFontColor",
					tooltipTitleFontColor.getColorValue());
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tooltip title font color
	 * 
	 * @return the tooltip title font color
	 */
	public String getTooltipTitleFontColor() {
		try {
			if (getChartOptionSet().has("tooltipTitleFontColor")) {
				return getChartOptionSet().get("tooltipTitleFontColor")
						.toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip Y padding, default is 6.0
	 * 
	 * @param tooltipYPadding
	 *            the tooltip Y padding
	 */
	public void setTooltipYPadding(Double tooltipYPadding) {
		try {
			getChartOptionSet().put("tooltipYPadding", tooltipYPadding);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tooltip Y padding
	 * 
	 * @return the tooltip Y padding
	 */
	public Double getTooltipYPadding() {
		try {
			if (getChartOptionSet().has("tooltipYPadding")) {
				return getChartOptionSet().getDouble("tooltipYPadding");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip X padding, default is 6.0
	 * 
	 * @param tooltipXPadding
	 *            the tooltip X padding
	 */
	public void setTooltipXPadding(Double tooltipXPadding) {
		try {
			getChartOptionSet().put("tooltipXPadding", tooltipXPadding);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tooltip X padding
	 * 
	 * @return the tooltip X padding
	 */
	public Double getTooltipXPadding() {
		try {
			if (getChartOptionSet().has("tooltipXPadding")) {
				return getChartOptionSet().getDouble("tooltipXPadding");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip caret size, default is 8.0
	 * 
	 * @param tooltipCaretSize
	 *            the tooltip caret size
	 */
	public void setTooltipCaretSize(Double tooltipCaretSize) {
		try {
			getChartOptionSet().put("tooltipCaretSize", tooltipCaretSize);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tooltip caret size
	 * 
	 * @return the tooltip caret size
	 */
	public Double getTooltipCaretSize() {
		try {
			if (getChartOptionSet().has("tooltipCaretSize")) {
				return getChartOptionSet().getDouble("tooltipCaretSize");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip corner radius, default is 6.0
	 * 
	 * @param tooltipCornerRadius
	 *            the tooltip corner radius
	 */
	public void setTooltipCornerRadius(Double tooltipCornerRadius) {
		try {
			getChartOptionSet().put("tooltipCornerRadius", tooltipCornerRadius);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * the tooltip corner radius
	 * 
	 * @return the tooltip corner radius
	 */
	public Double getTooltipCornerRadius() {
		try {
			if (getChartOptionSet().has("tooltipCornerRadius")) {
				return getChartOptionSet().getDouble("tooltipCornerRadius");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip X offset, default is 10.0
	 * 
	 * @param tooltipXOffset
	 *            the tooltip X offset
	 */
	public void setTooltipXOffset(Double tooltipXOffset) {
		try {
			getChartOptionSet().put("tooltipXOffset", tooltipXOffset);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tooltip X offset
	 * 
	 * @return the tooltip X offset
	 */
	public Double getTooltipXOffset() {
		try {
			if (getChartOptionSet().has("tooltipXOffset")) {
				return getChartOptionSet().getDouble("tooltipXOffset");
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the tooltip template, default is
	 * "<%if (label){%><%=label%>: <%}%><%= value %>"
	 * 
	 * @param tooltipTemplate
	 *            the tooltip template
	 */
	public void setTooltipTemplate(String tooltipTemplate) {
		try {
			getChartOptionSet().put("tooltipTemplate", tooltipTemplate);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets the tooltip template
	 * 
	 * @return the tooltip template
	 */
	public String getTooltipTemplate() {
		try {
			if (getChartOptionSet().has("tooltipTemplate")) {
				return getChartOptionSet().get("tooltipTemplate").toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets the multi tooltip template, default is "<%= value %>"
	 * 
	 * @param multiTooltipTemplate
	 *            multi tooltip template
	 */
	public void setMultiTooltipTemplate(String multiTooltipTemplate) {
		try {
			getChartOptionSet().put("multiTooltipTemplate",
					multiTooltipTemplate);
		} catch (JSONException je) {
			// Nothing to do
		}
	}

	/**
	 * Gets multi tooltip template
	 * 
	 * @return multi tooltip template
	 */
	public String getMultiTooltipTemplate() {
		try {
			if (getChartOptionSet().has("multiTooltipTemplate")) {
				return getChartOptionSet().get("multiTooltipTemplate")
						.toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets a javascript function while animation is in process, default is
	 * empty function i.e function(){}
	 */
	public void setOnAnimationProgress(String function) {
		try {
			getChartOptionSet().put("onAnimationProgress", function);
		} catch (JSONException je) {
			// Nothing to do
		}

	}

	/**
	 * @return the javascript function while animation is in process
	 */
	public String getOnAnimationProgress() {
		try {
			if (getChartOptionSet().has("onAnimationProgress")) {
				return getChartOptionSet().get("onAnimationProgress")
						.toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	/**
	 * Sets a javascript function while animation is completed, default is empty
	 * function i.e function(){}
	 */
	public void setOnAnimationComplete(String function) {
		try {
			getChartOptionSet().put("onAnimationComplete", function);
		} catch (JSONException je) {
			// Nothing to do
		}

	}

	/**
	 * @return the javascript function while animation is completed
	 */
	public String getOnAnimationComplete() {
		try {
			if (getChartOptionSet().has("onAnimationComplete")) {
				return getChartOptionSet().get("onAnimationComplete")
						.toString();
			}
		} catch (JSONException je) {
			// Nothing to Do
		}
		return null;
	}

	public JSONObject getChartOptionSet() {
		return chartOptionSet;
	}

}
