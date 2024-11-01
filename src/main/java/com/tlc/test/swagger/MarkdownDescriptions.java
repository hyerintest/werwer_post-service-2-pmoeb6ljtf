package com.tlc.test.swagger;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

@Target({METHOD, TYPE, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MarkdownDescriptions {
        MarkdownDescription[] value() default {};

}
