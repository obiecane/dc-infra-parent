package com.developcollect.lang.annotation;

import java.io.Serializable;
import java.util.function.ToIntFunction;

@FunctionalInterface
public interface SerializableToIntFunction<T> extends Serializable, ToIntFunction<T> {


}
