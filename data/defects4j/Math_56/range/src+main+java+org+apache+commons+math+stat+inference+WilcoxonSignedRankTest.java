{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/stat/inference/WilcoxonSignedRankTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WilcoxonSignedRankTest",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 107,
      "comment": "\n * An interface for Wilcoxon signed-rank test.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTest.wilcoxonSignedRank(double[], double[])",
      "begin_line": 63,
      "end_line": 64,
      "comment": "\n     * Computes the \u003ca\n     * href\u003d\"http://en.wikipedia.org/wiki/Wilcoxon_signed-rank_test\"\u003e\n     * Wilcoxon signed ranked statistic\u003c/a\u003e comparing mean for two related\n     * samples or repeated measurements on a single sample.\n     * \u003cp\u003e\n     * This statistic can be used to perform a Wilcoxon signed ranked test\n     * evaluating the null hypothesis that the two related samples or repeated\n     * measurements on a single sample has equal mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Let X\u003csub\u003ei\u003c/sub\u003e denote the i\u0027th individual of the first sample and\n     * Y\u003csub\u003ei\u003c/sub\u003e the related i\u0027th individual in the second sample. Let\n     * Z\u003csub\u003ei\u003c/sub\u003e \u003d Y\u003csub\u003ei\u003c/sub\u003e - X\u003csub\u003ei\u003c/sub\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003eThe differences Z\u003csub\u003ei\u003c/sub\u003e must be independent.\u003c/li\u003e\n     * \u003cli\u003eEach Z\u003csub\u003ei\u003c/sub\u003e comes from a continuous population (they must be\n     * identical) and is symmetric about a common median.\u003c/li\u003e\n     * \u003cli\u003eThe values that X\u003csub\u003ei\u003c/sub\u003e and Y\u003csub\u003ei\u003c/sub\u003e represent are\n     * ordered, so the comparisons greater than, less than, and equal to are\n     * meaningful.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @return wilcoxonSignedRank statistic\n     * @throws IllegalArgumentException\n     *             if preconditions are not met\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.WilcoxonSignedRankTest.wilcoxonSignedRankTest(double[], double[], boolean)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Returns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a \u003ca\n     * href\u003d\"http://en.wikipedia.org/wiki/Wilcoxon_signed-rank_test\"\u003e\n     * Wilcoxon signed ranked statistic\u003c/a\u003e comparing mean for two related\n     * samples or repeated measurements on a single sample.\n     * \u003cp\u003e\n     * Let X\u003csub\u003ei\u003c/sub\u003e denote the i\u0027th individual of the first sample and\n     * Y\u003csub\u003ei\u003c/sub\u003e the related i\u0027th individual in the second sample. Let\n     * Z\u003csub\u003ei\u003c/sub\u003e \u003d Y\u003csub\u003ei\u003c/sub\u003e - X\u003csub\u003ei\u003c/sub\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003eThe differences Z\u003csub\u003ei\u003c/sub\u003e must be independent.\u003c/li\u003e\n     * \u003cli\u003eEach Z\u003csub\u003ei\u003c/sub\u003e comes from a continuous population (they must be\n     * identical) and is symmetric about a common median.\u003c/li\u003e\n     * \u003cli\u003eThe values that X\u003csub\u003ei\u003c/sub\u003e and Y\u003csub\u003ei\u003c/sub\u003e represent are\n     * ordered, so the comparisons greater than, less than, and equal to are\n     * meaningful.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param x\n     *            the first sample\n     * @param y\n     *            the second sample\n     * @param exactPValue\n     *            if the exact p-value is wanted (only works for x.length \u003c\u003d 30,\n     *            if true and x.length \u003e 30, this is ignored because\n     *            calculations may take too long)\n     * @return p-value\n     * @throws IllegalArgumentException\n     *             if preconditions are not met\n     * @throws MathException\n     *             if an error occurs computing the p-value\n     ",
      "child_ranges": []
    }
  ]
}