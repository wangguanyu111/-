package Android.service;

import Android.mapper.IShop;
import Android.pojo.Shop;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private SqlSession session = null;
    public List<Shop> findAll() throws IOException {
        InputStream ins;
            ins = Resources.getResourceAsStream("Mybatis-Config.xml");
            //使用Mybatis的连接工厂SqlSessionFactory
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
            //获取数据库的连接SqlSession
            session = factory.openSession();
        ArrayList<Shop> ss=new ArrayList<Shop>();
        if (session != null) {
            IShop shopDap = session.getMapper(IShop.class);
//接口操作和mapper文件绑定
            List<Shop> list = shopDap.selectALL();
            ss.addAll(list);
        }
        if (session != null) {
            session.close();
        }
        return ss;
    }
}
