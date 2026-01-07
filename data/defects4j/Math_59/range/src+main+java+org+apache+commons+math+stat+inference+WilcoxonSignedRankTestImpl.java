{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/stat/inference/WilcoxonSignedRankTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WilcoxonSignedRankTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.WilcoxonSignedRankTest"
      ],
      "begin_line": 31,
      "end_line": 271,
      "comment": "\n * An implementation of the Wilcoxon signed-rank test.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "naturalRanking"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.WilcoxonSignedRankTestImpl()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n     * Create a test instance where NaN\u0027s are left in place and ties get\n     * the average of applicable ranks. Use this unless you are very sure\n     * of what you are doing.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 41,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.WilcoxonSignedRankTestImpl(org.apache.commons.math.stat.ranking.NaNStrategy, org.apache.commons.math.stat.ranking.TiesStrategy)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create a test instance using the given strategies for NaN\u0027s and ties.\n     * Only use this if you are sure of what you are doing.\n     * \n     * @param nanStrategy\n     *            specifies the strategy that should be used for Double.NaN\u0027s\n     * @param tiesStrategy\n     *            specifies the strategy that should be used for ties\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.ensureDataConformance(double[], double[])",
      "begin_line": 66,
      "end_line": 85,
      "comment": "\n     * Ensures that the provided arrays fulfills the assumptions.\n     * \n     * @param x\n     * @param y\n     * @throws IllegalArgumentException\n     *             if assumptions are not met\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.calculateDifferences(double[], double[])",
      "begin_line": 95,
      "end_line": 105,
      "comment": "\n     * Calculates y[i] - x[i] for all i\n     * \n     * @param x\n     * @param y\n     * @throws IllegalArgumentException\n     *             if assumptions are not met\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 48)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.calculateAbsoluteDifferences(double[])",
      "begin_line": 114,
      "end_line": 132,
      "comment": "\n     * Calculates |z[i]| for all i\n     * \n     * @param z\n     * @throws IllegalArgumentException\n     *             if assumptions are not met\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 51)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.wilcoxonSignedRank(double[], double[])",
      "begin_line": 145,
      "end_line": 169,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @return wilcoxonSignedRank statistic (the larger of W+ and W-)\n     * @throws IllegalArgumentException\n     *             if preconditions are not met\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 36)",
        "(line 152,col 9)-(line 152,col 54)",
        "(line 153,col 9)-(line 153,col 62)",
        "(line 155,col 9)-(line 155,col 57)",
        "(line 157,col 9)-(line 157,col 25)",
        "(line 159,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 31)",
        "(line 166,col 9)-(line 166,col 71)",
        "(line 168,col 9)-(line 168,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.calculateExactPValue(double, int)",
      "begin_line": 181,
      "end_line": 210,
      "comment": "\n     * Algorithm inspired by\n     * http://www.fon.hum.uva.nl/Service/Statistics/Signed_Rank_Algorihms.html#C\n     * by Rob van Son, Institute of Phonetic Sciences \u0026 IFOTT, \n     * University of Amsterdam\n     * \n     * @param Wmax largest Wilcoxon signed rank value\n     * @param N number of subjects (corresponding to x.length)\n     * @return two-sided exact p-value \n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 29)",
        "(line 186,col 9)-(line 186,col 31)",
        "(line 188,col 9)-(line 203,col 9)",
        "(line 209,col 9)-(line 209,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.calculateAsymptoticPValue(double, int)",
      "begin_line": 218,
      "end_line": 233,
      "comment": "\n     * @param Wmin smallest Wilcoxon signed rank value\n     * @param N number of subjects (corresponding to x.length)\n     * @return two-sided asymptotic p-value \n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 55)",
        "(line 225,col 9)-(line 225,col 62)",
        "(line 228,col 9)-(line 228,col 65)",
        "(line 230,col 9)-(line 230,col 87)",
        "(line 232,col 9)-(line 232,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTestImpl.wilcoxonSignedRankTest(double[], double[], boolean)",
      "begin_line": 251,
      "end_line": 270,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @param exactPValue\n     *            if the exact p-value is wanted (only for x.length \u003c\u003d 30)\n     * @return p-value\n     * @throws IllegalArgumentException\n     *             if preconditions are not met or exact p-value is wanted for\n     *             when x.length \u003e 30\n     * @throws MathException\n     *             if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 36)",
        "(line 257,col 9)-(line 257,col 31)",
        "(line 258,col 9)-(line 258,col 53)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 269,col 9)"
      ]
    }
  ]
}