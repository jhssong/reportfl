{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/stat/inference/TTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.TTest"
      ],
      "begin_line": 32,
      "end_line": 1053,
      "comment": "\n * Implements t-test statistics defined in the {@link TTest} interface.\n * \u003cp\u003e\n * Uses commons-math {@link org.apache.commons.math.distribution.TDistribution}\n * implementation to estimate exact p-values.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distributionFactory"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Cached DistributionFactory used to create TDistribution instances "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.TTestImpl()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.pairedT(double[], double[])",
      "begin_line": 64,
      "end_line": 74,
      "comment": "\n     * Computes a paired, 2-sample t-statistic based on the data in the input \n     * arrays.  The t-statistic returned is equivalent to what would be returned by\n     * computing the one-sample t-statistic {@link #t(double, double[])}, with\n     * \u003ccode\u003emu \u003d 0\u003c/code\u003e and the sample array consisting of the (signed) \n     * differences between corresponding entries in \u003ccode\u003esample1\u003c/code\u003e and \n     * \u003ccode\u003esample2.\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input arrays must have the same length and their common length\n     * must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if the statistic can not be computed do to a\n     *         convergence or other numerical error.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 75)",
        "(line 71,col 9)-(line 73,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.pairedTTest(double[], double[])",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003e p-value\u003c/i\u003e, associated with a paired, two-sample, two-tailed t-test \n     * based on the data in the input arrays.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean of the paired\n     * differences is 0 in favor of the two-sided alternative that the mean paired \n     * difference is not equal to 0. For a one-sided test, divide the returned \n     * value by 2.\n     * \u003cp\u003e\n     * This test is equivalent to a one-sample t-test computed using\n     * {@link #tTest(double, double[])} with \u003ccode\u003emu \u003d 0\u003c/code\u003e and the sample\n     * array consisting of the signed differences between corresponding elements of \n     * \u003ccode\u003esample1\u003c/code\u003e and \u003ccode\u003esample2.\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input array lengths must be the same and their common length must\n     * be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 75)",
        "(line 112,col 9)-(line 114,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.pairedTTest(double[], double[], double)",
      "begin_line": 149,
      "end_line": 155,
      "comment": "\n     * Performs a paired t-test evaluating the null hypothesis that the \n     * mean of the paired differences between \u003ccode\u003esample1\u003c/code\u003e and\n     * \u003ccode\u003esample2\u003c/code\u003e is 0 in favor of the two-sided alternative that the \n     * mean paired difference is not equal to 0, with significance level \n     * \u003ccode\u003ealpha\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be rejected with \n     * confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To perform a 1-sided test, use \n     * \u003ccode\u003ealpha * 2\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input array lengths must be the same and their common length \n     * must be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with \n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, double[])",
      "begin_line": 172,
      "end_line": 179,
      "comment": "\n     * Computes a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc22.htm#formula\"\u003e \n     * t statistic \u003c/a\u003e given observed values and a comparison constant.\n     * \u003cp\u003e\n     * This statistic can be used to perform a one sample t-test for the mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param mu comparison constant\n     * @param observed array of values\n     * @return t statistic\n     * @throws IllegalArgumentException if input array length is less than 2\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 178,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 197,
      "end_line": 204,
      "comment": "\n     * Computes a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc22.htm#formula\"\u003e\n     * t statistic \u003c/a\u003e to use in comparing the mean of the dataset described by \n     * \u003ccode\u003esampleStats\u003c/code\u003e to \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * This statistic can be used to perform a one sample t-test for the mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eobserved.getN() \u003e \u003d 2\u003c/code\u003e.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param mu comparison constant\n     * @param sampleStats DescriptiveStatistics holding sample summary statitstics\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 203,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticT(double[], double[])",
      "begin_line": 239,
      "end_line": 248,
      "comment": "\n     * Computes a 2-sample t statistic,  under the hypothesis of equal \n     * subpopulation variances.  To compute a t-statistic without the\n     * equal variances hypothesis, use {@link #t(double[], double[])}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a (homoscedastic) two-sample\n     * t-test to compare sample means.   \n     * \u003cp\u003e\n     * The t-statisitc is\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp;\u003ccode\u003e  t \u003d (m1 - m2) / (sqrt(1/n1 +1/n2) sqrt(var))\u003c/code\u003e\n     * \u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of first sample; \n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of second sample; \n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of second sample\u003c/li\u003e\n     * \u003c/ul\u003e\n     * and \u003cstrong\u003e\u003ccode\u003evar\u003c/code\u003e\u003c/strong\u003e is the pooled variance estimate:\n     * \u003cp\u003e\n     * \u003ccode\u003evar \u003d sqrt(((n1 - 1)var1 + (n2 - 1)var2) / ((n1-1) + (n2-1)))\u003c/code\u003e\n     * \u003cp\u003e \n     * with \u003cstrong\u003e\u003ccode\u003evar1\u003ccode\u003e\u003c/strong\u003e the variance of the first sample and\n     * \u003cstrong\u003e\u003ccode\u003evar2\u003c/code\u003e\u003c/strong\u003e the variance of the second sample.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double[], double[])",
      "begin_line": 278,
      "end_line": 287,
      "comment": "\n     * Computes a 2-sample t statistic, without the hypothesis of equal\n     * subpopulation variances.  To compute a t-statistic assuming equal\n     * variances, use {@link #homoscedasticT(double[], double[])}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a two-sample t-test to compare\n     * sample means.\n     * \u003cp\u003e\n     * The t-statisitc is\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp; \u003ccode\u003e  t \u003d (m1 - m2) / sqrt(var1/n1 + var2/n2)\u003c/code\u003e\n     * \u003cp\u003e\n     *  where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of the first sample\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of the second sample; \n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of the first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of the second sample;\n     * \u003cstrong\u003e\u003ccode\u003e var1\u003c/code\u003e\u003c/strong\u003e is the variance of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e var2\u003c/code\u003e\u003c/strong\u003e is the variance of the second sample;  \n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 286,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 320,
      "end_line": 331,
      "comment": "\n     * Computes a 2-sample t statistic \u003c/a\u003e, comparing the means of the datasets\n     * described by two {@link StatisticalSummary} instances, without the\n     * assumption of equal subpopulation variances.  Use \n     * {@link #homoscedasticT(StatisticalSummary, StatisticalSummary)} to\n     * compute a t-statistic under the equal variances assumption.\n     * \u003cp\u003e\n     * This statistic can be used to perform a two-sample t-test to compare\n     * sample means.\n     * \u003cp\u003e\n      * The returned  t-statisitc is\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp; \u003ccode\u003e  t \u003d (m1 - m2) / sqrt(var1/n1 + var2/n2)\u003c/code\u003e\n     * \u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of the first sample; \n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of the second sample; \n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of the first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of the second sample\n     * \u003cstrong\u003e\u003ccode\u003e var1\u003c/code\u003e\u003c/strong\u003e is the variance of the first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e var2\u003c/code\u003e\u003c/strong\u003e is the variance of the second sample\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing data from the first sample\n     * @param sampleStats2 StatisticalSummary describing data from the second sample\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 330,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 368,
      "end_line": 379,
      "comment": "\n     * Computes a 2-sample t statistic, comparing the means of the datasets\n     * described by two {@link StatisticalSummary} instances, under the\n     * assumption of equal subpopulation variances.  To compute a t-statistic\n     * without the equal variances assumption, use \n     * {@link #t(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a (homoscedastic) two-sample\n     * t-test to compare sample means.\n     * \u003cp\u003e\n     * The t-statisitc returned is\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp;\u003ccode\u003e  t \u003d (m1 - m2) / (sqrt(1/n1 +1/n2) sqrt(var))\u003c/code\u003e\n     * \u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of first sample; \n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of second sample; \n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of second sample\n     * and \u003cstrong\u003e\u003ccode\u003evar\u003c/code\u003e\u003c/strong\u003e is the pooled variance estimate:\n     * \u003cp\u003e\n     * \u003ccode\u003evar \u003d sqrt(((n1 - 1)var1 + (n2 - 1)var2) / ((n1-1) + (n2-1)))\u003c/code\u003e\n     * \u003cp\u003e \n     * with \u003cstrong\u003e\u003ccode\u003evar1\u003ccode\u003e\u003c/strong\u003e the variance of the first sample and\n     * \u003cstrong\u003e\u003ccode\u003evar2\u003c/code\u003e\u003c/strong\u003e the variance of the second sample.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing data from the first sample\n     * @param sampleStats2 StatisticalSummary describing data from the second sample\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 378,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double[])",
      "begin_line": 407,
      "end_line": 414,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a one-sample, two-tailed t-test \n     * comparing the mean of the input array with the constant \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean equals \n     * \u003ccode\u003emu\u003c/code\u003e in favor of the two-sided alternative that the mean\n     * is different from \u003ccode\u003emu\u003c/code\u003e. For a one-sided test, divide the \n     * returned value by 2.\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003ehere\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sample array of sample data values\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 413,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double[], double)",
      "begin_line": 451,
      "end_line": 457,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that the mean of the population from\n     * which \u003ccode\u003esample\u003c/code\u003e is drawn equals \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be \n     * rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To \n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003esample mean \u003d mu \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(mu, sample, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e sample mean \u003c mu \u003c/code\u003e\n     * at the 99% level, first verify that the measured sample mean is less \n     * than \u003ccode\u003emu\u003c/code\u003e and then use \n     * \u003cbr\u003e\u003ccode\u003etTest(mu, sample, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the one-sample \n     * parametric t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/sg_glos.html#one-sample\"\u003ehere\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sample array of sample data values\n     * @param alpha significance level of the test\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error computing the p-value\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 487,
      "end_line": 494,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a one-sample, two-tailed t-test \n     * comparing the mean of the dataset described by \u003ccode\u003esampleStats\u003c/code\u003e\n     * with the constant \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean equals \n     * \u003ccode\u003emu\u003c/code\u003e in favor of the two-sided alternative that the mean\n     * is different from \u003ccode\u003emu\u003c/code\u003e. For a one-sided test, divide the \n     * returned value by 2.\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe sample must contain at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sampleStats StatisticalSummary describing sample data\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 493,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 532,
      "end_line": 539,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that the mean of the\n     * population from which the dataset described by \u003ccode\u003estats\u003c/code\u003e is\n     * drawn equals \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be rejected with\n     * confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To  perform a 1-sided test, use\n     * \u003ccode\u003ealpha * 2.\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003esample mean \u003d mu \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(mu, sampleStats, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e sample mean \u003c mu \u003c/code\u003e\n     * at the 99% level, first verify that the measured sample mean is less \n     * than \u003ccode\u003emu\u003c/code\u003e and then use \n     * \u003cbr\u003e\u003ccode\u003etTest(mu, sampleStats, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the one-sample \n     * parametric t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/sg_glos.html#one-sample\"\u003ehere\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe sample must include at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sampleStats StatisticalSummary describing sample data values\n     * @param alpha significance level of the test\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double[], double[])",
      "begin_line": 577,
      "end_line": 586,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test \n     * comparing the means of the input arrays.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different. \n     * For a one-sided test, divide the returned value by 2.\n     * \u003cp\u003e\n     * The test does not assume that the underlying popuation variances are\n     * equal  and it uses approximated degrees of freedom computed from the \n     * sample data to compute the p-value.  The t-statistic used is as defined in\n     * {@link #t(double[], double[])} and the Welch-Satterthwaite approximation\n     * to the degrees of freedom is used, \n     * as described \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * here.\u003c/a\u003e  To perform the test under the assumption of equal subpopulation\n     * variances, use {@link #homoscedasticTTest(double[], double[])}. \n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 585,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(double[], double[])",
      "begin_line": 621,
      "end_line": 631,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test \n     * comparing the means of the input arrays, under the assumption that\n     * the two samples are drawn from subpopulations with equal variances.\n     * To perform the test without the equal variances assumption, use\n     * {@link #tTest(double[], double[])}.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different. \n     * For a one-sided test, divide the returned value by 2.\n     * \u003cp\u003e\n     * A pooled variance estimate is used to compute the t-statistic.  See\n     * {@link #homoscedasticT(double[], double[])}. The sum of the sample sizes\n     * minus 2 is used as the degrees of freedom.\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 630,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double[], double[], double)",
      "begin_line": 685,
      "end_line": 692,
      "comment": "\n     * Performs a \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \u003ccode\u003esample1\u003c/code\u003e \n     * and \u003ccode\u003esample2\u003c/code\u003e are drawn from populations with the same mean, \n     * with significance level \u003ccode\u003ealpha\u003c/code\u003e.  This test does not assume\n     * that the subpopulation variances are equal.  To perform the test assuming\n     * equal variances, use \n     * {@link #homoscedasticTTest(double[], double[], double)}.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To \n     * perform a 1-sided test, use \u003ccode\u003ealpha / 2\u003c/code\u003e\n     * \u003cp\u003e\n     * See {@link #t(double[], double[])} for the formula used to compute the\n     * t-statistic.  Degrees of freedom are approximated using the\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * Welch-Satterthwaite approximation.\u003c/a\u003e\n      \n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95% level,  use \n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.05). \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2 \u003c/code\u003e at\n     * the 99% level, first verify that the measured  mean of \u003ccode\u003esample 1\u003c/code\u003e\n     * is less than the mean of \u003ccode\u003esample 2\u003c/code\u003e and then use \n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with \n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 691,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(double[], double[], double)",
      "begin_line": 745,
      "end_line": 752,
      "comment": "\n     * Performs a \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \u003ccode\u003esample1\u003c/code\u003e \n     * and \u003ccode\u003esample2\u003c/code\u003e are drawn from populations with the same mean, \n     * with significance level \u003ccode\u003ealpha\u003c/code\u003e,  assuming that the\n     * subpopulation variances are equal.  Use \n     * {@link #tTest(double[], double[], double)} to perform the test without\n     * the assumption of equal variances.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To \n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2.\u003c/code\u003e  To perform the test\n     * without the assumption of equal subpopulation variances, use \n     * {@link #tTest(double[], double[], double)}.\n     * \u003cp\u003e\n     * A pooled variance estimate is used to compute the t-statistic. See\n     * {@link #t(double[], double[])} for the formula. The sum of the sample\n     * sizes minus 2 is used as the degrees of freedom.\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.05). \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2, \u003c/code\u003e\n     * at the 99% level, first verify that the measured mean of \n     * \u003ccode\u003esample 1\u003c/code\u003e is less than the mean of \u003ccode\u003esample 2\u003c/code\u003e\n     * and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with \n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 788,
      "end_line": 797,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test \n     * comparing the means of the datasets described by two StatisticalSummary\n     * instances.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different. \n     * For a one-sided test, divide the returned value by 2.\n     * \u003cp\u003e\n     * The test does not assume that the underlying popuation variances are\n     * equal  and it uses approximated degrees of freedom computed from the \n     * sample data to compute the p-value.   To perform the test assuming\n     * equal variances, use \n     * {@link #homoscedasticTTest(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sampleStats1  StatisticalSummary describing data from the first sample\n     * @param sampleStats2  StatisticalSummary describing data from the second sample\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 796,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 832,
      "end_line": 843,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test \n     * comparing the means of the datasets described by two StatisticalSummary\n     * instances, under the hypothesis of equal subpopulation variances. To\n     * perform a test without the equal variances assumption, use\n     * {@link #tTest(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different. \n     * For a one-sided test, divide the returned value by 2.\n     * \u003cp\u003e\n     * See {@link #homoscedasticT(double[], double[])} for the formula used to\n     * compute the t-statistic. The sum of the  sample sizes minus 2 is used as\n     * the degrees of freedom.\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003ehere\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sampleStats1  StatisticalSummary describing data from the first sample\n     * @param sampleStats2  StatisticalSummary describing data from the second sample\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 842,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 898,
      "end_line": 905,
      "comment": "\n     * Performs a \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \n     * \u003ccode\u003esampleStats1\u003c/code\u003e and \u003ccode\u003esampleStats2\u003c/code\u003e describe\n     * datasets drawn from populations with the same mean, with significance\n     * level \u003ccode\u003ealpha\u003c/code\u003e.   This test does not assume that the\n     * subpopulation variances are equal.  To perform the test under the equal\n     * variances assumption, use\n     * {@link #homoscedasticTTest(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To \n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2\u003c/code\u003e\n     * \u003cp\u003e\n     * See {@link #t(double[], double[])} for the formula used to compute the\n     * t-statistic.  Degrees of freedom are approximated using the\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * Welch-Satterthwaite approximation.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95%, use \n     * \u003cbr\u003e\u003ccode\u003etTest(sampleStats1, sampleStats2, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2 \u003c/code\u003e\n     * at the 99% level,  first verify that the measured mean of  \n     * \u003ccode\u003esample 1\u003c/code\u003e is less than  the mean of \u003ccode\u003esample 2\u003c/code\u003e\n     * and then use \n     * \u003cbr\u003e\u003ccode\u003etTest(sampleStats1, sampleStats2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing sample data values\n     * @param sampleStats2 StatisticalSummary describing sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with \n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 904,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.getDistributionFactory()",
      "begin_line": 913,
      "end_line": 918,
      "comment": "\n     * Gets a DistributionFactory to use in creating TDistribution instances.\n     * @return a distribution factory.\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.df(double, double, double, double)",
      "begin_line": 929,
      "end_line": 933,
      "comment": "\n     * Computes approximate degrees of freedom for 2-sample t-test.\n     * \n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return approximate degrees of freedom\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 932,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, double, double, double)",
      "begin_line": 944,
      "end_line": 946,
      "comment": "\n     * Computes t test statistic for 1-sample t-test.\n     * \n     * @param m sample mean\n     * @param mu constant to test against\n     * @param v sample variance\n     * @param n sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, double, double, double, double, double)",
      "begin_line": 961,
      "end_line": 964,
      "comment": "\n     * Computes t test statistic for 2-sample t-test.\n     * \u003cp\u003e\n     * Does not assume that subpopulation variances are equal.\n     * \n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 963,col 13)-(line 963,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticT(double, double, double, double, double, double)",
      "begin_line": 978,
      "end_line": 982,
      "comment": "\n     * Computes t test statistic for 2-sample t-test under the hypothesis\n     * of equal subpopulation variances.\n     * \n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 980,col 13)-(line 980,col 85)",
        "(line 981,col 13)-(line 981,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double, double, double)",
      "begin_line": 994,
      "end_line": 1000,
      "comment": "\n     * Computes p-value for 2-sided, 1-sample t-test.\n     * \n     * @param m sample mean\n     * @param mu constant to test against\n     * @param v sample variance\n     * @param n sample n\n     * @return p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 44)",
        "(line 997,col 9)-(line 998,col 64)",
        "(line 999,col 9)-(line 999,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double, double, double, double, double)",
      "begin_line": 1017,
      "end_line": 1026,
      "comment": "\n     * Computes p-value for 2-sided, 2-sample t-test.\n     * \u003cp\u003e\n     * Does not assume subpopulation variances are equal. Degrees of freedom\n     * are estimated from the data.\n     * \n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 55)",
        "(line 1021,col 9)-(line 1021,col 36)",
        "(line 1022,col 9)-(line 1022,col 45)",
        "(line 1023,col 9)-(line 1024,col 75)",
        "(line 1025,col 9)-(line 1025,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(double, double, double, double, double, double)",
      "begin_line": 1043,
      "end_line": 1052,
      "comment": "\n     * Computes p-value for 2-sided, 2-sample t-test, under the assumption\n     * of equal subpopulation variances.\n     * \u003cp\u003e\n     * The sum of the sample sizes minus 2 is used as degrees of freedom.\n     * \n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 68)",
        "(line 1047,col 9)-(line 1047,col 36)",
        "(line 1048,col 13)-(line 1048,col 54)",
        "(line 1049,col 9)-(line 1050,col 75)",
        "(line 1051,col 9)-(line 1051,col 64)"
      ]
    }
  ]
}