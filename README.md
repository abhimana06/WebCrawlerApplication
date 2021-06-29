# WebCrawlerApplication
This application will fetch all the URLs related to the URL given in the request and also provides the matched URLs based on searchedText.

#How to run application
Clone the code by git repository into your local directory and open it as Maven Project in IntelliJ or Eclipse.
Start the Application by using Play/Run button and use the application using swagger URL provided below.

#Swagger URL : http://localhost:9091/dbs-wbc/swagger-ui.html#

<img width="1427" alt="Screenshot 2021-06-29 at 12 54 24 AM" src="https://user-images.githubusercontent.com/59757975/123674842-a7536b00-d874-11eb-8010-b1e273449ac9.png">


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
    "https://about.google/intl/en/stories/jason-barnes-accessibility-tools/#accessible-technology",
    "https://about.google/intl/en/stories/jason-barnes-accessibility-tools/#power-of-partnerships",
    "https://about.google/intl/en/stories/jason-barnes-accessibility-tools/#community-impact",
    "https://about.google/intl/en/stories/jason-barnes-accessibility-tools/#ways-to-get-involved",
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
    "http://ai.googleblog.com/2021/06/achieving-precision-in-quantum-material.html",
    "https://ai.googleblog.com/2019/10/quantum-supremacy-using-programmable.html",
    "http://ai.googleblog.com/2019/10/quantum-supremacy-using-programmable.html",
    "https://ai.googleblog.com/2018/05/the-question-of-quantum-supremacy.html",
    "http://ai.googleblog.com/2018/05/the-question-of-quantum-supremacy.html",
    "https://research.googleblog.com/2018/03/a-preview-of-bristlecone-googles-new.html",
    "http://ai.googleblog.com/2018/03/a-preview-of-bristlecone-googles-new.html",
    "https://research.google.com/pubs/QuantumAI.html",
    "http://googleresearch.blogspot.com/2014/09/introducing-structured-snippets-now.html",
    "http://ai.googleblog.com/2014/09/introducing-structured-snippets-now.html",
    "https://www.google.com/insidesearch/features/search/knowledge.html",
    "https://www.google.com/search/about/#jump-content",
    "https://search.app.goo.gl/?link=https://play.google.com/store/apps/details?id=com.google.android.googlequicksearchbox&apn=com.google.android.googlequicksearchbox&al=googleapp%3A%2F%2Fdeeplink%2F%3Fdata%3DCksBDb3mGzBEAiAuIhh7GaFTR_dlud5exBE8PSJX-mttN37tZqeYAb8LYQIgcl8Ed0YeWyjSf1xP6F2vWBpdGnbSCcSAFmywPzgGoWESoQEKBgjzsrOPARICCHEaOxI5CAMSNYLR5vMELwotaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS9zZWFyY2g_cT13ZWF0aGVyJmhzaT0xIlYKVGh0dHA6Ly9wbGF5Lmdvb2dsZS5jb20vc3RvcmUvYXBwcy9kZXRhaWxzP2lkPWNvbS5nb29nbGUuYW5kcm9pZC5nb29nbGVxdWlja3NlYXJjaGJveA&ibi=com.google.GoogleMobile&isi=284815942&utm_source=web-gsa&utm_medium=owned&pt=9008&ct=web-gsa&mt=8"
  ],
  
  "matchedLinks": [
    "text: google link: http://www.google.com",
    "text: google link: https://mail.google.com/mail/&ogbl",
    "text: google link: https://www.google.com.sg/imghp?hl=en&ogbl",
    "text: google link: https://www.google.com.sg/intl/en/about/products?tab=ih",
    "text: google link: https://research.google.com/pubs/QuantumAI.html",
    "text: google link: https://www.google.com/insidesearch/features/search/knowledge.html",
    "text: google link: https://www.google.com/search/about/#jump-content",
    "text: google link: https://search.app.goo.gl/?link=https://play.google.com/store/apps/details?id=com.google.android.googlequicksearchbox&apn=com.google.android.googlequicksearchbox&al=googleapp%3A%2F%2Fdeeplink%2F%3Fdata%3DCksBDb3mGzBEAiAuIhh7GaFTR_dlud5exBE8PSJX-mttN37tZqeYAb8LYQIgcl8Ed0YeWyjSf1xP6F2vWBpdGnbSCcSAFmywPzgGoWESoQEKBgjzsrOPARICCHEaOxI5CAMSNYLR5vMELwotaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS9zZWFyY2g_cT13ZWF0aGVyJmhzaT0xIlYKVGh0dHA6Ly9wbGF5Lmdvb2dsZS5jb20vc3RvcmUvYXBwcy9kZXRhaWxzP2lkPWNvbS5nb29nbGUuYW5kcm9pZC5nb29nbGVxdWlja3NlYXJjaGJveA&ibi=com.google.GoogleMobile&isi=284815942&utm_source=web-gsa&utm_medium=owned&pt=9008&ct=web-gsa&mt=8"
  ]
}
