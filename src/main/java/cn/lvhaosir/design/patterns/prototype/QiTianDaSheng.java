package cn.lvhaosir.design.patterns.prototype;

import java.io.*;
import java.util.Date;

/**
 * <p>QiTianDaSHeng</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/23
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.weight;
        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return qiTianDaSheng;
    }

}
