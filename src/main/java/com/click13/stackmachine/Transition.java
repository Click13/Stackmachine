package com.click13.stackmachine;

import lombok.Getter;
import lombok.NonNull;

public class Transition {

    @Getter
    private State startState;

    @Getter
    private State endstate;

    @Getter
    private StackAction stackaction;

    @Getter
    private State stackState;

    @Getter
    private String action;

    public Transition(@NonNull State startState, @NonNull String action, @NonNull State stackState, @NonNull StackAction stackAction, @NonNull State endstate){
        this.startState = startState;
        this.endstate = endstate;
        this.stackaction = stackAction;
        this.action = action;
        this.stackState = stackState;
    }
}