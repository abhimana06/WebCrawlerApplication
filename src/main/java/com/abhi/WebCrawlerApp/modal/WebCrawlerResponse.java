package com.abhi.WebCrawlerApp.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebCrawlerResponse implements Serializable {

    String searchedURL;
    String searchedText;
    List<String> links = new ArrayList<String>();
    List<String> matchedLinks = new ArrayList<String>();
}
