package test;


import org.apache.commons.lang3.StringEscapeUtils;
//import org.springframework.web.util.HtmlUtils;

/**
 * 测试特殊字符转义
 */
public class JSONTest {

    public static void main(String[] args) {
        String s1 = "<p data-spm-anchor-id='0.0.0.i3.4542de4dwYS0XB'>活动说明，必填项，使用文本编辑器（同知识库新增模块的逻辑）；活动时间，必填项，需要填入开始和结束时间，点击后使用时间选择组件（见demo），只可选择当前日期之后时间（当前及之前的日期在日历上置灰不可选择），选定日期后再展开整点时间，选中某一个时间后再收起选择组件，并带入到选择框内，结束时间必须晚于开始时间；报名时间，开始时间必须早于等于活动开始时间<br><br></p><p data-spm-anchor-id='0.0.0.i3.4542de4dwYS0XB'><img src='https://img.alicdn.com/imgextra/i1/3696339109/O1CN012H9yGgTOnddlmG3_!!3696339109-0-tmallcaradmin.jpg' style='max-width:100%;'></p>";
        String s2 = "<p><img src='http://192.168.201.108:8888/group2/M00/04/D8/wKjJbFwvsi6AdVCTAACI6-7rEuE7316502'></p>  <p>CIA Director Mike Pompeo will affirm in his confirmation hearing the U.S.’ ‘soft policy’ toward Russia is over. (AP Photo/Manuel Balce Ceneta)</p><p>The U.S. Secretary of State said that Washington will talk with Ankara to make sure it will not “slaughter” Kurds in Syria after the upcoming withdrawal of American troops from the war-torn country.</p>  <p>“The importance of ensuring that the Turks don’t slaughter the Kurds, the protection of religious minorities there in Syria. All of those things are still part of the American mission set,” Mike Pompeo said during an interview with Newsmax, a U.S. news and opinion site popular with conservatives, on January 3.</p><p>President Donald Trump’s decision to withdraw U.S. forces from Syria led to a backlash from the media and many politicians. One of the main sources of criticism was the timing of the surprise decision, which came ahead of a planned Turkish military operation against Washington’s proxies in northeastern Syria, where the vast of majority of Syria’s Kurds live.</p><p>Pompeo’s defended Trump’s decision and stressed that the withdrawal will go ahead. However, he didn’t give a more precise timeline so as not to tip off U.S. adversaries. Recent reports claim that the currently timeline for the withdraw will be four months.</p><p>Despite acknowledging that the U.S. had “real concerns” with Turkey’s President Recep Tayyip Erdogan, the Secretary of State stressed that Washington and Ankara have to work together on many issues.</p>  <p>“There are lots of places where we need to work with President Erdogan and the Turkish leadership to get good outcomes for the United States,” the National quoted Pompeo as saying.</p><p>It’s unclear yet how the U.S. will be able to ensure the safety of Syrian Kurds after the withdrawal of its forces. One of the ideas that are being mentioned now is the deployment of Arab forces from countries friendly to Damascus, such as the UAE and Egypt. However, this is yet to be confirmed.</p><p>More on this topic:</p>      Trump’s ‘Full’ & ‘Rapid’ Troops Withdrawal From Syria Appears To Be ‘Slow’ & ‘Smart’  <p>      Donate</p>";
        String s = StringEscapeUtils.escapeHtml4(s2);
        System.out.println(s);
        String s3 = StringEscapeUtils.unescapeHtml4(s);
        System.out.println(s3);
    }

}