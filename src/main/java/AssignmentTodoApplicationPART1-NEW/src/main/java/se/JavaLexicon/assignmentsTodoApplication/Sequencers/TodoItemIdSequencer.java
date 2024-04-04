package se.JavaLexicon.assignmentsTodoApplication.Sequencers;

public class TodoItemIdSequencer {
    public static int getId () {
        return id;
    }

    public static void setId (int id) {
        TodoItemIdSequencer.id = id;
    }

    private static int id = 0;

    public static int nextId() {
        return ++id;

    }

}
