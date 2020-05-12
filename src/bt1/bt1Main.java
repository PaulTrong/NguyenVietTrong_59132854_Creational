package bt1;

/**
 *
 * @author TRONG
 */
public class bt1Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder().setHeader( new HoaDonHeader("001", "11/05/2020", "Nguyen Viet Trong"))
        .addDSHD( new CTHD("Điện thoại", 2, 20000000, 1))
        .build();
        System.out.println(hd.toString());
    }
}
