package Object;

public class BillingAddress {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zipCode;
    private String email;
    private String country;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String state;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }







    public String getAddress() {
        return address;
    }

    public void setAddressLine1(String address) {
        this.address = address;
    }





    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }





    public String getZipCode() {
        return zipCode;
    }

    public void setPostalCode(String zipCode) {
        this.zipCode = zipCode;
    }







    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }









}
