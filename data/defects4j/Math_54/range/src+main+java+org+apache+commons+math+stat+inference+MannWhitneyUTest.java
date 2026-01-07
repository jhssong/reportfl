{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/stat/inference/MannWhitneyUTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MannWhitneyUTest",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 92,
      "comment": "\n * An interface for Mann-Whitney U test (also called Wilcoxon rank-sum test).\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTest.mannWhitneyU(double[], double[])",
      "begin_line": 58,
      "end_line": 59,
      "comment": "\n     * Computes the \u003ca\n     * href\u003d\"http://en.wikipedia.org/wiki/Mann%E2%80%93Whitney_U\"\u003e Mann-Whitney\n     * U statistic\u003c/a\u003e comparing mean for two independent samples possibly of\n     * different length.\n     * \u003cp\u003e\n     * This statistic can be used to perform a Mann-Whitney U test evaluating\n     * the null hypothesis that the two independent samples has equal mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Let X\u003csub\u003ei\u003c/sub\u003e denote the i\u0027th individual of the first sample and\n     * Y\u003csub\u003ej\u003c/sub\u003e the j\u0027th individual in the second sample. Note that the\n     * samples would often have different length.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003eAll observations in the two samples are independent.\u003c/li\u003e\n     * \u003cli\u003eThe observations are at least ordinal (continuous are also ordinal).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @return mannWhitneyU statistic\n     * @throws IllegalArgumentException\n     *             if preconditions are not met\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTest.mannWhitneyUTest(double[], double[])",
      "begin_line": 90,
      "end_line": 91,
      "comment": "\n     * Returns the asymptotic \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a \u003ca\n     * href\u003d\"http://en.wikipedia.org/wiki/Mann%E2%80%93Whitney_U\"\u003e Mann-Whitney\n     * U statistic\u003c/a\u003e comparing mean for two independent samples.\n     * \u003cp\u003e\n     * Let X\u003csub\u003ei\u003c/sub\u003e denote the i\u0027th individual of the first sample and\n     * Y\u003csub\u003ej\u003c/sub\u003e the j\u0027th individual in the second sample. Note that the\n     * samples would often have different length.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003eAll observations in the two samples are independent.\u003c/li\u003e\n     * \u003cli\u003eThe observations are at least ordinal (continuous are also ordinal).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @return asymptotic p-value\n     * @throws IllegalArgumentException\n     *             if preconditions are not met\n     * @throws MathException\n     *             if an error occurs computing the p-value\n     ",
      "child_ranges": []
    }
  ]
}