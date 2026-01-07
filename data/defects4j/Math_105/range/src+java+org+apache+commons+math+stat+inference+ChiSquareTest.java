{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/inference/ChiSquareTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTest",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 213,
      "comment": "\n * An interface for Chi-Square tests.\n *\n * @version $Revision$ $Date$ \n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTest.chiSquare(double[], long[])",
      "begin_line": 51,
      "end_line": 52,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm\"\u003e\n     * Chi-Square statistic\u003c/a\u003e comparing \u003ccode\u003eobserved\u003c/code\u003e and \u003ccode\u003eexpected\u003c/code\u003e \n     * freqeuncy counts. \n     * \u003cp\u003e\n     * This statistic can be used to perform a Chi-Square test evaluating the null hypothesis that\n     *  the observed counts follow the expected distribution.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eExpected counts must all be positive.  \n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts must all be \u003e\u003d 0.   \n     * \u003c/li\u003e\n     * \u003cli\u003eThe observed and expected arrays must have the same length and\n     * their common length must be at least 2.  \n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chiSquare statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTest.chiSquareTest(double[], long[])",
      "begin_line": 83,
      "end_line": 84,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm\"\u003e\n     * Chi-square goodness of fit test\u003c/a\u003e comparing the \u003ccode\u003eobserved\u003c/code\u003e \n     * frequency counts to those in the \u003ccode\u003eexpected\u003c/code\u003e array.\n     * \u003cp\u003e\n     * The number returned is the smallest significance level at which one can reject \n     * the null hypothesis that the observed counts conform to the frequency distribution \n     * described by the expected counts. \n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eExpected counts must all be positive.  \n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts must all be \u003e\u003d 0.   \n     * \u003c/li\u003e\n     * \u003cli\u003eThe observed and expected arrays must have the same length and\n     * their common length must be at least 2.  \n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTest.chiSquareTest(double[], long[], double)",
      "begin_line": 118,
      "end_line": 119,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm\"\u003e\n     * Chi-square goodness of fit test\u003c/a\u003e evaluating the null hypothesis that the observed counts \n     * conform to the frequency distribution described by the expected counts, with \n     * significance level \u003ccode\u003ealpha\u003c/code\u003e.  Returns true iff the null hypothesis can be rejected\n     * with 100 * (1 - alpha) percent confidence.\n     * \u003cp\u003e\n     * \u003cstrong\u003eExample:\u003c/strong\u003e\u003cbr\u003e\n     * To test the hypothesis that \u003ccode\u003eobserved\u003c/code\u003e follows \n     * \u003ccode\u003eexpected\u003c/code\u003e at the 99% level, use \u003cp\u003e\n     * \u003ccode\u003echiSquareTest(expected, observed, 0.01) \u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eExpected counts must all be positive.  \n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts must all be \u003e\u003d 0.   \n     * \u003c/li\u003e\n     * \u003cli\u003eThe observed and expected arrays must have the same length and\n     * their common length must be at least 2.  \n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTest.chiSquare(long[][])",
      "begin_line": 145,
      "end_line": 146,
      "comment": "\n     *  Computes the Chi-Square statistic associated with a \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section4/prc45.htm\"\u003e\n     *  chi-square test of independence\u003c/a\u003e based on the input \u003ccode\u003ecounts\u003c/code\u003e\n     *  array, viewed as a two-way table.  \n     * \u003cp\u003e\n     * The rows of the 2-way table are \u003ccode\u003ecount[0], ... , count[count.length - 1] \u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAll counts must be \u003e\u003d 0.  \n     * \u003c/li\u003e\n     * \u003cli\u003eThe count array must be rectangular (i.e. all count[i] subarrays must have the same length). \n     * \u003c/li\u003e\n     * \u003cli\u003eThe 2-way table represented by \u003ccode\u003ecounts\u003c/code\u003e must have at least 2 columns and\n     *        at least 2 rows.\n     * \u003c/li\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param counts array representation of 2-way table\n     * @return chiSquare statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTest.chiSquareTest(long[][])",
      "begin_line": 175,
      "end_line": 176,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a \n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section4/prc45.htm\"\u003e\n     * chi-square test of independence\u003c/a\u003e based on the input \u003ccode\u003ecounts\u003c/code\u003e\n     * array, viewed as a two-way table.  \n     * \u003cp\u003e\n     * The rows of the 2-way table are \u003ccode\u003ecount[0], ... , count[count.length - 1] \u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAll counts must be \u003e\u003d 0.  \n     * \u003c/li\u003e\n     * \u003cli\u003eThe count array must be rectangular (i.e. all count[i] subarrays must have the same length). \n     * \u003c/li\u003e\n     * \u003cli\u003eThe 2-way table represented by \u003ccode\u003ecounts\u003c/code\u003e must have at least 2 columns and\n     *        at least 2 rows.\n     * \u003c/li\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTest.chiSquareTest(long[][], double)",
      "begin_line": 211,
      "end_line": 212,
      "comment": "\n     * Performs a \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section4/prc45.htm\"\u003e\n     * chi-square test of independence\u003c/a\u003e evaluating the null hypothesis that the classifications \n     * represented by the counts in the columns of the input 2-way table are independent of the rows,\n     * with significance level \u003ccode\u003ealpha\u003c/code\u003e.  Returns true iff the null hypothesis can be rejected\n     * with 100 * (1 - alpha) percent confidence.\n     * \u003cp\u003e\n     * The rows of the 2-way table are \u003ccode\u003ecount[0], ... , count[count.length - 1] \u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eExample:\u003c/strong\u003e\u003cbr\u003e\n     * To test the null hypothesis that the counts in \u003ccode\u003ecount[0], ... , count[count.length - 1] \u003c/code\u003e\n     *  all correspond to the same underlying probability distribution at the 99% level, use \u003cp\u003e\n     * \u003ccode\u003echiSquareTest(counts, 0.01) \u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAll counts must be \u003e\u003d 0.  \n     * \u003c/li\u003e\n     * \u003cli\u003eThe count array must be rectangular (i.e. all count[i] subarrays must have the same length). \n     * \u003c/li\u003e\n     * \u003cli\u003eThe 2-way table represented by \u003ccode\u003ecounts\u003c/code\u003e must have at least 2 columns and\n     *        at least 2 rows.\n     * \u003c/li\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": []
    }
  ]
}