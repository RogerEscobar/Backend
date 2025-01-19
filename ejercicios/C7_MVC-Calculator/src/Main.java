import Controller.SumController;
import Model.SumModel;
import View.SumView;

public class Main {
    public static void main(String[] args) {
        SumModel model = new SumModel();
        SumController controller = new SumController(model);
        SumView view = new SumView();

        int numberOne = view.catchNumber();
        int numberTwo = view.catchNumber();
        int result = controller.controlSum(numberOne, numberTwo);
        view.showResult(result);
    }
}