package com.abhi.WebCrawlerApp.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebCrawlerRequest implements Serializable {

    private Integer level;
    private String URL;
    private String searchText;

}
