/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging.exception;

/**
 * This is the root class of all checked exceptions in the OMS API.
 * <p>
 * A OMSException consists of the following parts:
 * <ul>
 * <li>A provider-specific string describing the error.</li>
 * <li>A provider-specific string error code to identify the specific exception type.</li>
 * </ul>
 *
 * @version OMS 1.0.0
 * @since OMS 1.0.0
 */
public class OMSException extends Exception {

    /**
     * Vendor-specific error code.
     **/
    private final String errorCode;

    /**
     * Constructs a {@code OMSException} with the specified detail message
     * and error code.
     *
     * @param errorCode a specified error code
     * @param message a description of the exception
     **/
    public OMSException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * Constructs a {@code OMSException} with the specified error code and cause.
     *
     * @param errorCode a specified error code
     * @param cause the underlying cause of this exception
     */
    public OMSException(String errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    /**
     * Constructs a {@code OMSException} with the specified detail message,
     * error code and cause.
     *
     * @param errorCode a specified error code
     * @param message a description of the exception
     * @param cause the underlying cause of this exception
     */
    public OMSException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    /**
     * Returns the error code of this {@code OMSException} object.
     *
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }
}
