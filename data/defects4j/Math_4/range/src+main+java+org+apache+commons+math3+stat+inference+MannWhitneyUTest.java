{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/inference/MannWhitneyUTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MannWhitneyUTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 238,
      "comment": "\n * An implementation of the Mann-Whitney U test (also called Wilcoxon rank-sum test).\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "naturalRanking"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Ranking algorithm. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.MannWhitneyUTest.MannWhitneyUTest()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Create a test instance using where NaN\u0027s are left in place and ties get\n     * the average of applicable ranks. Use this unless you are very sure of\n     * what you are doing.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 46,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.MannWhitneyUTest.MannWhitneyUTest(org.apache.commons.math3.stat.ranking.NaNStrategy, org.apache.commons.math3.stat.ranking.TiesStrategy)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Create a test instance using the given strategies for NaN\u0027s and ties.\n     * Only use this if you are sure of what you are doing.\n     *\n     * @param nanStrategy\n     *            specifies the strategy that should be used for Double.NaN\u0027s\n     * @param tiesStrategy\n     *            specifies the strategy that should be used for ties\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.MannWhitneyUTest.ensureDataConformance(double[], double[])",
      "begin_line": 71,
      "end_line": 82,
      "comment": "\n     * Ensures that the provided arrays fulfills the assumptions.\n     *\n     * @param x first sample\n     * @param y second sample\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.MannWhitneyUTest.concatenateSamples(double[], double[])",
      "begin_line": 89,
      "end_line": 96,
      "comment": " Concatenate the samples into one array.\n     * @param x first sample\n     * @param y second sample\n     * @return concatenated array\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 59)",
        "(line 92,col 9)-(line 92,col 47)",
        "(line 93,col 9)-(line 93,col 54)",
        "(line 95,col 9)-(line 95,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(double[], double[])",
      "begin_line": 126,
      "end_line": 156,
      "comment": "\n     * Computes the \u003ca\n     * href\u003d\"http://en.wikipedia.org/wiki/Mann%E2%80%93Whitney_U\"\u003e Mann-Whitney\n     * U statistic\u003c/a\u003e comparing mean for two independent samples possibly of\n     * different length.\n     * \u003cp\u003e\n     * This statistic can be used to perform a Mann-Whitney U test evaluating\n     * the null hypothesis that the two independent samples has equal mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Let X\u003csub\u003ei\u003c/sub\u003e denote the i\u0027th individual of the first sample and\n     * Y\u003csub\u003ej\u003c/sub\u003e the j\u0027th individual in the second sample. Note that the\n     * samples would often have different length.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003eAll observations in the two samples are independent.\u003c/li\u003e\n     * \u003cli\u003eThe observations are at least ordinal (continuous are also ordinal).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the first sample\n     * @param y the second sample\n     * @return Mann-Whitney U statistic (maximum of U\u003csup\u003ex\u003c/sup\u003e and U\u003csup\u003ey\u003c/sup\u003e)\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 36)",
        "(line 131,col 9)-(line 131,col 52)",
        "(line 132,col 9)-(line 132,col 54)",
        "(line 134,col 9)-(line 134,col 28)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 148,col 9)-(line 148,col 69)",
        "(line 153,col 9)-(line 153,col 51)",
        "(line 155,col 9)-(line 155,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.MannWhitneyUTest.calculateAsymptoticPValue(double, int, int)",
      "begin_line": 168,
      "end_line": 188,
      "comment": "\n     * @param Umin smallest Mann-Whitney U value\n     * @param n1 number of subjects in first sample\n     * @param n2 number of subjects in second sample\n     * @return two-sided asymptotic p-value\n     * @throws ConvergenceException if the p-value can not be computed\n     * due to a convergence error\n     * @throws MaxCountExceededException if the maximum number of\n     * iterations is exceeded\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 45)",
        "(line 179,col 9)-(line 179,col 41)",
        "(line 180,col 9)-(line 180,col 60)",
        "(line 182,col 9)-(line 182,col 59)",
        "(line 185,col 9)-(line 185,col 79)",
        "(line 187,col 9)-(line 187,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest(double[], double[])",
      "begin_line": 222,
      "end_line": 236,
      "comment": "\n     * Returns the asymptotic \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a \u003ca\n     * href\u003d\"http://en.wikipedia.org/wiki/Mann%E2%80%93Whitney_U\"\u003e Mann-Whitney\n     * U statistic\u003c/a\u003e comparing mean for two independent samples.\n     * \u003cp\u003e\n     * Let X\u003csub\u003ei\u003c/sub\u003e denote the i\u0027th individual of the first sample and\n     * Y\u003csub\u003ej\u003c/sub\u003e the j\u0027th individual in the second sample. Note that the\n     * samples would often have different length.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003eAll observations in the two samples are independent.\u003c/li\u003e\n     * \u003cli\u003eThe observations are at least ordinal (continuous are also ordinal).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * Ties give rise to biased variance at the moment. See e.g. \u003ca\n     * href\u003d\"http://mlsc.lboro.ac.uk/resources/statistics/Mannwhitney.pdf\"\n     * \u003ehttp://mlsc.lboro.ac.uk/resources/statistics/Mannwhitney.pdf\u003c/a\u003e.\u003c/p\u003e\n     *\n     * @param x the first sample\n     * @param y the second sample\n     * @return asymptotic p-value\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     * @throws ConvergenceException if the p-value can not be computed due to a\n     * convergence error\n     * @throws MaxCountExceededException if the maximum number of iterations\n     * is exceeded\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 36)",
        "(line 228,col 9)-(line 228,col 47)",
        "(line 233,col 9)-(line 233,col 55)",
        "(line 235,col 9)-(line 235,col 67)"
      ]
    }
  ]
}