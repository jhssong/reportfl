{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/stat/inference/WilcoxonSignedRankTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WilcoxonSignedRankTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.WilcoxonSignedRankTest"
      ],
      "begin_line": 31,
      "end_line": 272,
      "comment": "\n * An implementation of the Wilcoxon signed-rank test.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "naturalRanking"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Ranking algorithm. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.WilcoxonSignedRankTestImpl()",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Create a test instance where NaN\u0027s are left in place and ties get\n     * the average of applicable ranks. Use this unless you are very sure\n     * of what you are doing.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 43,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.WilcoxonSignedRankTestImpl(org.apache.commons.math.stat.ranking.NaNStrategy, org.apache.commons.math.stat.ranking.TiesStrategy)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Create a test instance using the given strategies for NaN\u0027s and ties.\n     * Only use this if you are sure of what you are doing.\n     *\n     * @param nanStrategy\n     *            specifies the strategy that should be used for Double.NaN\u0027s\n     * @param tiesStrategy\n     *            specifies the strategy that should be used for ties\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.ensureDataConformance(double[], double[])",
      "begin_line": 68,
      "end_line": 87,
      "comment": "\n     * Ensures that the provided arrays fulfills the assumptions.\n     *\n     * @param x first sample\n     * @param y second sample\n     * @throws IllegalArgumentException\n     *             if assumptions are not met\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.calculateDifferences(double[], double[])",
      "begin_line": 96,
      "end_line": 105,
      "comment": "\n     * Calculates y[i] - x[i] for all i\n     *\n     * @param x first sample\n     * @param y second sample\n     * @return z \u003d y - x\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 48)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.calculateAbsoluteDifferences(double[])",
      "begin_line": 115,
      "end_line": 133,
      "comment": "\n     * Calculates |z[i]| for all i\n     *\n     * @param z sample\n     * @return |z|\n     * @throws IllegalArgumentException\n     *             if assumptions are not met\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 51)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.wilcoxonSignedRank(double[], double[])",
      "begin_line": 146,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @return wilcoxonSignedRank statistic (the larger of W+ and W-)\n     * @throws IllegalArgumentException\n     *             if preconditions are not met\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 36)",
        "(line 153,col 9)-(line 153,col 54)",
        "(line 154,col 9)-(line 154,col 62)",
        "(line 156,col 9)-(line 156,col 57)",
        "(line 158,col 9)-(line 158,col 25)",
        "(line 160,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 31)",
        "(line 167,col 9)-(line 167,col 71)",
        "(line 169,col 9)-(line 169,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.calculateExactPValue(double, int)",
      "begin_line": 182,
      "end_line": 211,
      "comment": "\n     * Algorithm inspired by\n     * http://www.fon.hum.uva.nl/Service/Statistics/Signed_Rank_Algorihms.html#C\n     * by Rob van Son, Institute of Phonetic Sciences \u0026 IFOTT,\n     * University of Amsterdam\n     *\n     * @param Wmax largest Wilcoxon signed rank value\n     * @param N number of subjects (corresponding to x.length)\n     * @return two-sided exact p-value\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 29)",
        "(line 187,col 9)-(line 187,col 31)",
        "(line 189,col 9)-(line 204,col 9)",
        "(line 210,col 9)-(line 210,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.calculateAsymptoticPValue(double, int)",
      "begin_line": 219,
      "end_line": 234,
      "comment": "\n     * @param Wmin smallest Wilcoxon signed rank value\n     * @param N number of subjects (corresponding to x.length)\n     * @return two-sided asymptotic p-value\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 55)",
        "(line 226,col 9)-(line 226,col 62)",
        "(line 229,col 9)-(line 229,col 65)",
        "(line 231,col 9)-(line 231,col 87)",
        "(line 233,col 9)-(line 233,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.wilcoxonSignedRankTest(double[], double[], boolean)",
      "begin_line": 252,
      "end_line": 271,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @param exactPValue\n     *            if the exact p-value is wanted (only for x.length \u003c\u003d 30)\n     * @return p-value\n     * @throws IllegalArgumentException\n     *             if preconditions are not met or exact p-value is wanted for\n     *             when x.length \u003e 30\n     * @throws MathException\n     *             if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 36)",
        "(line 258,col 9)-(line 258,col 31)",
        "(line 259,col 9)-(line 259,col 53)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 270,col 9)"
      ]
    }
  ]
}