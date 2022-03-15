package seedu.duke.commands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seedu.duke.Timetable;
import seedu.duke.events.Lesson;
import seedu.duke.exceptions.DuplicateEventException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.duke.ErrorMessages.ERROR_INDEX_OUT_OF_BOUND;

public class DeleteCommandTest {

    Timetable timetable = new Timetable();

    @BeforeEach
    void setUp() throws DuplicateEventException {
        Lesson lesson1 = new Lesson("John","CS2113","Friday",1230,1330,"online");
        Lesson lesson2 = new Lesson("John","CS2113","Friday",1400,1600,"physical");
        timetable.add(lesson1);
        timetable.add(lesson2);
    }

    @Test
    public void deleteCommand_IndexOutOfBoundsSize_throwException() throws DuplicateEventException {
        //delete index that is not found in list
        DeleteCommand deleteIndexSize = new DeleteCommand(timetable.size());
        deleteIndexSize.execute(timetable);
        assertEquals(ERROR_INDEX_OUT_OF_BOUND, deleteIndexSize.execute(timetable));
    }

}
