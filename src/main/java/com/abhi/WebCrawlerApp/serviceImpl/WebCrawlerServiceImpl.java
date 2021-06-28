package com.abhi.WebCrawlerApp.serviceImpl;

import com.abhi.WebCrawlerApp.exception.AppException;
import com.abhi.WebCrawlerApp.modal.WebCrawlerRequest;
import com.abhi.WebCrawlerApp.modal.WebCrawlerResponse;
import com.abhi.WebCrawlerApp.service.WebcrawlerService;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
@Slf4j
public class WebCrawlerServiceImpl implements WebcrawlerService {

    private static int diglevel = 1;

    @Override
    public WebCrawlerResponse getDetails(WebCrawlerRequest request) throws IOException {
        log.info("WebCrawlerServiceImpl - START");
        WebCrawlerResponse response = new WebCrawlerResponse();
        HashSet<String> links = new HashSet<>();
        List<List<String>> subLinks = new ArrayList<>();
        List matchedLinks = new ArrayList();
        diglevel = request.getLevel();
        String url = request.getURL().trim();
        String searchText =  request.getSearchText();
        if(StringUtils.isEmpty(url) || StringUtils.isEmpty(searchText)){
            throw new AppException(500, "URL/ SearchText is Empty");
        }
        log.info("url: {}", url);
        log.info("searchText: {}", searchText);
        List<String> crawlLinks = new ArrayList<>();
        crawl(1, url,crawlLinks, searchText);
        searchedText(searchText, crawlLinks, matchedLinks);
        response.setSearchedURL(url);
        response.setSearchedText(request.getSearchText());
        response.setLinks(crawlLinks);
        response.setMatchedLinks(matchedLinks);
        log.info("WebCrawlerServiceImpl - END");
        return response;
    }

    private void crawl(int level, String url, List<String> links, String searchText) throws IOException {
        if(level <=diglevel){
            Document document = requestCrawl(url, links);
            if(document!=null){
                for(Element link : document.select("a[href]")){
                    String next_link = link.absUrl("href");
                    if(!links.contains(next_link) && next_link.matches("^.*?("+searchText+").*$")){
                        crawl(level++, next_link, links, searchText);
                    }
                }
            }
        }
    }

    private static Document requestCrawl(String url, List<String> v) throws IOException{
        try{
            Connection con = Jsoup.connect(url);
            Document doc = con.get();
            if(con.response().statusCode() == 200){
                log.info("Link:" + url);
                log.info("docTitle" + doc.title());
                v.add(url);
                return doc;
            }
            return null;
        }catch (IOException ex){
            ex.printStackTrace();
            return null;
        }
    }

        private void searchedText(String searchedText, List<String> subLinks, List<String> matchedLinks) {
            try {
                subLinks.forEach(a -> {
                    if(a.contains("."+searchedText+".")==true || a.contains("/"+searchedText+"/")==true){
                        String link = a;
                        String temp = "text: " + searchedText + " link: " + link;
                        matchedLinks.add(temp);
                        log.info(temp);
                    }
                });
            } catch (Exception e) {
                log.error("Error occured while searching the text : {}",e.getMessage());
                e.printStackTrace();
            }
        }

}
