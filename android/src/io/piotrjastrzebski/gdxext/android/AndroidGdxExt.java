package io.piotrjastrzebski.gdxext.android;

import io.piotrjastrzebski.aartestlib.AARTest;
import io.piotrjastrzebski.gdxext.core.GdxExt;
import io.piotrjastrzebski.gdxext.core.GdxExtManager;

/**
 * Created by PiotrJ on 01/07/16.
 */
public class AndroidGdxExt implements GdxExt {
	/*
	This libs code is:
	public class AARTest {
	 public float compute (float x, float y) {
		  return x + y;
	 }

	 public String type () {
		  return "AAR";
	 }
	}

	aar was generated with buildDebug in android studio, lib stub was generated via new module, android library,

	 */
	AARTest aarTest;
	public AndroidGdxExt() {
		aarTest = new AARTest();
	}

	@Override public float compute (float x, float y) {
		return aarTest.compute(x, y);
	}

	@Override public String type () {
		return aarTest.type();
	}
}
