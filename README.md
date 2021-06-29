# WebCrawlerApplication
This application will fetch all the URLs related to the URL given in the request and also provides the matched URLs based on searchedText.

#How to run application
Clone the code by git repository into your local directory and open it as Maven Project in IntelliJ or Eclipse.
Start the Application by using Play/Run button and use the application using swagger URL provided below.

#Swagger URL : http://localhost:9091/dbs-wbc/swagger-ui.html#

<img width="1432" alt="Screenshot 2021-06-29 at 8 31 04 AM" src="https://user-images.githubusercontent.com/59757975/123719562-74c96280-d8b4-11eb-8f27-d078c4a8f77a.png">



API : /webCrawler/getWebCrawlerDetails
Method : POST

Request :

{
  "level": 2,
  "searchText": "google",
  "url": "http://www.google.com"
}

Response:

{
  "searchedURL": "http://www.google.com",
  "searchedText": "google",
  "links": [
    "http://www.google.com",
    "https://mail.google.com/mail/&ogbl",
    "https://www.google.com.sg/imghp?hl=en&ogbl",
    "https://www.google.com.sg/intl/en/about/products?tab=ih",
    "https://about.google/intl/en/",
    "https://about.google/intl/en/#content",
    "https://about.google/intl/en/products/",
    "https://about.google/intl/en/products/#page-content",
    "https://about.google/intl/en/commitments/",
    "https://about.google/intl/en/commitments/#content",
    "https://about.google/intl/en/stories/",
    "https://about.google/intl/en/stories/#content",
    "https://about.google/intl/en/stories/all-stories/?topic=culture",
    "https://about.google/intl/en/stories/all-stories/?topic=culture#content",
    "https://about.google/intl/en/stories/accessibility/",
    "https://about.google/intl/en/stories/accessibility/#content",
    "https://about.google/intl/en/stories/jason-barnes-accessibility-tools/",
    "https://about.google/intl/en/stories/jason-barnes-accessibility-tools/#page-content",
    "https://sites.research.google/euphonia/about/",
    "https://research.google/",
    "https://research.google/philosophy/",
    "https://research.google/research-areas/",
    "https://research.google/pubs/",
    "https://research.google/people/",
    "https://research.google/tools/",
    "https://research.google/outreach/",
    "https://research.google/careers/",
    "https://ai.googleblog.com",
    "http://ai.googleblog.com/",
    "https://ai.googleblog.com/.",
    "http://ai.googleblog.com/2021/06/take-all-your-pictures-to-cleaners-with.html",
    "https://blog.google/products/photos/new-helpful-editor/",
    "https://blog.google/products/photos/new-helpful-editor/#jump-content",
    "https://blog.google/",
    "https://blog.google/#jump-content",
    "https://twitter.com/intent/tweet?text=The%20Keyword%20%40google&url=https://blog.google/"
  ],
  "matchedLinks": [
    "searchedText: google link: http://www.google.com",
    "searchedText: google link: https://mail.google.com/mail/&ogbl",
    "searchedText: google link: https://www.google.com.sg/imghp?hl=en&ogbl",
    "searchedText: google link: https://www.google.com.sg/intl/en/about/products?tab=ih"
  ]
}
