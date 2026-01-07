{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/stat/inference/MannWhitneyUTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MannWhitneyUTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.MannWhitneyUTest"
      ],
      "begin_line": 32,
      "end_line": 197,
      "comment": "\n * An implementation of the Mann-Whitney U test (also called Wilcoxon rank-sum\n * test).\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "naturalRanking"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.MannWhitneyUTestImpl()",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Create a test instance using where NaN\u0027s are left in place and ties get\n     * the average of applicable ranks. Use this unless you are very sure of\n     * what you are doing.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 42,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.MannWhitneyUTestImpl(org.apache.commons.math.stat.ranking.NaNStrategy, org.apache.commons.math.stat.ranking.TiesStrategy)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Create a test instance using the given strategies for NaN\u0027s and ties.\n     * Only use this if you are sure of what you are doing.\n     * \n     * @param nanStrategy\n     *            specifies the strategy that should be used for Double.NaN\u0027s\n     * @param tiesStrategy\n     *            specifies the strategy that should be used for ties\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.ensureDataConformance(double[], double[])",
      "begin_line": 67,
      "end_line": 86,
      "comment": "\n     * Ensures that the provided arrays fulfills the assumptions.\n     * \n     * @param x\n     * @param y\n     * @throws IllegalArgumentException\n     *             if assumptions are not met\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.concatinateSamples(double[], double[])",
      "begin_line": 88,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 59)",
        "(line 91,col 9)-(line 91,col 47)",
        "(line 92,col 9)-(line 92,col 54)",
        "(line 94,col 9)-(line 94,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.mannWhitneyU(double[], double[])",
      "begin_line": 108,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @return mannWhitneyU statistic U (maximum of U\u003csup\u003ex\u003c/sup\u003e and U\u003csup\u003ey\u003c/sup\u003e)\n     * @throws IllegalArgumentException\n     *             if preconditions are not met\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 36)",
        "(line 113,col 9)-(line 113,col 52)",
        "(line 114,col 9)-(line 114,col 54)",
        "(line 116,col 9)-(line 116,col 28)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 130,col 9)-(line 130,col 69)",
        "(line 135,col 9)-(line 135,col 51)",
        "(line 137,col 9)-(line 137,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.calculateAsymptoticPValue(double, int, int)",
      "begin_line": 149,
      "end_line": 164,
      "comment": "\n     * @param Umin\n     *            smallest Mann-Whitney U value\n     * @param N\n     *            number of subjects (corresponding to x.length)\n     * @return two-sided asymptotic p-value\n     * @throws MathException\n     *             if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 37)",
        "(line 155,col 9)-(line 155,col 50)",
        "(line 156,col 9)-(line 156,col 71)",
        "(line 158,col 9)-(line 158,col 59)",
        "(line 160,col 9)-(line 161,col 22)",
        "(line 163,col 9)-(line 163,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.mannWhitneyUTest(double[], double[])",
      "begin_line": 183,
      "end_line": 196,
      "comment": "\n     * Ties give rise to biased variance at the moment. See e.g. \u003ca\n     * href\u003d\"http://mlsc.lboro.ac.uk/resources/statistics/Mannwhitney.pdf\"\n     * \u003ehttp://mlsc.lboro.ac.uk/resources/statistics/Mannwhitney.pdf\u003c/a\u003e.\n     * \n     * {@inheritDoc}\n     * \n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @return asymptotic p-value (biased for samples with ties)\n     * @throws IllegalArgumentException\n     *             if preconditions are not met\n     * @throws MathException\n     *             if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 36)",
        "(line 188,col 9)-(line 188,col 47)",
        "(line 193,col 9)-(line 193,col 55)",
        "(line 195,col 9)-(line 195,col 67)"
      ]
    }
  ]
}