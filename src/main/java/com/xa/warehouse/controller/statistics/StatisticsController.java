package com.xa.warehouse.controller.statistics;

import com.xa.warehouse.service.statistics.StatisticsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/statistics/")
public class StatisticsController {

    private final StatisticsService statisticsService;


    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }


    @GetMapping("mean/")
    public double calculateMean(@RequestBody List<Double> numbers) {
        return statisticsService.calculateMean(numbers);
    }



    @GetMapping("median/")
    public double calculateMedian(@RequestBody List<Double> numbers) {
        return statisticsService.calculateMedian(numbers);
    }

    @GetMapping("mode/")
    public List<Double> calculateMode(@RequestBody List<Double> numbers) {
        return statisticsService.calculateMode(numbers);
    }


    @GetMapping("range/")
    public double calculateRange(@RequestBody List<Double> numbers) {
        return statisticsService.calculateRange(numbers);


    }
}


//    @GetMapping("mean/")
//    public ResponseEntity<Double> calculateMean(@RequestBody List<Double> numbers) {
//        return ResponseEntity.ok(statisticsService.calculateMean(numbers));
//    }
//
//    @GetMapping("median/")
//    public ResponseEntity<Double> calculateMedian(@RequestBody List<Double> numbers) {
//        return ResponseEntity.ok(statisticsService.calculateMedian(numbers));
//    }
//
//    @GetMapping("mode/")
//    public ResponseEntity<List<Double>> calculateMode(@RequestBody List<Double> numbers) {
//        return ResponseEntity.ok(statisticsService.calculateMode(numbers));
//    }
//
//    @GetMapping("range/")
//    public ResponseEntity<Double> calculateRange(@RequestBody List<Double> numbers) {
//        return ResponseEntity.ok(statisticsService.calculateRange(numbers));
//    }
//}






