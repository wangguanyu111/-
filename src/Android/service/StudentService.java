package Android.service;

import Android.mapper.IShop;
import Android.mapper.IStudent;
import Android.pojo.Shop;
import Android.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private SqlSession session = null;
    public List<Student> findAll(Student student) throws IOException {
        InputStream ins;
        ins = Resources.getResourceAsStream("Mybatis-Config.xml");
        //使用Mybatis的连接工厂SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
        //获取数据库的连接SqlSession
        session = factory.openSession();
        ArrayList<Student> ss=new ArrayList<Student>();
        if (session != null) {
            IStudent studentDao = session.getMapper(IStudent.class);
//接口操作和mapper文件绑定
            List<Student> list = studentDao.selectALL(student);
            ss.addAll(list);
        }
        if (session != null) {
            session.close();
        }
        return ss;
    }
    public void Add(Student student) throws IOException {
        InputStream ins;
        ins = Resources.getResourceAsStream("Mybatis-Config.xml");
        //使用Mybatis的连接工厂SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
        //获取数据库的连接SqlSession
        session = factory.openSession();
        if (session != null) {
            IStudent studentDao = session.getMapper(IStudent.class);
//接口操作和mapper文件绑定
            studentDao.Insert(student);

        }
        if (session != null) {
            session.close();
        }

    }
    public void delete(int id) throws IOException {
        InputStream ins;
        ins = Resources.getResourceAsStream("Mybatis-Config.xml");
        //使用Mybatis的连接工厂SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
        //获取数据库的连接SqlSession
        session = factory.openSession();
        if (session != null) {
            IStudent studentDao = session.getMapper(IStudent.class);
//接口操作和mapper文件绑定
            studentDao.Delete(id);

        }
        if (session != null) {
            session.close();
        }

    }
    public void update(Student student) throws IOException {
        InputStream ins;
        ins = Resources.getResourceAsStream("Mybatis-Config.xml");
        //使用Mybatis的连接工厂SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
        //获取数据库的连接SqlSession
        session = factory.openSession();
        if (session != null) {
            IStudent studentDao = session.getMapper(IStudent.class);
//接口操作和mapper文件绑定
            studentDao.Update(student);

        }
        if (session != null) {
            session.close();
        }

    }
}
