package com.hotbloodedchina.historyandmimilitary.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lilongyun on 2018/4/22.
 */
@RestController
@RequestMapping("/post")
public class PostController {

    @RequestMapping(value = "/queryPosts", method = RequestMethod.GET)
    @ResponseBody
    public List queryPosts(){
        List list = new ArrayList();
        return list;
    }
}
