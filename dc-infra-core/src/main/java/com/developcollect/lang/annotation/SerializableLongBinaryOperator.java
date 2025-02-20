package com.developcollect.lang.annotation;

import java.io.Serializable;
import java.util.function.LongBinaryOperator;

@FunctionalInterface
public interface SerializableLongBinaryOperator extends Serializable, LongBinaryOperator {

}
