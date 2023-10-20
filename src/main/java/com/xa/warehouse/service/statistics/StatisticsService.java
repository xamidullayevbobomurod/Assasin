package com.xa.warehouse.service.statistics;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StatisticsService  {


    public double calculateMean(List<Double> numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }


    public double calculateMedian(List<Double> numbers) {
        Collections.sort(numbers);
        int size = numbers.size();

        if (size % 2 != 0) {
            return numbers.get(size / 2);
        } else {
            return (numbers.get((size - 1) / 2) + numbers.get(size / 2)) / 2.0;
        }
    }


    public List<Double> calculateMode(List<Double> numbers) {
        Map<Double, Integer> frequencyMap = new HashMap<>();

        for (double num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = Collections.max(frequencyMap.values());
        List<Double> modes = new ArrayList<>();

        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                modes.add(entry.getKey());
            }
        }

        return modes;
    }


    public double calculateRange(List<Double> numbers) {
        double max = Collections.max(numbers);
        double min = Collections.min(numbers);
        return max - min;
    }
}


