package seedu.duke;

import java.sql.Time;
import java.util.Scanner;

public class Duke {

    private static Scanner SCANNER = new Scanner(System.in);
    private static final String ADD_COMMAND = "add";
    private static final String LIST_COMMAND = "list";

    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("What is your name?");

        System.out.println("Hello " + SCANNER.nextLine());

        //check for bye message
        while(true) {
            String input = getInput();
            Parser parser = new Parser(input);

            String parsedCommand = parser.getCommand();
            if (parsedCommand.equals(ADD_COMMAND)) {
                addEvent(parser);
            } else if (parsedCommand.equals(LIST_COMMAND)) {
                listTimetable();
            }
        }
    }

    private static String getInput() {
        String newInput = SCANNER.nextLine();
        String trimmedInput = newInput.trim();
        return trimmedInput;
    }

    private static void addEvent(Parser parser) {
        String[] eventDescription = parser.getAddDescription();
        Event upcomingEvent = AddCommand.execute(eventDescription);
        AddCommand.printConfirmation(upcomingEvent);
    }

    private static void listTimetable() {
        for (int i = 0; i < Timetable.size(); i++) {
            System.out.println(Timetable.get(i));
        }
    }

}