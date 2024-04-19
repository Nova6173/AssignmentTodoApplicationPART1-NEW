package se.JavaLexicon.assignmentsTodoApplication.Sequencers;

public class PersonIdSequencer {

    private static int CurrentId = 0;

    public static int nextId() {
        return ++CurrentId;
    }

    public static int getCurrentId () {
        return CurrentId;
    }

    public static void setCurrentId (int id) {
        CurrentId = id;
    }
}
