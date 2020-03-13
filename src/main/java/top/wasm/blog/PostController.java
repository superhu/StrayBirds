package top.wasm.blog;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/post")
public class PostController {
    public static ArrayList<Post> db = new ArrayList<>();

    static {
        Post post1 = Post.builder().title("hello world").content("how to write code in rust...").createTime(new Date()).build();
        Post post2 = Post.builder().title("bbb").content("xxx").createTime(new Date()).build();

        List<Post> posts = Arrays.asList(new Post[]{post1, post2});
        db.addAll(posts);
    }

    @GetMapping("/list")
    public List<Post> posts(String title){

//        String json = JSON.builder().data("a", "111").data("bb", "22").build().toString();

        return db.stream().filter(item ->item.getTitle().equals(title)).collect(Collectors.toList());
    }

    @PostMapping("/add")
    public void add(@RequestBody Post post){

        db.add(post);
    }

    @DeleteMapping("/delete/{id}")
    public void add(@PathVariable("id") String id){

        db.removeIf(p ->p.getTitle().equals(id));
    }
}
