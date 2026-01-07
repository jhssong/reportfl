{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/inference/TTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.TTest"
      ],
      "begin_line": 34,
      "end_line": 1064,
      "comment": "\n * Implements t-test statistics defined in the {@link TTest} interface.\n * \u003cp\u003e\n * Uses commons-math {@link org.apache.commons.math.distribution.TDistribution}\n * implementation to estimate exact p-values.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "INSUFFICIENT_DATA_MESSAGE"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": " Message for insufficient data. "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Distribution used to compute inference statistics. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.TTestImpl()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.TTestImpl(org.apache.commons.math.distribution.TDistribution)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Create a test instance using the given distribution for computing\n     * inference statistics.\n     * @param t distribution used to compute inference statistics.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)",
        "(line 58,col 9)-(line 58,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.pairedT(double[], double[])",
      "begin_line": 81,
      "end_line": 89,
      "comment": "\n     * Computes a paired, 2-sample t-statistic based on the data in the input\n     * arrays.  The t-statistic returned is equivalent to what would be returned by\n     * computing the one-sample t-statistic {@link #t(double, double[])}, with\n     * \u003ccode\u003emu \u003d 0\u003c/code\u003e and the sample array consisting of the (signed)\n     * differences between corresponding entries in \u003ccode\u003esample1\u003c/code\u003e and\n     * \u003ccode\u003esample2.\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input arrays must have the same length and their common length\n     * must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if the statistic can not be computed do to a\n     *         convergence or other numerical error.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 33)",
        "(line 84,col 9)-(line 84,col 33)",
        "(line 85,col 9)-(line 85,col 75)",
        "(line 86,col 9)-(line 88,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.pairedTTest(double[], double[])",
      "begin_line": 124,
      "end_line": 130,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003e p-value\u003c/i\u003e, associated with a paired, two-sample, two-tailed t-test\n     * based on the data in the input arrays.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean of the paired\n     * differences is 0 in favor of the two-sided alternative that the mean paired\n     * difference is not equal to 0. For a one-sided test, divide the returned\n     * value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * This test is equivalent to a one-sample t-test computed using\n     * {@link #tTest(double, double[])} with \u003ccode\u003emu \u003d 0\u003c/code\u003e and the sample\n     * array consisting of the signed differences between corresponding elements of\n     * \u003ccode\u003esample1\u003c/code\u003e and \u003ccode\u003esample2.\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input array lengths must be the same and their common length must\n     * be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 75)",
        "(line 127,col 9)-(line 129,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.pairedTTest(double[], double[], double)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "\n     * Performs a paired t-test evaluating the null hypothesis that the\n     * mean of the paired differences between \u003ccode\u003esample1\u003c/code\u003e and\n     * \u003ccode\u003esample2\u003c/code\u003e is 0 in favor of the two-sided alternative that the\n     * mean paired difference is not equal to 0, with significance level\n     * \u003ccode\u003ealpha\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be rejected with\n     * confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To perform a 1-sided test, use\n     * \u003ccode\u003ealpha * 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input array lengths must be the same and their common length\n     * must be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 38)",
        "(line 167,col 9)-(line 167,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, double[])",
      "begin_line": 185,
      "end_line": 190,
      "comment": "\n     * Computes a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc22.htm#formula\"\u003e\n     * t statistic \u003c/a\u003e given observed values and a comparison constant.\n     * \u003cp\u003e\n     * This statistic can be used to perform a one sample t-test for the mean.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu comparison constant\n     * @param observed array of values\n     * @return t statistic\n     * @throws IllegalArgumentException if input array length is less than 2\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 34)",
        "(line 188,col 9)-(line 189,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 208,
      "end_line": 213,
      "comment": "\n     * Computes a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc22.htm#formula\"\u003e\n     * t statistic \u003c/a\u003e to use in comparing the mean of the dataset described by\n     * \u003ccode\u003esampleStats\u003c/code\u003e to \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * This statistic can be used to perform a one sample t-test for the mean.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eobserved.getN() \u003e \u003d 2\u003c/code\u003e.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu comparison constant\n     * @param sampleStats DescriptiveStatistics holding sample summary statitstics\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 37)",
        "(line 211,col 9)-(line 212,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticT(double[], double[])",
      "begin_line": 248,
      "end_line": 255,
      "comment": "\n     * Computes a 2-sample t statistic,  under the hypothesis of equal\n     * subpopulation variances.  To compute a t-statistic without the\n     * equal variances hypothesis, use {@link #t(double[], double[])}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a (homoscedastic) two-sample\n     * t-test to compare sample means.\u003c/p\u003e\n     * \u003cp\u003e\n     * The t-statisitc is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp;\u003ccode\u003e  t \u003d (m1 - m2) / (sqrt(1/n1 +1/n2) sqrt(var))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of first sample;\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of second sample;\n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of first sample;\n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of second sample\u003c/li\u003e\n     * \u003c/ul\u003e\n     * and \u003cstrong\u003e\u003ccode\u003evar\u003c/code\u003e\u003c/strong\u003e is the pooled variance estimate:\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003ccode\u003evar \u003d sqrt(((n1 - 1)var1 + (n2 - 1)var2) / ((n1-1) + (n2-1)))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * with \u003cstrong\u003e\u003ccode\u003evar1\u003ccode\u003e\u003c/strong\u003e the variance of the first sample and\n     * \u003cstrong\u003e\u003ccode\u003evar2\u003c/code\u003e\u003c/strong\u003e the variance of the second sample.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 33)",
        "(line 251,col 9)-(line 251,col 33)",
        "(line 252,col 9)-(line 254,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double[], double[])",
      "begin_line": 285,
      "end_line": 292,
      "comment": "\n     * Computes a 2-sample t statistic, without the hypothesis of equal\n     * subpopulation variances.  To compute a t-statistic assuming equal\n     * variances, use {@link #homoscedasticT(double[], double[])}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a two-sample t-test to compare\n     * sample means.\u003c/p\u003e\n     * \u003cp\u003e\n     * The t-statisitc is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp; \u003ccode\u003e  t \u003d (m1 - m2) / sqrt(var1/n1 + var2/n2)\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     *  where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of the first sample\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of the second sample;\n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of the second sample;\n     * \u003cstrong\u003e\u003ccode\u003e var1\u003c/code\u003e\u003c/strong\u003e is the variance of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e var2\u003c/code\u003e\u003c/strong\u003e is the variance of the second sample;\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 33)",
        "(line 288,col 9)-(line 288,col 33)",
        "(line 289,col 9)-(line 291,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 325,
      "end_line": 333,
      "comment": "\n     * Computes a 2-sample t statistic \u003c/a\u003e, comparing the means of the datasets\n     * described by two {@link StatisticalSummary} instances, without the\n     * assumption of equal subpopulation variances.  Use\n     * {@link #homoscedasticT(StatisticalSummary, StatisticalSummary)} to\n     * compute a t-statistic under the equal variances assumption.\n     * \u003cp\u003e\n     * This statistic can be used to perform a two-sample t-test to compare\n     * sample means.\u003c/p\u003e\n     * \u003cp\u003e\n      * The returned  t-statisitc is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp; \u003ccode\u003e  t \u003d (m1 - m2) / sqrt(var1/n1 + var2/n2)\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of the second sample;\n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of the second sample\n     * \u003cstrong\u003e\u003ccode\u003e var1\u003c/code\u003e\u003c/strong\u003e is the variance of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e var2\u003c/code\u003e\u003c/strong\u003e is the variance of the second sample\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing data from the first sample\n     * @param sampleStats2 StatisticalSummary describing data from the second sample\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 38)",
        "(line 329,col 9)-(line 329,col 38)",
        "(line 330,col 9)-(line 332,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 370,
      "end_line": 378,
      "comment": "\n     * Computes a 2-sample t statistic, comparing the means of the datasets\n     * described by two {@link StatisticalSummary} instances, under the\n     * assumption of equal subpopulation variances.  To compute a t-statistic\n     * without the equal variances assumption, use\n     * {@link #t(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a (homoscedastic) two-sample\n     * t-test to compare sample means.\u003c/p\u003e\n     * \u003cp\u003e\n     * The t-statisitc returned is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp;\u003ccode\u003e  t \u003d (m1 - m2) / (sqrt(1/n1 +1/n2) sqrt(var))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of first sample;\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of second sample;\n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of first sample;\n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of second sample\n     * and \u003cstrong\u003e\u003ccode\u003evar\u003c/code\u003e\u003c/strong\u003e is the pooled variance estimate:\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003ccode\u003evar \u003d sqrt(((n1 - 1)var1 + (n2 - 1)var2) / ((n1-1) + (n2-1)))\u003c/code\u003e\n     * \u003cp\u003e\n     * with \u003cstrong\u003e\u003ccode\u003evar1\u003ccode\u003e\u003c/strong\u003e the variance of the first sample and\n     * \u003cstrong\u003e\u003ccode\u003evar2\u003c/code\u003e\u003c/strong\u003e the variance of the second sample.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing data from the first sample\n     * @param sampleStats2 StatisticalSummary describing data from the second sample\n     * @return t statistic\n     * @throws IllegalArgumentException if the precondition is not met\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 38)",
        "(line 374,col 9)-(line 374,col 38)",
        "(line 375,col 9)-(line 377,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double[])",
      "begin_line": 406,
      "end_line": 411,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a one-sample, two-tailed t-test\n     * comparing the mean of the input array with the constant \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean equals\n     * \u003ccode\u003emu\u003c/code\u003e in favor of the two-sided alternative that the mean\n     * is different from \u003ccode\u003emu\u003c/code\u003e. For a one-sided test, divide the\n     * returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sample array of sample data values\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 32)",
        "(line 409,col 9)-(line 410,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double[], double)",
      "begin_line": 448,
      "end_line": 452,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that the mean of the population from\n     * which \u003ccode\u003esample\u003c/code\u003e is drawn equals \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be\n     * rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To\n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003esample mean \u003d mu \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(mu, sample, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e sample mean \u003c mu \u003c/code\u003e\n     * at the 99% level, first verify that the measured sample mean is less\n     * than \u003ccode\u003emu\u003c/code\u003e and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(mu, sample, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the one-sample\n     * parametric t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/sg_glos.html#one-sample\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sample array of sample data values\n     * @param alpha significance level of the test\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error computing the p-value\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 38)",
        "(line 451,col 9)-(line 451,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 482,
      "end_line": 487,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a one-sample, two-tailed t-test\n     * comparing the mean of the dataset described by \u003ccode\u003esampleStats\u003c/code\u003e\n     * with the constant \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean equals\n     * \u003ccode\u003emu\u003c/code\u003e in favor of the two-sided alternative that the mean\n     * is different from \u003ccode\u003emu\u003c/code\u003e. For a one-sided test, divide the\n     * returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe sample must contain at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sampleStats StatisticalSummary describing sample data\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 37)",
        "(line 485,col 9)-(line 486,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 525,
      "end_line": 530,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that the mean of the\n     * population from which the dataset described by \u003ccode\u003estats\u003c/code\u003e is\n     * drawn equals \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be rejected with\n     * confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To  perform a 1-sided test, use\n     * \u003ccode\u003ealpha * 2.\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003esample mean \u003d mu \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(mu, sampleStats, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e sample mean \u003c mu \u003c/code\u003e\n     * at the 99% level, first verify that the measured sample mean is less\n     * than \u003ccode\u003emu\u003c/code\u003e and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(mu, sampleStats, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the one-sample\n     * parametric t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/sg_glos.html#one-sample\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe sample must include at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sampleStats StatisticalSummary describing sample data values\n     * @param alpha significance level of the test\n     * @return p-value\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 38)",
        "(line 529,col 9)-(line 529,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double[], double[])",
      "begin_line": 568,
      "end_line": 575,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test\n     * comparing the means of the input arrays.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different.\n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * The test does not assume that the underlying popuation variances are\n     * equal  and it uses approximated degrees of freedom computed from the\n     * sample data to compute the p-value.  The t-statistic used is as defined in\n     * {@link #t(double[], double[])} and the Welch-Satterthwaite approximation\n     * to the degrees of freedom is used,\n     * as described\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * here.\u003c/a\u003e  To perform the test under the assumption of equal subpopulation\n     * variances, use {@link #homoscedasticTTest(double[], double[])}.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 33)",
        "(line 571,col 9)-(line 571,col 33)",
        "(line 572,col 9)-(line 574,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(double[], double[])",
      "begin_line": 610,
      "end_line": 618,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test\n     * comparing the means of the input arrays, under the assumption that\n     * the two samples are drawn from subpopulations with equal variances.\n     * To perform the test without the equal variances assumption, use\n     * {@link #tTest(double[], double[])}.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different.\n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * A pooled variance estimate is used to compute the t-statistic.  See\n     * {@link #homoscedasticT(double[], double[])}. The sum of the sample sizes\n     * minus 2 is used as the degrees of freedom.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 33)",
        "(line 613,col 9)-(line 613,col 33)",
        "(line 614,col 9)-(line 617,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double[], double[], double)",
      "begin_line": 672,
      "end_line": 677,
      "comment": "\n     * Performs a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \u003ccode\u003esample1\u003c/code\u003e\n     * and \u003ccode\u003esample2\u003c/code\u003e are drawn from populations with the same mean,\n     * with significance level \u003ccode\u003ealpha\u003c/code\u003e.  This test does not assume\n     * that the subpopulation variances are equal.  To perform the test assuming\n     * equal variances, use\n     * {@link #homoscedasticTTest(double[], double[], double)}.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To\n     * perform a 1-sided test, use \u003ccode\u003ealpha / 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link #t(double[], double[])} for the formula used to compute the\n     * t-statistic.  Degrees of freedom are approximated using the\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * Welch-Satterthwaite approximation.\u003c/a\u003e\u003c/p\u003e\n\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95% level,  use\n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.05). \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2 \u003c/code\u003e at\n     * the 99% level, first verify that the measured  mean of \u003ccode\u003esample 1\u003c/code\u003e\n     * is less than the mean of \u003ccode\u003esample 2\u003c/code\u003e and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 38)",
        "(line 676,col 9)-(line 676,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(double[], double[], double)",
      "begin_line": 730,
      "end_line": 735,
      "comment": "\n     * Performs a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \u003ccode\u003esample1\u003c/code\u003e\n     * and \u003ccode\u003esample2\u003c/code\u003e are drawn from populations with the same mean,\n     * with significance level \u003ccode\u003ealpha\u003c/code\u003e,  assuming that the\n     * subpopulation variances are equal.  Use\n     * {@link #tTest(double[], double[], double)} to perform the test without\n     * the assumption of equal variances.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To\n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2.\u003c/code\u003e  To perform the test\n     * without the assumption of equal subpopulation variances, use\n     * {@link #tTest(double[], double[], double)}.\u003c/p\u003e\n     * \u003cp\u003e\n     * A pooled variance estimate is used to compute the t-statistic. See\n     * {@link #t(double[], double[])} for the formula. The sum of the sample\n     * sizes minus 2 is used as the degrees of freedom.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.05). \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2, \u003c/code\u003e\n     * at the 99% level, first verify that the measured mean of\n     * \u003ccode\u003esample 1\u003c/code\u003e is less than the mean of \u003ccode\u003esample 2\u003c/code\u003e\n     * and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 38)",
        "(line 734,col 9)-(line 734,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 771,
      "end_line": 778,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test\n     * comparing the means of the datasets described by two StatisticalSummary\n     * instances.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different.\n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * The test does not assume that the underlying popuation variances are\n     * equal  and it uses approximated degrees of freedom computed from the\n     * sample data to compute the p-value.   To perform the test assuming\n     * equal variances, use\n     * {@link #homoscedasticTTest(StatisticalSummary, StatisticalSummary)}.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1  StatisticalSummary describing data from the first sample\n     * @param sampleStats2  StatisticalSummary describing data from the second sample\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 38)",
        "(line 774,col 9)-(line 774,col 38)",
        "(line 775,col 9)-(line 777,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 813,
      "end_line": 822,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test\n     * comparing the means of the datasets described by two StatisticalSummary\n     * instances, under the hypothesis of equal subpopulation variances. To\n     * perform a test without the equal variances assumption, use\n     * {@link #tTest(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different.\n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link #homoscedasticT(double[], double[])} for the formula used to\n     * compute the t-statistic. The sum of the  sample sizes minus 2 is used as\n     * the degrees of freedom.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1  StatisticalSummary describing data from the first sample\n     * @param sampleStats2  StatisticalSummary describing data from the second sample\n     * @return p-value for t-test\n     * @throws IllegalArgumentException if the precondition is not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 38)",
        "(line 817,col 9)-(line 817,col 38)",
        "(line 818,col 9)-(line 821,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 877,
      "end_line": 882,
      "comment": "\n     * Performs a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that\n     * \u003ccode\u003esampleStats1\u003c/code\u003e and \u003ccode\u003esampleStats2\u003c/code\u003e describe\n     * datasets drawn from populations with the same mean, with significance\n     * level \u003ccode\u003ealpha\u003c/code\u003e.   This test does not assume that the\n     * subpopulation variances are equal.  To perform the test under the equal\n     * variances assumption, use\n     * {@link #homoscedasticTTest(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To\n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link #t(double[], double[])} for the formula used to compute the\n     * t-statistic.  Degrees of freedom are approximated using the\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * Welch-Satterthwaite approximation.\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95%, use\n     * \u003cbr\u003e\u003ccode\u003etTest(sampleStats1, sampleStats2, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2 \u003c/code\u003e\n     * at the 99% level,  first verify that the measured mean of\n     * \u003ccode\u003esample 1\u003c/code\u003e is less than  the mean of \u003ccode\u003esample 2\u003c/code\u003e\n     * and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(sampleStats1, sampleStats2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing sample data values\n     * @param sampleStats2 StatisticalSummary describing sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 38)",
        "(line 881,col 9)-(line 881,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.df(double, double, double, double)",
      "begin_line": 895,
      "end_line": 899,
      "comment": "\n     * Computes approximate degrees of freedom for 2-sample t-test.\n     *\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return approximate degrees of freedom\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 898,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, double, double, double)",
      "begin_line": 910,
      "end_line": 912,
      "comment": "\n     * Computes t test statistic for 1-sample t-test.\n     *\n     * @param m sample mean\n     * @param mu constant to test against\n     * @param v sample variance\n     * @param n sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.t(double, double, double, double, double, double)",
      "begin_line": 927,
      "end_line": 930,
      "comment": "\n     * Computes t test statistic for 2-sample t-test.\n     * \u003cp\u003e\n     * Does not assume that subpopulation variances are equal.\u003c/p\u003e\n     *\n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 929,col 13)-(line 929,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticT(double, double, double, double, double, double)",
      "begin_line": 944,
      "end_line": 948,
      "comment": "\n     * Computes t test statistic for 2-sample t-test under the hypothesis\n     * of equal subpopulation variances.\n     *\n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 946,col 13)-(line 946,col 85)",
        "(line 947,col 13)-(line 947,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double, double, double)",
      "begin_line": 960,
      "end_line": 965,
      "comment": "\n     * Computes p-value for 2-sided, 1-sample t-test.\n     *\n     * @param m sample mean\n     * @param mu constant to test against\n     * @param v sample variance\n     * @param n sample n\n     * @return p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 44)",
        "(line 963,col 9)-(line 963,col 48)",
        "(line 964,col 9)-(line 964,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.tTest(double, double, double, double, double, double)",
      "begin_line": 982,
      "end_line": 990,
      "comment": "\n     * Computes p-value for 2-sided, 2-sample t-test.\n     * \u003cp\u003e\n     * Does not assume subpopulation variances are equal. Degrees of freedom\n     * are estimated from the data.\u003c/p\u003e\n     *\n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 55)",
        "(line 986,col 9)-(line 986,col 36)",
        "(line 987,col 9)-(line 987,col 46)",
        "(line 988,col 9)-(line 988,col 59)",
        "(line 989,col 9)-(line 989,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.homoscedasticTTest(double, double, double, double, double, double)",
      "begin_line": 1007,
      "end_line": 1014,
      "comment": "\n     * Computes p-value for 2-sided, 2-sample t-test, under the assumption\n     * of equal subpopulation variances.\n     * \u003cp\u003e\n     * The sum of the sample sizes minus 2 is used as degrees of freedom.\u003c/p\u003e\n     *\n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 68)",
        "(line 1011,col 9)-(line 1011,col 46)",
        "(line 1012,col 9)-(line 1012,col 59)",
        "(line 1013,col 9)-(line 1013,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.setDistribution(org.apache.commons.math.distribution.TDistribution)",
      "begin_line": 1021,
      "end_line": 1023,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     * @param value the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.checkSignificanceLevel(double)",
      "begin_line": 1029,
      "end_line": 1036,
      "comment": " Check significance level.\n     * @param alpha significance level\n     * @exception IllegalArgumentException if significance level is out of bounds\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1035,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.checkSampleData(double[])",
      "begin_line": 1042,
      "end_line": 1049,
      "comment": " Check sample data.\n     * @param data sample data\n     * @exception IllegalArgumentException if there is not enough sample data\n     ",
      "child_ranges": [
        "(line 1044,col 9)-(line 1048,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TTestImpl.checkSampleData(org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 1055,
      "end_line": 1062,
      "comment": " Check sample data.\n     * @param stat statistical summary\n     * @exception IllegalArgumentException if there is not enough sample data\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1061,col 9)"
      ]
    }
  ]
}