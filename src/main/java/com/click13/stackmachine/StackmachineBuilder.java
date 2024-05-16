package com.click13.stackmachine;

import lombok.NonNull;

import java.util.LinkedList;
import java.util.List;

public class StackmachineBuilder {

    private State startState;
    private List<Transition> transitions;

    public StackmachineBuilder(){
        startState = null;
        transitions = new LinkedList<>();
    }

    public StackmachineBuilder addTransition(@NonNull Transition transition){
        transitions.add(transition);
        return this;
    }

    public StackmachineBuilder setStartState(@NonNull State startstate){
        this.startState = startstate;
        return this;
    }

    public Stackmachine build(){
        //TODO Regelprüfungen einfügen!
        return new Stackmachine(startState, transitions);
    }

    private static Transition[] toArray(List<Transition> transitions){
        Transition[] out = new Transition[transitions.size()];
        for (int i = 0; i < transitions.size(); i++) {
            out[i] = transitions.get(i);
        }
        return out;
    }
}