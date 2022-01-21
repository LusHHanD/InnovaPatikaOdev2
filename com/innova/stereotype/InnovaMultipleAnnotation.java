package com.innova.stereotype;

import com.innova.alternative.ApplicationScoped;
import com.innova.alternative.Named;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Stereotype
@Target({ TYPE, METHOD, FIELD })
@Retention(RUNTIME)
@Documented

@Named("stereotype")
@ApplicationScoped
public @interface InnovaMultipleAnnotation {

}