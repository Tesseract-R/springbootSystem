package com.ruicheng.blog.initializerstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 主页控制器.
 *
 * @author Ruicheng
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {

    @GetMapping
    public String listBlogs(@RequestParam(value = "order", required = false, defaultValue = "new") String order,
                            @RequestParam(value = "tag", required = false) Long tag) {
        System.out.print("order:" + order + ";tag:" + tag);
        return "redirect:/index?order=" + order + "&tag=" + tag;
    }

}
