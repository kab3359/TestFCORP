import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("input key search");
        String name = input.nextLine();
        String[] str = {"Bank regulation: Bank regulation is a form of government regulation which subjects banks to certain requirements",
                "Banking crisis: When banks suffer a sudden rush of withdrawals by depositors, this is called a bank run"};
        Search search = new Search(str);
        List<Integer> arr = search.findDocs(name);
        System.out.println(arr);
    }
}
