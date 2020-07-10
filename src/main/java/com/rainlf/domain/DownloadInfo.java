package com.rainlf.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : rain
 * @date : 2020/7/10 14:40
 */
@Data
@NoArgsConstructor
public class DownloadInfo {
    public String imageName;
    public String imageUrl;
    public String mp4Name;
    public String mp4Url;
    public String mp4HdName;
    public String mp4HdUrl;
    public String mp4MobileName;
    public String mp4MobileUrl;

    private static String httpPrefix = "http:";
    private static String httpsPrefix = "https://cn.bing.com";

    public DownloadInfo(BingInfo.Image image) {
        DownloadInfo resource = new DownloadInfo();
        if (image.getVid() == null) {
            imageName = getName(image.getUrl());
            imageUrl = httpsPrefix + image.getUrl();
        } else {
            // rain todo parse
//            imageName = StringUtils.getFilename(image.getVid().getImage());
//            imageUrl = httpPrefix + image.getVid().getImage();
//            mp4Name = StringUtils.getFilename(image.getVid().getSources().get(0).get(2));
//            mp4Url = httpPrefix + image.getVid().getSources().get(0).get(2);
//            mp4HdName = StringUtils.getFilename(image.getVid().getSources().get(1).get(2));
//            mp4HdUrl = httpPrefix + image.getVid().getSources().get(1).get(2);
//            mp4MobileName = StringUtils.getFilename(image.getVid().getSources().get(2).get(2));
//            mp4MobileUrl = httpPrefix + image.getVid().getSources().get(2).get(2);
        }
    }

    private String getName(String value) {
        return value.substring(value.indexOf("=") + 1, value.indexOf("&"));
    }
}
