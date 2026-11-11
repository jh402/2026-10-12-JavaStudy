package com.sist.format;

import java.text.ChoiceFormat;

public class Format_3 {
	public static void main(String[] args) {
		//59이하, 60~69, 70~79, 80~89, 90이상
        double[] limits={0, 60, 70, 80, 90};
        String[] formats= {"F", "D", "C", "B", "A"};
        
        ChoiceFormat cf=new ChoiceFormat(limits, formats);
        //85이므로 배열의 4번째 요소가 출력
        System.out.println(cf.format(85));
	}
}
