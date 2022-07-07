package com.moc.login.Res;

import lombok.Data;

import java.io.Serializable;

@Data

public class resentity<T> implements Serializable {
    private resutil resutil;
    private T date;

}
