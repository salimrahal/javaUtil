package lambdas;
import com.sun.glass.ui.Window.State;
/*
 *Functional programming 
 * http://tutorials.jenkov.com/java/lambda-expressions.html

 */
	
public class StateOwner {

	public void addStateListener(StateChangeListener listener) {
		System.out.println("addStateListener...");
	}

	public static void main(String args[]) {
		System.out.println("main...");
		StateOwner stateOwner = new StateOwner();
        
		//anonymous function style
		stateOwner.addStateListener(new StateChangeListener() {

		    public void onStateChange(State oldState, State newState) {
		        // do something with the old and new state.
		    	System.out.println("main...onStateChange");
		    }
		});
		
		// lambda expression: passing a function as param / Functional programming 
		stateOwner.addStateListener( 
				(oldStateParam, newStateparam) -> System.out.println("lambda...onStateChange")
				);
	}
}
