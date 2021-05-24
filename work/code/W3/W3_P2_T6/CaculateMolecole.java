import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaculateMolecole {
    public static void main(String[] args) {
        String molocole = "C6H5OH ";
        HashMap<Character,Double> map = new HashMap<Character, Double>();
        map.put('C',12.01);map.put('H',1.008);
        map.put('O',16.00);map.put('N',14.01);
        double sum = 0.0;
        Matcher m = Pattern.compile("[CHON]").matcher(molocole);
        while(m.find()){
            sum+=map.get(molocole.charAt(m.start()));
        }

    }
}
