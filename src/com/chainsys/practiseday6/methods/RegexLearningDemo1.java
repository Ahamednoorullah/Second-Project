package com.chainsys.practiseday6.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearningDemo1 {

	public static void main(String[] args) {
		String sentences = "thupparkku thuppaya thuppaki thupparku thuppaya thoovum mazhai";

		Pattern p = Pattern.compile("thuppa");
		Matcher m = p.matcher(sentences);
		
		int count =0;
		while (m.find()) {
			System.out.println(m.group() + " Starts at "+m.start()+" ends at "+m.end());
		count++;
		}
		System.out.println("thuppa appears "+count+ " times");
	}

}
