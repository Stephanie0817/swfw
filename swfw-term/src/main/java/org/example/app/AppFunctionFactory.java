package org.example.app;

public interface AppFunctionFactory {
    AbstractView createView();
    AbstractManager createManager();
}