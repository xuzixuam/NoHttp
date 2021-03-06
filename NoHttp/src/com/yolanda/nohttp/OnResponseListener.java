/*
 * Copyright © YOLANDA. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yolanda.nohttp;

/**
 * Created in Jul 28, 2015 7:32:53 PM
 * 
 * @author YOLANDA
 */
public abstract interface OnResponseListener<T> {

	/**
	 * When the request starts
	 * 
	 * @param what The credit of the incoming request is used to distinguish between multiple requests
	 */
	public abstract void onStart(int what);

	/**
	 * Server correct response to callback when an HTTP request
	 * 
	 * @param what The credit of the incoming request is used to distinguish between multiple requests
	 * @param response In response to the results
	 */
	public abstract void onSucceed(int what, Response<T> response);

	/**
	 * When there was an error correction
	 * 
	 * @param what The credit of the incoming request is used to distinguish between multiple requests
	 * @param tag Tag of request callback
	 * @param message error message for request
	 */
	public abstract void onFailed(int what, String url, Object tag, CharSequence message);

	/**
	 * When the request finish
	 * 
	 * @param what The credit of the incoming request is used to distinguish between multiple requests
	 */
	public abstract void onFinish(int what);

}
