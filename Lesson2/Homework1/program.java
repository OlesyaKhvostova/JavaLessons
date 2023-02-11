package Homework1;

import java.util.regex.Pattern;

/**
 * program
 */
public class program {
    public static String Convert(String data) {
        var array = data.split(",", 0);
        int rating = 0;
        String sername = new String();
        String subject = new String();
        for (String string : array) {
            string = string.replaceAll("\"", "");
            var params = string.split(":", rating);
            if (params[0].equals("оценка"))
            {
                rating = Integer.parseInt(params[1]);
            }
            else if (params[0].equals("фамилия"))
            {
                sername = params[1];
            }
            else if (params[0].equals("предмет"))
            {
                subject = params[1];
            }
        }
        String output = new String();
        output = "Студент " + sername + " получил " + rating + " по предмету " + subject;
        return output;
    }
    public static void main(String[] args) {
        
        String inputData = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математека\"},{\"фамилия\":\"Петров\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        String[] data = inputData.split("\\}");
        for (String string : data) {
            
            string = string.replaceAll("\\[\\{|,\\{|]", "");
            if(!string.isEmpty())
            {
                var outData = Convert(string);
                System.out.println(outData); 
            }           
        }
    }    
}
