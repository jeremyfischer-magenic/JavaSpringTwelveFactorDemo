package com.hello.world.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@WebMvcTest(WebRoot.class)
class WebRootTest {

    @Autowired
    private MockMvc mockMvc;

    private WebRoot sut;

    @BeforeEach
    public void before() {
        this.sut = new WebRoot();
    }

    @Test
    public void root() {
        String result = sut.root();
        Assert.isTrue(!result.isEmpty(), "result should return a string!");
    }

    @Test
    public void rootControllerTest() throws Exception {
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/"));
        Assert.isTrue(!result.andReturn().getResponse().getContentAsString().isEmpty(), "Result should return a string!");
    }
}