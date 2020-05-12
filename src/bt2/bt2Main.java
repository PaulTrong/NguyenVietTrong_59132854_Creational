package bt2;

/**
 *
 * @author TRONG
 */
public class bt2Main {
    public static void main(String[] args) {
        MyStringBuilder stb = new MyStringBuilder.Builder()
                .addString("Xin chao")
                .addfloat((float)1.75)
                .addBoolean(true)
                .build(); 
        System.out.println(stb.toString());
    }
}
