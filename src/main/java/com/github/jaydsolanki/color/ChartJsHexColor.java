package com.github.jaydsolanki.color;

import java.util.HashMap;
import java.util.Map;

public class ChartJsHexColor extends ChartJsColor {

	public static Map<String, String> colorHexMap = new HashMap<String, String>();

	static {
		initHexColors();
	}

	public ChartJsHexColor(String hexColorValue) {
		this.colorValue = hexColorValue;
	}

	public ChartJsHexColor(StoredColors storedColor) {
		this.colorValue = colorHexMap.get(storedColor.toString());
	}

	public static void initHexColors() {
		colorHexMap.put("MAROON", "#800000");
		colorHexMap.put("DARK_RED", "#8B0000");
		colorHexMap.put("BROWN", "#A52A2A");
		colorHexMap.put("FIREBRICK", "#B22222");
		colorHexMap.put("CRIMSON", "#DC143C");
		colorHexMap.put("RED", "#FF0000");
		colorHexMap.put("TOMATO", "#FF6347");
		colorHexMap.put("CORAL", "#FF7F50");
		colorHexMap.put("INDIAN_RED", "#CD5C5C");
		colorHexMap.put("LIGHT_CORAL", "#F08080");
		colorHexMap.put("DARK_SALMON", "#E9967A");
		colorHexMap.put("SALMON", "#FA8072");
		colorHexMap.put("LIGHT_SALMON", "#FFA07A");
		colorHexMap.put("ORANGE_RED", "#FF4500");
		colorHexMap.put("DARK_ORANGE", "#FF8C00");
		colorHexMap.put("ORANGE", "#FFA500");
		colorHexMap.put("GOLD", "#FFD700");
		colorHexMap.put("DARK_GOLDEN_ROD", "#B8860B");
		colorHexMap.put("GOLDEN_ROD", "#DAA520");
		colorHexMap.put("PALE_GOLDEN_ROD", "#EEE8AA");
		colorHexMap.put("DARK_KHAKI", "#BDB76B");
		colorHexMap.put("KHAKI", "#F0E68C");
		colorHexMap.put("OLIVE", "#808000");
		colorHexMap.put("YELLOW", "#FFFF00");
		colorHexMap.put("YELLOW_GREEN", "#9ACD32");
		colorHexMap.put("DARK_OLIVE_GREEN", "#556B2F");
		colorHexMap.put("OLIVE_DRAB", "#6B8E23");
		colorHexMap.put("LAWN_GREEN", "#7CFC00");
		colorHexMap.put("CHART_REUSE", "#7FFF00");
		colorHexMap.put("GREEN_YELLOW", "#ADFF2F");
		colorHexMap.put("DARK_GREEN", "#006400");
		colorHexMap.put("GREEN", "#008000");
		colorHexMap.put("FOREST_GREEN", "#228B22");
		colorHexMap.put("LIME", "#00FF00");
		colorHexMap.put("LIME_GREEN", "#32CD32");
		colorHexMap.put("LIGHT_GREEN", "#90EE90");
		colorHexMap.put("PALE_GREEN", "#98FB98");
		colorHexMap.put("DARK_SEA_GREEN", "#8FBC8F");
		colorHexMap.put("MEDIUM_SPRING_GREEN", "#00FA9A");
		colorHexMap.put("SPRING_GREEN", "#00FF7F");
		colorHexMap.put("SEA_GREEN", "#2E8B57");
		colorHexMap.put("MEDIUM_AQUA_MARINE", "#66CDAA");
		colorHexMap.put("MEDIUM_SEA_GREEN", "#3CB371");
		colorHexMap.put("LIGHT_SEA_GREEN", "#20B2AA");
		colorHexMap.put("DARK_SLATE_GRAY", "#2F4F4F");
		colorHexMap.put("TEAL", "#008080");
		colorHexMap.put("DARK_CYAN", "#008B8B");
		colorHexMap.put("AQUA", "#00FFFF");
		colorHexMap.put("CYAN", "#00FFFF");
		colorHexMap.put("LIGHT_CYAN", "#E0FFFF");
		colorHexMap.put("DARK_TURQUOISE", "#00CED1");
		colorHexMap.put("TURQUOISE", "#40E0D0");
		colorHexMap.put("MEDIUM_TURQUOISE", "#48D1CC");
		colorHexMap.put("PALE_TURQUOISE", "#AFEEEE");
		colorHexMap.put("AQUA_MARINE", "#7FFFD4");
		colorHexMap.put("POWDER_BLUE", "#B0E0E6");
		colorHexMap.put("CADET_BLUE", "#5F9EA0");
		colorHexMap.put("STEEL_BLUE", "#4682B4");
		colorHexMap.put("CORN_FLOWER_BLUE", "#6495ED");
		colorHexMap.put("DEEP_SKY_BLUE", "#00BFFF");
		colorHexMap.put("DODGER_BLUE", "#1E90FF");
		colorHexMap.put("LIGHT_BLUE", "#ADD8E6");
		colorHexMap.put("SKY_BLUE", "#87CEEB");
		colorHexMap.put("LIGHT_SKY_BLUE", "#87CEFA");
		colorHexMap.put("MIDNIGHT_BLUE", "#191970");
		colorHexMap.put("NAVY", "#000080");
		colorHexMap.put("DARK_BLUE", "#00008B");
		colorHexMap.put("MEDIUM_BLUE", "#0000CD");
		colorHexMap.put("BLUE", "#0000FF");
		colorHexMap.put("ROYAL_BLUE", "#4169E1");
		colorHexMap.put("BLUE_VIOLET", "#8A2BE2");
		colorHexMap.put("INDIGO", "#4B0082");
		colorHexMap.put("DARK_SLATE_BLUE", "#483D8B");
		colorHexMap.put("SLATE_BLUE", "#6A5ACD");
		colorHexMap.put("MEDIUM_SLATE_BLUE", "#7B68EE");
		colorHexMap.put("MEDIUM_PURPLE", "#9370DB");
		colorHexMap.put("DARK_MAGENTA", "#8B008B");
		colorHexMap.put("DARK_VIOLET", "#9400D3");
		colorHexMap.put("DARK_ORCHID", "#9932CC");
		colorHexMap.put("MEDIUM_ORCHID", "#BA55D3");
		colorHexMap.put("PURPLE", "#800080");
		colorHexMap.put("THISTLE", "#D8BFD8");
		colorHexMap.put("PLUM", "#DDA0DD");
		colorHexMap.put("VIOLET", "#EE82EE");
		colorHexMap.put("MAGENTA", "#FF00FF");
		colorHexMap.put("FUCHSIA", "#FF00FF");
		colorHexMap.put("ORCHID", "#DA70D6");
		colorHexMap.put("MEDIUM_VIOLET_RED", "#C71585");
		colorHexMap.put("PALE_VIOLET_RED", "#DB7093");
		colorHexMap.put("DEEP_PINK", "#FF1493");
		colorHexMap.put("HOT_PINK", "#FF69B4");
		colorHexMap.put("LIGHT_PINK", "#FFB6C1");
		colorHexMap.put("PINK", "#FFC0CB");
		colorHexMap.put("ANTIQUE_WHITE", "#FAEBD7");
		colorHexMap.put("BEIGE", "#F5F5DC");
		colorHexMap.put("BISQUE", "#FFE4C4");
		colorHexMap.put("BLANCHED_ALMOND", "#FFEBCD");
		colorHexMap.put("WHEAT", "#F5DEB3");
		colorHexMap.put("CORN_SILK", "#FFF8DC");
		colorHexMap.put("LEMON_CHIFFON", "#FFFACD");
		colorHexMap.put("LIGHT_GOLDEN_ROD_YELLOW", "#FAFAD2");
		colorHexMap.put("LIGHT_YELLOW", "#FFFFE0");
		colorHexMap.put("SADDLE_BROWN", "#8B4513");
		colorHexMap.put("SIENNA", "#A0522D");
		colorHexMap.put("CHOCOLATE", "#D2691E");
		colorHexMap.put("PERU", "#CD853F");
		colorHexMap.put("SANDY_BROWN", "#F4A460");
		colorHexMap.put("BURLY_WOOD", "#DEB887");
		colorHexMap.put("TAN", "#D2B48C");
		colorHexMap.put("ROSY_BROWN", "#BC8F8F");
		colorHexMap.put("MOCCASIN", "#FFE4B5");
		colorHexMap.put("NAVAJO_WHITE", "#FFDEAD");
		colorHexMap.put("PEACH_PUFF", "#FFDAB9");
		colorHexMap.put("MISTY_ROSE", "#FFE4E1");
		colorHexMap.put("LAVENDER_BLUSH", "#FFF0F5");
		colorHexMap.put("LINEN", "#FAF0E6");
		colorHexMap.put("OLD_LACE", "#FDF5E6");
		colorHexMap.put("PAPAYA_WHIP", "#FFEFD5");
		colorHexMap.put("SEA_SHELL", "#FFF5EE");
		colorHexMap.put("MINT_CREAM", "#F5FFFA");
		colorHexMap.put("SLATE_GRAY", "#708090");
		colorHexMap.put("LIGHT_SLATE_GRAY", "#778899");
		colorHexMap.put("LIGHT_STEEL_BLUE", "#B0C4DE");
		colorHexMap.put("LAVENDER", "#E6E6FA");
		colorHexMap.put("FLORAL_WHITE", "#FFFAF0");
		colorHexMap.put("ALICE_BLUE", "#F0F8FF");
		colorHexMap.put("GHOST_WHITE", "#F8F8FF");
		colorHexMap.put("HONEYDEW", "#F0FFF0");
		colorHexMap.put("IVORY", "#FFFFF0");
		colorHexMap.put("AZURE", "#F0FFFF");
		colorHexMap.put("SNOW", "#FFFAFA");
		colorHexMap.put("BLACK", "#000000");
		colorHexMap.put("DIM_GRAY", "#696969");
		colorHexMap.put("GRAY", "#808080");
		colorHexMap.put("DARK_GRAY", "#A9A9A9");
		colorHexMap.put("SILVER", "#C0C0C0");
		colorHexMap.put("LIGHT_GRAY_GREY", "#D3D3D3");
		colorHexMap.put("GAINSBORO", "#DCDCDC");
		colorHexMap.put("WHITE_SMOKE", "#F5F5F5");
		colorHexMap.put("WHITE", "#FFFFFF");
	}

}
