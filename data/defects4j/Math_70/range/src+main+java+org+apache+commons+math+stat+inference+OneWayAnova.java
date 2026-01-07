{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/inference/OneWayAnova.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OneWayAnova",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 103,
      "comment": "\n * An interface for one-way ANOVA (analysis of variance).\n *\n * \u003cp\u003e Tests for differences between two or more categories of univariate data\n * (for example, the body mass index of accountants, lawyers, doctors and\n * computer programmers).  When two categories are given, this is equivalent to\n * the {@link org.apache.commons.math.stat.inference.TTest}.\n * \u003c/p\u003e\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnova.anovaFValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 54,
      "end_line": 55,
      "comment": "\n     * Computes the ANOVA F-value for a collection of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * \u003ccode\u003edouble[]\u003c/code\u003e arrays.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two \u003ccode\u003edouble[]\u003c/code\u003e arrays in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these arrays must\n     * contain at least two values.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @return Fvalue\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if the statistic can not be computed do to a\n     *         convergence or other numerical error.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnova.anovaPValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 75,
      "end_line": 76,
      "comment": "\n     * Computes the ANOVA P-value for a collection of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * \u003ccode\u003edouble[]\u003c/code\u003e arrays.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two \u003ccode\u003edouble[]\u003c/code\u003e arrays in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these arrays must\n     * contain at least two values.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @return Pvalue\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if the statistic can not be computed do to a\n     *         convergence or other numerical error.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnova.anovaTest(java.util.Collection\u003cdouble[]\u003e, double)",
      "begin_line": 100,
      "end_line": 101,
      "comment": "\n     * Performs an ANOVA test, evaluating the null hypothesis that there\n     * is no difference among the means of the data categories.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * \u003ccode\u003edouble[]\u003c/code\u003e arrays.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two \u003ccode\u003edouble[]\u003c/code\u003e arrays in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these arrays must\n     * contain at least two values.\u003c/li\u003e\n     * \u003cli\u003ealpha must be strictly greater than 0 and less than or equal to 0.5.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws IllegalArgumentException if the preconditions are not met\n     * @throws MathException if the statistic can not be computed do to a\n     *         convergence or other numerical error.\n     ",
      "child_ranges": []
    }
  ]
}