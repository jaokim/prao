
import java.util.ArrayList;
import java.util.List;


public class Reproducer {
    static String[] arr = {"java", "duke", "luke", "owen", "turbin", "vermin", "hulk"};
    int doIt() { return 0; }
    public static void main(String ... args) {
        int counter = 0;
        List list = new ArrayList<Reproducer>();
        while (true) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j< 7; j++) {
                    final String value = new String(arr[i] + arr[j]);
                    Reproducer o = new Reproducer() {
                        int doIt() {
                            return new String(value.toString()).hashCode();
                        }
                    };
                    list.add(o);
                }
            }
            counter++;
            if ((counter % 10000) == 0) {
                list.clear();
                try { Thread.sleep(500); } catch(Exception e) {}
                System.out.println("Done "+counter + " rounds so far");
            }
        }
    }
}
