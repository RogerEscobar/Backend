package Controller;

import Model.SumModel;

public class SumController {
    private SumModel model;
    public SumController (SumModel model){
        this.model = model;
    }
    public int controlSum(int a, int b){
        return model.add(a,b);
    }
}
