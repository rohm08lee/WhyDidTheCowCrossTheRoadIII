import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("cowqueue.in"));
        PrintWriter pw = new PrintWriter("cowqueue.out");

        int N = sc.nextInt();
        int[] startTime = new int[N];
        HashMap<Integer, Integer> time = new HashMap<>();
        for (int i = 0; i < N; i++) {
            startTime[i] = sc.nextInt();
            time.put(startTime[i], sc.nextInt());
        }
        Arrays.sort(startTime);

        int curTime = 0;
        for (int i = 0; i < N; i++) {
            if (curTime < startTime[i]) {
                curTime = startTime[i];
            }
            curTime+=time.get(startTime[i]);
        }

        pw.println(curTime);
        pw.close();
    }
}
