package com.click13.stackmachine.rules;

import com.click13.stackmachine.State;
import com.click13.stackmachine.Transition;

import java.util.List;

public class RuleProcessor {

    private Rule[] rules = {
            new StartStateNotNull(),
            new AmountOfTransitions()
    };

    public boolean processRules(State startstate, List<Transition> transitions){
        for (int i = 0; i < rules.length; i++) {
            if (!rules[i].process(startstate, transitions)){
                return false;
            }
        }
        return true;
    }
}