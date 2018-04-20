package device_management;

import behaviours.IInput;

public class Mouse extends Component implements IInput {


    public Mouse(String make, String model){
        super(make, model);
    }

    public int clickLeftButton(){
        return 1;
    }

    public int clickRightButton(){
        return 2;
    }

    public String sendData(String data){
        return "Mouse sends data: " + data;
    }


}
