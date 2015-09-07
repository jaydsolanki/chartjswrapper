package com.github.jaydsolanki.color;

import java.util.HashMap;
import java.util.Map;

public class ChartJsRgbaColor extends ChartJsColor {

	private static Map<String, String> colorRgbMap = new HashMap<String, String>();

	static {
		initRgbColors();
	}

	private int r;
	private int g;
	private int b;
	private int a;


	/**
	 * Generates rgba colors with given parameters
	 * 
	 * @param r
	 * @param g
	 * @param b
	 * @param a
	 */
	public ChartJsRgbaColor(int r, int g, int b, double a) {
		this.colorValue = generateRgbaString(r, g, b, a);
	}

	/**
	 * Generates a rgba color with given transparency
	 * 
	 * @param storedColor
	 *            storedColor Color from StoredColors enum
	 * @param transparency
	 *            0<=transparency<=1.0, transparency factor
	 */
	public ChartJsRgbaColor(StoredColors storedColor, double transparency) {
		this.colorValue = appendTransparencyInRgb(
				colorRgbMap.get(storedColor.toString()), transparency);
	}

	/**
	 * Generates a rgba color with 0% transparency
	 * 
	 * @param storedColor
	 *            Color from StoredColors enum
	 */
	public ChartJsRgbaColor(StoredColors storedColor) {
		this.colorValue = appendTransparencyInRgb(
				colorRgbMap.get(storedColor.toString()), 1.0);
	}

	public static String generateRgbaString(int r, int g, int b, double a) {
		return "rgba(" + r + "," + g + "," + b + "," + a + ")";
	}

	public static String generateRgbString(int r, int g, int b) {
		return "rgba(" + r + "," + g + "," + b + ")";
	}

	public static String appendTransparencyInRgb(String rgb, double a) {
		return rgb.replace(")", "," + a + ")");
	}

