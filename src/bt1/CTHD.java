package bt1;

/**
 *
 * @author TRONG
 */
public class CTHD {
    String sP; int sL, chietKhau; double donGia;

    public CTHD(String sP, int sL, double donGia, int chietKhau){
        this.sP = sP;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.sL = sL;
    }

    @Override
    public String toString() {
        return "Chi tiết{" + "Sản phẩm = " + sP + ", Số lượng = " + sL + ", Chiết khấu = " + chietKhau + ", Đơn giá = " + donGia + '}';
    }
    
}
