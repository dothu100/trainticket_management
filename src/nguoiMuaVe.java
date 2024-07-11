
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thanh
 */
public class nguoiMuaVe implements Serializable{
    private String hoTen,diaChi,maNguoiMua,nhomNguoiMua;

    public nguoiMuaVe() {
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNguoiMua() {
        return maNguoiMua;
    }

    public void setMaNguoiMua(String maNguoiMua) {
        this.maNguoiMua = maNguoiMua;
    }

    public String getNhomNguoiMua() {
        return nhomNguoiMua;
    }

    public void setNhomNguoiMua(String nhomNguoiMua) {
        this.nhomNguoiMua = nhomNguoiMua;
    }

    public nguoiMuaVe(String hoTen, String diaChi, String maNguoiMua, String nhomNguoiMua) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.maNguoiMua = maNguoiMua;
        this.nhomNguoiMua = nhomNguoiMua;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final nguoiMuaVe other = (nguoiMuaVe) obj;
        if ((this.maNguoiMua == null) ? (other.maNguoiMua != null) : !this.maNguoiMua.equals(other.maNguoiMua)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.maNguoiMua != null ? this.maNguoiMua.hashCode() : 0);
        return hash;
    }
    
    public Object[] toArr()
    {
        return new Object[]{maNguoiMua,hoTen,diaChi,nhomNguoiMua};
    }
}
