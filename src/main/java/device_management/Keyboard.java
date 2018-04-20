package device_management;

import behaviours.IInput;

public class Keyboard extends Component implements IInput {

    public Keyboard(String make, String model){
        super(make, model);
    }

    public String sendData(String data) {
        return "Keyboard sends data: " + data;
    }
}
