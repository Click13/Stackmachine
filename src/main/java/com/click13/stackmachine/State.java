package com.click13.stackmachine;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@EqualsAndHashCode
public class State {
    @Getter
    private String name;

    public State(@NonNull String name){
        this.name = name;
    }
}