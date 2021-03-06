/*
 * Copyright (c) 2017-18 Mindstix Software Labs, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.mindstix.baseline;

/**
 * FlavorSpecific class for 'QA' build variants.
 * This class will hold all the required configuration for running 'QA' variant of the application.
 * Example: Analytics Keys, Crash Reporting Tool Keys, Push Notification Platform Configuration etc.
 *
 * @author Mindstix Software Labs, Inc.
 */

public class FlavorSpecific {

    public static final String APP_LOG_TAG = "Baseline QA";

    // Weather API base URL.
    public static final String API_BASE_URL = "http://api.openweathermap.org";

    // Weather API application ID.
    public static final String APP_ID = "63651b78dd7c768fc9b24a55353646fd";

    // Weather condition icon base URL.
    public static final String ICON_BASE_URL = "http://openweathermap.org/img/w/";
}
