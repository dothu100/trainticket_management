
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thanh
 */
public class io {
    private File f1 =new File("NGUOIMUA.DAT");
    private File f2 =new File("VE.DAT");
    private File f3 =new File("HOADON.DAT");
    
    public void ghinguoimua(ArrayList<nguoiMuaVe> list){
        try{ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
        oos.writeObject(list);
        oos.close();}
        catch(Exception e ){}
    }
    
    public ArrayList<nguoiMuaVe> docnguoimua() throws IOException, ClassNotFoundException
    {
        if(!f1.exists()) return new ArrayList<nguoiMuaVe>();
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream(f1));
        return (ArrayList<nguoiMuaVe>)ois.readObject();
    }
    
    public void ghive(ArrayList<veTau> list){
        try{ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f2));
        oos.writeObject(list);
        oos.close();}
        catch(Exception e ){}
    }
    
    public ArrayList<veTau> docve() throws IOException, ClassNotFoundException
    {
        if(!f2.exists()) return new ArrayList<veTau>();
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream(f2));
        return (ArrayList<veTau>)ois.readObject();
    }
    
    public void ghihoadon(ArrayList<hoaDon> list){
        try{ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f3));
        oos.writeObject(list);
        oos.close();}
        catch(Exception e ){}
    }
    
    public ArrayList<hoaDon> dochd() throws IOException, ClassNotFoundException
    {
        if(!f3.exists()) return new ArrayList<hoaDon>();
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream(f3));
        return (ArrayList<hoaDon>)ois.readObject();
    }
}
