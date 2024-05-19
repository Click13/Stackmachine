package com.click13.stackmachine;

import lombok.Getter;
import lombok.NonNull;

import java.util.List;

public class Stackmachine {

    public static StackmachineBuilder builer(){
        return new StackmachineBuilder();
    }

    @Getter
    private State state;
    private List<Transition> transitions;
    private Stack internalStack;

    protected Stackmachine(@NonNull State startState, @NonNull List<Transition> transitions){
        this.state = startState;
        this.transitions = transitions;
        internalStack = new Stack();
    }

    public boolean isStackEmpty(){
        return internalStack.isEmpty();
    }
}