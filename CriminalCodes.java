public class CriminalCodes {
    private String id;
    private String name;
    private String date;
    private String gender;
    private String FingerprintCode;
    private String DNAcode;

    public CriminalCodes(String id,String name,String date,String gender,String FingerprintCode, String DNAcode) {
        this.id=id;
        this.name=name;
        this.date=date;
        this.gender=gender;
        this.FingerprintCode = FingerprintCode;
        this.DNAcode = DNAcode;
    }
    public String getName(){
        return this.name;
    }
    public String getDate(){
        return this.date;
    }
    public String getGender(){
        return this.gender;
    }
    public String getFingerprintCode() {
        return this.FingerprintCode;
    }
    public String getDNAcode() {
        return this.DNAcode;
    }
    public String getResult(String FingerprintCode){
       if((this.FingerprintCode!=null)&&(DNAcode!=null)&&this.FingerprintCode==DNAcode){ return "Criminal";}
       else  return "Innocent";
    }
    public String result(){
       return getResult(FingerprintCode);
    }
    
    @Override
    public String toString(){
        return this.id;
    }
}
