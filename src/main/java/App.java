import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String phrase = myApp.readQuote();
        String name = myApp.readName();
        String outputString = myApp.generateOutputString(name, phrase);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readQuote(){
        System.out.print("What is the quote? ");
        return in.nextLine();
    }

    public String readName() {
        System.out.print("Who said it? ");
        return in.nextLine();
    }

    public String generateOutputString(String name, String phrase){
        return String.format("%s says, "+ "\"%s\"", name, phrase);
    }
}