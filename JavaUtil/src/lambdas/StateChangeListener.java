package lambdas;

import com.sun.glass.ui.Window.State;

public interface StateChangeListener {
    public void onStateChange(State oldState,  State newState);
}

