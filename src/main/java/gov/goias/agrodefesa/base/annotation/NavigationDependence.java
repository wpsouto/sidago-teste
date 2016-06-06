package gov.goias.agrodefesa.base.annotation;

import gov.goias.agrodefesa.constants.Action;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wemerson on 19/05/16.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface NavigationDependence {
    Class<?> dependence();
    Action[] actions() default {};
}
