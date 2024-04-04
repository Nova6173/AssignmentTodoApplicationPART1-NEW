package se.JavaLexicon.assignmentsTodoApplication.Sequencers;

public class PersonIdSequencer {

    private static int id = 0;

    public static int nextId() {
        return ++id;
    }

    public static int getId () {
        return id;
    }

    public static void setId (int id) {
        PersonIdSequencer.id = id;
    }
}
