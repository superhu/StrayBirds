package top.wasm.blog;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import top.wasm.blog.util.RestClient;
import top.wasm.blog.vo.Post;

//@SpringBootTest
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlogApplication.class)
class BlogApplicationTests {

	@Test
	void test1() {
		String result = RestClient.builder().method(HttpMethod.GET).url("http://localhost:8080/blog/post/list")
				.queryParam("title", "ccc")
				.build().execute();
		System.out.println(result);

	}

	public static void main(String[] args) {
		getHtml();
//		deletePost();
//		addPost();
//		queryPost(args);
	}

	private static void queryPost(String[] args) {
		String result = RestClient.builder().method(HttpMethod.GET).url("http://localhost:8080/blog/post/list")
				.queryParam("title", "ddd")
				.build().execute();
		System.out.println(result);
	}

	private static void addPost() {
		Post post = Post.builder().title("ddd").content("dddddddd").build();
		String result = RestClient.builder().method(HttpMethod.POST).url("http://localhost:8080/blog/post/add")
				.body(post)
				.build().execute();
		System.out.println(result);
	}

	private static void deletePost() {
		Post post = Post.builder().title("ddd").content("dddddddd").build();
		String result = RestClient.builder().method(HttpMethod.DELETE).url("http://localhost:8080/blog/post/delete/{id}")
				.pathVariable("id","ddd")
				.build().execute();
		System.out.println(result);
	}
	private static void getHtml(){
		String result = RestClient.builder().method(HttpMethod.GET).url("http://www.baidu.com")
				.header(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_HTML_VALUE)
				.build()
				.execute();
		System.out.println(result);
	}

}
