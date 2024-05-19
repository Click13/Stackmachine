package com.click13.stackmachine.rules;

import com.click13.stackmachine.State;
import com.click13.stackmachine.Transition;

import java.util.List;

public class StartStateNotNull extends Rule{
    @Override
    protected boolean process(State startstate, List<Transition> transitions) {
        return startstate != null;
    }
}