/**
 * 
 */
package de.hybris.platform.bonstore.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;


/**
 * Meta-annotation considering a class as {@link Component} having scope tenant. With this is is detectable by Spring's
 * component scan and will get the scope tenant applied out of the box.
 * 
 */
@Target(
{ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Scope("singleton")
public @interface SingletonScopedComponent
{
	/**
	 * The value may indicate a suggestion for a logical component name, to be turned into a Spring bean in case of an
	 * autodetected component.
	 * 
	 * @return the suggested component name, if any
	 */
	String value() default "";
}
