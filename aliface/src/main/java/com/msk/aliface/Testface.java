package com.msk.aliface;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.facebody.model.v20191230.RecognizeActionRequest;
import com.aliyuncs.facebody.model.v20191230.RecognizeActionResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Testface {

    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-shanghai", "LTAI5tBa3ydB7o7DULRDC9mx", "0xm282WuHc0VBkouIe8enzcAlVuGR1");
        IAcsClient client = new DefaultAcsClient(profile);

        RecognizeActionRequest request = new RecognizeActionRequest();
        request.setRegionId("cn-shanghai");
        request.setType(1);
        List<RecognizeActionRequest.URLList> urlLists = new ArrayList<>();
        RecognizeActionRequest.URLList urlList1 = new RecognizeActionRequest.URLList();
        urlList1.setURL("http://www.bxjkw.cn/Files/201612/20161215100434319.jpgg");
        RecognizeActionRequest.URLList urlList2 = new RecognizeActionRequest.URLList();
        urlList2.setURL("http://www.bxjkw.cn/Files/201612/20161215100434319.jpg");
        RecognizeActionRequest.URLList urlList3 = new RecognizeActionRequest.URLList();
        urlList3.setURL("http://www.bxjkw.cn/Files/201612/20161215100434319.jpg");
        RecognizeActionRequest.URLList urlList4 = new RecognizeActionRequest.URLList();
        urlList4.setURL("http://www.bxjkw.cn/Files/201612/20161215100434319.jpg");
        urlLists.add(urlList1);
        urlLists.add(urlList2);
        urlLists.add(urlList3);
        urlLists.add(urlList4);
        request.setURLLists(urlLists);
//        request.setVideoUrl("http://viapi-test.oss-cn-shanghai.aliyuncs.com/RecognizeAction/actionvideo.mp4");

        try {
            RecognizeActionResponse response = client.getAcsResponse(request);
            System.out.println(new Gson().toJson(response));
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }
    }
}
