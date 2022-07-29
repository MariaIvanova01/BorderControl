package borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        while (true){
            String[] input = scan.nextLine().split(" ");

            if (input[0].equals("End")){
                break;
            }

            Identifiable identifiable = input.length == 2
                    ? new Robot(input[1],input[0])
                    : new Citizen(input[0],Integer.parseInt(input[1]),input[2]);

            identifiables.add(identifiable);
        }
        String lastDigitsFakeId = scan.nextLine();

        identifiables.stream().forEach(identifiable -> {
            if(identifiable.getId().endsWith(lastDigitsFakeId)){
                System.out.println(identifiable.getId());
            }
        });
    }
}
