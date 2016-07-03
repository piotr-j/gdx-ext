package io.piotrjastrzebski.gdxext.android;

import io.piotrjastrzebski.gdxext.core.GdxExt;
import io.piotrjastrzebski.gdxext.core.GdxExtManager;

/**
 * Created by PiotrJ on 01/07/16.
 */
public class AndroidGdxExt implements GdxExt {
	@Override public float compute (float x, float y) {
		return x + y;
	}

	@Override public String type () {
		return "Android";
	}
}
