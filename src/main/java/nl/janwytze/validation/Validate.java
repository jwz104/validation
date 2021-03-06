package nl.janwytze.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {

     /**
      * All rules that should be validated.
      *
      * @return Rules to validate.
      */
     Rule[] rules();
}
