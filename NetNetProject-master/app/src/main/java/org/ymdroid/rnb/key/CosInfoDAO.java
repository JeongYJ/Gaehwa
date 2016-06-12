package org.ymdroid.rnb.key;

import org.ymdroid.rnb.R;

import java.util.ArrayList;
/**
 * Created by yj on 16. 6. 12..
 */
public class CosInfoDAO {

    private volatile static CosInfoDAO Instance = null;
    public ArrayList<CosInfo> cosInfos;

    //public String birth;

    private CosInfoDAO(){
        cosInfos = new ArrayList<CosInfo>();
        makeTable();
    }

    public static CosInfoDAO getInstance(){
        if(Instance==null){
            synchronized (CosInfoDAO.class){
                if(Instance==null)
                    Instance = new CosInfoDAO();
            }
        }
        return Instance;
    }

    private void makeTable(){
        CosInfo A = new CosInfo(24,0);
        A.idx = 0;
        A.img = R.drawable.sample_image;
        A.name = "마몽드 엑스트라 모이스처";
        A.brand = "아모레퍼시픽";
        A.type = "스킨";
        A.lowPrice = 8910;
        A.highPrice = 26180;
        A.code = "792850136991";
        A.krIng[0] = "정제수";
        A.krIng[1] = "부틸렌글라이콜";
        A.krIng[2] = "에탄올";
        A.krIng[3] = "베타인";
        A.krIng[4] = "피이지/피피지-17/6코폴리머";
        A.krIng[5] = "디에톡시에칠석시네이트";
        A.krIng[6] = "눈연꽃추출물";
        A.krIng[7] = "하이알루로닉애씨드";
        A.krIng[8] = "세라마이드3";
        A.krIng[9] = "하이드롤라이즈드루핀프로테인";
        A.krIng[10] = "피이지-60하이드로제네이티드캐스터오일";
        A.krIng[11] = "흰목이버섯추출물";
        A.krIng[12] = "잔탄검";
        A.krIng[13] = "카보머";
        A.krIng[14] = "페녹시에탄올";
        A.krIng[15] = "하이드록시에칠아크릴레이트/소듐아크릴로일디메칠타우레이트코폴리머";
        A.krIng[16] = "페닐트리메치콘";
        A.krIng[17] = "셀룰로오스검";
        A.krIng[18] = "에칠헥실글리세린";
        A.krIng[19] = "글리세린";
        A.krIng[20] = "아크릴레이트/스테아릴메타크릴레이트코폴리머";
        A.krIng[21] = "트로메타민";
        A.krIng[22] = "디소듐이디티에이";
        A.krIng[23] = "향료";

        A.enIng[0] = "Water Aqua";
        A.enIng[1] = "Butylene Glycol";
        A.enIng[2] = "Alcohol";
        A.enIng[3] = "Betaine";
        A.enIng[4] = "PEG/PPG-17/6 Copolymer";
        A.enIng[5] = "Diethoxyethyl Succinate";
        A.enIng[6] = "Saussurea Involucrata Extract";
        A.enIng[7] = "Hyaluronic Acid ";
        A.enIng[8] = "Ceramide3";
        A.enIng[9] = "Hydrolyzed Lupine Protein";
        A.enIng[10] = "PEG-60 Hydrogenated Castor Oil";
        A.enIng[11] = "Tremella Fuciformis (Mushroom) Extract";
        A.enIng[12] = "Xanthan Gum";
        A.enIng[13] = "Carbomer";
        A.enIng[14] = "Phenoxyethanol";
        A.enIng[15] = "Hydroxyethyl Acrylate/Sodium Acryloyldimethyl Taurate Copolymer";
        A.enIng[16] = "Phenyl Trimethicone";
        A.enIng[17] = "Cellulose Gum";
        A.enIng[18] = "Ethylhexylglycerin";
        A.enIng[19] = "Glycerin";
        A.enIng[20] = "Acrylates/Stearyl Methacrylate Copolymer";
        A.enIng[21] = "Tromethamine";
        A.enIng[22] = "Disodium EDTA";
        A.enIng[23] = "Flavor";

        A.danger[0] = 1;
        A.danger[1] = 1;
        A.danger[2] = 2;
        A.danger[3] = 1;
        A.danger[4] = 3;
        A.danger[5] = 0;
        A.danger[6] = 1;
        A.danger[7] = 1;
        A.danger[8] = 0;
        A.danger[9] = 1;
        A.danger[10] = 3;
        A.danger[11] = 1;
        A.danger[12] = 1;
        A.danger[13] = 1;
        A.danger[14] = 4;
        A.danger[15] = 1;
        A.danger[16] = 1;
        A.danger[17] = 1;
        A.danger[18] = 1;
        A.danger[19] = 2;
        A.danger[20] = 0;
        A.danger[21] = 2;
        A.danger[22] = 1;
        A.danger[23] = 8;

        A.rv.add(new Review("UserA", 3, "SoSo"));
        A.rv.add(new Review("UserB", 4, "좋아요"));

        cosInfos.add(A);


        A = new CosInfo(24,0);
        A.idx = 1;
        A.img = R.drawable.good;
        A.name = "마몽드 엑스트라 모이스처222";
        A.brand = "아모레퍼시픽";
        A.type = "스킨";
        A.lowPrice = 7910;
        A.highPrice = 56180;
        A.code = "792850136991";
        A.krIng[0] = "정제수";
        A.krIng[1] = "부틸렌글라이콜";
        A.krIng[2] = "에탄올";
        A.krIng[3] = "베타인";
        A.krIng[4] = "피이지/피피지-17/6코폴리머";
        A.krIng[5] = "디에톡시에칠석시네이트";
        A.krIng[6] = "눈연꽃추출물";
        A.krIng[7] = "하이알루로닉애씨드";
        A.krIng[8] = "세라마이드3";
        A.krIng[9] = "하이드롤라이즈드루핀프로테인";
        A.krIng[10] = "피이지-60하이드로제네이티드캐스터오일";
        A.krIng[11] = "흰목이버섯추출물";
        A.krIng[12] = "잔탄검";
        A.krIng[13] = "카보머";
        A.krIng[14] = "페녹시에탄올";
        A.krIng[15] = "하이드록시에칠아크릴레이트/소듐아크릴로일디메칠타우레이트코폴리머";
        A.krIng[16] = "페닐트리메치콘";
        A.krIng[17] = "셀룰로오스검";
        A.krIng[18] = "에칠헥실글리세린";
        A.krIng[19] = "글리세린";
        A.krIng[20] = "아크릴레이트/스테아릴메타크릴레이트코폴리머";
        A.krIng[21] = "트로메타민";
        A.krIng[22] = "디소듐이디티에이";
        A.krIng[23] = "향료";

        A.enIng[0] = "Water Aqua";
        A.enIng[1] = "Butylene Glycol";
        A.enIng[2] = "Alcohol";
        A.enIng[3] = "Betaine";
        A.enIng[4] = "PEG/PPG-17/6 Copolymer";
        A.enIng[5] = "Diethoxyethyl Succinate";
        A.enIng[6] = "Saussurea Involucrata Extract";
        A.enIng[7] = "Hyaluronic Acid ";
        A.enIng[8] = "Ceramide3";
        A.enIng[9] = "Hydrolyzed Lupine Protein";
        A.enIng[10] = "PEG-60 Hydrogenated Castor Oil";
        A.enIng[11] = "Tremella Fuciformis (Mushroom) Extract";
        A.enIng[12] = "Xanthan Gum";
        A.enIng[13] = "Carbomer";
        A.enIng[14] = "Phenoxyethanol";
        A.enIng[15] = "Hydroxyethyl Acrylate/Sodium Acryloyldimethyl Taurate Copolymer";
        A.enIng[16] = "Phenyl Trimethicone";
        A.enIng[17] = "Cellulose Gum";
        A.enIng[18] = "Ethylhexylglycerin";
        A.enIng[19] = "Glycerin";
        A.enIng[20] = "Acrylates/Stearyl Methacrylate Copolymer";
        A.enIng[21] = "Tromethamine";
        A.enIng[22] = "Disodium EDTA";
        A.enIng[23] = "Flavor";

        A.danger[0] = 1;
        A.danger[1] = 1;
        A.danger[2] = 2;
        A.danger[3] = 1;
        A.danger[4] = 3;
        A.danger[5] = 0;
        A.danger[6] = 1;
        A.danger[7] = 1;
        A.danger[8] = 0;
        A.danger[9] = 1;
        A.danger[10] = 3;
        A.danger[11] = 1;
        A.danger[12] = 1;
        A.danger[13] = 1;
        A.danger[14] = 4;
        A.danger[15] = 1;
        A.danger[16] = 1;
        A.danger[17] = 1;
        A.danger[18] = 1;
        A.danger[19] = 2;
        A.danger[20] = 0;
        A.danger[21] = 2;
        A.danger[22] = 1;
        A.danger[23] = 8;

        A.rv.add(new Review("UserA", 3, "SoSo"));
        A.rv.add(new Review("UserB", 4, "좋아요"));

        cosInfos.add(A);
    }

}