	public static void initRgbColors() {
		colorRgbMap.put("MAROON", generateRgbString(128, 0, 0));
		colorRgbMap.put("DARK_RED", generateRgbString(139, 0, 0));
		colorRgbMap.put("BROWN", generateRgbString(165, 42, 42));
		colorRgbMap.put("FIREBRICK", generateRgbString(178, 34, 34));
		colorRgbMap.put("CRIMSON", generateRgbString(220, 20, 60));
		colorRgbMap.put("RED", generateRgbString(255, 0, 0));
		colorRgbMap.put("TOMATO", generateRgbString(255, 99, 71));
		colorRgbMap.put("CORAL", generateRgbString(255, 127, 80));
		colorRgbMap.put("INDIAN_RED", generateRgbString(205, 92, 92));
		colorRgbMap.put("LIGHT_CORAL", generateRgbString(240, 128, 128));
		colorRgbMap.put("DARK_SALMON", generateRgbString(233, 150, 122));
		colorRgbMap.put("SALMON", generateRgbString(250, 128, 114));
		colorRgbMap.put("LIGHT_SALMON", generateRgbString(255, 160, 122));
		colorRgbMap.put("ORANGE_RED", generateRgbString(255, 69, 0));
		colorRgbMap.put("DARK_ORANGE", generateRgbString(255, 140, 0));
		colorRgbMap.put("ORANGE", generateRgbString(255, 165, 0));
		colorRgbMap.put("GOLD", generateRgbString(255, 215, 0));
		colorRgbMap.put("DARK_GOLDEN_ROD", generateRgbString(184, 134, 11));
		colorRgbMap.put("GOLDEN_ROD", generateRgbString(218, 165, 32));
		colorRgbMap.put("PALE_GOLDEN_ROD", generateRgbString(238, 232, 170));
		colorRgbMap.put("DARK_KHAKI", generateRgbString(189, 183, 107));
		colorRgbMap.put("KHAKI", generateRgbString(240, 230, 140));
		colorRgbMap.put("OLIVE", generateRgbString(128, 128, 0));
		colorRgbMap.put("YELLOW", generateRgbString(255, 255, 0));
		colorRgbMap.put("YELLOW_GREEN", generateRgbString(154, 205, 50));
		colorRgbMap.put("DARK_OLIVE_GREEN", generateRgbString(85, 107, 47));
		colorRgbMap.put("OLIVE_DRAB", generateRgbString(107, 142, 35));
		colorRgbMap.put("LAWN_GREEN", generateRgbString(124, 252, 0));
		colorRgbMap.put("CHART_REUSE", generateRgbString(127, 255, 0));
		colorRgbMap.put("GREEN_YELLOW", generateRgbString(173, 255, 47));
		colorRgbMap.put("DARK_GREEN", generateRgbString(0, 100, 0));
		colorRgbMap.put("GREEN", generateRgbString(0, 128, 0));
		colorRgbMap.put("FOREST_GREEN", generateRgbString(34, 139, 34));
		colorRgbMap.put("LIME", generateRgbString(0, 255, 0));
		colorRgbMap.put("LIME_GREEN", generateRgbString(50, 205, 50));
		colorRgbMap.put("LIGHT_GREEN", generateRgbString(144, 238, 144));
		colorRgbMap.put("PALE_GREEN", generateRgbString(152, 251, 152));
		colorRgbMap.put("DARK_SEA_GREEN", generateRgbString(143, 188, 143));
		colorRgbMap.put("MEDIUM_SPRING_GREEN", generateRgbString(0, 250, 154));
		colorRgbMap.put("SPRING_GREEN", generateRgbString(0, 255, 127));
		colorRgbMap.put("SEA_GREEN", generateRgbString(46, 139, 87));
		colorRgbMap.put("MEDIUM_AQUA_MARINE", generateRgbString(102, 205, 170));
		colorRgbMap.put("MEDIUM_SEA_GREEN", generateRgbString(60, 179, 113));
		colorRgbMap.put("LIGHT_SEA_GREEN", generateRgbString(32, 178, 170));
		colorRgbMap.put("DARK_SLATE_GRAY", generateRgbString(47, 79, 79));
		colorRgbMap.put("TEAL", generateRgbString(0, 128, 128));
		colorRgbMap.put("DARK_CYAN", generateRgbString(0, 139, 139));
		colorRgbMap.put("AQUA", generateRgbString(0, 255, 255));
		colorRgbMap.put("CYAN", generateRgbString(0, 255, 255));
		colorRgbMap.put("LIGHT_CYAN", generateRgbString(224, 255, 255));
		colorRgbMap.put("DARK_TURQUOISE", generateRgbString(0, 206, 209));
		colorRgbMap.put("TURQUOISE", generateRgbString(64, 224, 208));
		colorRgbMap.put("MEDIUM_TURQUOISE", generateRgbString(72, 209, 204));
		colorRgbMap.put("PALE_TURQUOISE", generateRgbString(175, 238, 238));
		colorRgbMap.put("AQUA_MARINE", generateRgbString(127, 255, 212));
		colorRgbMap.put("POWDER_BLUE", generateRgbString(176, 224, 230));
		colorRgbMap.put("CADET_BLUE", generateRgbString(95, 158, 160));
		colorRgbMap.put("STEEL_BLUE", generateRgbString(70, 130, 180));
		colorRgbMap.put("CORN_FLOWER_BLUE", generateRgbString(100, 149, 237));
		colorRgbMap.put("DEEP_SKY_BLUE", generateRgbString(0, 191, 255));
		colorRgbMap.put("DODGER_BLUE", generateRgbString(30, 144, 255));
		colorRgbMap.put("LIGHT_BLUE", generateRgbString(173, 216, 230));
		colorRgbMap.put("SKY_BLUE", generateRgbString(135, 206, 235));
		colorRgbMap.put("LIGHT_SKY_BLUE", generateRgbString(135, 206, 250));
		colorRgbMap.put("MIDNIGHT_BLUE", generateRgbString(25, 25, 112));
		colorRgbMap.put("NAVY", generateRgbString(0, 0, 128));
		colorRgbMap.put("DARK_BLUE", generateRgbString(0, 0, 139));
		colorRgbMap.put("MEDIUM_BLUE", generateRgbString(0, 0, 205));
		colorRgbMap.put("BLUE", generateRgbString(0, 0, 255));
		colorRgbMap.put("ROYAL_BLUE", generateRgbString(65, 105, 225));
		colorRgbMap.put("BLUE_VIOLET", generateRgbString(138, 43, 226));
		colorRgbMap.put("INDIGO", generateRgbString(75, 0, 130));
		colorRgbMap.put("DARK_SLATE_BLUE", generateRgbString(72, 61, 139));
		colorRgbMap.put("SLATE_BLUE", generateRgbString(106, 90, 205));
		colorRgbMap.put("MEDIUM_SLATE_BLUE", generateRgbString(123, 104, 238));
		colorRgbMap.put("MEDIUM_PURPLE", generateRgbString(147, 112, 219));
		colorRgbMap.put("DARK_MAGENTA", generateRgbString(139, 0, 139));
		colorRgbMap.put("DARK_VIOLET", generateRgbString(148, 0, 211));
		colorRgbMap.put("DARK_ORCHID", generateRgbString(153, 50, 204));
		colorRgbMap.put("MEDIUM_ORCHID", generateRgbString(186, 85, 211));
		colorRgbMap.put("PURPLE", generateRgbString(128, 0, 128));
		colorRgbMap.put("THISTLE", generateRgbString(216, 191, 216));
		colorRgbMap.put("PLUM", generateRgbString(221, 160, 221));
		colorRgbMap.put("VIOLET", generateRgbString(238, 130, 238));
		colorRgbMap.put("MAGENTA", generateRgbString(255, 0, 255));
		colorRgbMap.put("FUCHSIA", generateRgbString(255, 0, 255));
		colorRgbMap.put("ORCHID", generateRgbString(218, 112, 214));
		colorRgbMap.put("MEDIUM_VIOLET_RED", generateRgbString(199, 21, 133));
		colorRgbMap.put("PALE_VIOLET_RED", generateRgbString(219, 112, 147));
		colorRgbMap.put("DEEP_PINK", generateRgbString(255, 20, 147));
		colorRgbMap.put("HOT_PINK", generateRgbString(255, 105, 180));
		colorRgbMap.put("LIGHT_PINK", generateRgbString(255, 182, 193));
		colorRgbMap.put("PINK", generateRgbString(255, 192, 203));
		colorRgbMap.put("ANTIQUE_WHITE", generateRgbString(250, 235, 215));
		colorRgbMap.put("BEIGE", generateRgbString(245, 245, 220));
		colorRgbMap.put("BISQUE", generateRgbString(255, 228, 196));
		colorRgbMap.put("BLANCHED_ALMOND", generateRgbString(255, 235, 205));
		colorRgbMap.put("WHEAT", generateRgbString(245, 222, 179));
		colorRgbMap.put("CORN_SILK", generateRgbString(255, 248, 220));
		colorRgbMap.put("LEMON_CHIFFON", generateRgbString(255, 250, 205));
		colorRgbMap.put("LIGHT_GOLDEN_ROD_YELLOW",
				generateRgbString(250, 250, 210));
		colorRgbMap.put("LIGHT_YELLOW", generateRgbString(255, 255, 224));
		colorRgbMap.put("SADDLE_BROWN", generateRgbString(139, 69, 19));
		colorRgbMap.put("SIENNA", generateRgbString(160, 82, 45));
		colorRgbMap.put("CHOCOLATE", generateRgbString(210, 105, 30));
		colorRgbMap.put("PERU", generateRgbString(205, 133, 63));
		colorRgbMap.put("SANDY_BROWN", generateRgbString(244, 164, 96));
		colorRgbMap.put("BURLY_WOOD", generateRgbString(222, 184, 135));
		colorRgbMap.put("TAN", generateRgbString(210, 180, 140));
		colorRgbMap.put("ROSY_BROWN", generateRgbString(188, 143, 143));
		colorRgbMap.put("MOCCASIN", generateRgbString(255, 228, 181));
		colorRgbMap.put("NAVAJO_WHITE", generateRgbString(255, 222, 173));
		colorRgbMap.put("PEACH_PUFF", generateRgbString(255, 218, 185));
		colorRgbMap.put("MISTY_ROSE", generateRgbString(255, 228, 225));
		colorRgbMap.put("LAVENDER_BLUSH", generateRgbString(255, 240, 245));
		colorRgbMap.put("LINEN", generateRgbString(250, 240, 230));
		colorRgbMap.put("OLD_LACE", generateRgbString(253, 245, 230));
		colorRgbMap.put("PAPAYA_WHIP", generateRgbString(255, 239, 213));
		colorRgbMap.put("SEA_SHELL", generateRgbString(255, 245, 238));
		colorRgbMap.put("MINT_CREAM", generateRgbString(245, 255, 250));
		colorRgbMap.put("SLATE_GRAY", generateRgbString(112, 128, 144));
		colorRgbMap.put("LIGHT_SLATE_GRAY", generateRgbString(119, 136, 153));
		colorRgbMap.put("LIGHT_STEEL_BLUE", generateRgbString(176, 196, 222));
		colorRgbMap.put("LAVENDER", generateRgbString(230, 230, 250));
		colorRgbMap.put("FLORAL_WHITE", generateRgbString(255, 250, 240));
		colorRgbMap.put("ALICE_BLUE", generateRgbString(240, 248, 255));
		colorRgbMap.put("GHOST_WHITE", generateRgbString(248, 248, 255));
		colorRgbMap.put("HONEYDEW", generateRgbString(240, 255, 240));
		colorRgbMap.put("IVORY", generateRgbString(255, 255, 240));
		colorRgbMap.put("AZURE", generateRgbString(240, 255, 255));
		colorRgbMap.put("SNOW", generateRgbString(255, 250, 250));
		colorRgbMap.put("BLACK", generateRgbString(0, 0, 0));
		colorRgbMap.put("DIM_GRAY", generateRgbString(105, 105, 105));
		colorRgbMap.put("GRAY", generateRgbString(128, 128, 128));
		colorRgbMap.put("DARK_GRAY", generateRgbString(169, 169, 169));
		colorRgbMap.put("SILVER", generateRgbString(192, 192, 192));
		colorRgbMap.put("LIGHT_GRAY", generateRgbString(211, 211, 211));
		colorRgbMap.put("GAINSBORO", generateRgbString(220, 220, 220));
		colorRgbMap.put("WHITE_SMOKE", generateRgbString(245, 245, 245));
		colorRgbMap.put("WHITE", generateRgbString(255, 255, 255));
	}

}
