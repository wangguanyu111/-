package Android.mapper;

import Android.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudent {
    public List<Student> selectALL(@Param("stu") Student stu);
    public void Delete(@Param("id") int id);

    public void Insert(@Param("stu") Student stu);

    public void Update(@Param("stu") Student stu);
}
