package fopnetbeans;


import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class PieChart extends JFrame {
    // public static String[] X_DATA;
    // public static int[] Y_DATA;

    public PieChart(String appTitle, String chartTitle) {
        PieDataset dataset = createDataset(KillRequest.X_DATA, KillRequest.Y_DATA);
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(chartPanel);        
    }
    
    public PieDataset createDataset(String[] X_DATA, String[] Y_DATA) {
        DefaultPieDataset result = new DefaultPieDataset();
        for (int i = 0; i < X_DATA.length; i++) {
            result.setValue(X_DATA[i], Integer.parseInt(Y_DATA[i]));
        }
        return result;
    }
    
    private JFreeChart createChart (PieDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, true, true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(0);      plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
    
}
