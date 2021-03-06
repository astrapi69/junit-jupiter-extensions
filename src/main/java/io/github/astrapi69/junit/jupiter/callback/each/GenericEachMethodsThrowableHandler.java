/**
 * The MIT License
 *
 * Copyright (C) 2021 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.junit.jupiter.callback.each;

import java.awt.HeadlessException;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.LifecycleMethodExecutionExceptionHandler;

import io.github.astrapi69.junit.jupiter.callback.AbstractThrowableTypeResolver;

/**
 * The abstract class {@link GenericEachMethodsThrowableHandler} can be used if the
 * {@link HeadlessException} should be ignored in the @BeforeEach lifecycle methods. For more
 * information for the lifecycle
 * <a href= "https://junit.org/junit5/docs/current/user-guide/#extensions-execution-order-overview">
 * https://junit.org/junit5/docs/current/user-guide/#extensions-execution-order-overview</a>
 */
public abstract class GenericEachMethodsThrowableHandler<T extends Throwable>
	extends
		AbstractThrowableTypeResolver<T>
	implements
		LifecycleMethodExecutionExceptionHandler
{

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void handleBeforeEachMethodExecutionException(ExtensionContext context,
		Throwable throwable) throws Throwable
	{
		if (throwable.getClass().equals(getType()))
		{
			return;
		}
		throw throwable;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void handleAfterEachMethodExecutionException(ExtensionContext context,
		Throwable throwable) throws Throwable
	{
		if (throwable.getClass().equals(getType()))
		{
			return;
		}
		throw throwable;
	}

}
