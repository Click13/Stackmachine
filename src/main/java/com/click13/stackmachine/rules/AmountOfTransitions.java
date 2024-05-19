package com.click13.stackmachine.rules;

import com.click13.stackmachine.State;
import com.click13.stackmachine.Transition;

import java.util.List;

public class AmountOfTransitions extends Rule{
    @Override
    protected boolean process(State startstate, List<Transition> transitions) {
        return transitions != null && transitions.size() > 0;
    }
}