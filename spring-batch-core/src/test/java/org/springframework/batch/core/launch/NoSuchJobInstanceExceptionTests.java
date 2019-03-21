/*
 * Copyright 2006-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.batch.core.launch;

import org.springframework.batch.core.AbstractExceptionTests;

/**
 * @author Dave Syer
 *
 */
public class NoSuchJobInstanceExceptionTests extends AbstractExceptionTests {

	/* (non-Javadoc)
	 * @see org.springframework.batch.io.exception.AbstractExceptionTests#getException(java.lang.String)
	 */
	@Override
	public Exception getException(String msg) throws Exception {
		return new NoSuchJobInstanceException(msg);
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.io.exception.AbstractExceptionTests#getException(java.lang.String, java.lang.Throwable)
	 */
	@Override
	public Exception getException(String msg, Throwable t) throws Exception {
		return new NoSuchJobInstanceException(msg, t);
	}

}
