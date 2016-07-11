/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.piotrjastrzebski.gdxext.ios.bindings;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.MachineSizedFloat;

@NativeClass
public class LibraryTest extends NSObject {

	//	@Property(selector = "type")
	// works!
	@Property
	public native String getType ();

	// works!
	@Method(selector = "computeDouble:")
	public native double computeDouble (double value);

	// doesnt! need to figure out proper names
	// NOTE all native stuff must be doubles, optionally marked as floats
	@Method(selector = "compute:and:")
	public native double compute (@MachineSizedFloat double value, @MachineSizedFloat double with);

	public float computeFloats(float value, float with) {
		return (float)compute(value, with);
	}
	/*
		-(CGFloat)compute:(CGFloat)value :(CGFloat)with;
	 */

	/*
	@Method(selector = "asImageWithSize:andScale:")
   public native UIImage asImageWithSize(@ByVal CGSize maximumSize, @MachineSizedFloat double scale);

	-(UIImage*)asImageWithSize:(CGSize)maximumSize andScale:(CGFloat)scale;

	 */
}
