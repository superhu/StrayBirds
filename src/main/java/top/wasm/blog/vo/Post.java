package top.wasm.blog.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

//@Table(name="post")

//@Builder
@TableName("post")
@Data
//@Accessors(chain = true)
//@RequiredArgsConstructor(staticName = "of")
//@NoArgsConstructor
public class Post {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(value = "id")
    private Integer id;

//    @Column(name="title")
    private String title;

//    @Column(name = "create_time")
    private Date createTime;

//    @Column(name = "content")
    private String content;


}