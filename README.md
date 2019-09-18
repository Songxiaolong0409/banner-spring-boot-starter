# banner-spring-boot-starter

### 1. 引用jar包，自定义bannner

修改com.framework.banner.CustomBanner.getBannerEntiy()的输出即可。

    <dependency>
        <groupId>com.framework.banner</groupId>
        <artifactId>banner-spring-boot-starter</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
    
### 2. 随机端口号

    server:
      port: ${randomServerPort.value[10000,19999]}    