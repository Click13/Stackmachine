package com.click13.stackmachine;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

class Stack {
    private StackElement head;

    public Stack(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public State peek(){
        return head.getPayload();
    }

    public void push(@NonNull State state){
        StackElement temp = new StackElement(state);
        temp.setNext(head);
        head = temp;
    }

    public State pop(){
        StackElement temp = head;
        head = head.getNext();
        return temp.getPayload();
    }

    @EqualsAndHashCode
    private class StackElement{
        @Getter
        private State payload;

        @Getter
        @Setter
        private StackElement next;

        StackElement(@NonNull State payload){
            this.payload = payload;
        }
    }
}