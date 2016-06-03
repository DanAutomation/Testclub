package Lesson3;

public class Advanced_3_metrics {
	int passed;
	int failed;
	int highPrior;
	int criticalBlocker;
	private boolean testFail;

	public boolean isTestFail() {
		return testFail;
	}

	public boolean isMoreThan20(int passed, int failed) {
		this.passed = passed;
		this.failed = failed;
		return testFail = (failed * 100) / (passed + failed) >= 20;
	}

	public boolean isHighPrior(int highPrior) {
		this.highPrior = highPrior;
		return highPrior < 10 ? true : false;
	}

	public boolean isBlockCritical(int criticalBlocker) {
		this.criticalBlocker = criticalBlocker;
		return criticalBlocker < 5 ? true : false;
	}

	public boolean happyWife(int passed, int failed) {
		this.passed = passed;
		this.failed = failed;
		return failed / failed + passed * 100 > 5 ? true : false;
	}

	public void generateReport(String res) {
		System.out.println(res + "\r" + result());
	}

	public String result() {
		return "Statistic. Passed: " + passed + ", failed: " + failed + ", Blocker and Critical bugs: " + criticalBlocker + ", High Prority bugs: " + highPrior;
	}
}
