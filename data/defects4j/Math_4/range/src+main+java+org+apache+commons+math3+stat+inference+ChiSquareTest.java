{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/inference/ChiSquareTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 601,
      "comment": "\n * Implements Chi-Square test statistics.\n *\n * \u003cp\u003eThis implementation handles both known and unknown distributions.\u003c/p\u003e\n *\n * \u003cp\u003eTwo samples tests can be used when the distribution is unknown \u003ci\u003ea priori\u003c/i\u003e\n * but provided by one sample, or when the hypothesis under test is that the two\n * samples come from the same underlying distribution.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.ChiSquareTest()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Construct a ChiSquareTest\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.chiSquare(double[], long[])",
      "begin_line": 81,
      "end_line": 118,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm\"\u003e\n     * Chi-Square statistic\u003c/a\u003e comparing \u003ccode\u003eobserved\u003c/code\u003e and \u003ccode\u003eexpected\u003c/code\u003e\n     * frequency counts.\n     * \u003cp\u003e\n     * This statistic can be used to perform a Chi-Square test evaluating the null\n     * hypothesis that the observed counts follow the expected distribution.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eExpected counts must all be positive.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts must all be \u0026ge; 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe observed and expected arrays must have the same length and\n     * their common length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chiSquare test statistic\n     * @throws NotPositiveException if \u003ccode\u003eobserved\u003c/code\u003e has negative entries\n     * @throws NotStrictlyPositiveException if \u003ccode\u003eexpected\u003c/code\u003e has entries that are\n     * not strictly positive\n     * @throws DimensionMismatchException if the arrays length is less than 2\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 92,col 9)-(line 92,col 46)",
        "(line 94,col 9)-(line 94,col 32)",
        "(line 95,col 9)-(line 95,col 32)",
        "(line 96,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 28)",
        "(line 101,col 9)-(line 101,col 32)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 28)",
        "(line 107,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.chiSquareTest(double[], long[])",
      "begin_line": 155,
      "end_line": 162,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm\"\u003e\n     * Chi-square goodness of fit test\u003c/a\u003e comparing the \u003ccode\u003eobserved\u003c/code\u003e\n     * frequency counts to those in the \u003ccode\u003eexpected\u003c/code\u003e array.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level at which one can reject\n     * the null hypothesis that the observed counts conform to the frequency distribution\n     * described by the expected counts.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eExpected counts must all be positive.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts must all be \u0026ge; 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe observed and expected arrays must have the same length and\n     * their common length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws NotPositiveException if \u003ccode\u003eobserved\u003c/code\u003e has negative entries\n     * @throws NotStrictlyPositiveException if \u003ccode\u003eexpected\u003c/code\u003e has entries that are\n     * not strictly positive\n     * @throws DimensionMismatchException if the arrays length is less than 2\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 160,col 62)",
        "(line 161,col 9)-(line 161,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.chiSquareTest(double[], long[], double)",
      "begin_line": 203,
      "end_line": 214,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm\"\u003e\n     * Chi-square goodness of fit test\u003c/a\u003e evaluating the null hypothesis that the\n     * observed counts conform to the frequency distribution described by the expected\n     * counts, with significance level \u003ccode\u003ealpha\u003c/code\u003e.  Returns true iff the null\n     * hypothesis can be rejected with 100 * (1 - alpha) percent confidence.\n     * \u003cp\u003e\n     * \u003cstrong\u003eExample:\u003c/strong\u003e\u003cbr\u003e\n     * To test the hypothesis that \u003ccode\u003eobserved\u003c/code\u003e follows\n     * \u003ccode\u003eexpected\u003c/code\u003e at the 99% level, use \u003c/p\u003e\u003cp\u003e\n     * \u003ccode\u003echiSquareTest(expected, observed, 0.01) \u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eExpected counts must all be positive.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts must all be \u0026ge; 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe observed and expected arrays must have the same length and\n     * their common length must be at least 2.\n     * \u003cli\u003e \u003ccode\u003e 0 \u0026lt; alpha \u0026lt; 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws NotPositiveException if \u003ccode\u003eobserved\u003c/code\u003e has negative entries\n     * @throws NotStrictlyPositiveException if \u003ccode\u003eexpected\u003c/code\u003e has entries that are\n     * not strictly positive\n     * @throws DimensionMismatchException if the arrays length is less than 2\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.chiSquare(long[][])",
      "begin_line": 244,
      "end_line": 276,
      "comment": "\n     *  Computes the Chi-Square statistic associated with a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section4/prc45.htm\"\u003e\n     *  chi-square test of independence\u003c/a\u003e based on the input \u003ccode\u003ecounts\u003c/code\u003e\n     *  array, viewed as a two-way table.\n     * \u003cp\u003e\n     * The rows of the 2-way table are\n     * \u003ccode\u003ecount[0], ... , count[count.length - 1] \u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAll counts must be \u0026ge; 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe count array must be rectangular (i.e. all count[i] subarrays\n     *  must have the same length).\n     * \u003c/li\u003e\n     * \u003cli\u003eThe 2-way table represented by \u003ccode\u003ecounts\u003c/code\u003e must have at\n     *  least 2 columns and at least 2 rows.\n     * \u003c/li\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param counts array representation of 2-way table\n     * @return chiSquare test statistic\n     * @throws NullArgumentException if the array is null\n     * @throws DimensionMismatchException if the array is not rectangular\n     * @throws NotPositiveException if {@code counts} has negative entries\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 27)",
        "(line 249,col 9)-(line 249,col 34)",
        "(line 250,col 9)-(line 250,col 37)",
        "(line 253,col 9)-(line 253,col 44)",
        "(line 254,col 9)-(line 254,col 44)",
        "(line 255,col 9)-(line 255,col 28)",
        "(line 256,col 9)-(line 262,col 9)",
        "(line 265,col 9)-(line 265,col 28)",
        "(line 266,col 9)-(line 266,col 31)",
        "(line 267,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.chiSquareTest(long[][])",
      "begin_line": 309,
      "end_line": 319,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section4/prc45.htm\"\u003e\n     * chi-square test of independence\u003c/a\u003e based on the input \u003ccode\u003ecounts\u003c/code\u003e\n     * array, viewed as a two-way table.\n     * \u003cp\u003e\n     * The rows of the 2-way table are\n     * \u003ccode\u003ecount[0], ... , count[count.length - 1] \u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAll counts must be \u0026ge; 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe count array must be rectangular (i.e. all count[i] subarrays must have\n     *     the same length).\n     * \u003c/li\u003e\n     * \u003cli\u003eThe 2-way table represented by \u003ccode\u003ecounts\u003c/code\u003e must have at least 2\n     *     columns and at least 2 rows.\n     * \u003c/li\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws NullArgumentException if the array is null\n     * @throws DimensionMismatchException if the array is not rectangular\n     * @throws NotPositiveException if {@code counts} has negative entries\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 27)",
        "(line 314,col 9)-(line 314,col 82)",
        "(line 315,col 9)-(line 315,col 44)",
        "(line 316,col 9)-(line 316,col 54)",
        "(line 317,col 9)-(line 317,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.chiSquareTest(long[][], double)",
      "begin_line": 359,
      "end_line": 369,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section4/prc45.htm\"\u003e\n     * chi-square test of independence\u003c/a\u003e evaluating the null hypothesis that the\n     * classifications represented by the counts in the columns of the input 2-way table\n     * are independent of the rows, with significance level \u003ccode\u003ealpha\u003c/code\u003e.\n     * Returns true iff the null hypothesis can be rejected with 100 * (1 - alpha) percent\n     * confidence.\n     * \u003cp\u003e\n     * The rows of the 2-way table are\n     * \u003ccode\u003ecount[0], ... , count[count.length - 1] \u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExample:\u003c/strong\u003e\u003cbr\u003e\n     * To test the null hypothesis that the counts in\n     * \u003ccode\u003ecount[0], ... , count[count.length - 1] \u003c/code\u003e\n     *  all correspond to the same underlying probability distribution at the 99% level, use\u003c/p\u003e\n     * \u003cp\u003e\u003ccode\u003echiSquareTest(counts, 0.01)\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAll counts must be \u0026ge; 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe count array must be rectangular (i.e. all count[i] subarrays must have the\n     *     same length).\u003c/li\u003e\n     * \u003cli\u003eThe 2-way table represented by \u003ccode\u003ecounts\u003c/code\u003e must have at least 2 columns and\n     *     at least 2 rows.\u003c/li\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws NullArgumentException if the array is null\n     * @throws DimensionMismatchException if the array is not rectangular\n     * @throws NotPositiveException if {@code counts} has any negative entries\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 410,
      "end_line": 463,
      "comment": "\n     * \u003cp\u003eComputes a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/software/dataplot/refman1/auxillar/chi2samp.htm\"\u003e\n     * Chi-Square two sample test statistic\u003c/a\u003e comparing bin frequency counts\n     * in \u003ccode\u003eobserved1\u003c/code\u003e and \u003ccode\u003eobserved2\u003c/code\u003e.  The\n     * sums of frequency counts in the two samples are not required to be the\n     * same.  The formula used to compute the test statistic is\u003c/p\u003e\n     * \u003ccode\u003e\n     * \u0026sum;[(K * observed1[i] - observed2[i]/K)\u003csup\u003e2\u003c/sup\u003e / (observed1[i] + observed2[i])]\n     * \u003c/code\u003e where\n     * \u003cbr/\u003e\u003ccode\u003eK \u003d \u0026sqrt;[\u0026sum(observed2 / \u0026sum;(observed1)]\u003c/code\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eThis statistic can be used to perform a Chi-Square test evaluating the\n     * null hypothesis that both observed counts follow the same distribution.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eObserved counts must be non-negative.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific bin must not both be zero.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific sample must not all be 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe arrays \u003ccode\u003eobserved1\u003c/code\u003e and \u003ccode\u003eobserved2\u003c/code\u003e must have\n     * the same length and their common length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chiSquare test statistic\n     * @throws DimensionMismatchException the the length of the arrays does not match\n     * @throws NotPositiveException if any entries in \u003ccode\u003eobserved1\u003c/code\u003e or\n     * \u003ccode\u003eobserved2\u003c/code\u003e are negative\n     * @throws ZeroException if either all counts of \u003ccode\u003eobserved1\u003c/code\u003e or\n     * \u003ccode\u003eobserved2\u003c/code\u003e are zero, or if the count at some index is zero\n     * for both arrays\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 422,col 9)-(line 422,col 47)",
        "(line 423,col 9)-(line 423,col 47)",
        "(line 426,col 9)-(line 426,col 27)",
        "(line 427,col 9)-(line 427,col 27)",
        "(line 428,col 9)-(line 428,col 38)",
        "(line 429,col 9)-(line 429,col 28)",
        "(line 430,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 439,col 47)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 444,col 28)",
        "(line 445,col 9)-(line 445,col 26)",
        "(line 446,col 9)-(line 446,col 27)",
        "(line 447,col 9)-(line 447,col 27)",
        "(line 448,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 507,
      "end_line": 516,
      "comment": "\n     * \u003cp\u003eReturns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a Chi-Square two sample test comparing\n     * bin frequency counts in \u003ccode\u003eobserved1\u003c/code\u003e and\n     * \u003ccode\u003eobserved2\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe number returned is the smallest significance level at which one\n     * can reject the null hypothesis that the observed counts conform to the\n     * same distribution.\n     * \u003c/p\u003e\n     * \u003cp\u003eSee {@link #chiSquareDataSetsComparison(long[], long[])} for details\n     * on the formula used to compute the test statistic. The degrees of\n     * of freedom used to perform the test is one less than the common length\n     * of the input observed count arrays.\n     * \u003c/p\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eObserved counts must be non-negative.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific bin must not both be zero.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific sample must not all be 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe arrays \u003ccode\u003eobserved1\u003c/code\u003e and \u003ccode\u003eobserved2\u003c/code\u003e must\n     * have the same length and\n     * their common length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws DimensionMismatchException the the length of the arrays does not match\n     * @throws NotPositiveException if any entries in \u003ccode\u003eobserved1\u003c/code\u003e or\n     * \u003ccode\u003eobserved2\u003c/code\u003e are negative\n     * @throws ZeroException if either all counts of \u003ccode\u003eobserved1\u003c/code\u003e or\n     * \u003ccode\u003eobserved2\u003c/code\u003e are zero, or if the count at the same index is zero\n     * for both arrays\n     * @throws MaxCountExceededException if an error occurs computing the p-value\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 44)",
        "(line 512,col 9)-(line 512,col 81)",
        "(line 513,col 9)-(line 514,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 560,
      "end_line": 573,
      "comment": "\n     * \u003cp\u003ePerforms a Chi-Square two sample test comparing two binned data\n     * sets. The test evaluates the null hypothesis that the two lists of\n     * observed counts conform to the same frequency distribution, with\n     * significance level \u003ccode\u003ealpha\u003c/code\u003e.  Returns true iff the null\n     * hypothesis can be rejected with 100 * (1 - alpha) percent confidence.\n     * \u003c/p\u003e\n     * \u003cp\u003eSee {@link #chiSquareDataSetsComparison(long[], long[])} for\n     * details on the formula used to compute the Chisquare statistic used\n     * in the test. The degrees of of freedom used to perform the test is\n     * one less than the common length of the input observed count arrays.\n     * \u003c/p\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eObserved counts must be non-negative.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific bin must not both be zero.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific sample must not all be 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe arrays \u003ccode\u003eobserved1\u003c/code\u003e and \u003ccode\u003eobserved2\u003c/code\u003e must\n     * have the same length and their common length must be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws DimensionMismatchException the the length of the arrays does not match\n     * @throws NotPositiveException if any entries in \u003ccode\u003eobserved1\u003c/code\u003e or\n     * \u003ccode\u003eobserved2\u003c/code\u003e are negative\n     * @throws ZeroException if either all counts of \u003ccode\u003eobserved1\u003c/code\u003e or\n     * \u003ccode\u003eobserved2\u003c/code\u003e are zero, or if the count at the same index is zero\n     * for both arrays\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws MaxCountExceededException if an error occurs performing the test\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.ChiSquareTest.checkArray(long[][])",
      "begin_line": 584,
      "end_line": 599,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries.\n     *\n     * @param in input 2-way table to check\n     * @throws NullArgumentException if the array is null\n     * @throws DimensionMismatchException if the array is not valid\n     * @throws NotPositiveException if the array contains any negative entries\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 590,col 9)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 596,col 9)-(line 596,col 40)",
        "(line 597,col 9)-(line 597,col 40)"
      ]
    }
  ]
}