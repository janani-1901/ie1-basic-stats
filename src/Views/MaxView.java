import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
public class MaxView implements View {

double max;
JTextField max_field;
String name;
public MaxView()
{
   
    max_field = new JTextField(5);
    max_field.setEditable(false);
    name = "Maximum";

};

@Override
public void update(ArrayList<Double> numbers)
{
    max = MinMaxCalculation.maximum_calc(MinMaxCalculation.getArrayDouble(numbers));
    max_field.setText(""+ max);
}

@Override
public void reset()
{
    max_field.setText("");

}

@Override
public JTextComponent show()
{
    return max_field;
}

@Override
public String getName() 
{
		return name;
}

    
}
