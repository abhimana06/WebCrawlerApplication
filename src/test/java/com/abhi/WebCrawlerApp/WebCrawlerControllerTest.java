package com.abhi.WebCrawlerApp;

import com.abhi.WebCrawlerApp.controller.WebCrawlerController;
import com.abhi.WebCrawlerApp.modal.WebCrawlerRequest;
import com.abhi.WebCrawlerApp.modal.WebCrawlerResponse;
import com.abhi.WebCrawlerApp.service.WebcrawlerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class WebCrawlerControllerTest {
    @InjectMocks
    WebCrawlerController obj = new WebCrawlerController();

    @Autowired
    private WebcrawlerService webcrawlerService ;



    @Test
    public void testWebCrawlerDetails() throws Exception {
        WebCrawlerRequest request = new WebCrawlerRequest(1, "http://www.google.com","google");
        WebCrawlerResponse response =  webcrawlerService.getDetails(request);
        assertNotNull(response.getLinks());
    }
}
