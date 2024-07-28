package com.list.Model;

import java.util.ArrayList;
import java.util.List;

public class Loop {

    private Integer num;
    private List<String> lista = new ArrayList<>();

    public Loop(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public List<String> getLista() {
        for (int i = 1; i < 11; i++) {
            lista.add(num + " x " + i + " = " + (num * i));
        }
        return lista;
    }


}
