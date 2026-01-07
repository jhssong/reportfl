{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/inference/GTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 537,
      "comment": "\n * Implements \u003ca href\u003d\"http://en.wikipedia.org/wiki/G-test\"\u003eG Test\u003c/a\u003e\n * statistics.\n *\n * \u003cp\u003eThis is known in statistical genetics as the McDonald-Kreitman test.\n * The implementation handles both known and unknown distributions.\u003c/p\u003e\n *\n * \u003cp\u003eTwo samples tests can be used when the distribution is unknown \u003ci\u003ea priori\u003c/i\u003e\n * but provided by one sample, or when the hypothesis under test is that the two\n * samples come from the same underlying distribution.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.g(double[], long[])",
      "begin_line": 77,
      "end_line": 110,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://en.wikipedia.org/wiki/G-test\"\u003eG statistic\n     * for Goodness of Fit\u003c/a\u003e comparing {@code observed} and {@code expected}\n     * frequency counts.\n     *\n     * \u003cp\u003eThis statistic can be used to perform a G test (Log-Likelihood Ratio\n     * Test) evaluating the null hypothesis that the observed counts follow the\n     * expected distribution.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eExpected counts must all be positive. \u003c/li\u003e\n     * \u003cli\u003eObserved counts must all be \u0026ge; 0. \u003c/li\u003e\n     * \u003cli\u003eThe observed and expected arrays must have the same length and their\n     * common length must be at least 2. \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eIf any of the preconditions are not met, a\n     * {@code MathIllegalArgumentException} is thrown.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003eThis implementation rescales the\n     * {@code expected} array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return G-Test statistic\n     * @throws NotPositiveException if {@code observed} has negative entries\n     * @throws NotStrictlyPositiveException if {@code expected} has entries that\n     * are not strictly positive\n     * @throws DimensionMismatchException if the array lengths do not match or\n     * are less than 2.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 43)",
        "(line 88,col 9)-(line 88,col 46)",
        "(line 90,col 9)-(line 90,col 32)",
        "(line 91,col 9)-(line 91,col 32)",
        "(line 92,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 26)",
        "(line 97,col 9)-(line 97,col 32)",
        "(line 98,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 24)",
        "(line 103,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.gTest(double[], long[])",
      "begin_line": 152,
      "end_line": 160,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e p-value\u003c/a\u003e,\n     * associated with a G-Test for goodness of fit\u003c/a\u003e comparing the\n     * {@code observed} frequency counts to those in the {@code expected} array.\n     *\n     * \u003cp\u003eThe number returned is the smallest significance level at which one\n     * can reject the null hypothesis that the observed counts conform to the\n     * frequency distribution described by the expected counts.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe probability returned is the tail probability beyond\n     * {@link #g(double[], long[]) g(expected, observed)}\n     * in the ChiSquare distribution with degrees of freedom one less than the\n     * common length of {@code expected} and {@code observed}.\u003c/p\u003e\n     *\n     * \u003cp\u003e \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eExpected counts must all be positive. \u003c/li\u003e\n     * \u003cli\u003eObserved counts must all be \u0026ge; 0. \u003c/li\u003e\n     * \u003cli\u003eThe observed and expected arrays must have the\n     * same length and their common length must be at least 2.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eIf any of the preconditions are not met, a\n     * {@code MathIllegalArgumentException} is thrown.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003eThis implementation rescales the\n     * {@code expected} array if necessary to ensure that the sum of the\n     *  expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws NotPositiveException if {@code observed} has negative entries\n     * @throws NotStrictlyPositiveException if {@code expected} has entries that\n     * are not strictly positive\n     * @throws DimensionMismatchException if the array lengths do not match or\n     * are less than 2.\n     * @throws MaxCountExceededException if an error occurs computing the\n     * p-value.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 157,col 66)",
        "(line 158,col 9)-(line 159,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.gTestIntrinsic(double[], long[])",
      "begin_line": 183,
      "end_line": 191,
      "comment": "\n     * Returns the intrinsic (Hardy-Weinberg proportions) p-Value, as described\n     * in p64-69 of McDonald, J.H. 2009. Handbook of Biological Statistics\n     * (2nd ed.). Sparky House Publishing, Baltimore, Maryland.\n     *\n     * \u003cp\u003e The probability returned is the tail probability beyond\n     * {@link #g(double[], long[]) g(expected, observed)}\n     * in the ChiSquare distribution with degrees of freedom two less than the\n     * common length of {@code expected} and {@code observed}.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws NotPositiveException if {@code observed} has negative entries\n     * @throws NotStrictlyPositiveException {@code expected} has entries that are\n     * not strictly positive\n     * @throws DimensionMismatchException if the array lengths do not match or\n     * are less than 2.\n     * @throws MaxCountExceededException if an error occurs computing the\n     * p-value.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 188,col 66)",
        "(line 189,col 9)-(line 190,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.gTest(double[], long[], double)",
      "begin_line": 237,
      "end_line": 247,
      "comment": "\n     * Performs a G-Test (Log-Likelihood Ratio Test) for goodness of fit\n     * evaluating the null hypothesis that the observed counts conform to the\n     * frequency distribution described by the expected counts, with\n     * significance level {@code alpha}. Returns true iff the null\n     * hypothesis can be rejected with {@code 100 * (1 - alpha)} percent confidence.\n     *\n     * \u003cp\u003e\u003cstrong\u003eExample:\u003c/strong\u003e\u003cbr\u003e To test the hypothesis that\n     * {@code observed} follows {@code expected} at the 99% level,\n     * use \u003c/p\u003e\u003cp\u003e\n     * {@code gTest(expected, observed, 0.01)}\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns true iff {@link #gTest(double[], long[])\n     *  gTestGoodnessOfFitPValue(expected, observed)} \u003c alpha\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eExpected counts must all be positive. \u003c/li\u003e\n     * \u003cli\u003eObserved counts must all be \u0026ge; 0. \u003c/li\u003e\n     * \u003cli\u003eThe observed and expected arrays must have the same length and their\n     * common length must be at least 2.\n     * \u003cli\u003e {@code 0 \u003c alpha \u003c 0.5} \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eIf any of the preconditions are not met, a\n     * {@code MathIllegalArgumentException} is thrown.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003eThis implementation rescales the\n     * {@code expected} array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence 1 -\n     * alpha\n     * @throws NotPositiveException if {@code observed} has negative entries\n     * @throws NotStrictlyPositiveException if {@code expected} has entries that\n     * are not strictly positive\n     * @throws DimensionMismatchException if the array lengths do not match or\n     * are less than 2.\n     * @throws MaxCountExceededException if an error occurs computing the\n     * p-value.\n     * @throws OutOfRangeException if alpha is not strictly greater than zero\n     * and less than or equal to 0.5\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.entropy(long[][])",
      "begin_line": 261,
      "end_line": 278,
      "comment": "\n     * Calculates the \u003ca href\u003d\n     * \"http://en.wikipedia.org/wiki/Entropy_%28information_theory%29\"\u003eShannon\n     * entropy\u003c/a\u003e for 2 Dimensional Matrix.  The value returned is the entropy\n     * of the vector formed by concatenating the rows (or columns) of {@code k}\n     * to form a vector. See {@link #entropy(long[])}.\n     *\n     * @param k 2 Dimensional Matrix of long values (for ex. the counts of a\n     * trials)\n     * @return Shannon Entropy of the given Matrix\n     *\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 22)",
        "(line 263,col 9)-(line 263,col 26)",
        "(line 264,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.entropy(long[])",
      "begin_line": 291,
      "end_line": 304,
      "comment": "\n     * Calculates the \u003ca href\u003d\"http://en.wikipedia.org/wiki/Entropy_%28information_theory%29\"\u003e\n     * Shannon entropy\u003c/a\u003e for a vector.  The values of {@code k} are taken to be\n     * incidence counts of the values of a random variable. What is returned is \u003cbr/\u003e\n     * \u0026sum;p\u003csub\u003ei\u003c/sub\u003elog(p\u003csub\u003ei\u003c/sub\u003e\u003cbr/\u003e\n     * where p\u003csub\u003ei\u003c/sub\u003e \u003d k[i] / (sum of elements in k)\n     *\n     * @param k Vector (for ex. Row Sums of a trials)\n     * @return Shannon Entropy of the given Vector\n     *\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 22)",
        "(line 293,col 9)-(line 293,col 26)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.gDataSetsComparison(long[], long[])",
      "begin_line": 348,
      "end_line": 389,
      "comment": "\n     * \u003cp\u003eComputes a G (Log-Likelihood Ratio) two sample test statistic for\n     * independence comparing frequency counts in\n     * {@code observed1} and {@code observed2}. The sums of frequency\n     * counts in the two samples are not required to be the same. The formula\n     * used to compute the test statistic is \u003c/p\u003e\n     *\n     * \u003cp\u003e{@code 2 * totalSum * [H(rowSums) + H(colSums) - H(k)]}\u003c/p\u003e\n     *\n     * \u003cp\u003e where {@code H} is the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Entropy_%28information_theory%29\"\u003e\n     * Shannon Entropy\u003c/a\u003e of the random variable formed by viewing the elements\n     * of the argument array as incidence counts; \u003cbr/\u003e\n     * {@code k} is a matrix with rows {@code [observed1, observed2]}; \u003cbr/\u003e\n     * {@code rowSums, colSums} are the row/col sums of {@code k}; \u003cbr\u003e\n     * and {@code totalSum} is the overall sum of all entries in {@code k}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis statistic can be used to perform a G test evaluating the null\n     * hypothesis that both observed counts are independent \u003c/p\u003e\n     *\n     * \u003cp\u003e \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eObserved counts must be non-negative. \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific bin must not both be zero. \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific sample must not all be  0. \u003c/li\u003e\n     * \u003cli\u003eThe arrays {@code observed1} and {@code observed2} must have\n     * the same length and their common length must be at least 2. \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eIf any of the preconditions are not met, a\n     * {@code MathIllegalArgumentException} is thrown.\u003c/p\u003e\n     *\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data\n     * set\n     * @return G-Test statistic\n     * @throws DimensionMismatchException the the lengths of the arrays do not\n     * match or their common length is less than 2\n     * @throws NotPositiveException if any entry in {@code observed1} or\n     * {@code observed2} is negative\n     * @throws ZeroException if either all counts of\n     * {@code observed1} or {@code observed2} are zero, or if the count\n     * at the same index is zero for both arrays.\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 360,col 9)-(line 360,col 47)",
        "(line 361,col 9)-(line 361,col 47)",
        "(line 364,col 9)-(line 364,col 27)",
        "(line 365,col 9)-(line 365,col 27)",
        "(line 368,col 9)-(line 368,col 59)",
        "(line 369,col 9)-(line 369,col 57)",
        "(line 371,col 9)-(line 381,col 9)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 54)",
        "(line 387,col 9)-(line 387,col 67)",
        "(line 388,col 9)-(line 388,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.rootLogLikelihoodRatio(long, long, long, long)",
      "begin_line": 421,
      "end_line": 430,
      "comment": "\n     * Calculates the root log-likelihood ratio for 2 state Datasets. See\n     * {@link #gDataSetsComparison(long[], long[] )}.\n     *\n     * \u003cp\u003eGiven two events A and B, let k11 be the number of times both events\n     * occur, k12 the incidence of B without A, k21 the count of A without B,\n     * and k22 the number of times neither A nor B occurs.  What is returned\n     * by this method is \u003c/p\u003e\n     *\n     * \u003cp\u003e{@code (sgn) sqrt(gValueDataSetsComparison({k11, k12}, {k21, k22})}\u003c/p\u003e\n     *\n     * \u003cp\u003ewhere {@code sgn} is -1 if {@code k11 / (k11 + k12) \u003c k21 / (k21 + k22))};\u003cbr/\u003e\n     * 1 otherwise.\u003c/p\u003e\n     *\n     * \u003cp\u003eSigned root LLR has two advantages over the basic LLR: a) it is positive\n     * where k11 is bigger than expected, negative where it is lower b) if there is\n     * no difference it is asymptotically normally distributed. This allows one\n     * to talk about \"number of standard deviations\" which is a more common frame\n     * of reference than the chi^2 distribution.\u003c/p\u003e\n     *\n     * @param k11 number of times the two events occurred together (AB)\n     * @param k12 number of times the second event occurred WITHOUT the\n     * first event (notA,B)\n     * @param k21 number of times the first event occurred WITHOUT the\n     * second event (A, notB)\n     * @param k22 number of times something else occurred (i.e. was neither\n     * of these events (notA, notB)\n     * @return root log-likelihood ratio\n     *\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 424,col 60)",
        "(line 425,col 9)-(line 425,col 41)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.gTestDataSetsComparison(long[], long[])",
      "begin_line": 472,
      "end_line": 480,
      "comment": "\n     * \u003cp\u003eReturns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a G-Value (Log-Likelihood Ratio) for two\n     * sample test comparing bin frequency counts in {@code observed1} and\n     * {@code observed2}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe number returned is the smallest significance level at which one\n     * can reject the null hypothesis that the observed counts conform to the\n     * same distribution. \u003c/p\u003e\n     *\n     * \u003cp\u003eSee {@link #gTest(double[], long[])} for details\n     * on how the p-value is computed.  The degrees of of freedom used to\n     * perform the test is one less than the common length of the input observed\n     * count arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e \u003cli\u003eObserved counts must be non-negative. \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific bin must not both be zero. \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific sample must not all be 0. \u003c/li\u003e\n     * \u003cli\u003eThe arrays {@code observed1} and {@code observed2} must\n     * have the same length and their common length must be at least 2. \u003c/li\u003e\n     * \u003c/ul\u003e\u003cp\u003e\n     * \u003cp\u003e If any of the preconditions are not met, a\n     * {@code MathIllegalArgumentException} is thrown.\u003c/p\u003e\n     *\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data\n     * set\n     * @return p-value\n     * @throws DimensionMismatchException the the length of the arrays does not\n     * match or their common length is less than 2\n     * @throws NotPositiveException if any of the entries in {@code observed1} or\n     * {@code observed2} are negative\n     * @throws ZeroException if either all counts of {@code observed1} or\n     * {@code observed2} are zero, or if the count at some index is\n     * zero for both arrays\n     * @throws MaxCountExceededException if an error occurs computing the\n     * p-value.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 477,col 47)",
        "(line 478,col 9)-(line 479,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.GTest.gTestDataSetsComparison(long[], long[], double)",
      "begin_line": 524,
      "end_line": 536,
      "comment": "\n     * \u003cp\u003ePerforms a G-Test (Log-Likelihood Ratio Test) comparing two binned\n     * data sets. The test evaluates the null hypothesis that the two lists\n     * of observed counts conform to the same frequency distribution, with\n     * significance level {@code alpha}. Returns true iff the null\n     * hypothesis can be rejected  with 100 * (1 - alpha) percent confidence.\n     * \u003c/p\u003e\n     * \u003cp\u003eSee {@link #gDataSetsComparison(long[], long[])} for details\n     * on the formula used to compute the G (LLR) statistic used in the test and\n     * {@link #gTest(double[], long[])} for information on how\n     * the observed significance level is computed. The degrees of of freedom used\n     * to perform the test is one less than the common length of the input observed\n     * count arrays. \u003c/p\u003e\n     *\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eObserved counts must be non-negative. \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific bin must not both be zero. \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific sample must not all be 0. \u003c/li\u003e\n     * \u003cli\u003eThe arrays {@code observed1} and {@code observed2} must\n     * have the same length and their common length must be at least 2. \u003c/li\u003e\n     * \u003cli\u003e{@code 0 \u003c alpha \u003c 0.5} \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eIf any of the preconditions are not met, a\n     * {@code MathIllegalArgumentException} is thrown.\u003c/p\u003e\n     *\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data\n     * set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence 1 -\n     * alpha\n     * @throws DimensionMismatchException the the length of the arrays does not\n     * match\n     * @throws NotPositiveException if any of the entries in {@code observed1} or\n     * {@code observed2} are negative\n     * @throws ZeroException if either all counts of {@code observed1} or\n     * {@code observed2} are zero, or if the count at some index is\n     * zero for both arrays\n     * @throws OutOfRangeException if {@code alpha} is not in the range\n     * (0, 0.5]\n     * @throws MaxCountExceededException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 69)"
      ]
    }
  ]
}