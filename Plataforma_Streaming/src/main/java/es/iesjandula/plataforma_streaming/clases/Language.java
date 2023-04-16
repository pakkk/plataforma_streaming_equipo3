/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesjandula.plataforma_streaming.clases;

/**
 *
 * @author 1DAM
 */
public enum Language {
	
	ENGLISH, FRENCH, SPANISH, CHINESE, NOTAVAILABLE;

	public static boolean isSpanish(Language language) {
		if (language.equals(SPANISH)) {
			return true;
		}
		return false;
	}

	public static boolean isFrench(Language language) {
		if (language.equals(FRENCH)) {
			return true;
		}
		return false;
	}

	public static boolean isEnglish(Language language) {
		if (language.equals(ENGLISH)) {
			return true;
		}
		return false;
	}

	public static boolean isChinese(Language language) {
		if (language.equals(CHINESE)) {
			return true;
		}
		return false;
	}

	public static boolean isNotAvailable(Language language) {
		if (language.equals(SPANISH)) {
			return true;
		}
		return false;
	}
}
