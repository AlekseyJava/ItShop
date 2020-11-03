package ru.itshop.model;

import java.io.Serializable;

public interface Model<PK extends Serializable> extends Serializable {
    PK getId();
}
