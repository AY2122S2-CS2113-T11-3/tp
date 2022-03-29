package seedu.meetingjio.common;

/**
 *  Container for user visible error messages.
 */
public class ErrorMessages {

    public static final String ERROR_INDEX_OUT_OF_BOUND = "Hi I need a valid index in the list so I can delete";
    public static final String ERROR_INVALID_INDEX_FORMAT = "Hi I did not receive a proper "
            + "integer that I can parse";
    public static final String ERROR_MISSING_PARAMETERS_ADD_EVENT = "Hi 1 or more parameters are missing\n"
            + "The required parameters are:\n"
            + "n/[Name]\n"
            + "t/[Title]\n"
            + "d/[Day]\n"
            + "st/[StartTime]\n"
            + "et/[EndTime]\n"
            + "m/[Mode]";

    public static final String ERROR_MISSING_VALUES_ADD_EVENT = "Hi 1 or more parameters have missing values\n"
            + "The parameters that require values are:\n"
            + "n/[Name]\n"
            + "t/[Title]\n"
            + "d/[Day]\n"
            + "st/[StartTime]\n"
            + "et/[EndTime]\n"
            + "m/[Mode]";
    public static final String ERROR_INVALID_TIME = "Hi please input a valid time where "
            + "StartTime must be before EndTime\n"
            + "Accepted inputs are: 0000 - 2359";
    public static final String ERROR_INVALID_DAY = "Hi please input a valid day\n"
            + "Accepted inputs are:\n"
            + "monday\n"
            + "tuesday\n"
            + "wednesday\n"
            + "thursday\n"
            + "friday\n"
            + "saturday\n"
            + "sunday";
    public static final String ERROR_INVALID_MODE = "Hi please input a valid mode\n"
            + "Accepted inputs are: online or physical";

    // List Command
    public static final String ERROR_EMPTY_LIST = "There are no lessons in your timetable yet!";

    // Event
    public static final String ERROR_DUPLICATE_EVENT = "This event already exists. "
            + "This event will not be not added to the timetable.";
    public static final String ERROR_OVERLAPPING_EVENT = "This event coincides with another event. "
            + "This event will not be added to the timetable.";

    public static final String ERROR_INIT_FAILED = "Failed to initialise MeetingJio application. Exiting...";
    public static final String ERROR_INVALID_COMMAND = "Hi please input a valid command.";
    public static final String ERROR_NON_EMPTY_LIST = "Failed to clear whole list";
    public static final String ERROR_DELETE_COMMAND_FAILED = "Failed to delete element";
    public static final String ERROR_INVALID_USER = "User does not exist";
    public static final String ERROR_UNSPECIFIED_LIST = "Please specify which timetable to print";
    public static final String ERROR_EMPTY_MASTER_TIMETABLE = "The Master Timetable has no populated timetables!";
    public static final String ERROR_TIMETABLE_NOT_FOUND_TO_DELETE = "User and his Timetable not found";
    public static final String ERROR_EXCEPTION_NOT_HANDLED = "New exception found that is not handled. Logged this";
    public static final String ERROR_DUPLICATE_USER = "This user already exists. New timetable will not be created.";

    // Meeting
    public static final String ERROR_OVERLAPPING_MEETING = "This meeting cannot be added as "
            + "some of the members cannot make it";
    public static final String ERROR_DUPLICATE_MEETING = "This meeting already exists. "
            + "This meeting will not be not added to the timetable.";
    public static final String ERROR_MEETING_DOES_NOT_EXIST = "This meeting does not exist";

    public static final String ERROR_FREE_INPUT_INVALID = "Please specify the minimum duration for everyone to be free "
            + "where duration is an integer indicating the minimum number of hours: free [duration]\n"
            + "If there is no such constraint for the duration, just input 'free'.";
    public static final String ERROR_NO_FREE_TIMESLOT = "Sorry, there is no timeslot that fits your requirement.";

    public static final String ERROR_DATA_SAVE_FAILED = "Error writing to file: MeetingJio.txt";

