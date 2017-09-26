import java.util.ArrayList;
import java.util.List;
//by Anton Rossinevich
public class searchMaxSubArr {
    static int maxSum = 0;
    static int currentSum = 0;

    static List<Integer> searMSArray(List<Integer> inputList) {
        List<Integer> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            current.add(inputList.get(i));
            currentSum += inputList.get(i);
            if (currentSum > maxSum) {
                res.clear();
                res.addAll(current);
                maxSum = currentSum;
            } else if (currentSum < 0) {
                current.clear();
                currentSum = 0;
            }
        }
        return res;
    }
}
