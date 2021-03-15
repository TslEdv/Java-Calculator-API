package ee.taltech.calculator.controller;

import ee.taltech.calculator.dto.CalculationResult;
import ee.taltech.calculator.service.CalculatorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("calculator")
public class CalculationController {

    private final CalculatorService calculatorService;

    @GetMapping(value = "/calculate1")
    public CalculationResult calculate1(@RequestParam List<Integer> input) {
        return calculatorService.calculate1(input);
    }

    @GetMapping(value = "/calculate2")
    public CalculationResult calculate2(@RequestParam List<Integer> input) {
        return calculatorService.calculate2(input);
    }
}
