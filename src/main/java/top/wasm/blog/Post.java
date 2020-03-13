package top.wasm.blog;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Post {

    private String title;

    private String content;

    private Date createTime;
}
