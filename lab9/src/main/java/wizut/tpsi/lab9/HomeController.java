package wizut.tpsi.lab9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class HomeController {

    @Autowired
    private BlogRepository blogRepository;

    @RequestMapping("/")
    public String home(Model model) {


        try {

            model.addAttribute("posts",  blogRepository.getAllPosts());

        }
        catch (Exception ex){}


        return "home";
    }

    @PostMapping("/newpost")
    public String newPost(BlogPost post) throws SQLException {
        blogRepository.createPost(post);
        return "redirect:/";
    }

    @RequestMapping("usun_{id}")
    public String usun(@PathVariable String id) {

        try {
            blogRepository.deletePost(Long.parseLong(id));
        }
        catch (Exception ex){}
        return "redirect:/";
    }
}
