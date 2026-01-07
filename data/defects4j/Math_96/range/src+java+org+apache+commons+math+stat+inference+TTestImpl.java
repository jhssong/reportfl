{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/stat/inference/TTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.TTest"
      ],
      "begin_line": 33,
      "end_line": 1059,
      "comment": "\n * Implements t-test statistics defined in the {@link TTest} interface.\n * \u003cp\u003e\n * Uses commons-math {@link org.apache.commons.math.distribution.TDistribution}\n * implementation to estimate exact p-values.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Distribution used to compute inference statistics. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.TTestImpl()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.TTestImpl(org.apache.commons.math.distribution.TDistribution)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Create a test instance using the given distribution for computing\n     * inference statistics.\n     * @param t distribution used to compute inference statistics.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.pairedT(double[], double[])",
      "begin_line": 76,
      "end_line": 86,
      "comment": "\n     * Computes a paired, 2-sample t-statistic based on the data in the input \n     * arrays.  The t-statistic returned is equivalent to what would be returned by\n     * computing the one-sample t-statistic {@link #t(double, double[])}, with\n     * \u003ccode\u003emu \u003d 0\u003c/code\u003e and the sample array consisting of the (signed) \n     * differences between corresponding entries in \u003ccode\u003esample1\u003c/code\u003e and \n     * \u003ccode\u003esample2.\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input arrays must have the same length and their common length\n     * must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if the statistic can not be computed do to a\n     *         convergence or other numerical error.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 75)",
        "(line 83,col 9)-(line 85,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.pairedTTest(double[], double[])",
      "begin_line": 121,
      "end_line": 127,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003e p-value\u003c/i\u003e, associated with a paired, two-sample, two-tailed t-test \n     * based on the data in the input arrays.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean of the paired\n     * differences is 0 in favor of the two-sided alternative that the mean paired \n     * difference is not equal to 0. For a one-sided test, divide the returned \n     * value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * This test is equivalent to a one-sample t-test computed using\n     * {@link #tTest(double, double[])} with \u003ccode\u003emu \u003d 0\u003c/code\u003e and the sample\n     * array consisting of the signed differences between corresponding elements of \n     * \u003ccode\u003esample1\u003c/code\u003e and \u003ccode\u003esample2.\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input array lengths must be the same and their common length must\n     * be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 75)",
        "(line 124,col 9)-(line 126,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.pairedTTest(double[], double[], double)",
      "begin_line": 161,
      "end_line": 167,
      "comment": "\n     * Performs a paired t-test evaluating the null hypothesis that the \n     * mean of the paired differences between \u003ccode\u003esample1\u003c/code\u003e and\n     * \u003ccode\u003esample2\u003c/code\u003e is 0 in favor of the two-sided alternative that the \n     * mean paired difference is not equal to 0, with significance level \n     * \u003ccode\u003ealpha\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be rejected with \n     * confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To perform a 1-sided test, use \n     * \u003ccode\u003ealpha * 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input array lengths must be the same and their common length \n     * must be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with \n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, double[])",
      "begin_line": 184,
      "end_line": 191,
      "comment": "\n     * Computes a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc22.htm#formula\"\u003e \n     * t statistic \u003c/a\u003e given observed values and a comparison constant.\n     * \u003cp\u003e\n     * This statistic can be used to perform a one sample t-test for the mean.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu comparison constant\n     * @param observed array of values\n     * @return t statistic\n     * @throws IllegalArgumentException if input array length is less than 2\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 190,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 209,
      "end_line": 216,
      "comment": "\n     * Computes a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc22.htm#formula\"\u003e\n     * t statistic \u003c/a\u003e to use in comparing the mean of the dataset described by \n     * \u003ccode\u003esampleStats\u003c/code\u003e to \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * This statistic can be used to perform a one sample t-test for the mean.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eobserved.getN() \u003e \u003d 2\u003c/code\u003e.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu comparison constant\n     * @param sampleStats DescriptiveStatistics holding sample summary statitstics\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 215,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticT(double[], double[])",
      "begin_line": 251,
      "end_line": 260,
      "comment": "\n     * Computes a 2-sample t statistic,  under the hypothesis of equal \n     * subpopulation variances.  To compute a t-statistic without the\n     * equal variances hypothesis, use {@link #t(double[], double[])}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a (homoscedastic) two-sample\n     * t-test to compare sample means.\u003c/p\u003e\n     * \u003cp\u003e\n     * The t-statisitc is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp;\u003ccode\u003e  t \u003d (m1 - m2) / (sqrt(1/n1 +1/n2) sqrt(var))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of first sample; \n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of second sample; \n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of second sample\u003c/li\u003e\n     * \u003c/ul\u003e\n     * and \u003cstrong\u003e\u003ccode\u003evar\u003c/code\u003e\u003c/strong\u003e is the pooled variance estimate:\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003ccode\u003evar \u003d sqrt(((n1 - 1)var1 + (n2 - 1)var2) / ((n1-1) + (n2-1)))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e \n     * with \u003cstrong\u003e\u003ccode\u003evar1\u003ccode\u003e\u003c/strong\u003e the variance of the first sample and\n     * \u003cstrong\u003e\u003ccode\u003evar2\u003c/code\u003e\u003c/strong\u003e the variance of the second sample.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 259,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double[], double[])",
      "begin_line": 290,
      "end_line": 299,
      "comment": "\n     * Computes a 2-sample t statistic, without the hypothesis of equal\n     * subpopulation variances.  To compute a t-statistic assuming equal\n     * variances, use {@link #homoscedasticT(double[], double[])}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a two-sample t-test to compare\n     * sample means.\u003c/p\u003e\n     * \u003cp\u003e\n     * The t-statisitc is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp; \u003ccode\u003e  t \u003d (m1 - m2) / sqrt(var1/n1 + var2/n2)\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     *  where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of the first sample\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of the second sample; \n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of the first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of the second sample;\n     * \u003cstrong\u003e\u003ccode\u003e var1\u003c/code\u003e\u003c/strong\u003e is the variance of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e var2\u003c/code\u003e\u003c/strong\u003e is the variance of the second sample;  \n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 298,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 332,
      "end_line": 343,
      "comment": "\n     * Computes a 2-sample t statistic \u003c/a\u003e, comparing the means of the datasets\n     * described by two {@link StatisticalSummary} instances, without the\n     * assumption of equal subpopulation variances.  Use \n     * {@link #homoscedasticT(StatisticalSummary, StatisticalSummary)} to\n     * compute a t-statistic under the equal variances assumption.\n     * \u003cp\u003e\n     * This statistic can be used to perform a two-sample t-test to compare\n     * sample means.\u003c/p\u003e\n     * \u003cp\u003e\n      * The returned  t-statisitc is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp; \u003ccode\u003e  t \u003d (m1 - m2) / sqrt(var1/n1 + var2/n2)\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of the first sample; \n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of the second sample; \n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of the first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of the second sample\n     * \u003cstrong\u003e\u003ccode\u003e var1\u003c/code\u003e\u003c/strong\u003e is the variance of the first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e var2\u003c/code\u003e\u003c/strong\u003e is the variance of the second sample\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing data from the first sample\n     * @param sampleStats2 StatisticalSummary describing data from the second sample\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 380,
      "end_line": 391,
      "comment": "\n     * Computes a 2-sample t statistic, comparing the means of the datasets\n     * described by two {@link StatisticalSummary} instances, under the\n     * assumption of equal subpopulation variances.  To compute a t-statistic\n     * without the equal variances assumption, use \n     * {@link #t(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a (homoscedastic) two-sample\n     * t-test to compare sample means.\u003c/p\u003e\n     * \u003cp\u003e\n     * The t-statisitc returned is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp;\u003ccode\u003e  t \u003d (m1 - m2) / (sqrt(1/n1 +1/n2) sqrt(var))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of first sample; \n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of second sample; \n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of first sample;  \n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of second sample\n     * and \u003cstrong\u003e\u003ccode\u003evar\u003c/code\u003e\u003c/strong\u003e is the pooled variance estimate:\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003ccode\u003evar \u003d sqrt(((n1 - 1)var1 + (n2 - 1)var2) / ((n1-1) + (n2-1)))\u003c/code\u003e\n     * \u003cp\u003e \n     * with \u003cstrong\u003e\u003ccode\u003evar1\u003ccode\u003e\u003c/strong\u003e the variance of the first sample and\n     * \u003cstrong\u003e\u003ccode\u003evar2\u003c/code\u003e\u003c/strong\u003e the variance of the second sample.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing data from the first sample\n     * @param sampleStats2 StatisticalSummary describing data from the second sample\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 390,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double[])",
      "begin_line": 419,
      "end_line": 426,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a one-sample, two-tailed t-test \n     * comparing the mean of the input array with the constant \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean equals \n     * \u003ccode\u003emu\u003c/code\u003e in favor of the two-sided alternative that the mean\n     * is different from \u003ccode\u003emu\u003c/code\u003e. For a one-sided test, divide the \n     * returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sample array of sample data values\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 425,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double[], double)",
      "begin_line": 463,
      "end_line": 469,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that the mean of the population from\n     * which \u003ccode\u003esample\u003c/code\u003e is drawn equals \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be \n     * rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To \n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003esample mean \u003d mu \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(mu, sample, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e sample mean \u003c mu \u003c/code\u003e\n     * at the 99% level, first verify that the measured sample mean is less \n     * than \u003ccode\u003emu\u003c/code\u003e and then use \n     * \u003cbr\u003e\u003ccode\u003etTest(mu, sample, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the one-sample \n     * parametric t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/sg_glos.html#one-sample\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sample array of sample data values\n     * @param alpha significance level of the test\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error computing the p-value\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 499,
      "end_line": 506,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a one-sample, two-tailed t-test \n     * comparing the mean of the dataset described by \u003ccode\u003esampleStats\u003c/code\u003e\n     * with the constant \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean equals \n     * \u003ccode\u003emu\u003c/code\u003e in favor of the two-sided alternative that the mean\n     * is different from \u003ccode\u003emu\u003c/code\u003e. For a one-sided test, divide the \n     * returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe sample must contain at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sampleStats StatisticalSummary describing sample data\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 505,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 544,
      "end_line": 551,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that the mean of the\n     * population from which the dataset described by \u003ccode\u003estats\u003c/code\u003e is\n     * drawn equals \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be rejected with\n     * confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To  perform a 1-sided test, use\n     * \u003ccode\u003ealpha * 2.\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003esample mean \u003d mu \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(mu, sampleStats, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e sample mean \u003c mu \u003c/code\u003e\n     * at the 99% level, first verify that the measured sample mean is less \n     * than \u003ccode\u003emu\u003c/code\u003e and then use \n     * \u003cbr\u003e\u003ccode\u003etTest(mu, sampleStats, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the one-sample \n     * parametric t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/sg_glos.html#one-sample\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe sample must include at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sampleStats StatisticalSummary describing sample data values\n     * @param alpha significance level of the test\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double[], double[])",
      "begin_line": 589,
      "end_line": 598,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test \n     * comparing the means of the input arrays.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different. \n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * The test does not assume that the underlying popuation variances are\n     * equal  and it uses approximated degrees of freedom computed from the \n     * sample data to compute the p-value.  The t-statistic used is as defined in\n     * {@link #t(double[], double[])} and the Welch-Satterthwaite approximation\n     * to the degrees of freedom is used, \n     * as described \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * here.\u003c/a\u003e  To perform the test under the assumption of equal subpopulation\n     * variances, use {@link #homoscedasticTTest(double[], double[])}.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 597,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(double[], double[])",
      "begin_line": 633,
      "end_line": 643,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test \n     * comparing the means of the input arrays, under the assumption that\n     * the two samples are drawn from subpopulations with equal variances.\n     * To perform the test without the equal variances assumption, use\n     * {@link #tTest(double[], double[])}.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different. \n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * A pooled variance estimate is used to compute the t-statistic.  See\n     * {@link #homoscedasticT(double[], double[])}. The sum of the sample sizes\n     * minus 2 is used as the degrees of freedom.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 642,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double[], double[], double)",
      "begin_line": 697,
      "end_line": 704,
      "comment": "\n     * Performs a \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \u003ccode\u003esample1\u003c/code\u003e \n     * and \u003ccode\u003esample2\u003c/code\u003e are drawn from populations with the same mean, \n     * with significance level \u003ccode\u003ealpha\u003c/code\u003e.  This test does not assume\n     * that the subpopulation variances are equal.  To perform the test assuming\n     * equal variances, use \n     * {@link #homoscedasticTTest(double[], double[], double)}.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To \n     * perform a 1-sided test, use \u003ccode\u003ealpha / 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link #t(double[], double[])} for the formula used to compute the\n     * t-statistic.  Degrees of freedom are approximated using the\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * Welch-Satterthwaite approximation.\u003c/a\u003e\u003c/p\u003e\n      \n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95% level,  use \n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.05). \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2 \u003c/code\u003e at\n     * the 99% level, first verify that the measured  mean of \u003ccode\u003esample 1\u003c/code\u003e\n     * is less than the mean of \u003ccode\u003esample 2\u003c/code\u003e and then use \n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with \n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(double[], double[], double)",
      "begin_line": 757,
      "end_line": 764,
      "comment": "\n     * Performs a \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \u003ccode\u003esample1\u003c/code\u003e \n     * and \u003ccode\u003esample2\u003c/code\u003e are drawn from populations with the same mean, \n     * with significance level \u003ccode\u003ealpha\u003c/code\u003e,  assuming that the\n     * subpopulation variances are equal.  Use \n     * {@link #tTest(double[], double[], double)} to perform the test without\n     * the assumption of equal variances.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To \n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2.\u003c/code\u003e  To perform the test\n     * without the assumption of equal subpopulation variances, use \n     * {@link #tTest(double[], double[], double)}.\u003c/p\u003e\n     * \u003cp\u003e\n     * A pooled variance estimate is used to compute the t-statistic. See\n     * {@link #t(double[], double[])} for the formula. The sum of the sample\n     * sizes minus 2 is used as the degrees of freedom.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.05). \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2, \u003c/code\u003e\n     * at the 99% level, first verify that the measured mean of \n     * \u003ccode\u003esample 1\u003c/code\u003e is less than the mean of \u003ccode\u003esample 2\u003c/code\u003e\n     * and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with \n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 800,
      "end_line": 809,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test \n     * comparing the means of the datasets described by two StatisticalSummary\n     * instances.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different. \n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * The test does not assume that the underlying popuation variances are\n     * equal  and it uses approximated degrees of freedom computed from the \n     * sample data to compute the p-value.   To perform the test assuming\n     * equal variances, use \n     * {@link #homoscedasticTTest(StatisticalSummary, StatisticalSummary)}.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1  StatisticalSummary describing data from the first sample\n     * @param sampleStats2  StatisticalSummary describing data from the second sample\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 808,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 844,
      "end_line": 855,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test \n     * comparing the means of the datasets described by two StatisticalSummary\n     * instances, under the hypothesis of equal subpopulation variances. To\n     * perform a test without the equal variances assumption, use\n     * {@link #tTest(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different. \n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link #homoscedasticT(double[], double[])} for the formula used to\n     * compute the t-statistic. The sum of the  sample sizes minus 2 is used as\n     * the degrees of freedom.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1  StatisticalSummary describing data from the first sample\n     * @param sampleStats2  StatisticalSummary describing data from the second sample\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 854,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 910,
      "end_line": 917,
      "comment": "\n     * Performs a \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \n     * \u003ccode\u003esampleStats1\u003c/code\u003e and \u003ccode\u003esampleStats2\u003c/code\u003e describe\n     * datasets drawn from populations with the same mean, with significance\n     * level \u003ccode\u003ealpha\u003c/code\u003e.   This test does not assume that the\n     * subpopulation variances are equal.  To perform the test under the equal\n     * variances assumption, use\n     * {@link #homoscedasticTTest(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To \n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link #t(double[], double[])} for the formula used to compute the\n     * t-statistic.  Degrees of freedom are approximated using the\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * Welch-Satterthwaite approximation.\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95%, use \n     * \u003cbr\u003e\u003ccode\u003etTest(sampleStats1, sampleStats2, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2 \u003c/code\u003e\n     * at the 99% level,  first verify that the measured mean of  \n     * \u003ccode\u003esample 1\u003c/code\u003e is less than  the mean of \u003ccode\u003esample 2\u003c/code\u003e\n     * and then use \n     * \u003cbr\u003e\u003ccode\u003etTest(sampleStats1, sampleStats2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed \n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing sample data values\n     * @param sampleStats2 StatisticalSummary describing sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with \n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 915,col 9)",
        "(line 916,col 9)-(line 916,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.df(double, double, double, double)",
      "begin_line": 930,
      "end_line": 934,
      "comment": "\n     * Computes approximate degrees of freedom for 2-sample t-test.\n     * \n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return approximate degrees of freedom\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 933,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, double, double, double)",
      "begin_line": 945,
      "end_line": 947,
      "comment": "\n     * Computes t test statistic for 1-sample t-test.\n     * \n     * @param m sample mean\n     * @param mu constant to test against\n     * @param v sample variance\n     * @param n sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, double, double, double, double, double)",
      "begin_line": 962,
      "end_line": 965,
      "comment": "\n     * Computes t test statistic for 2-sample t-test.\n     * \u003cp\u003e\n     * Does not assume that subpopulation variances are equal.\u003c/p\u003e\n     * \n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 964,col 13)-(line 964,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticT(double, double, double, double, double, double)",
      "begin_line": 979,
      "end_line": 983,
      "comment": "\n     * Computes t test statistic for 2-sample t-test under the hypothesis\n     * of equal subpopulation variances.\n     * \n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 981,col 13)-(line 981,col 85)",
        "(line 982,col 13)-(line 982,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double, double, double)",
      "begin_line": 995,
      "end_line": 1000,
      "comment": "\n     * Computes p-value for 2-sided, 1-sample t-test.\n     * \n     * @param m sample mean\n     * @param mu constant to test against\n     * @param v sample variance\n     * @param n sample n\n     * @return p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 44)",
        "(line 998,col 9)-(line 998,col 48)",
        "(line 999,col 9)-(line 999,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double, double, double, double, double)",
      "begin_line": 1017,
      "end_line": 1025,
      "comment": "\n     * Computes p-value for 2-sided, 2-sample t-test.\n     * \u003cp\u003e\n     * Does not assume subpopulation variances are equal. Degrees of freedom\n     * are estimated from the data.\u003c/p\u003e\n     * \n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 55)",
        "(line 1021,col 9)-(line 1021,col 36)",
        "(line 1022,col 9)-(line 1022,col 46)",
        "(line 1023,col 9)-(line 1023,col 59)",
        "(line 1024,col 9)-(line 1024,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(double, double, double, double, double, double)",
      "begin_line": 1042,
      "end_line": 1049,
      "comment": "\n     * Computes p-value for 2-sided, 2-sample t-test, under the assumption\n     * of equal subpopulation variances.\n     * \u003cp\u003e\n     * The sum of the sample sizes minus 2 is used as degrees of freedom.\u003c/p\u003e\n     * \n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 68)",
        "(line 1046,col 9)-(line 1046,col 57)",
        "(line 1047,col 9)-(line 1047,col 59)",
        "(line 1048,col 9)-(line 1048,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.setDistribution(org.apache.commons.math.distribution.TDistribution)",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     * @param value the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 29)"
      ]
    }
  ]
}