package ee.taltech.calculator;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@SpringBootTest
class CalculationControllerTest {

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
				.andExpect(jsonPath("$.even").value(Matchers.containsInAnyOrder(2,4)));
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
				.andExpect(jsonPath("$.even").value(Matchers.containsInAnyOrder(-2,-4)));
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
				.andExpect(jsonPath("$.even").value(Matchers.containsInAnyOrder(2,4)));
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
				.andExpect(jsonPath("$.even").value(Matchers.containsInAnyOrder(2,4,6)));
	}

	@Test
	@DisplayName("Calculator1 Test with only odd numbers")
	void Calculator1TestWithOddNumbers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1?input=1,3,5"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.maxEven").doesNotExist())
				.andExpect(jsonPath("$.minOdd").value(1))
				.andExpect(jsonPath("$.even").value(Matchers.empty()));
	}
	@Test
	@DisplayName("Calculator2 test with positives and negatives")
	void Calculator2TestWithPositivesAndNegatives() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate2?input=1,2,-2,-1"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.squared").value(Matchers.containsInAnyOrder(1,1,4,4)))
				.andExpect(jsonPath("$.maxEven").value(2))
				.andExpect(jsonPath("$.averageOfPositives").value(1.5));
	}
	@Test
	@DisplayName("Calculator2 test with positives")
	void Calculator2TestWithPositives() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate2?input=2,3,7"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.squared").value(Matchers.containsInAnyOrder(4,9,49)))
				.andExpect(jsonPath("$.maxEven").value(2))
				.andExpect(jsonPath("$.averageOfPositives").value(4));
	}
	@Test
	@DisplayName("Calculator2 test with negatives")
	void Calculator2TestWithNegatives() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate2?input=-2,-3,-6"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.squared").value(Matchers.containsInAnyOrder(4,9,36)))
				.andExpect(jsonPath("$.maxEven").value(-2))
				.andExpect(jsonPath("$.averageOfPositives").value(0));
	}
	@Test
	@DisplayName("Calculator2 test with odd numbers")
	void Calculator2TestWithOddNumbers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate2?input=1,3,5"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.squared").value(Matchers.containsInAnyOrder(1,9,25)))
				.andExpect(jsonPath("$.maxEven").doesNotExist())
				.andExpect(jsonPath("$.averageOfPositives").value(3));
	}
	@Test
	@DisplayName("Calculator2 test with even numbers")
	void Calculator2TestWithEvenNumbers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate2?input=2,4,-6"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.squared").value(Matchers.containsInAnyOrder(4,16,36)))
				.andExpect(jsonPath("$.maxEven").value(4))
				.andExpect(jsonPath("$.averageOfPositives").value(3));
	}
	@Test
	@DisplayName("Calculator2 test with odd and even numbers")
	void Calculator2TestWithOddAndEvenNumbers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate2?input=-3,2,6"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.squared").value(Matchers.containsInAnyOrder(9,4,36)))
				.andExpect(jsonPath("$.maxEven").value(6))
				.andExpect(jsonPath("$.averageOfPositives").value(4));
	}
}
