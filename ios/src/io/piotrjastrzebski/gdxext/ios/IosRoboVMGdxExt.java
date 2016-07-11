package io.piotrjastrzebski.gdxext.ios;

import io.piotrjastrzebski.gdxext.core.GdxExt;
import io.piotrjastrzebski.gdxext.ios.bindings.LibraryTest;

/**
 * Created by PiotrJ on 01/07/16.
 */
public class IosRoboVMGdxExt implements GdxExt {
	private LibraryTest libraryTest;
	public IosRoboVMGdxExt (){
		libraryTest = new LibraryTest();
	}

	@Override public float compute (float x, float y) {
		return (float)libraryTest.compute(x, y);
	}

	@Override public String type () {
//		return "IosRoboVM";
		return libraryTest.getType();
	}
}
