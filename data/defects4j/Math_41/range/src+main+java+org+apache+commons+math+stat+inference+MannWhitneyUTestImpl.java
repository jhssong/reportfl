{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/stat/inference/MannWhitneyUTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MannWhitneyUTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.MannWhitneyUTest"
      ],
      "begin_line": 32,
      "end_line": 195,
      "comment": "\n * An implementation of the Mann-Whitney U test (also called Wilcoxon rank-sum\n * test).\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "naturalRanking"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Ranking algorithm. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.MannWhitneyUTestImpl()",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Create a test instance using where NaN\u0027s are left in place and ties get\n     * the average of applicable ranks. Use this unless you are very sure of\n     * what you are doing.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 44,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.MannWhitneyUTestImpl(org.apache.commons.math.stat.ranking.NaNStrategy, org.apache.commons.math.stat.ranking.TiesStrategy)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Create a test instance using the given strategies for NaN\u0027s and ties.\n     * Only use this if you are sure of what you are doing.\n     *\n     * @param nanStrategy\n     *            specifies the strategy that should be used for Double.NaN\u0027s\n     * @param tiesStrategy\n     *            specifies the strategy that should be used for ties\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.ensureDataConformance(double[], double[])",
      "begin_line": 69,
      "end_line": 88,
      "comment": "\n     * Ensures that the provided arrays fulfills the assumptions.\n     *\n     * @param x first sample\n     * @param y second sample\n     * @throws IllegalArgumentException\n     *             if assumptions are not met\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 87,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.concatenateSamples(double[], double[])",
      "begin_line": 95,
      "end_line": 102,
      "comment": " Concatenate the samples into one array.\n     * @param x first sample\n     * @param y second sample\n     * @return concatenated array\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 59)",
        "(line 98,col 9)-(line 98,col 47)",
        "(line 99,col 9)-(line 99,col 54)",
        "(line 101,col 9)-(line 101,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.mannWhitneyU(double[], double[])",
      "begin_line": 112,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x the first sample\n     * @param y the second sample\n     * @return mannWhitneyU statistic U (maximum of U\u003csup\u003ex\u003c/sup\u003e and U\u003csup\u003ey\u003c/sup\u003e)\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 36)",
        "(line 117,col 9)-(line 117,col 52)",
        "(line 118,col 9)-(line 118,col 54)",
        "(line 120,col 9)-(line 120,col 28)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 134,col 9)-(line 134,col 69)",
        "(line 139,col 9)-(line 139,col 51)",
        "(line 141,col 9)-(line 141,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.calculateAsymptoticPValue(double, int, int)",
      "begin_line": 151,
      "end_line": 166,
      "comment": "\n     * @param Umin smallest Mann-Whitney U value\n     * @param n1 number of subjects in first sample\n     * @param n2 number of subjects in second sample\n     * @return two-sided asymptotic p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 37)",
        "(line 157,col 9)-(line 157,col 50)",
        "(line 158,col 9)-(line 158,col 71)",
        "(line 160,col 9)-(line 160,col 59)",
        "(line 162,col 9)-(line 163,col 22)",
        "(line 165,col 9)-(line 165,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.MannWhitneyUTestImpl.mannWhitneyUTest(double[], double[])",
      "begin_line": 181,
      "end_line": 194,
      "comment": "\n     * Ties give rise to biased variance at the moment. See e.g. \u003ca\n     * href\u003d\"http://mlsc.lboro.ac.uk/resources/statistics/Mannwhitney.pdf\"\n     * \u003ehttp://mlsc.lboro.ac.uk/resources/statistics/Mannwhitney.pdf\u003c/a\u003e.\n     *\n     * {@inheritDoc}\n     *\n     * @param x the first sample\n     * @param y the second sample\n     * @return asymptotic p-value (biased for samples with ties)\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 36)",
        "(line 186,col 9)-(line 186,col 47)",
        "(line 191,col 9)-(line 191,col 55)",
        "(line 193,col 9)-(line 193,col 67)"
      ]
    }
  ]
}