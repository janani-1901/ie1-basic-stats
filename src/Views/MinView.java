
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import java.util.ArrayList;
public class MinView implements View {

double min;
JTextField min_field;
String name;
public MinView()
{
   
    min_field = new JTextField(5);
    min_field.setEditable(false);
    name = "Minimum";

};

@Override
public void update(ArrayList<Double> numbers)
{
    min = MinMaxCalculation.minimum_calc(MinMaxCalculation.getArrayDouble(numbers));
    min_field.setText("" + min);
}

@Override
public void reset()
{
    min_field.setText("");

}

@Override
public JTextComponent show()
{
    return min_field;
}

@Override
public String getName() 
{
		return name;
}

    
}
