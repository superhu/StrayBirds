package top.wasm.blog.vo;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name="post")
@Builder
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "content")
    private String content;


}