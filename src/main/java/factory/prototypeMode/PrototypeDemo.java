package factory.prototypeMode;

import java.io.*;
import java.util.List;

/**
 * @Author: Liam
 * @Date: 8/17/2022 2:38 PM
 */
public class PrototypeDemo implements Cloneable, Serializable {
    private Long num;
    private List<Object> list;

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    @Override
    protected Object clone(){
        PrototypeDemo prototypeDemo = null;
        try {
            ByteArrayOutputStream bas = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bas);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bas.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            prototypeDemo = (PrototypeDemo) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return prototypeDemo;
    }
}
