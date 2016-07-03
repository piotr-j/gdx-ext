package io.piotrjastrzebski.gdxext.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.reflect.ClassReflection;

/**
 * Created by PiotrJ on 01/07/16.
 */
public final class GdxExtManager {
	private final static String TAG = GdxExtManager.class.getSimpleName();
	private static GdxExt gdxExt;
	private static boolean loaded;

	public static GdxExt install() {
		if (loaded) return gdxExt;
		loaded = true;
		switch (Gdx.app.getType()) {
		case Android:
			return installAndroid();
		case Desktop:
			return installDesktop();
		case iOS:
			return installIOS();
		case WebGL:
			return installWebGL();
		case Applet:
			Gdx.app.error(TAG, "Applet app type is not supported!");
			break;
		case HeadlessDesktop:
			Gdx.app.error(TAG, "Headless desktop app type is not supported!");
			break;
		}
		return null;
	}

	public static void uninstall() {
		if (!loaded) return;
		loaded = false;
		// TODO do any cleanup needed
		gdxExt = null;
	}

	private static GdxExt installDesktop () {
		try {
			Class<?> gdxExtClazz =
				ClassReflection.forName("io.piotrjastrzebski.gdxext.desktop.DesktopGdxExt");
			gdxExt = (GdxExt)ClassReflection.newInstance(gdxExtClazz);
		} catch (Exception ex) {
			Gdx.app.error(TAG, "Desktop CommonInterface failed to install!", ex);
		}
		return gdxExt;
	}

	private static GdxExt installAndroid () {
		try {
			Class<?> gdxExtClazz =
				ClassReflection.forName("io.piotrjastrzebski.gdxext.android.AndroidGdxExt");
			gdxExt = (GdxExt)ClassReflection.newInstance(gdxExtClazz);
		} catch (Exception ex) {
			Gdx.app.error(TAG, "Desktop CommonInterface failed to install!", ex);
		}
		return gdxExt;
	}

	private static GdxExt installIOS () {
		try {
			Class<?> gdxExtClazz =
				ClassReflection.forName("io.piotrjastrzebski.gdxext.iosmoe.IosMoeGdxExt");
			gdxExt = (GdxExt)ClassReflection.newInstance(gdxExtClazz);
		} catch (Exception ex) {
			Gdx.app.error(TAG, "Desktop CommonInterface failed to install!", ex);
		}
		return gdxExt;
	}

	private static GdxExt installWebGL () {
		try {
			Class<?> gdxExtClazz =
				ClassReflection.forName("io.piotrjastrzebski.gdxext.html.HtmlGdxExt");
			gdxExt = (GdxExt)ClassReflection.newInstance(gdxExtClazz);
		} catch (Exception ex) {
			Gdx.app.error(TAG, "Desktop CommonInterface failed to install!", ex);
		}
		return gdxExt;
	}
}
