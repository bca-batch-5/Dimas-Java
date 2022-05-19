package tugasSistemAkademik.Obj;


public class Student{

    private String matKul;
    private int sks;
    

    public Student(String matKul, int sks) {
        this.matKul = matKul;
        this.sks = sks;
    }
    
    public String getMatKul() {
        return matKul;
    }
    public void setMatKul(String matKul) {
        this.matKul = matKul;
    }
    public int getSks() {
        return sks;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }


}


