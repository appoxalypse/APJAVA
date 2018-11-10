public class PhoneNumber {

	private String country;
	private String areaCode;
	private String number;

	public PhoneNumber(String theCountry, theArea, theNumber) {
		country = theCountry;
		areaCode = theArea;
		number = theNumber;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String theNumber) {
		number = theNumber;
	}

}