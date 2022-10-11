package vk.repeater;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestRepeater implements IRetryAnalyzer {

    public int retryCount = 0;
    public int maxRetryCount = 0;

    public void requireRerunIf(boolean rerun) {
        if (rerun) {
            maxRetryCount = 1;
        } else {
            maxRetryCount = 0;
        }
    }

    @Override
    public boolean retry(ITestResult iTestResult) {
        return false;
    }

//    @Override
//    public boolean retry(ITestResult iTestResult) {
//        requireRerunIf(Settings.config.needRerun());
//        if (retryCount < maxRetryCount && Logger.getTicketForFailedTest(iTestResult).equals("N/A")) { // test rerun is performed only if the test has failed by unknown issue
//            Settings.setRetryNumber(retryCount);
//            retryCount++;
//            return true;
//        }
//        return false;
//    }
}