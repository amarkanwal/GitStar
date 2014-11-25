import javax.swing.*;
import java.text.NumberFormat;
public class PayCheck {

	public static void main (String[] args)
	{
		String numHours, numPay;
		int hours;
		int pay;
		double total;
	
			numHours=JOptionPane.showInputDialog("Enter hours worked:");	
			numPay=JOptionPane.showInputDialog("Enter rate of pay:");
			
			hours = Integer.parseInt(numHours);
			pay = Integer.parseInt(numPay);
				
			NumberFormat money = NumberFormat.getCurrencyInstance();
		
			if(hours>40)
			{
			total= (pay*40)+(hours-40)*(1.5*pay);	
			JOptionPane.showMessageDialog(null,"You made: " + money.format(total));
			}	
			
			else
			{
				total = hours*pay;
				JOptionPane.showMessageDialog(null,"You made: " + money.format(total));
			}
		
	}		
}	
