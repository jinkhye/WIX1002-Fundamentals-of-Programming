package fop.assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;

public class BoxAndWhiskerDemo {

    private static final int COLS = 20;
    private static final int VISIBLE = 4;
    private static final int ROWS = 5;
    private static final int VALUES = 10;
    private static final Random rnd = new Random();
    private List<String> columns;
    private List<List<List<Double>>> data;
    private DefaultBoxAndWhiskerCategoryDataset dataset;
    private CategoryPlot plot;
    private ChartPanel chartPanel;
    private JPanel controlPanel;
    private int start = 0;

    public BoxAndWhiskerDemo() {
        createDataset();
        createChartPanel();
        createControlPanel();
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
    
    

    private void createChartPanel() {
        CategoryAxis xAxis = new CategoryAxis("Category");
        NumberAxis yAxis = new NumberAxis("Value");
        BoxAndWhiskerRenderer renderer = new BoxAndWhiskerRenderer();
        plot = new CategoryPlot(dataset, xAxis, yAxis, renderer);
        JFreeChart chart = new JFreeChart("BoxAndWhiskerDemo", plot);
        chartPanel = new ChartPanel(chart);
    }

    private void createControlPanel() {
        controlPanel = new JPanel();
        controlPanel.add(new JButton(new AbstractAction("\u22b2Prev") {

            @Override
            public void actionPerformed(ActionEvent e) {
                start -= VISIBLE;
                if (start < 0) {
                    start = 0;
                    return;
                }
                createDataset();
                plot.setDataset(dataset);
            }
        }));
        controlPanel.add(new JButton(new AbstractAction("Next\u22b3") {

            @Override
            public void actionPerformed(ActionEvent e) {
                start += VISIBLE;
                if (start > COLS - VISIBLE) {
                    start = COLS - VISIBLE;
                    return;
                }
                createDataset();
                plot.setDataset(dataset);
            }
        }));
    }

    public ChartPanel getChartPanel() {
        return chartPanel;
    }

    public JPanel getControlPanel() {
        return controlPanel;
    }

//    public static void main(String[] args) throws IOException {
//        EventQueue.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//                JFrame frame = new JFrame();
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                BoxAndWhiskerDemo demo = new BoxAndWhiskerDemo();
//                frame.add(demo.getChartPanel(), BorderLayout.CENTER);
//                frame.add(demo.getControlPanel(), BorderLayout.SOUTH);
//                frame.pack();
//                frame.setLocationRelativeTo(null);
//                frame.setVisible(true);
//            }
//        });
//    }
}