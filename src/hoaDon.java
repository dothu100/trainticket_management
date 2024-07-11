
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thanh
 */
public class hoaDon implements Serializable{
    nguoiMuaVe nguoimua;
    veTau vt;
    private int soluong;
    private int soTienTra;

    public int getSoTienTra() {
        return soTienTra;
    }

    public void setSoTienTra(int soTienTra) {
        this.soTienTra = soTienTra;
    }

    public veTau getBt() {
        return vt;
    }

    public void setBt(veTau bt) {
        this.vt = bt;
    }

    public nguoiMuaVe getNguoimua() {
        return nguoimua;
    }

    public void setNguoimua(nguoiMuaVe nguoimua) {
        this.nguoimua = nguoimua;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public hoaDon(nguoiMuaVe nguoimua, veTau bt, int soluong) {
        this.nguoimua = nguoimua;
        this.vt = bt;
        this.soluong = soluong;
    }

    public hoaDon() {
    }
    public Object[] toarr()
    {
        return new Object[]{nguoimua.getMaNguoiMua(),nguoimua.getHoTen(),vt.getMaVe(),soluong};
    }
}
