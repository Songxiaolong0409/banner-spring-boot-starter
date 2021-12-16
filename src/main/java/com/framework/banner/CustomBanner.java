/**
 * Copyright @2018 xiaolong.song All Rights Reserved
 */
package com.framework.banner;

/**
 * @author xiaolong.song
 * @Description:  Banner
 * @Package com.framework.banner
 * @email loye.song@foxmail.com
 * @date 2018/6/6 13:20
 */
public class CustomBanner implements IBanner {

    public CustomBanner() {
    }

    @Override
    public BannerEntiy getBannerEntiy() {
        StringBuffer stringBuffer=new StringBuffer();
        /*stringBuffer.append("  ______                             ").append(",");
        stringBuffer.append(" |  ____|                            ").append(",");
        stringBuffer.append(" | |__ _____  _____ ___  _ __  _ __  ").append(",");
        stringBuffer.append(" |  __/ _ \\ \\/ / __/ _ \\| '_ \\| '_ \\ ").append(",");
        stringBuffer.append(" | | | (_) >  < (_| (_) | | | | | | |").append(",");
        stringBuffer.append(" |_|  \\___/_/\\_\\___\\___/|_| |_|_| |_|").append(",");*/


        stringBuffer.append(" __  __       _     _ _      _____       _").append(",");
        stringBuffer.append("|  \\/  |     | |   (_) |    |  __ \\     (_)").append(",");
        stringBuffer.append("| \\  / | ___ | |__  _| | ___| |  | |_ __ ___   _____").append(",");
        stringBuffer.append("| |\\/| |/ _ \\| '_ \\| | |/ _ \\ |  | | '__| \\ \\ / / _ \\").append(",");
        stringBuffer.append("| |  | | (_) | |_) | | |  __/ |__| | |  | |\\ V /  __/").append(",");
        stringBuffer.append("|_|  |_|\\___/|_.__/|_|_|\\___|_____/|_|  |_| \\_/ \\___|").append(",");



        BannerEntiy bannerEntiy=new BannerEntiy();
        bannerEntiy.setBanner(stringBuffer);
        bannerEntiy.setCopyright("MobileDrive");

        return bannerEntiy;
    }

}
