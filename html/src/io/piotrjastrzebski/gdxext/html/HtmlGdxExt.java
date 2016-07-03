package io.piotrjastrzebski.gdxext.html;

import io.piotrjastrzebski.gdxext.core.GdxExt;

/**
 * Created by PiotrJ on 01/07/16.
 */
public class HtmlGdxExt implements GdxExt {
	@Override public float compute (float x, float y) {
		return x + y;
	}

	@Override public String type () {
		return "Html";
	}
}
