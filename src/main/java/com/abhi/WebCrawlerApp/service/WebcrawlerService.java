package com.abhi.WebCrawlerApp.service;

import com.abhi.WebCrawlerApp.modal.WebCrawlerRequest;
import com.abhi.WebCrawlerApp.modal.WebCrawlerResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface WebcrawlerService {

    WebCrawlerResponse getDetails(WebCrawlerRequest request) throws IOException;
}
