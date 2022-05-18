package TugasPertama;
public class App {
    public static void main(String[] args) throws Exception {

    UserData userData = new UserData();
    
    userData.setUserData("Dimas Galang", "Aji Wiguna", "Malang", "2002", "JavaScript");
    
    System.out.println("Halo nama saya " + userData.getFirstName() + " " + userData.getLastName());
    System.out.println("lahir di "+ userData.getBirthPlace());
    System.out.println("tahun " + userData.getBirthYear());
    System.out.println("bahasa favorit saya adalah " + userData.getProgrLangFav());
    userData.fungsiBilangan();


    for(int i=0;i<=3;i++){
        for(int j=0;j<=5;j++){
        System.out.print("*");
        }
        System.out.println("");
        }
    }
}
