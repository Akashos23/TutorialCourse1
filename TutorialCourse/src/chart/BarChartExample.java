
package chart;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JPanel;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarChartExample extends Application  {
	private ArrayList<Long> listeTimeExecutionIterativeReverse;
	private ArrayList<Long> listeTimeExecutionRecursivityReverse;
	
	public BarChartExample(ArrayList<Long> listeTimeExecutionIterativeReverse, ArrayList<Long> listeTimeExecutionRecursivityReverse) {
		this.listeTimeExecutionIterativeReverse = listeTimeExecutionIterativeReverse;
		this.listeTimeExecutionRecursivityReverse = listeTimeExecutionRecursivityReverse;
	}
	
	
	 @Override
	   public void start(Stage stage) {    
              
	      CategoryAxis xAxis = new CategoryAxis();  
	      xAxis.setCategories(FXCollections.<String>
	      observableArrayList(Arrays.asList("abc", "odd", "aujourd'hui")));
	      xAxis.setLabel("Word to reverse");
	       
	      NumberAxis yAxis = new NumberAxis();
	      yAxis.setLabel("time");
	     
	     
	      BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis); 
	      barChart.setTitle("Comparison between reverse string iterative VS recursivity");
	        
	      //Prepare XYChart.Series objects by setting data       
	      XYChart.Series<String, Number> series1 = new XYChart.Series<>();
	      series1.getData().add(new XYChart.Data<>("abc iterative : ", this.listeTimeExecutionIterativeReverse.get(0)));
	      series1.getData().add(new XYChart.Data<>("odd iterative : ", this.listeTimeExecutionIterativeReverse.get(1)));
	      series1.getData().add(new XYChart.Data<>("aujourd'hui iterative : ", this.listeTimeExecutionIterativeReverse.get(2)));

	        
	      XYChart.Series<String, Number> series2 = new XYChart.Series<>();
	      series2.getData().add(new XYChart.Data<>("abc recursive : ", this.listeTimeExecutionRecursivityReverse.get(0)));
	      series2.getData().add(new XYChart.Data<>("odd recursive : ",this.listeTimeExecutionRecursivityReverse.get(0) ));
	      series2.getData().add(new XYChart.Data<>("aujourd'hui recursive : ", this.listeTimeExecutionRecursivityReverse.get(0)));
	      
	              
	      //Setting the data to bar chart       
	      barChart.getData().addAll(series1, series2);
	        
	      //Creating a Group object 
	      Group root = new Group(barChart);
	        
	      //Creating a scene object
	      Scene scene = new Scene(root, 600, 400);

	      //Setting title to the Stage
	      stage.setTitle("Bar Chart");
	        
	      //Adding scene to the stage
	      stage.setScene(scene);
	        
	      //Displaying the contents of the stage
	      stage.show();        
	   }
}
