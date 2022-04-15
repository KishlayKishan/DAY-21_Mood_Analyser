/* @Purpose : Ability to analyse mood and respond either happy or sad
 * @File : Mood Analyzer
 * @Author : Kishlay Kishan
 */

package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	private String msg;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String msg) {
		this.msg = msg;
	}

	public String analyzeMood() {
		try {
			if (msg.contains("Sad")) {
				return "Sad";
			}
			return "Happy";
		} catch (NullPointerException e) {
			return "Happy";
		}
	}
}