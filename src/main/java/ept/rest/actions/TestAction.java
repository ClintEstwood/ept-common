package ept.rest.actions;

public abstract class TestAction<T> {
    protected final T context;

    protected TestAction(T context) {
        this.context = context;
    }
}