package com.learn_spring_boot.webapp1.course.jdbc;

import com.learn_spring_boot.webapp1.course.Course;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY=
        """
            insert into COURSE(id,name,author)
            values(?,?,?)
        """;

    private static String SELECT_ALL=
        """
            SELECT * FROM COURSE
        """;

    private static String SELECT_BY_ID=
        """
            SELECT * FROM COURSE
            WHERE id=?
        """;

    private static String DELETE_BY_ID=
        """
            DELETE FROM COURSE
            WHERE id=?
        """;

    private static String UPDATE_QUERY=
        """
           UPDATE COURSE
           SET name = ?, author = ?
           WHERE id = ?;
            """;

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY,
            course.getId(), course.getName(), course.getAuthor());
    }

    public List<Course> findAll() {
        return jdbcTemplate.query(SELECT_ALL, new BeanPropertyRowMapper<>((Course.class)));
    }

    public Course findById(BigInteger id) {
        return jdbcTemplate.queryForObject(SELECT_BY_ID, new BeanPropertyRowMapper<>((Course.class)),id);
    }
    public void deleteById(BigInteger id) {
        jdbcTemplate.update(DELETE_BY_ID,id);
    }
    public void update(Course course) {
        jdbcTemplate.update(UPDATE_QUERY, course.getName(),course.getAuthor(),course.getId());
    }


}
