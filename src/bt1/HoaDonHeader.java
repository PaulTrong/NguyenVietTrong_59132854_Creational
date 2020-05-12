package bt1;

/**
 *
 * @author TRONG
 */
public class HoaDonHeader {
    String mHD, ngayBan, tenKH;

    public HoaDonHeader(String mHD, String ngayBan, String tenKH) {
        this.mHD = mHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "Hóa Đơn{" + "Mã = " + mHD + ", Ngày bán = " + ngayBan + ", Tên khách hàng = " + tenKH + '}';
    }       
}
