import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MinMaxCalculation
{
    private static ArrayList<Double> data = new ArrayList<Double>();
    public static void main(String []args)
    {
        AddNumCtrl numCtrl = new AddNumCtrl();
        ResetCtrl resetCtrl = new ResetCtrl();
        AddNumView addnumview = new AddNumView();
        ResetView resetview = new ResetView();
        NumbersView numberview = new NumbersView();
        MaxView maxview = new MaxView();
        MinView minview = new MinView();
        Numbers num_model = new Numbers();

        numCtrl.addModel(num_model);
        resetCtrl.addModel(num_model);
        num_model.addObserver(addnumview);
        num_model.addObserver(resetview);
        num_model.addObserver(numberview);
        num_model.addObserver(maxview);
        num_model.addObserver(minview);
        addnumview.addController(numCtrl);
        resetview.addController(resetCtrl);
        

        JFrame jfMain = new JFrame("Min Max calculation");
        jfMain.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jfMain.setSize(1000,900);
        jfMain.setLocationRelativeTo(null);

        JPanel jpInput = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpInput.add(addnumview.show());
        jpInput.add(addnumview.getButton());

        JPanel jpMinMax = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpMinMax.add(new JLabel(minview.getName()));
        jpMinMax.add(minview.show());
        jpMinMax.add(new JLabel(maxview.getName()));
        jpMinMax.add(maxview.show());
        jfMain.getContentPane().add(jpMinMax, BorderLayout.CENTER);
        jfMain.getContentPane().add(numberview.show(), BorderLayout.SOUTH);
        jfMain.getContentPane().add(jpInput, BorderLayout.NORTH);
        jfMain.setVisible(true);

        
    }

    public static double minimum_calc(double ... numbers)
    {
        double min=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i]<min)
                min= numbers[i];
        }
        return min;
    }
    public static double maximum_calc(double ... numbers)
    {
        double max=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i]>max)
                max= numbers[i];
        }
        return max;
    }
    public static double[] getArrayDouble(ArrayList<Double> doubles) {
        double[] result = new double[doubles.size()];

        //O(n) iteration to convert result
        for (int i = 0 ; i < doubles.size(); i++) {
            result[i] = doubles.get(i);
        }

        return result;
    }



    
}