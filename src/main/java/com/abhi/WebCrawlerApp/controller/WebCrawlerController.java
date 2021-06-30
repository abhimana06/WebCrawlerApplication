package com.abhi.WebCrawlerApp.controller;

import com.abhi.WebCrawlerApp.exception.AppException;
import com.abhi.WebCrawlerApp.modal.WebCrawlerRequest;
import com.abhi.WebCrawlerApp.modal.WebCrawlerResponse;
import com.abhi.WebCrawlerApp.service.WebcrawlerService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webCrawler")
@Slf4j
public class WebCrawlerController {

    @Autowired
    WebcrawlerService webcrawlerService;

    @PostMapping("/getWebCrawlerDetails")
    @ApiOperation(value = "To get webcrawler details", notes = "URL = to fetch URLs related to URL, \n searchText= to search in fetched URL list and return ones matches with \".searchText.\" & \\searchText\\ \n" +
            "level : to limit the depth of searching URLs")
    public ResponseEntity<?> getWebCrawlerDetails(@RequestBody WebCrawlerRequest request) throws Exception{
        if(request==null){
            throw new AppException(400, "Bad Request/Request is Empty");
        }
        WebCrawlerResponse response = webcrawlerService.getDetails(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
