package test;

public class HtmlToTxtTest {

    public static void main(String[] args) {
        String ss = "<p data-spm-anchor-id='0.0.0.i25.9abede4dG7V0Lc'>东风标致新一代508L，邀你成为首席体验官！</p><img url='https://img.alicdn.com/tfs/TB1d3_4XDZmx1VjSZFGXXax2XXa-1099-810.png'></img><p data-spm-anchor-id='0.0.0.i25.9abede4dG7V0Lc'>免费预约试驾瓜分千元红包</p><p data-spm-anchor-id='0.0.0.i24.9abede4dG7V0Lc'>参与店铺试驾赢取4月上海车展门票/蓝牙耳机/价值3000元的GoPro运动相机。</p><p data-spm-anchor-id='0.0.0.i26.9abede4dG7V0Lc'>到店试驾后上传试驾体验还可赢取扫地机器人，老车主还可享500元油卡。<img src='https://img.alicdn.com/imgextra/i2/1048557669/O1CN01yzBx4126WRwbGvCBK_!!1048557669-0-tmallcaradmin.jpg' style='max-width: 100%;'></p><p data-spm-anchor-id='0.0.0.i26.9abede4dG7V0Lc'><br></p>";
        //剔出<html>的标签
        String txtcontent = ss.replaceAll("</?[^>]+>", "");
        //去除字符串中的空格,回车,换行符,制表符
        txtcontent = txtcontent.replaceAll("<a>\\s*|\t|\r|\n</a>", "");
        System.out.println(txtcontent);

        //HTMLEditorKit.ParserCallback
    }
}