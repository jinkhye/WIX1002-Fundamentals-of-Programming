package fop.assignment;

import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart extends JFrame {
    
    public static String[] Activity;
    public static String[][] multiarray = new String[24][];
    public static int[] Number;
    public static String[] Hour;

   public LineChart( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Hours","Number of Jobs",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset( ) {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      //value, type of activity, hour 

      
       for (int i = 0; i < Activity.length; i++) {
           dataset.addValue( Number[i] , Activity[i] , Hour[i] );
       }
      
      return dataset;
   }
   
   
}