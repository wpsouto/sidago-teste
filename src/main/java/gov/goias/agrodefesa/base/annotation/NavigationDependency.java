package gov.goias.agrodefesa.base.annotation;

import gov.goias.agrodefesa.constants.Action;

import java.lang.annotation.*;

/**
 * Created by wemerson on 19/05/16.
 * *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(NavigationDependencies.class)
public @interface NavigationDependency {
    Class<?> dependence();

    Action[] actions() default {};
}
