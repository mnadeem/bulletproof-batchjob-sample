package com.nadeem.app.batch;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-main-context.xml"})
public class ImportProductsIntegrationTest {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job job;

	@Before
	public void dobeforeEachTestCase() throws Exception {

	}

	@Test
	public void importProducts() throws Exception {

		jobLauncher.run(job, new JobParametersBuilder()
			.addString("inputDirectory", "classpath:/input/")
			.addString("targetFile","products.gz")
			.addLong("timestamp", System.currentTimeMillis())
			.toJobParameters()
		);		
	}
}