package io.piotrjastrzebski.gdxext.ios;

import io.piotrjastrzebski.gdxext.core.GdxExt;

/**
 * Created by PiotrJ on 01/07/16.
 */
public class IosRoboVMGdxExt implements GdxExt {
	@Override public float compute (float x, float y) {
		return x + y;
	}

	@Override public String type () {
		return "IosRoboVM";
	}
}
