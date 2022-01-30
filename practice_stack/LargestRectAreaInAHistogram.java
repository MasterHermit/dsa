import java.util.*;

public class LargestRectAreaInAHistogram {
    public static int LargestRectArea3(int[] hist) {
        Stack<Integer> s = new Stack<>();
        int len = hist.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            while (!s.isEmpty() && hist[i] <= hist[s.peek()]) {
                int popElementIndex = s.pop();
                int sum = hist[popElementIndex] * (s.isEmpty() ? i : (i - s.peek() - 1));
                res = Math.max(res, sum);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            int popElementIndex = s.pop();
            int sum = hist[popElementIndex] * (s.isEmpty() ? len : (len - s.peek() - 1));
            res = Math.max(res, sum);
        }

        return res;

    }

    public static int LargestRectArea2(int[] hist) {
        Stack<Integer> stack = new Stack<Integer>();
        int len = hist.length;
        int[] ll = new int[hist.length];
        int[] rl = new int[len];
        stack.push(0);
        ll[0] = -1;
        for (int i = 1; i < len; i++) {
            while (!stack.isEmpty() && hist[i] <= hist[stack.peek()]) {
                stack.pop();

            }
            ll[i] = (stack.isEmpty()) ? -1 : stack.peek();
            stack.push(i);

        }
        stack.clear();
        stack.push(len - 1);
        rl[len - 1] = len;
        for (int i = len - 2; i >= 0; i--) {
            while (!stack.isEmpty() && hist[i] <= hist[stack.peek()]) {
                stack.pop();

            }
            rl[i] = (stack.isEmpty()) ? len : stack.peek();
            stack.push(i);

        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            int sum = hist[i];
            sum += (i - ll[i] - 1) * hist[i];
            sum += (rl[i] - i - 1) * hist[i];

            res = Math.max(res, sum);

        }
        return res;

    }

    public static int LargestRectArea(int[] hist) {
        int len = hist.length;
        int area = 0;
        for (int i = 0; i < len; i++) {
            int sum = hist[i];

            for (int j = i - 1; j >= 0; j--) {
                if (hist[j] > hist[i])
                    sum += hist[i];
                else
                    break;
            }
            for (int j = i + 1; j < len; j++) {
                if (hist[j] > hist[i])
                    sum += hist[i];
                else
                    break;
            }
            area = Math.max(area, sum);
        }
        return area;
    }

    public static void main(String[] args) {
        int[] hist = { 6, 2, 5, 4, 1, 5, 6 };
        int area = LargestRectArea(hist);// O(n*2);
        int area2 = LargestRectArea2(hist);
        int area3 = LargestRectArea3(hist);
        System.out.println(area + " " + area2 + " " + area3);
    }
}