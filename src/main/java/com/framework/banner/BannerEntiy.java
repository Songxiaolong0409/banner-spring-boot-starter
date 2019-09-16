package com.framework.banner;

import lombok.Data;

@Data
public class BannerEntiy {

    private StringBuffer banner=new StringBuffer("");

    private String version="(v1.0)";

    private String copyright="xiaolong.song";
}
