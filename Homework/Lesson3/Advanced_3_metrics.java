package Lesson3;

public class Advanced_3_metrics {
	int passed;
	int failed;
	int highPrior;
	int criticalBlocker;
	private boolean testFail;

	public boolean isTestFail() { // check is failed test (will next step?)
		return testFail;
	}

	public boolean isMoreThan20(int passed, int failed) { // check quantity of bugs (passed, failed) is bigger than 20 % 
		this.passed = passed;
		this.failed = failed;
		return testFail = (failed * 100) / (passed + failed) >= 20;
	}

	public boolean isHighPrior(int highPrior) { // check quantity of bugs with high priority is smaller than 10 %
		this.highPrior = highPrior;
		return highPrior < 10 ? true : false;
	}

	public boolean isBlockCritical(int criticalBlocker) { // check quantity of bugs with critical / blocker is smaller than 5 %
		this.criticalBlocker = criticalBlocker;
		return criticalBlocker < 5 ? true : false;
	}

	public boolean happyWife(int passed, int failed) { // remember about wife
		this.passed = passed;
		this.failed = failed;
		return failed / failed + passed * 100 > 5 ? true : false;
	}

	public void generateReport(String res) { // generate report (what will output, when find mistakes)
		System.out.println(res + "\r" + result());
	}

	public String result() { // what will contain report
		return "Statistic. Passed: " + passed + ", failed: " + failed + ", Blocker and Critical bugs: " + criticalBlocker + ", High Prority bugs: " + highPrior;
	}
}