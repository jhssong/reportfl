{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/stat/inference/TTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 1169,
      "comment": "\n * An implementation for Student\u0027s t-tests.\n * \u003cp\u003e\n * Tests can be:\u003cul\u003e\n * \u003cli\u003eOne-sample or two-sample\u003c/li\u003e\n * \u003cli\u003eOne-sided or two-sided\u003c/li\u003e\n * \u003cli\u003ePaired or unpaired (for two-sample tests)\u003c/li\u003e\n * \u003cli\u003eHomoscedastic (equal variance assumption) or heteroscedastic\n * (for two sample tests)\u003c/li\u003e\n * \u003cli\u003eFixed significance level (boolean-valued) or returning p-values.\n * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * Test statistics are available for all tests.  Methods including \"Test\" in\n * in their names perform tests, all other methods return t-statistics.  Among\n * the \"Test\" methods, \u003ccode\u003edouble-\u003c/code\u003evalued methods return p-values;\n * \u003ccode\u003eboolean-\u003c/code\u003evalued methods perform fixed significance level tests.\n * Significance levels are always specified as numbers between 0 and 0.5\n * (e.g. tests at the 95% level  use \u003ccode\u003ealpha\u003d0.05\u003c/code\u003e).\u003c/p\u003e\n * \u003cp\u003e\n * Input to tests can be either \u003ccode\u003edouble[]\u003c/code\u003e arrays or\n * {@link StatisticalSummary} instances.\u003c/p\u003e\u003cp\u003e\n * Uses commons-math {@link org.apache.commons.math3.distribution.TDistribution}\n * implementation to estimate exact p-values.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.pairedT(double[], double[])",
      "begin_line": 79,
      "end_line": 90,
      "comment": "\n     * Computes a paired, 2-sample t-statistic based on the data in the input\n     * arrays.  The t-statistic returned is equivalent to what would be returned by\n     * computing the one-sample t-statistic {@link #t(double, double[])}, with\n     * \u003ccode\u003emu \u003d 0\u003c/code\u003e and the sample array consisting of the (signed)\n     * differences between corresponding entries in \u003ccode\u003esample1\u003c/code\u003e and\n     * \u003ccode\u003esample2.\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input arrays must have the same length and their common length\n     * must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws NullArgumentException if the arrays are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NoDataException if the arrays are empty\n     * @throws DimensionMismatchException if the length of the arrays is not equal\n     * @throws NumberIsTooSmallException if the length of the arrays is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 33)",
        "(line 84,col 9)-(line 84,col 33)",
        "(line 85,col 9)-(line 85,col 75)",
        "(line 86,col 9)-(line 88,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.pairedTTest(double[], double[])",
      "begin_line": 128,
      "end_line": 137,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003e p-value\u003c/i\u003e, associated with a paired, two-sample, two-tailed t-test\n     * based on the data in the input arrays.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean of the paired\n     * differences is 0 in favor of the two-sided alternative that the mean paired\n     * difference is not equal to 0. For a one-sided test, divide the returned\n     * value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * This test is equivalent to a one-sample t-test computed using\n     * {@link #tTest(double, double[])} with \u003ccode\u003emu \u003d 0\u003c/code\u003e and the sample\n     * array consisting of the signed differences between corresponding elements of\n     * \u003ccode\u003esample1\u003c/code\u003e and \u003ccode\u003esample2.\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input array lengths must be the same and their common length must\n     * be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws NullArgumentException if the arrays are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NoDataException if the arrays are empty\n     * @throws DimensionMismatchException if the length of the arrays is not equal\n     * @throws NumberIsTooSmallException if the length of the arrays is \u0026lt; 2\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 75)",
        "(line 133,col 9)-(line 135,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.pairedTTest(double[], double[], double)",
      "begin_line": 175,
      "end_line": 183,
      "comment": "\n     * Performs a paired t-test evaluating the null hypothesis that the\n     * mean of the paired differences between \u003ccode\u003esample1\u003c/code\u003e and\n     * \u003ccode\u003esample2\u003c/code\u003e is 0 in favor of the two-sided alternative that the\n     * mean paired difference is not equal to 0, with significance level\n     * \u003ccode\u003ealpha\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be rejected with\n     * confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To perform a 1-sided test, use\n     * \u003ccode\u003ealpha * 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe input array lengths must be the same and their common length\n     * must be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u0026lt; alpha \u0026lt; 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws NullArgumentException if the arrays are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NoDataException if the arrays are empty\n     * @throws DimensionMismatchException if the length of the arrays is not equal\n     * @throws NumberIsTooSmallException if the length of the arrays is \u0026lt; 2\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 38)",
        "(line 181,col 9)-(line 181,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.t(double, double[])",
      "begin_line": 201,
      "end_line": 208,
      "comment": "\n     * Computes a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc22.htm#formula\"\u003e\n     * t statistic \u003c/a\u003e given observed values and a comparison constant.\n     * \u003cp\u003e\n     * This statistic can be used to perform a one sample t-test for the mean.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu comparison constant\n     * @param observed array of values\n     * @return t statistic\n     * @throws NullArgumentException if \u003ccode\u003eobserved\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the length of \u003ccode\u003eobserved\u003c/code\u003e is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 34)",
        "(line 205,col 9)-(line 206,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.t(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 227,
      "end_line": 234,
      "comment": "\n     * Computes a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc22.htm#formula\"\u003e\n     * t statistic \u003c/a\u003e to use in comparing the mean of the dataset described by\n     * \u003ccode\u003esampleStats\u003c/code\u003e to \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * This statistic can be used to perform a one sample t-test for the mean.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eobserved.getN() \u0026ge; 2\u003c/code\u003e.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu comparison constant\n     * @param sampleStats DescriptiveStatistics holding sample summary statitstics\n     * @return t statistic\n     * @throws NullArgumentException if \u003ccode\u003esampleStats\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the number of samples is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 37)",
        "(line 231,col 9)-(line 232,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.homoscedasticT(double[], double[])",
      "begin_line": 270,
      "end_line": 279,
      "comment": "\n     * Computes a 2-sample t statistic,  under the hypothesis of equal\n     * subpopulation variances.  To compute a t-statistic without the\n     * equal variances hypothesis, use {@link #t(double[], double[])}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a (homoscedastic) two-sample\n     * t-test to compare sample means.\u003c/p\u003e\n     * \u003cp\u003e\n     * The t-statistic is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp;\u003ccode\u003e  t \u003d (m1 - m2) / (sqrt(1/n1 +1/n2) sqrt(var))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of first sample;\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of second sample;\n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of first sample;\n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of second sample\u003c/li\u003e\n     * \u003c/ul\u003e\n     * and \u003cstrong\u003e\u003ccode\u003evar\u003c/code\u003e\u003c/strong\u003e is the pooled variance estimate:\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003ccode\u003evar \u003d sqrt(((n1 - 1)var1 + (n2 - 1)var2) / ((n1-1) + (n2-1)))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * with \u003cstrong\u003e\u003ccode\u003evar1\u003c/code\u003e\u003c/strong\u003e the variance of the first sample and\n     * \u003cstrong\u003e\u003ccode\u003evar2\u003c/code\u003e\u003c/strong\u003e the variance of the second sample.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws NullArgumentException if the arrays are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the length of the arrays is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 33)",
        "(line 274,col 9)-(line 274,col 33)",
        "(line 275,col 9)-(line 277,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.t(double[], double[])",
      "begin_line": 310,
      "end_line": 319,
      "comment": "\n     * Computes a 2-sample t statistic, without the hypothesis of equal\n     * subpopulation variances.  To compute a t-statistic assuming equal\n     * variances, use {@link #homoscedasticT(double[], double[])}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a two-sample t-test to compare\n     * sample means.\u003c/p\u003e\n     * \u003cp\u003e\n     * The t-statistic is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp; \u003ccode\u003e  t \u003d (m1 - m2) / sqrt(var1/n1 + var2/n2)\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     *  where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of the first sample\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of the second sample;\n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of the second sample;\n     * \u003cstrong\u003e\u003ccode\u003e var1\u003c/code\u003e\u003c/strong\u003e is the variance of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e var2\u003c/code\u003e\u003c/strong\u003e is the variance of the second sample;\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return t statistic\n     * @throws NullArgumentException if the arrays are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the length of the arrays is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 33)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 315,col 9)-(line 317,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.t(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 353,
      "end_line": 363,
      "comment": "\n     * Computes a 2-sample t statistic \u003c/a\u003e, comparing the means of the datasets\n     * described by two {@link StatisticalSummary} instances, without the\n     * assumption of equal subpopulation variances.  Use\n     * {@link #homoscedasticT(StatisticalSummary, StatisticalSummary)} to\n     * compute a t-statistic under the equal variances assumption.\n     * \u003cp\u003e\n     * This statistic can be used to perform a two-sample t-test to compare\n     * sample means.\u003c/p\u003e\n     * \u003cp\u003e\n      * The returned  t-statistic is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp; \u003ccode\u003e  t \u003d (m1 - m2) / sqrt(var1/n1 + var2/n2)\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of the second sample;\n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of the second sample\n     * \u003cstrong\u003e\u003ccode\u003e var1\u003c/code\u003e\u003c/strong\u003e is the variance of the first sample;\n     * \u003cstrong\u003e\u003ccode\u003e var2\u003c/code\u003e\u003c/strong\u003e is the variance of the second sample\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing data from the first sample\n     * @param sampleStats2 StatisticalSummary describing data from the second sample\n     * @return t statistic\n     * @throws NullArgumentException if the sample statistics are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the number of samples is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 38)",
        "(line 358,col 9)-(line 358,col 38)",
        "(line 359,col 9)-(line 361,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.homoscedasticT(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 401,
      "end_line": 411,
      "comment": "\n     * Computes a 2-sample t statistic, comparing the means of the datasets\n     * described by two {@link StatisticalSummary} instances, under the\n     * assumption of equal subpopulation variances.  To compute a t-statistic\n     * without the equal variances assumption, use\n     * {@link #t(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * This statistic can be used to perform a (homoscedastic) two-sample\n     * t-test to compare sample means.\u003c/p\u003e\n     * \u003cp\u003e\n     * The t-statistic returned is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026nbsp;\u0026nbsp;\u003ccode\u003e  t \u003d (m1 - m2) / (sqrt(1/n1 +1/n2) sqrt(var))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * where \u003cstrong\u003e\u003ccode\u003en1\u003c/code\u003e\u003c/strong\u003e is the size of first sample;\n     * \u003cstrong\u003e\u003ccode\u003e n2\u003c/code\u003e\u003c/strong\u003e is the size of second sample;\n     * \u003cstrong\u003e\u003ccode\u003e m1\u003c/code\u003e\u003c/strong\u003e is the mean of first sample;\n     * \u003cstrong\u003e\u003ccode\u003e m2\u003c/code\u003e\u003c/strong\u003e is the mean of second sample\n     * and \u003cstrong\u003e\u003ccode\u003evar\u003c/code\u003e\u003c/strong\u003e is the pooled variance estimate:\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003ccode\u003evar \u003d sqrt(((n1 - 1)var1 + (n2 - 1)var2) / ((n1-1) + (n2-1)))\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * with \u003cstrong\u003e\u003ccode\u003evar1\u003c/code\u003e\u003c/strong\u003e the variance of the first sample and\n     * \u003cstrong\u003e\u003ccode\u003evar2\u003c/code\u003e\u003c/strong\u003e the variance of the second sample.\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing data from the first sample\n     * @param sampleStats2 StatisticalSummary describing data from the second sample\n     * @return t statistic\n     * @throws NullArgumentException if the sample statistics are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the number of samples is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 38)",
        "(line 407,col 9)-(line 409,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(double, double[])",
      "begin_line": 440,
      "end_line": 448,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a one-sample, two-tailed t-test\n     * comparing the mean of the input array with the constant \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean equals\n     * \u003ccode\u003emu\u003c/code\u003e in favor of the two-sided alternative that the mean\n     * is different from \u003ccode\u003emu\u003c/code\u003e. For a one-sided test, divide the\n     * returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sample array of sample data values\n     * @return p-value\n     * @throws NullArgumentException if the sample array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the length of the array is \u0026lt; 2\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 32)",
        "(line 445,col 9)-(line 446,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(double, double[], double)",
      "begin_line": 487,
      "end_line": 494,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that the mean of the population from\n     * which \u003ccode\u003esample\u003c/code\u003e is drawn equals \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be\n     * rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To\n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003esample mean \u003d mu \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(mu, sample, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e sample mean \u003c mu \u003c/code\u003e\n     * at the 99% level, first verify that the measured sample mean is less\n     * than \u003ccode\u003emu\u003c/code\u003e and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(mu, sample, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the one-sample\n     * parametric t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/sg_glos.html#one-sample\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sample array of sample data values\n     * @param alpha significance level of the test\n     * @return p-value\n     * @throws NullArgumentException if the sample array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the length of the array is \u0026lt; 2\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws MaxCountExceededException if an error computing the p-value\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 38)",
        "(line 492,col 9)-(line 492,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 525,
      "end_line": 533,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a one-sample, two-tailed t-test\n     * comparing the mean of the dataset described by \u003ccode\u003esampleStats\u003c/code\u003e\n     * with the constant \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the mean equals\n     * \u003ccode\u003emu\u003c/code\u003e in favor of the two-sided alternative that the mean\n     * is different from \u003ccode\u003emu\u003c/code\u003e. For a one-sided test, divide the\n     * returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe sample must contain at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sampleStats StatisticalSummary describing sample data\n     * @return p-value\n     * @throws NullArgumentException if \u003ccode\u003esampleStats\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the number of samples is \u0026lt; 2\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 37)",
        "(line 530,col 9)-(line 531,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 573,
      "end_line": 581,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that the mean of the\n     * population from which the dataset described by \u003ccode\u003estats\u003c/code\u003e is\n     * drawn equals \u003ccode\u003emu\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis can be rejected with\n     * confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To  perform a 1-sided test, use\n     * \u003ccode\u003ealpha * 2.\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003esample mean \u003d mu \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(mu, sampleStats, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e sample mean \u003c mu \u003c/code\u003e\n     * at the 99% level, first verify that the measured sample mean is less\n     * than \u003ccode\u003emu\u003c/code\u003e and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(mu, sampleStats, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the one-sample\n     * parametric t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/sg_glos.html#one-sample\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe sample must include at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mu constant value to compare sample mean against\n     * @param sampleStats StatisticalSummary describing sample data values\n     * @param alpha significance level of the test\n     * @return p-value\n     * @throws NullArgumentException if \u003ccode\u003esampleStats\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the number of samples is \u0026lt; 2\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 38)",
        "(line 579,col 9)-(line 579,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(double[], double[])",
      "begin_line": 620,
      "end_line": 630,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test\n     * comparing the means of the input arrays.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different.\n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * The test does not assume that the underlying popuation variances are\n     * equal  and it uses approximated degrees of freedom computed from the\n     * sample data to compute the p-value.  The t-statistic used is as defined in\n     * {@link #t(double[], double[])} and the Welch-Satterthwaite approximation\n     * to the degrees of freedom is used,\n     * as described\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * here.\u003c/a\u003e  To perform the test under the assumption of equal subpopulation\n     * variances, use {@link #homoscedasticTTest(double[], double[])}.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws NullArgumentException if the arrays are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the length of the arrays is \u0026lt; 2\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 33)",
        "(line 625,col 9)-(line 625,col 33)",
        "(line 626,col 9)-(line 628,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.homoscedasticTTest(double[], double[])",
      "begin_line": 666,
      "end_line": 678,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test\n     * comparing the means of the input arrays, under the assumption that\n     * the two samples are drawn from subpopulations with equal variances.\n     * To perform the test without the equal variances assumption, use\n     * {@link #tTest(double[], double[])}.\u003c/p\u003e\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different.\n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * A pooled variance estimate is used to compute the t-statistic.  See\n     * {@link #homoscedasticT(double[], double[])}. The sum of the sample sizes\n     * minus 2 is used as the degrees of freedom.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @return p-value for t-test\n     * @throws NullArgumentException if the arrays are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the length of the arrays is \u0026lt; 2\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 33)",
        "(line 671,col 9)-(line 671,col 33)",
        "(line 672,col 9)-(line 676,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(double[], double[], double)",
      "begin_line": 732,
      "end_line": 740,
      "comment": "\n     * Performs a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \u003ccode\u003esample1\u003c/code\u003e\n     * and \u003ccode\u003esample2\u003c/code\u003e are drawn from populations with the same mean,\n     * with significance level \u003ccode\u003ealpha\u003c/code\u003e.  This test does not assume\n     * that the subpopulation variances are equal.  To perform the test assuming\n     * equal variances, use\n     * {@link #homoscedasticTTest(double[], double[], double)}.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To\n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link #t(double[], double[])} for the formula used to compute the\n     * t-statistic.  Degrees of freedom are approximated using the\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * Welch-Satterthwaite approximation.\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95% level,  use\n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.05). \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2 \u003c/code\u003e,\n     * at the 99% level, first verify that the measured  mean of \u003ccode\u003esample 1\u003c/code\u003e\n     * is less than the mean of \u003ccode\u003esample 2\u003c/code\u003e and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws NullArgumentException if the arrays are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the length of the arrays is \u0026lt; 2\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 38)",
        "(line 738,col 9)-(line 738,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.homoscedasticTTest(double[], double[], double)",
      "begin_line": 795,
      "end_line": 803,
      "comment": "\n     * Performs a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that \u003ccode\u003esample1\u003c/code\u003e\n     * and \u003ccode\u003esample2\u003c/code\u003e are drawn from populations with the same mean,\n     * with significance level \u003ccode\u003ealpha\u003c/code\u003e,  assuming that the\n     * subpopulation variances are equal.  Use\n     * {@link #tTest(double[], double[], double)} to perform the test without\n     * the assumption of equal variances.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To\n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2.\u003c/code\u003e  To perform the test\n     * without the assumption of equal subpopulation variances, use\n     * {@link #tTest(double[], double[], double)}.\u003c/p\u003e\n     * \u003cp\u003e\n     * A pooled variance estimate is used to compute the t-statistic. See\n     * {@link #t(double[], double[])} for the formula. The sum of the sample\n     * sizes minus 2 is used as the degrees of freedom.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95% level, use \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.05). \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2, \u003c/code\u003e\n     * at the 99% level, first verify that the measured mean of\n     * \u003ccode\u003esample 1\u003c/code\u003e is less than the mean of \u003ccode\u003esample 2\u003c/code\u003e\n     * and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(sample1, sample2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe observed array lengths must both be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sample1 array of sample data values\n     * @param sample2 array of sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws NullArgumentException if the arrays are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the length of the arrays is \u0026lt; 2\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 38)",
        "(line 801,col 9)-(line 801,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 840,
      "end_line": 851,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test\n     * comparing the means of the datasets described by two StatisticalSummary\n     * instances.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different.\n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * The test does not assume that the underlying population variances are\n     * equal  and it uses approximated degrees of freedom computed from the\n     * sample data to compute the p-value.   To perform the test assuming\n     * equal variances, use\n     * {@link #homoscedasticTTest(StatisticalSummary, StatisticalSummary)}.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1  StatisticalSummary describing data from the first sample\n     * @param sampleStats2  StatisticalSummary describing data from the second sample\n     * @return p-value for t-test\n     * @throws NullArgumentException if the sample statistics are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the number of samples is \u0026lt; 2\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 38)",
        "(line 846,col 9)-(line 846,col 38)",
        "(line 847,col 9)-(line 849,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.homoscedasticTTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 887,
      "end_line": 900,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or\n     * \u003ci\u003ep-value\u003c/i\u003e, associated with a two-sample, two-tailed t-test\n     * comparing the means of the datasets described by two StatisticalSummary\n     * instances, under the hypothesis of equal subpopulation variances. To\n     * perform a test without the equal variances assumption, use\n     * {@link #tTest(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level\n     * at which one can reject the null hypothesis that the two means are\n     * equal in favor of the two-sided alternative that they are different.\n     * For a one-sided test, divide the returned value by 2.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link #homoscedasticT(double[], double[])} for the formula used to\n     * compute the t-statistic. The sum of the  sample sizes minus 2 is used as\n     * the degrees of freedom.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the p-value depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003ehere\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1  StatisticalSummary describing data from the first sample\n     * @param sampleStats2  StatisticalSummary describing data from the second sample\n     * @return p-value for t-test\n     * @throws NullArgumentException if the sample statistics are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the number of samples is \u0026lt; 2\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 38)",
        "(line 893,col 9)-(line 893,col 38)",
        "(line 894,col 9)-(line 898,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 957,
      "end_line": 966,
      "comment": "\n     * Performs a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda353.htm\"\u003e\n     * two-sided t-test\u003c/a\u003e evaluating the null hypothesis that\n     * \u003ccode\u003esampleStats1\u003c/code\u003e and \u003ccode\u003esampleStats2\u003c/code\u003e describe\n     * datasets drawn from populations with the same mean, with significance\n     * level \u003ccode\u003ealpha\u003c/code\u003e.   This test does not assume that the\n     * subpopulation variances are equal.  To perform the test under the equal\n     * variances assumption, use\n     * {@link #homoscedasticTTest(StatisticalSummary, StatisticalSummary)}.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff the null hypothesis that the means are\n     * equal can be rejected with confidence \u003ccode\u003e1 - alpha\u003c/code\u003e.  To\n     * perform a 1-sided test, use \u003ccode\u003ealpha * 2\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link #t(double[], double[])} for the formula used to compute the\n     * t-statistic.  Degrees of freedom are approximated using the\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section3/prc31.htm\"\u003e\n     * Welch-Satterthwaite approximation.\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExamples:\u003c/strong\u003e\u003cbr\u003e\u003col\u003e\n     * \u003cli\u003eTo test the (2-sided) hypothesis \u003ccode\u003emean 1 \u003d mean 2 \u003c/code\u003e at\n     * the 95%, use\n     * \u003cbr\u003e\u003ccode\u003etTest(sampleStats1, sampleStats2, 0.05) \u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eTo test the (one-sided) hypothesis \u003ccode\u003e mean 1 \u003c mean 2 \u003c/code\u003e\n     * at the 99% level,  first verify that the measured mean of\n     * \u003ccode\u003esample 1\u003c/code\u003e is less than  the mean of \u003ccode\u003esample 2\u003c/code\u003e\n     * and then use\n     * \u003cbr\u003e\u003ccode\u003etTest(sampleStats1, sampleStats2, 0.02) \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note:\u003c/strong\u003e\u003cbr\u003e\n     * The validity of the test depends on the assumptions of the parametric\n     * t-test procedure, as discussed\n     * \u003ca href\u003d\"http://www.basic.nwu.edu/statguidefiles/ttest_unpaired_ass_viol.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe datasets described by the two Univariates must each contain\n     * at least 2 observations.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param sampleStats1 StatisticalSummary describing sample data values\n     * @param sampleStats2 StatisticalSummary describing sample data values\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws NullArgumentException if the sample statistics are \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberIsTooSmallException if the number of samples is \u0026lt; 2\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 38)",
        "(line 964,col 9)-(line 964,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.df(double, double, double, double)",
      "begin_line": 979,
      "end_line": 983,
      "comment": "\n     * Computes approximate degrees of freedom for 2-sample t-test.\n     *\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return approximate degrees of freedom\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 982,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.t(double, double, double, double)",
      "begin_line": 994,
      "end_line": 997,
      "comment": "\n     * Computes t test statistic for 1-sample t-test.\n     *\n     * @param m sample mean\n     * @param mu constant to test against\n     * @param v sample variance\n     * @param n sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.t(double, double, double, double, double, double)",
      "begin_line": 1012,
      "end_line": 1016,
      "comment": "\n     * Computes t test statistic for 2-sample t-test.\n     * \u003cp\u003e\n     * Does not assume that subpopulation variances are equal.\u003c/p\u003e\n     *\n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1015,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.homoscedasticT(double, double, double, double, double, double)",
      "begin_line": 1030,
      "end_line": 1035,
      "comment": "\n     * Computes t test statistic for 2-sample t-test under the hypothesis\n     * of equal subpopulation variances.\n     *\n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return t test statistic\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 87)",
        "(line 1034,col 9)-(line 1034,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(double, double, double, double)",
      "begin_line": 1047,
      "end_line": 1055,
      "comment": "\n     * Computes p-value for 2-sided, 1-sample t-test.\n     *\n     * @param m sample mean\n     * @param mu constant to test against\n     * @param v sample variance\n     * @param n sample n\n     * @return p-value\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 48)",
        "(line 1052,col 9)-(line 1052,col 62)",
        "(line 1053,col 9)-(line 1053,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.tTest(double, double, double, double, double, double)",
      "begin_line": 1072,
      "end_line": 1082,
      "comment": "\n     * Computes p-value for 2-sided, 2-sample t-test.\n     * \u003cp\u003e\n     * Does not assume subpopulation variances are equal. Degrees of freedom\n     * are estimated from the data.\u003c/p\u003e\n     *\n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return p-value\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 65)",
        "(line 1078,col 9)-(line 1078,col 59)",
        "(line 1079,col 9)-(line 1079,col 73)",
        "(line 1080,col 9)-(line 1080,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.homoscedasticTTest(double, double, double, double, double, double)",
      "begin_line": 1099,
      "end_line": 1109,
      "comment": "\n     * Computes p-value for 2-sided, 2-sample t-test, under the assumption\n     * of equal subpopulation variances.\n     * \u003cp\u003e\n     * The sum of the sample sizes minus 2 is used as degrees of freedom.\u003c/p\u003e\n     *\n     * @param m1 first sample mean\n     * @param m2 second sample mean\n     * @param v1 first sample variance\n     * @param v2 second sample variance\n     * @param n1 first sample n\n     * @param n2 second sample n\n     * @return p-value\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 78)",
        "(line 1105,col 9)-(line 1105,col 52)",
        "(line 1106,col 9)-(line 1106,col 73)",
        "(line 1107,col 9)-(line 1107,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.checkSignificanceLevel(double)",
      "begin_line": 1117,
      "end_line": 1125,
      "comment": "\n     * Check significance level.\n     *\n     * @param alpha significance level\n     * @throws OutOfRangeException if the significance level is out of bounds.\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.checkSampleData(double[])",
      "begin_line": 1134,
      "end_line": 1146,
      "comment": "\n     * Check sample data.\n     *\n     * @param data Sample data.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     * @throws NumberIsTooSmallException if there is not enough sample data.\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1139,col 9)",
        "(line 1140,col 9)-(line 1144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TTest.checkSampleData(org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 1155,
      "end_line": 1167,
      "comment": "\n     * Check sample data.\n     *\n     * @param stat Statistical summary.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     * @throws NumberIsTooSmallException if there is not enough sample data.\n     ",
      "child_ranges": [
        "(line 1158,col 9)-(line 1160,col 9)",
        "(line 1161,col 9)-(line 1165,col 9)"
      ]
    }
  ]
}