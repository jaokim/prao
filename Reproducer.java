
import java.util.ArrayList;


public class Reproducer {
    static String[] arr = {"java", "duke", "luke", "owen", "turbin", "vermin", "hulk"};
    int doIt() { return 0; }
    public static void main(String ... args) {
        int counter = 0;
        ArrayList list = new ArrayList();
        while (true) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j< 7; j++) {
                    final String value = new String(arr[i] + arr[j]);
                    Reproducer o = new Reproducer() {
                        int doIt() {
                            return new String(value.toString()).hashCode();
                        }
                    };
                    list.add((Object)o);
                    
                }
            }
            counter++;
            if ((counter % 10000) == 0) {
                list.clear();
                System.out.println("Done "+counter + " rounds so far");
            }
        }
    }
}