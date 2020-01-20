package test;

import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class TestPinyin {

    public static void main(String[] args) throws Exception {
        System.out.print(testPinyin());

    }

    private static String testPinyin() throws BadHanyuPinyinOutputFormatCombination {
        String pinyinRegex = "[\\u4E00-\\u9FA5]+";
        String name = "三月春回大地万象更新在春暖花开之际邀你迎春接福到店试驾十重惊喜等你来发掘宋体宋体宋体宋体宋体宋体普通表格惊喜一活动时间线上报名参与活动在活动期间到店的用户即可获得保温杯一个惊喜二活动时间呼朋唤友一同到店可得镀金玫瑰花一支惊喜三活动时间到店试驾任意车型均能获取试驾好礼一份惊喜四活动期间老客户成功介绍亲朋好友购车就能获得元油卡一张惊喜五活动期间订车用户皆可得精美茶具一套惊喜六活动期间指定车型尊享成首付惊喜七活动期间订购指定车型尊享折优惠惊喜八活动期间订购指定车型加赠元电尾门惊喜九活动期间订购指定车型即可获得直通上海大奖赛名额亲历第场置身现场享受顶级赛事的激情与魅力见证赛道传奇惊喜十活动期间置换购车臻享元大礼包";
        char[] charArray = name.toCharArray();
        StringBuilder pinyin = new StringBuilder();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        // 设置大小写格式
        defaultFormat.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        // 设置声调格式：
//        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < charArray.length; i++) {
            //匹配中文,非中文转换会转换成null
            if (Character.toString(charArray[i]).matches(pinyinRegex)) {
                pinyin.append(charArray[i]);
//            String[] hanyuPinyinStringArray = PinyinHelper.toHanyuPinyinStringArray(charArray[i], defaultFormat);
//            if (hanyuPinyinStringArray != null) {
//                pinyin.append(hanyuPinyinStringArray[1].charAt(0));
//            }
            } else {
//            pinyin.append(charArray[0]);
            }
        }
        return pinyin.toString();
    }
}