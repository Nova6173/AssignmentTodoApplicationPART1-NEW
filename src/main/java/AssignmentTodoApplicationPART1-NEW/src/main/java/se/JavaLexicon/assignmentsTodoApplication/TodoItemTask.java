package se.JavaLexicon.assignmentsTodoApplication;


    public class TodoItemTask {
        private int id;
        private boolean assigned;
        private TodoItem parentItem;
        private Person assignee;

        //Constructors
        public TodoItemTask(int taskiId, boolean assigned, TodoItem parentItem, Person assignee){
            this.id = id;
            this.assigned = assigned;
            this.parentItem = parentItem;
            this.assignee = assignee;

        }
// Getters & setter for each field

        public int getId() {
            return id;

        }

        public void setId(int id) {
            this.id = id;

        }

        public boolean isAssigned() {
            return assigned;

        }

        public void setAssigned(boolean assigned) {
            this.assigned = assigned;

        }

        public TodoItem getTodoItem() {
            return parentItem = parentItem;

        }

        public void setTodoItem(TodoItem todoItem) {
            this.parentItem = parentItem;

        }

        public Person getAssigned() {
            return assignee;

        }

        public void setAssignee(Person assignee) {
            this.assignee = assignee;

        }

        // toString, equals, and hashCode methods

        @Override
        public String toString() {
            return "TodoItemTask{" +
                    "id=" + id +
                    ", assigned=" + assigned +
                    ", parentItem=" + parentItem.getTitle() +
                    ", assignee=" + (assignee != null ? assignee.getFirstName() + " " + assignee.getLastName() : "Unassigned") +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TodoItemTask that = (TodoItemTask) o;

            return id == that.id;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }
