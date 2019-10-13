import java.util.*;
import java.io.*;
import java.lang.*;

public class gardenMethods extends Garden implements gardenMethodInterfaces {

    @Override
    public List<Integer> size(String input) {
        int n = 0;
        List<Integer> size = new ArrayList<Integer>();
        while (n < input.length()) {
            if (input.charAt(n) != ',') {
                n++;
            } else {
                int a = Integer.parseInt(input.substring(0, n));
                size.add(a);
                n++;
            }
        }
        return size;

    }

    @Override
    public void buildGarden() {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        System.out.println("Enter the name of garden file:");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        Scanner file = new Scanner(fileName);
        String sizeInput = file.nextLine();
        List<String> inputRows = new ArrayList<String>();
        while (file.hasNextLine())
        {
            String addValue = file.nextLine();
            inputRows.add(addValue);
        }
        this.size(sizeInput)
        List<Integer> gardenSize = sizeInput.size();
        Garden a = new Garden(gardenSize);


    }

}
