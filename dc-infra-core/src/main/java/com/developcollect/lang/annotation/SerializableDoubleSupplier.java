package com.developcollect.lang.annotation;

import java.io.Serializable;
import java.util.function.DoubleSupplier;


@FunctionalInterface
public interface SerializableDoubleSupplier extends Serializable, DoubleSupplier {


}
