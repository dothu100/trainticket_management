
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thanh
 */
public class veTau implements Serializable{
    private String maVe,loaiGhe;
    private int donGia;

    public veTau() {
    }

    public veTau(String maVe, String loaiGhe, int donGia) {
        this.maVe = maVe;
        this.loaiGhe = loaiGhe;
        this.donGia = donGia;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getLoaiGhe() {
        return loaiGhe;
    }

    public void setLoaiGhe(String loaiGhe) {
        this.loaiGhe = loaiGhe;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final veTau other = (veTau) obj;
        if ((this.maVe == null) ? (other.maVe != null) : !this.maVe.equals(other.maVe)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.maVe != null ? this.maVe.hashCode() : 0);
        return hash;
    }
    public Object[] toArr()
    {
        return  new Object[]{maVe,loaiGhe,donGia};
        
    }
}
