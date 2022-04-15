/* @Purpose : Ability to analyse mood and respond either happy or sad
 * @File : Mood Analyzer
 * @Author : Kishlay Kishan
 */

package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	public String analyseMood(String msg) {
		if (msg.contains("Sad")) {
			return "Sad";
		}
		return "Happy";
	}
}
