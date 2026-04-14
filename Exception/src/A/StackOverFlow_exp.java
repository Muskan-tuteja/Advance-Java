package A;

public class StackOverFlow_exp {
	static void show() {
        show();   // calling itself again and again
    }

    public static void main(String[] args) {
        show();
        
        
        
        
        
    }

    
    
    
    
    
//Why this happens ? Method show() keeps calling itself repeatedly. There is no stopping condition. The call stack memory becomes full. So Java throws StackOverflowError. or StackOverflowError occurs when too many method calls fill the stack memory.







}
