package entity;

import java.io.Serializable;

/**
 * (Zhou)实体类
 *
 * @author makejava
 * @since 2021-07-21 21:21:55
 */
public class Zhou implements Serializable {
    private static final long serialVersionUID = 548381495794752719L;

    private Integer id;

    private String name;

    private Integer age;

    private String department;

    private String post;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

}
