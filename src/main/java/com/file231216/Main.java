package com.file231216;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        try{
            List<String> state = new ArrayList<>();
            state.add("アラバマ州");
            state.add("フロリダ州");
            state.add("ニューヨーク州");
            System.out.println(state.get(1));
            System.out.println(state.get(3));
        }catch(Exception e){
            System.out.println("この登録は存在しません");
        }
    }
}