    public static final String ERROR_MISSING_VALUES_ADD_USER = "Please provide a name to add";
    public static final String ERROR_UNSPECIFIED_LIST_CLEAR = "Please specify which timetable to Clear";
    public static final String ERROR_MISSING_PARAMETERS_DELETE = "Hi 1 or more parameters are missing\n"
            + "The required parameters are:\n"
            + "n/[Name]\n"
            + "i/[INDEX]\n";
    public static final String ERROR_MISSING_VALUES_DELETE = "Hi 1 or more parameters have missing values\n"
            + "The parameters that require values are:\n"
            + "n/[Name]\n"
            + "i/[INDEX]\n";

    public static final String ERROR_MISSING_PARAMETERS_ADD_MEETING = "Hi 1 or more parameters are missing\n"
            + "The required parameters are:\n"
            + "t/[Title]\n"
            + "d/[Day]\n"
            + "st/[StartTime]\n"
            + "et/[EndTime]\n"
            + "m/[Mode]";

    public static final String ERROR_MISSING_VALUES_ADD_MEETING = "Hi 1 or more parameters have missing values\n"
            + "The parameters that require values are:\n"
            + "t/[Title]\n"
            + "d/[Day]\n"
            + "st/[StartTime]\n"
            + "et/[EndTime]\n"
            + "m/[Mode]";

    public static final String ERROR_MISSING_VALUES_LOAD_LESSON = "Hi 1 or more parameters have missing values "
            + "in the MeetingJio.txt\n"
            + "Please ensure that the following parameters are not empty:\n"
            + "TITLE: [Title]\n"
            + "DAY: [Day]\n"
            + "START: [StartTime]\n"
            + "END: [EndTime]\n"
            + "MODE: [Mode]";

    public static final String ERROR_MISSING_PARAMETERS_LOAD_LESSON = "Hi 1 or more parameters are "
            + "missing in the MeetingJio.txt\n"
            + "Please ensure that the following parameters are present:\n"
            + "TITLE: [Title] "
            + "DAY: [Day] "
            + "START: [StartTime] "
            + "END: [EndTime] "
            + "MODE: [Mode]\n"
            + "Example:\n"
            + "1.[L] TITLE: CS2113\t\tDAY: friday\t\tSTART: 1430\t\tEND: 1530\t\tMODE: online";

    public static final String ERROR_INVALID_TIME_LOADING = "Hi invalid time found in the START or END field "
            + "in the MeetingJio.txt\n"
            + "Please ensure that StartTime must be before EndTime\n"
            + "Accepted inputs are: 0000 - 2359";

    public static final String ERROR_INVALID_DAY_LOADING = "Hi invalid day found in the DAY field "
            + "in the MeetingJio.txt\n"
            + "Accepted inputs are:\n"
            + "monday\n"
            + "tuesday\n"
            + "wednesday\n"
            + "thursday\n"
            + "friday\n"
            + "saturday\n"
            + "sunday";

    public static final String ERROR_INVALID_MODE_LOADING = "Hi invalid day found in the MODE field"
            + "in the MeetingJio.txt\n"
            + "Accepted inputs are: online or physical";

    public static final String ERROR_INVALID_EVENT_TYPE_LOADING = "Hi invalid event type found "
            + "in the MeetingJio.txt\n"
            + "Accepted inputs are: [M] or [L]"
            + "Please ensure that it follows the correct format:\n"
            + "1.[L] "
            + "TITLE: [Title] "
            + "DAY: [Day] "
            + "START: [StartTime] "
            + "END: [EndTime] "
            + "MODE: [Mode]\n"
            + "Example:\n"
            + "1.[L] TITLE: CS2113\t\tDAY: friday\t\tSTART: 1430\t\tEND: 1530\t\tMODE: online";

    public static final String ERROR_MISSING_PARAMETERS_LOAD_MEETING = "Hi 1 or more parameters are "
            + "missing for the meeting in the MeetingJio.txt\n"
            + "Please ensure that the following parameters are present:\n"
            + "TITLE: [Title] "
            + "DAY: [Day] "
            + "START: [StartTime] "
            + "END: [EndTime] "
            + "MODE: [Mode]\n"
            + "Example:\n"
            + "1.[M] TITLE: CS2113\t\tDAY: friday\t\tSTART: 1430\t\tEND: 1530\t\tMODE: online";

    public static final String ERROR_EMPTY_ROW = "A row cannot be empty in the MeetingJio.txt";

    public static final String ERROR_INCORRECT_INDEX = "Hi, please ensure that the index is in correct sequence\n"
            + "1, 2, 3, 4, ...";
}
