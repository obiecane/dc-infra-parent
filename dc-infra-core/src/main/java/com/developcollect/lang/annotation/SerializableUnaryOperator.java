package com.developcollect.lang.annotation;

import java.io.Serializable;
import java.util.function.UnaryOperator;


@FunctionalInterface
public interface SerializableUnaryOperator<T> extends Serializable, UnaryOperator<T> {


}
