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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import io.github.astrapi69.junit.jupiter.callback.before.test.GenericThrowableExtension;
import io.github.astrapi69.junit.jupiter.callback.before.test.IgnoreHeadlessExceptionExtension;

/**
 * The unit test class for the class {@link IgnoreHeadlessExceptionExtension}
 */
@ExtendWith(IgnoreHeadlessExceptionEachMethodsThrowableHandler.class)
public class IgnoreHeadlessExceptionEachMethodsThrowableHandlerTest
{

	/**
	 * Test method for
	 * {@link GenericEachMethodsThrowableHandler#handleBeforeEachMethodExecutionException(ExtensionContext, Throwable)}
	 */
	@BeforeEach
	public void beforeEach()
	{
		throw new HeadlessException();
	}

	/**
	 * Test method for
	 * {@link GenericEachMethodsThrowableHandler#handleAfterEachMethodExecutionException(ExtensionContext, Throwable)}
	 */
	@AfterEach
	public void afterEach()
	{
		throw new HeadlessException();
	}


	/**
	 * Test method for
	 * {@link GenericThrowableExtension#handleTestExecutionException(ExtensionContext, Throwable)}
	 */
	@ExtendWith(IgnoreHeadlessExceptionExtension.class)
	@Test
	public void test()
	{
		throw new HeadlessException();
	}
}
