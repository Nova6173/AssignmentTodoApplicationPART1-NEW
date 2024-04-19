package se.JavaLexicon.assignmentsTodoApplication.Dao;

import se.JavaLexicon.assignmentsTodoApplication.TodoItem;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TodoItemDAOImpl implements TodoItemDAO {

    private Map<Integer, TodoItem> items = new HashMap<> ();

    @Override
    public TodoItem persist(TodoItem todoItem) {
        items.put(todoItem.getId(), todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        return items.get(id);
    }

    @Override
     public Collection<TodoItem> findAll() {
        return items.values();
    }

    @Override
    public Collection<TodoItem> findByDoneStatus (boolean doneStatus) {
        return null;
    }

    @Override
    public Collection<TodoItem> findTitleContains (String title) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByPersonId (int personId) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore (Date date) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter (Date date) {
        return null;
    }



    @Override
    public void remove(int id) {
        items.remove(id);
    }

}