package com.framework.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.ansi.AnsiStyle;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

public interface IBanner extends Banner  {

    public BannerEntiy getBannerEntiy();

    default void printBanner(Environment environment, Class<?> sourceClass, PrintStream printStream) {

        BannerEntiy bannerEntiy=getBannerEntiy();
        StringBuffer stringBuffer=bannerEntiy.getBanner();
        stringBuffer.append("\n");

        String[] var4 = stringBuffer.toString().split(",");
        int var5 = var4.length;

        for (int i = 0; i < var5; ++i) {
            String line = var4[i];
            printStream.println(AnsiOutput.toString(new Object[]{AnsiColor.MAGENTA, line}));
        }

        String version = bannerEntiy.getVersion();
        printStream.println(AnsiOutput.toString(new Object[]{AnsiColor.GREEN, " :: Powered by "+bannerEntiy.getCopyright()+".inc :: ", AnsiColor.DEFAULT, AnsiStyle.FAINT, version}));
        printStream.println();
    }

}
