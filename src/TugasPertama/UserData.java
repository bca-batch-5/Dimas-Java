package TugasPertama;

public class UserData {
    private String firstName;
    private String lastName;
    private String birthPlace;
    private String birthYear;
    private String progrLangFav;

    // set data
    public void setUserData(String firstName, String lastName, String birthPlace, String birthYear, String progrLangfav) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthPlace = birthPlace;
        this.birthYear = birthYear;
        this.progrLangFav = progrLangfav;
    }


    // get data

    public String getFirstName() {
        return this.firstName;
        
    }
    public String getLastName() {
        return this.lastName;
        
    }
    public String getBirthPlace() {
        return this.birthPlace;
        
    }
    public String getBirthYear() {
        return this.birthYear;
        
    }
    public String getProgrLangFav() {
        return this.progrLangFav;
        
    }
    
    public void fungsiBilangan() {
        int x = 100;
        int jumlah = 0;
        for (int i = 1; i <= x; i++) {
            if (i%3 == 0 && i%5 == 0) {
                jumlah += 1;
                System.out.println(i);
            }
        }
        System.out.println("Total "+jumlah);
    
    }
}



