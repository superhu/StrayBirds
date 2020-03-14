package top.wasm.blog.controller;

import org.springframework.web.bind.annotation.*;
import top.wasm.blog.dao.PostMapper;
import top.wasm.blog.vo.Post;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/post")
public class PostController {

    @Resource
    private PostMapper postMapper;


    @GetMapping("/list")
    public List<Post> posts(String title) {

        return postMapper.selectAll();
    }

    @PostMapping("/add")
    public void addPost(@RequestBody Post post) {
        postMapper.insert(post);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable("id") Integer id) {

        postMapper.deleteByPrimaryKey(id);
    }

    @PutMapping("/update")
    public void updatePost(@RequestBody Post post) {

        postMapper.updateByPrimaryKey(post);

    }
}
