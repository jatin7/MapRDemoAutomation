package com.mapr.jatin.annotations.request.cmd;

import com.mapr.jatin.annotations.containers.cmd.LineContainer;

import java.lang.annotation.*;

/**
 * Only for annotate {@link requests.CommandRequest}
 * 
 * @author Jatin Shah
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Repeatable(LineContainer.class)
public @interface Line {
	String value() default "";
}
