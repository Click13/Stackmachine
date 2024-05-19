package com.click13.stackmachine.rules;

import com.click13.stackmachine.State;
import com.click13.stackmachine.Transition;

import java.util.List;

abstract class Rule {
    protected abstract boolean process(State startstate, List<Transition> transitions);
}