
// Method to find all links in the webpage
public List getLinks(WebDriver driver) {
	List linksList = new ArrayList();
	// All links are usually inside anchor tags Eg: <a href="http://www.sample.com">abc</a>
	linksList.addAll(driver.findElements(By.tagName("a")));
	 List linksFinalList = new ArrayList();
		// Filtering out links that don't have href
	  	for (WebElement link : linksList) {
		  	if(link.getAttribute("href") != null)
			linksFinalList.add(link);  
	  		}	
	return linksFinalList;
}
// Method to check if each link is working or not 
public String checkLink(URL url) throws Exception {
	String response = "";
	HttpURLConnection con = (HttpURLConnection) url.openConnection();
		try {
		    con.connect();
		    response = con.getResponseMessage();	        
		    con.disconnect();
		    return response;
       		}
		catch(Exception e) {
			return e.getMessage();
      		}
}
//Driver Method
public static void main(String[] args) throws Exception {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://RequiredURL/");
	List elements = getLinks(driver);    
		for(WebElement element : elements) {
		    try {
		    	URL url = new URL(element.getAttribute("href"));
			    System.out.println("URL:" + element.getAttribute("href")+ "status is "+ checkLink(url));
            		}
		    catch(Exception e) {
		    	System.out.println(e.getMessage());	    		
		    	}
		}
}
