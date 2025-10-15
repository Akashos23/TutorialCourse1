
package chart;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JPanel;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarChartReverseWord extends Application  {
	public static String title;
	public static String label;
	public static String NameSerie1;
	public static String NameSerie2;
	public static ArrayList<String> name;
	public static ArrayList<Long> listeTimeExecutionRecursivityReverse;
    public static ArrayList<Long> listeTimeExecutionIterativeReverse;

	
	 @Override
	 public void start(Stage stage) {    
	      CategoryAxis xAxis = new CategoryAxis();  
	      
	      xAxis.setCategories(FXCollections.<String>
	      observableArrayList(name));
	      
	      xAxis.setLabel(label);
	       
	      NumberAxis yAxis = new NumberAxis();
	      yAxis.setLabel("time");
	     
	     
	      BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis); 
	      barChart.setTitle(title);
       
	      XYChart.Series<String, Number> series1 = new XYChart.Series<>();
	      series1.setName(NameSerie1);
	      for(int i = 0; i < listeTimeExecutionIterativeReverse.size(); i++) {
	    	  series1.getData().add(new XYChart.Data<>(name.get(i), this.listeTimeExecutionIterativeReverse.get(i)));
	      }

	      XYChart.Series<String, Number> series2 = new XYChart.Series<>();
	      series2.setName(NameSerie2);
	      for(int i = 0; i < listeTimeExecutionRecursivityReverse.size(); i++) {
	    	  series2.getData().add(new XYChart.Data<>(name.get(i), this.listeTimeExecutionRecursivityReverse.get(i)));
	      }
	           
	      barChart.getData().addAll(series1, series2);
	        

	      Group root = new Group(barChart);

	      Scene scene = new Scene(root, 600, 400);

	      stage.setTitle("Bar Chart");

	      stage.setScene(scene);

	      stage.show();        
	   }
}
