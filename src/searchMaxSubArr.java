import java.util.List;

//by Anton Rossinevich
public class searchMaxSubArr {


    static List<Integer> searMSArray(List<Integer> inputList) {
        int maxSum = 0;
        int currentSum = 0;
        int leftInd = 0;
        int currentLeftInd = 0;
        int rightInd = -1;
        for (int i = 0; i < inputList.size(); i++) {
            int input = inputList.get(i);
            currentSum += input;
            if (currentSum > maxSum) {
                maxSum = currentSum;
                leftInd = currentLeftInd;
                rightInd = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                currentLeftInd = i + 1;
            }
        }
        return inputList.subList(leftInd, rightInd + 1);
    }
}
