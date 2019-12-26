
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Utility {
    public static ArrayList<CriminalCodes> readFile(String fileName){
        ArrayList<CriminalCodes> criminals=new ArrayList<>();
        try{
        FileReader fr=new FileReader(fileName);
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            String[] currentCriminals=line.split("<>");
            String id=currentCriminals[0];
            String name=currentCriminals[1];
            String date=currentCriminals[2];
            String gender=currentCriminals[3];
            String fprint=currentCriminals[4];
            String dna=currentCriminals[5];
            CriminalCodes c=new CriminalCodes(id,name,date,gender,fprint,dna);
            criminals.add(c);
        }
        br.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return criminals;
    }
    public static void writeFile(ArrayList<CriminalCodes> criminals,String fileName){
            try{
                FileWriter fw=new FileWriter(fileName);
                BufferedWriter bw=new BufferedWriter(fw);
                for(CriminalCodes c:criminals){
                bw.write(c.toString()+"<>"+c.getName()+"<>"+c.getGender()+"<>"+c.getDate()+"<>"+c.getFingerprintCode()+"<>"+c.getDNAcode()+"<>"+c.result()+"\n");
            }
                bw.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    } 
