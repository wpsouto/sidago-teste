package gov.goias.agrodefesa.base;

import gov.goias.agrodefesa.base.view.HomeView;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wemerson on 19/05/16.
 */
//// MATERIAL = create("material", CONTROLE_BENS, "material", NavigationMaterial.class, Material.class, MaterialViewHome.class, MaterialViewInsert.class, MaterialViewEdit.class);
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Navigation {
    Class<?> home();
    Class<?> insert() default None.class;
    Class<?> edit() default None.class;
    Class<?> entity() default None.class;

    static class None {

    }
}
