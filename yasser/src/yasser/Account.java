package yasser;


public class Account {
 private	String cardNumber ;
   private String Password ;
   private double CurrentBalance ;
   int transcount=0;
    public String getCardNumber() {
	return cardNumber;
}
    
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public double getCurrentBalance() {
	return CurrentBalance;
}
public void setCurrentBalance(double currentBalance) {
	CurrentBalance = currentBalance;
}

	String[] history=new String[5];
    
    
    public boolean Login (String cardNumber, String Password) {
    	
    	if(this.cardNumber.equals(cardNumber)&&this.Password.equals(Password))
    	{
    		return true;
    	}
    	return false;
    	
  
    }
    Account(String x,String y,double z)
    {
    	cardNumber=x;
    	Password=y;
    	CurrentBalance=z;
    }
public Account(String x, String y, int z) {
		cardNumber=x;
		Password=y;
		CurrentBalance=z;
	}

public boolean Withdraw (String y ) {
    	double x=Double.parseDouble(y);
  
    	if(x<CurrentBalance) {
    		CurrentBalance=CurrentBalance-x ;
    		for (int i=4;i>0;i--) {
       		 history[i]=history[i-1];
       	 }
    	 history[0]="the amount withdrawn $"+x+ " your current balance $"+CurrentBalance;
    	 transcount++;
    	 return true;
    	}
    	return false;
    }
    public String displayBalance () {
    	return Double.toString(CurrentBalance);
    }
    
    
    public void Deposit (String z) {
    	double x=Double.parseDouble(z);
         CurrentBalance=CurrentBalance+x;
    	 for (int i=4;i>0;i--) {
    		 history[i]=history[i-1];
    	 }
    	 history[0]="the amount of deposit $"+x+ " your current balance $"+CurrentBalance;   	
    	 transcount++;
    	}
    
    public String next () {
    	//Client.number++;
    	Client.number--;
    	if(Client.number<0) {
    		
    	
    		return("no more transactions");

    		
    	}
    	return history[Client.number];    
}
    
    public String previous () {
    	//Client.number--;
    	Client.number++;
    	if(Client.number>transcount-1||Client.number>4) {
    		return("no previous transactions");
    	}
    	if(Client.number<0) {
    		Client.number=0;
    		//System.out.println("Error");
    	}
    	return history[Client.number];    
    
}
}


