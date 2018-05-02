package com.mapr.jatin.annotations.request.restf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Only for annotate {@link requests.RestfRequest}
 * 
 * @author zhangyutao
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface Auth {
	String type() default "";

	String host() default "";

	String realm() default "";

	String username() default "";

	String password() default "";

	boolean preemptive() default false;
}
