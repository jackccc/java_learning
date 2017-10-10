package jack.chen.controller;

import jack.chen.models.ResultModel;
import jack.chen.services.GetArrayService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.text.NumberFormat;

@RestController
@EnableAutoConfiguration
public class GetArrayController {
    @RequestMapping("/array")
    @ResponseBody
    public ResultModel GetArray(){

        long startTime = System.nanoTime();
        ResultModel result = new ResultModel();
        result.setStartTime(startTime);

        GetArrayService arrayService = new GetArrayService();
        result.resultArray = arrayService.GetRandomArray();

        long endTime = System.nanoTime();
        result.setEndTime(endTime);
        result.timeCost = "执行耗时" + ((result.getEndTime() - result.getStartTime()) ) + "毫秒";
        return result;
    }
}
