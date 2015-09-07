This is a Wrapper Class for Chart.js charting library for Java Web Projects.

Six types of Charts are covered

1. Line Charts
2. Bar Charts
3. Radar Charts
4. Polar Charts
5. Pie Charts
6. Doughnut Charts

## **CHARTS** ##

* All the type of charts are defined under package **com.algocircle.chartjs.charts**.
* **ChartJs** is an abstract class, all other Chart Classes extend this class. While instantiating object of any chart class, default options are set (chat.js documentation default options).
* **getChartDataSet()** returns a JSON with Data to be plotted with dataset options, which is given to the Chart.Js javascript as the First parameter in the HTML page.
* **getChartOptionSet()** returns the options to be used while plotting, eg. grid line colors, Axis labels, fonts etc. The output of this is given as second parameter to the chart js javascript function.
* **getOptions()** function is used to set get the options object and change any of the properties.

## **DATA** ##
* Each type of chart has different format for Data. All the DataSets are in package **com.algocircle.chartjs.data**.
* **DataSet** is an abstract class, and all other DataSet Classes extend it. **getDataset()** is the base function to be used to retrieve the dataset.
* Based on the type of chart used, dataset can be instantiated and options for the specific dataset can be set. e.g. color of particular dataset when multiple datasets are plotted in one graph.

## **OPTIONS** ##
* Each type of chart has different options defined under package **com.algocircle.chartjs.options**.
* **ChartJsOptions** is an abstract class, and all other Options Classes extend it. It has global options initialized to defaults, whcih can be changed later.
* Based on the type of chart used, option class can be instantiated.

## **COLORS** ##
* The colors are wrapped up into 2 classes viz. **ChartJsRgbaColor** and **ChartJsHexColor**. ChartJsColor is an abstract class, and the given two classes extend it.
* There are some Stored Colors which one can use to avoid technical aspects of r,g,b,a and hex colors. **Constructors** of both the class are **overloaded** to instantiate color object using stored colors (an Enum defined in ChartJsColor)

## Drawing Charts - PlayFramework (Scala) Example ##
* The object of chart.js can be passed and the javascript can be called with


```
#!javascript
//The canvas element has to be created where you want to plot the graph in html <canvas id="chartCanvasId"></canvas>
var ctxLine=document.getElementById("lineChartId").getContext("2d");
var lineChart = new Chart(ctxLine).Line(@Html(chartObj.getChartDataSet().toString()), @Html(chartObj.getChartOptionSet().toString());

var ctxBar=document.getElementById("barChartId").getContext("2d");
var barChart = new Chart(ctxBar).Bar(@Html(chartObj.getChartDataSet().toString()), @Html(chartObj.getChartOptionSet().toString());

var ctxRadar=document.getElementById("radarChartId").getContext("2d");
var radarChart = new Chart(ctxRadar).Bar(@Html(chartObj.getChartDataSet().toString()), @Html(chartObj.getChartOptionSet().toString());

var ctxPolar=document.getElementById("polarChartId").getContext("2d");
var polarChart = new Chart(ctxPolar).Bar(@Html(chartObj.getChartDataSet().toString()), @Html(chartObj.getChartOptionSet().toString());

var ctxPie=document.getElementById("pieChartId").getContext("2d");
var pieChart = new Chart(ctxPie).Bar(@Html(chartObj.getChartDataSet().toString()), @Html(chartObj.getChartOptionSet().toString());

var ctxDoughnut=document.getElementById("doughnutChartId").getContext("2d");
var doughnutChart = new Chart(ctxDoughnut).Bar(@Html(chartObj.getChartDataSet().toString()), @Html(chartObj.getChartOptionSet().toString());


```

