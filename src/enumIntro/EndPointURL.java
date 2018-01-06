package enumIntro;

public enum EndPointURL {
	ADDCOUNTRY("/COUNTRY");

	String resourcePath = "";

	EndPointURL(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	public String getResourcePath() {
		return resourcePath;
	}

	public static void main(String[] args) {
		// constructor is getting called as soon as we are writing
		// EndPointURL.ADDCOUNTRY
		System.out.println(EndPointURL.ADDCOUNTRY.getResourcePath());
	}
}
