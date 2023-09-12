package Home.backjun.harder1;
import java.io.*;
import java.util.StringTokenizer;

public class majorGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double hakjum = 0.0;
        String grade;
        double hakjumTotal = 0.0;
        double total = 0.0;


        for(int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            hakjum = Double.parseDouble(st.nextToken());
            grade = st.nextToken();
            hakjumTotal += hakjum;
            switch(grade) {
                case "A+" :
                    total += (4.5 * hakjum);
                    break;
                case "A0":
                    total += (4.0 * hakjum);
                    break;
                case "B+":
                    total += (3.5* hakjum);
                    break;
                case "B0":
                    total += (3.0*hakjum);
                    break;
                case "C+":
                    total += (2.5*hakjum);
                    break;
                case "C0":
                    total += (2.0*hakjum);
                    break;
                case "D+":
                    total += (1.5*hakjum);
                    break;
                case "D0":
                    total += (1.0 * hakjum);
                    break;
                case "F":
                    total += (0.0*hakjum);
                    break;
                default:
                    hakjumTotal -= hakjum;
                    break;
            }
        }

        System.out.println(total / hakjumTotal);
    }
}
