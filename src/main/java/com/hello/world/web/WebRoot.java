package com.hello.world.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebRoot {
  @GetMapping("/")
  public @ResponseBody String root() {
    return "Hello world!";
  }
}
