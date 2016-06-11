package org.ymdroid.rnb.key;

/**
 * Created by yj on 16. 6. 12..
 */
public class CosInfo {
    String name;
    String brand;
    String type;
    int lowPrice;
    int highPrice;
    int[] rc; //추천화장품 인덱스
    int code; //바코드

    String[] krIng; //한글이름
    String[] enIng; //영문이름
    int[] danger; //위험도
}
