package ee.taltech.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@SpringBootTest
class CalculatorApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	@DisplayName("Calculator1 Test on no input")
	void Calculator1TestWithNoInput() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1"))
				.andExpect(status().is4xxClientError());
	}

	@Test
	@DisplayName("Calculator1 Test with only positive numbers")
	void Calculator1TestWithPositiveNumbers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1?input=1,2,3,4,5"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.maxEven").value(4))
				.andExpect(jsonPath("$.minOdd").value(1))
				.andExpect(jsonPath("$.even").exists())
				.andExpect(jsonPath("$.even[1]").value(4));
	}

	@Test
	@DisplayName("Calculator1 Test with only negative numbers")
	void Calculator1TestWithNegativeNumbers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1?input=-1,-2,-3,-4,-5"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.maxEven").value(-2))
				.andExpect(jsonPath("$.minOdd").value(-5))
				.andExpect(jsonPath("$.even").exists())
				.andExpect(jsonPath("$.even[1]").value(-4));
	}

	@Test
	@DisplayName("Calculator1 Test with both negative and positive numbers")
	void Calculator1TestWithBothNumbers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1?input=-1,2,-3,4,-5"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.maxEven").value(4))
				.andExpect(jsonPath("$.minOdd").value(-5))
				.andExpect(jsonPath("$.even").exists())
				.andExpect(jsonPath("$.even[1]").value(4));
	}

	@Test
	@DisplayName("Calculator1 Test with only even numbers")
	void Calculator1TestWithEvenNumbers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1?input=2,4,6"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.maxEven").value(6))
				.andExpect(jsonPath("$.minOdd").doesNotExist())
				.andExpect(jsonPath("$.even").exists())
				.andExpect(jsonPath("$.even[1]").value(4));
	}

	@Test
	@DisplayName("Calculator1 Test with only odd numbers")
	void Calculator1TestWithOddNumbers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1?input=1,3,5"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.maxEven").doesNotExist())
				.andExpect(jsonPath("$.minOdd").value(1))
				.andExpect(jsonPath("$.even").doesNotExist());
	}
}
