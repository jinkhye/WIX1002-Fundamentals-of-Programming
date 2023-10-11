package fop.assignment;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 

public class BarChart_AWT extends JFrame {

    public BarChart_AWT( String applicationTitle , String chartTitle, String category) {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Category",            
         "Score",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
        
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel );
      
//      JFrame frame = new JFrame("Many charts same frame");
//      frame.setLayout( new FlowLayout() );
//      JFreeChart barChart1 =
//        ChartFactory.createBarChart("Histogram1","", "", createDataset(),
//            PlotOrientation.VERTICAL, true, true, false);
//
//        frame.getContentPane().add(new ChartPanel(barChart1));
//
//        JFreeChart barChart2 = 
//        ChartFactory.createBarChart("Histogram2","", "", createDataset(),
//            PlotOrientation.VERTICAL, true, true, false);
//
//        frame.getContentPane().add(new ChartPanel(barChart2));
//
//        frame.pack();
//
//        frame.setVisible(true);
   }
   
   private CategoryDataset createDataset( ) {
       
      String users = "User";
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  
       for (int i = 0; i < FOPAssignment.X_DATA.length; i++) {
           dataset.addValue(FOPAssignment.Y_DATA[i], FOPAssignment.X_DATA[i], users);
       }
       
      return dataset; 
   }
   
   

    
}