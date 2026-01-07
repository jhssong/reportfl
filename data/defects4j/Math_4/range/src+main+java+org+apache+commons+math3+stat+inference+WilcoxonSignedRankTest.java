{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/inference/WilcoxonSignedRankTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WilcoxonSignedRankTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 325,
      "comment": "\n * An implementation of the Wilcoxon signed-rank test.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "naturalRanking"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Ranking algorithm. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest.WilcoxonSignedRankTest()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Create a test instance where NaN\u0027s are left in place and ties get\n     * the average of applicable ranks. Use this unless you are very sure\n     * of what you are doing.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 48,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest.WilcoxonSignedRankTest(org.apache.commons.math3.stat.ranking.NaNStrategy, org.apache.commons.math3.stat.ranking.TiesStrategy)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Create a test instance using the given strategies for NaN\u0027s and ties.\n     * Only use this if you are sure of what you are doing.\n     *\n     * @param nanStrategy\n     *            specifies the strategy that should be used for Double.NaN\u0027s\n     * @param tiesStrategy\n     *            specifies the strategy that should be used for ties\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest.ensureDataConformance(double[], double[])",
      "begin_line": 75,
      "end_line": 89,
      "comment": "\n     * Ensures that the provided arrays fulfills the assumptions.\n     *\n     * @param x first sample\n     * @param y second sample\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     * @throws DimensionMismatchException if {@code x} and {@code y} do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest.calculateDifferences(double[], double[])",
      "begin_line": 98,
      "end_line": 107,
      "comment": "\n     * Calculates y[i] - x[i] for all i\n     *\n     * @param x first sample\n     * @param y second sample\n     * @return z \u003d y - x\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 48)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest.calculateAbsoluteDifferences(double[])",
      "begin_line": 117,
      "end_line": 135,
      "comment": "\n     * Calculates |z[i]| for all i\n     *\n     * @param z sample\n     * @return |z|\n     * @throws NullArgumentException if {@code z} is {@code null}\n     * @throws NoDataException if {@code z} is zero-length.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 51)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest.wilcoxonSignedRank(double[], double[])",
      "begin_line": 172,
      "end_line": 196,
      "comment": "\n     * Computes the \u003ca\n     * href\u003d\"http://en.wikipedia.org/wiki/Wilcoxon_signed-rank_test\"\u003e\n     * Wilcoxon signed ranked statistic\u003c/a\u003e comparing mean for two related\n     * samples or repeated measurements on a single sample.\n     * \u003cp\u003e\n     * This statistic can be used to perform a Wilcoxon signed ranked test\n     * evaluating the null hypothesis that the two related samples or repeated\n     * measurements on a single sample has equal mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Let X\u003csub\u003ei\u003c/sub\u003e denote the i\u0027th individual of the first sample and\n     * Y\u003csub\u003ei\u003c/sub\u003e the related i\u0027th individual in the second sample. Let\n     * Z\u003csub\u003ei\u003c/sub\u003e \u003d Y\u003csub\u003ei\u003c/sub\u003e - X\u003csub\u003ei\u003c/sub\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003eThe differences Z\u003csub\u003ei\u003c/sub\u003e must be independent.\u003c/li\u003e\n     * \u003cli\u003eEach Z\u003csub\u003ei\u003c/sub\u003e comes from a continuous population (they must be\n     * identical) and is symmetric about a common median.\u003c/li\u003e\n     * \u003cli\u003eThe values that X\u003csub\u003ei\u003c/sub\u003e and Y\u003csub\u003ei\u003c/sub\u003e represent are\n     * ordered, so the comparisons greater than, less than, and equal to are\n     * meaningful.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the first sample\n     * @param y the second sample\n     * @return wilcoxonSignedRank statistic (the larger of W+ and W-)\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     * @throws DimensionMismatchException if {@code x} and {@code y} do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 36)",
        "(line 179,col 9)-(line 179,col 54)",
        "(line 180,col 9)-(line 180,col 62)",
        "(line 182,col 9)-(line 182,col 57)",
        "(line 184,col 9)-(line 184,col 25)",
        "(line 186,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 31)",
        "(line 193,col 9)-(line 193,col 71)",
        "(line 195,col 9)-(line 195,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest.calculateExactPValue(double, int)",
      "begin_line": 208,
      "end_line": 237,
      "comment": "\n     * Algorithm inspired by\n     * http://www.fon.hum.uva.nl/Service/Statistics/Signed_Rank_Algorihms.html#C\n     * by Rob van Son, Institute of Phonetic Sciences \u0026 IFOTT,\n     * University of Amsterdam\n     *\n     * @param Wmax largest Wilcoxon signed rank value\n     * @param N number of subjects (corresponding to x.length)\n     * @return two-sided exact p-value\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 29)",
        "(line 213,col 9)-(line 213,col 31)",
        "(line 215,col 9)-(line 230,col 9)",
        "(line 236,col 9)-(line 236,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest.calculateAsymptoticPValue(double, int)",
      "begin_line": 244,
      "end_line": 260,
      "comment": "\n     * @param Wmin smallest Wilcoxon signed rank value\n     * @param N number of subjects (corresponding to x.length)\n     * @return two-sided asymptotic p-value\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 55)",
        "(line 251,col 9)-(line 251,col 62)",
        "(line 254,col 9)-(line 254,col 65)",
        "(line 257,col 9)-(line 257,col 79)",
        "(line 259,col 9)-(line 259,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest.wilcoxonSignedRankTest(double[], double[], boolean)",
      "begin_line": 304,
      "end_line": 324,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a \u003ca\n     * href\u003d\"http://en.wikipedia.org/wiki/Wilcoxon_signed-rank_test\"\u003e\n     * Wilcoxon signed ranked statistic\u003c/a\u003e comparing mean for two related\n     * samples or repeated measurements on a single sample.\n     * \u003cp\u003e\n     * Let X\u003csub\u003ei\u003c/sub\u003e denote the i\u0027th individual of the first sample and\n     * Y\u003csub\u003ei\u003c/sub\u003e the related i\u0027th individual in the second sample. Let\n     * Z\u003csub\u003ei\u003c/sub\u003e \u003d Y\u003csub\u003ei\u003c/sub\u003e - X\u003csub\u003ei\u003c/sub\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003eThe differences Z\u003csub\u003ei\u003c/sub\u003e must be independent.\u003c/li\u003e\n     * \u003cli\u003eEach Z\u003csub\u003ei\u003c/sub\u003e comes from a continuous population (they must be\n     * identical) and is symmetric about a common median.\u003c/li\u003e\n     * \u003cli\u003eThe values that X\u003csub\u003ei\u003c/sub\u003e and Y\u003csub\u003ei\u003c/sub\u003e represent are\n     * ordered, so the comparisons greater than, less than, and equal to are\n     * meaningful.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the first sample\n     * @param y the second sample\n     * @param exactPValue\n     *            if the exact p-value is wanted (only works for x.length \u003c\u003d 30,\n     *            if true and x.length \u003e 30, this is ignored because\n     *            calculations may take too long)\n     * @return p-value\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     * @throws DimensionMismatchException if {@code x} and {@code y} do not\n     * have the same length.\n     * @throws NumberIsTooLargeException if {@code exactPValue} is {@code true}\n     * and {@code x.length} \u003e 30\n     * @throws ConvergenceException if the p-value can not be computed due to\n     * a convergence error\n     * @throws MaxCountExceededException if the maximum number of iterations\n     * is exceeded\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 36)",
        "(line 311,col 9)-(line 311,col 31)",
        "(line 312,col 9)-(line 312,col 53)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 323,col 9)"
      ]
    }
  ]
}