```
#!java

List<String> xAxisLabels = new ArrayList<String>();
			xAxisLabels.add("one");
			xAxisLabels.add("three");
			xAxisLabels.add("two");
			xAxisLabels.add("five");
			xAxisLabels.add("four");
			List<Double> plottingPoints = new ArrayList<Double>();
			plottingPoints.add(100.0);
			plottingPoints.add(300.0);
			plottingPoints.add(200.0);
			plottingPoints.add(500.0);
			plottingPoints.add(400.0);

                        //Line Chart
			LineDataSet lds = new LineDataSet(plottingPoints);
			// various properties of dataset can be changed, default would be
			// used otherwise
			lds.setLabel("New Label");
			ChartJsLine chartLine = new ChartJsLine(xAxisLabels, lds);
			// Various Properties can be set for Chart, default would be used
			// otherwise
			chartLine.getOptions().setBezierCurveTension(0.4);
			chartLine.getOptions().setPointHitDetectionRadius(8.0);

                        //Bar Chart
			BarDataSet bds = new BarDataSet(plottingPoints);
			// various properties of dataset can be changed, default would be
			// used otherwise
			bds.setLabel("barChart Label");
			bds.setFillColor(new ChartJsRgbaColor(StoredColors.LIGHT_BLUE));
			ChartJsBar chartBar = new ChartJsBar(xAxisLabels, bds);
			// Various Properties can be set for Chart, default would be used
			// otherwise
			chartBar.getOptions().setBarStrokeWidth(5.0);
                        
                        //Radar Chart
			RadarDataSet rds = new RadarDataSet(plottingPoints);
			// various properties of dataset can be changed, default would be
			// used otherwise
			rds.setLabel("Radarlabel");
			ChartJsRadar chartRadar = new ChartJsRadar(xAxisLabels, rds);
			// Various Properties can be set for Chart, default would be used
			// otherwise
			chartRadar.getOptions().setAnimationSteps(20);

                        //Polar Chart
			PolarDataSet pds = new PolarDataSet(
					"Three", 3.0,
					new ChartJsHexColor(StoredColors.CHOCOLATE),
					new ChartJsHexColor(StoredColors.LIGHT_BLUE));
			// various properties of dataset can be changed, default would be
			// used otherwise
			pds.setLabel("New Label");
			ChartJsPolar chartPolar = new ChartJsPolar(pds);
			// Directly adding new datasets with default properties
			chartPolar.addDataSet(new PolarDataSet("Two", 2.0,
					new ChartJsHexColor(StoredColors.DARK_BLUE),
					new ChartJsHexColor(StoredColors.BLUE)));
			chartPolar.addDataSet(new PolarDataSet("Two", 15.0,
					new ChartJsHexColor(StoredColors.YELLOW_GREEN),
					new ChartJsHexColor(StoredColors.LIGHT_BLUE)));
			// Various Properties can be set for Chart, default would be used
			// otherwise
			chartPolar.getOptions().setAnimateScale(true);

                        //Pie Chart
			ChartJsPieDoughnut chartPie = new ChartJsPieDoughnut(
					new PieDoughnutDataSet("Two",
							2.0, new ChartJsHexColor(StoredColors.CHOCOLATE),
							new ChartJsHexColor(StoredColors.LIGHT_BLUE)));
			chartPie.addDataSet(new PieDoughnutDataSet("Five", 5.0,
					new ChartJsHexColor(StoredColors.DARK_BLUE),
					new ChartJsHexColor(StoredColors.BLUE)));
			chartPie.addDataSet(new PieDoughnutDataSet("Fifteen", 15.0,
					new ChartJsHexColor(StoredColors.YELLOW_GREEN),
					new ChartJsHexColor(StoredColors.LIGHT_BLUE)));
			// This needs to be set to 0 for Pie else it will become doughnut
			chartPie.getOptions().setPercentageInnerCutout(0.0);
                       
                        //Doughnut Chart
			ChartJsPieDoughnut chartDoughnut = new ChartJsPieDoughnut(
					new PieDoughnutDataSet("Two",
							2.0, new ChartJsHexColor(StoredColors.CHOCOLATE),
							new ChartJsHexColor(StoredColors.LIGHT_BLUE)));
			chartDoughnut.addDataSet(new PieDoughnutDataSet("Five", 5.0,
					new ChartJsHexColor(StoredColors.DARK_BLUE),
					new ChartJsHexColor(StoredColors.BLUE)));
			chartDoughnut.addDataSet(new PieDoughnutDataSet("Fifteen", 15.0,
					new ChartJsHexColor(StoredColors.YELLOW_GREEN),
					new ChartJsHexColor(StoredColors.LIGHT_BLUE)));
			chartDoughnut.getOptions().setPercentageInnerCutout(30.0);



```
