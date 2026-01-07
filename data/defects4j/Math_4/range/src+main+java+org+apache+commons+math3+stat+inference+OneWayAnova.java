{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/inference/OneWayAnova.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OneWayAnova",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 354,
      "comment": "\n * Implements one-way ANOVA (analysis of variance) statistics.\n *\n * \u003cp\u003e Tests for differences between two or more categories of univariate data\n * (for example, the body mass index of accountants, lawyers, doctors and\n * computer programmers).  When two categories are given, this is equivalent to\n * the {@link org.apache.commons.math3.stat.inference.TTest}.\n * \u003c/p\u003e\u003cp\u003e\n * Uses the {@link org.apache.commons.math3.distribution.FDistribution\n * commons-math F Distribution implementation} to estimate exact p-values.\u003c/p\u003e\n * \u003cp\u003eThis implementation is based on a description at\n * http://faculty.vassar.edu/lowry/ch13pt1.html\u003c/p\u003e\n * \u003cpre\u003e\n * Abbreviations: bg \u003d between groups,\n *                wg \u003d within groups,\n *                ss \u003d sum squared deviations\n * \u003c/pre\u003e\n *\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.OneWayAnova()",
      "begin_line": 58,
      "end_line": 59,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaFValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Computes the ANOVA F-value for a collection of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * \u003ccode\u003edouble[]\u003c/code\u003e arrays.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two \u003ccode\u003edouble[]\u003c/code\u003e arrays in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these arrays must\n     * contain at least two values.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * This implementation computes the F statistic using the definitional\n     * formula\u003cpre\u003e\n     *   F \u003d msbg/mswg\u003c/pre\u003e\n     * where\u003cpre\u003e\n     *  msbg \u003d between group mean square\n     *  mswg \u003d within group mean square\u003c/pre\u003e\n     * are as defined \u003ca href\u003d\"http://faculty.vassar.edu/lowry/ch13pt1.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @return Fvalue\n     * @throws NullArgumentException if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException if the length of the \u003ccode\u003ecategoryData\u003c/code\u003e\n     * array is less than 2 or a contained \u003ccode\u003edouble[]\u003c/code\u003e array does not have\n     * at least two values\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 48)",
        "(line 92,col 9)-(line 92,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaPValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 124,
      "end_line": 133,
      "comment": "\n     * Computes the ANOVA P-value for a collection of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * \u003ccode\u003edouble[]\u003c/code\u003e arrays.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two \u003ccode\u003edouble[]\u003c/code\u003e arrays in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these arrays must\n     * contain at least two values.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * This implementation uses the\n     * {@link org.apache.commons.math3.distribution.FDistribution\n     * commons-math F Distribution implementation} to estimate the exact\n     * p-value, using the formula\u003cpre\u003e\n     *   p \u003d 1 - cumulativeProbability(F)\u003c/pre\u003e\n     * where \u003ccode\u003eF\u003c/code\u003e is the F value and \u003ccode\u003ecumulativeProbability\u003c/code\u003e\n     * is the commons-math implementation of the F distribution.\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @return Pvalue\n     * @throws NullArgumentException if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException if the length of the \u003ccode\u003ecategoryData\u003c/code\u003e\n     * array is less than 2 or a contained \u003ccode\u003edouble[]\u003c/code\u003e array does not have\n     * at least two values\n     * @throws ConvergenceException if the p-value can not be computed due to a convergence error\n     * @throws MaxCountExceededException if the maximum number of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 48)",
        "(line 130,col 9)-(line 130,col 64)",
        "(line 131,col 9)-(line 131,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaPValue(java.util.Collection\u003corg.apache.commons.math3.stat.descriptive.SummaryStatistics\u003e, boolean)",
      "begin_line": 165,
      "end_line": 174,
      "comment": "\n     * Computes the ANOVA P-value for a collection of {@link SummaryStatistics}.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * {@link SummaryStatistics}.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two {@link SummaryStatistics} in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these statistics must\n     * contain at least two values.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * This implementation uses the\n     * {@link org.apache.commons.math3.distribution.FDistribution\n     * commons-math F Distribution implementation} to estimate the exact\n     * p-value, using the formula\u003cpre\u003e\n     *   p \u003d 1 - cumulativeProbability(F)\u003c/pre\u003e\n     * where \u003ccode\u003eF\u003c/code\u003e is the F value and \u003ccode\u003ecumulativeProbability\u003c/code\u003e\n     * is the commons-math implementation of the F distribution.\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of {@link SummaryStatistics}\n     * each containing data for one category\n     * @param allowOneElementData if true, allow computation for one catagory\n     * only or for one data element per category\n     * @return Pvalue\n     * @throws NullArgumentException if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException if the length of the \u003ccode\u003ecategoryData\u003c/code\u003e\n     * array is less than 2 or a contained {@link SummaryStatistics} does not have\n     * at least two values\n     * @throws ConvergenceException if the p-value can not be computed due to a convergence error\n     * @throws MaxCountExceededException if the maximum number of iterations is exceeded\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 75)",
        "(line 171,col 9)-(line 171,col 70)",
        "(line 172,col 9)-(line 172,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaStats(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 191,
      "end_line": 210,
      "comment": "\n     * This method calls the method that actually does the calculations (except\n     * P-value).\n     *\n     * @param categoryData\n     *            \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e arrays each\n     *            containing data for one category\n     * @return computed AnovaStats\n     * @throws NullArgumentException\n     *             if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException\n     *             if the length of the \u003ccode\u003ecategoryData\u003c/code\u003e array is less\n     *             than 2 or a contained \u003ccode\u003edouble[]\u003c/code\u003e array does not\n     *             contain at least two values\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 45)",
        "(line 196,col 9)-(line 197,col 70)",
        "(line 200,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaTest(java.util.Collection\u003cdouble[]\u003e, double)",
      "begin_line": 246,
      "end_line": 258,
      "comment": "\n     * Performs an ANOVA test, evaluating the null hypothesis that there\n     * is no difference among the means of the data categories.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * \u003ccode\u003edouble[]\u003c/code\u003e arrays.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two \u003ccode\u003edouble[]\u003c/code\u003e arrays in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these arrays must\n     * contain at least two values.\u003c/li\u003e\n     * \u003cli\u003ealpha must be strictly greater than 0 and less than or equal to 0.5.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * This implementation uses the\n     * {@link org.apache.commons.math3.distribution.FDistribution\n     * commons-math F Distribution implementation} to estimate the exact\n     * p-value, using the formula\u003cpre\u003e\n     *   p \u003d 1 - cumulativeProbability(F)\u003c/pre\u003e\n     * where \u003ccode\u003eF\u003c/code\u003e is the F value and \u003ccode\u003ecumulativeProbability\u003c/code\u003e\n     * is the commons-math implementation of the F distribution.\u003c/p\u003e\n     * \u003cp\u003eTrue is returned iff the estimated p-value is less than alpha.\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws NullArgumentException if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException if the length of the \u003ccode\u003ecategoryData\u003c/code\u003e\n     * array is less than 2 or a contained \u003ccode\u003edouble[]\u003c/code\u003e array does not have\n     * at least two values\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws ConvergenceException if the p-value can not be computed due to a convergence error\n     * @throws MaxCountExceededException if the maximum number of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaStats(java.util.Collection\u003corg.apache.commons.math3.stat.descriptive.SummaryStatistics\u003e, boolean)",
      "begin_line": 273,
      "end_line": 324,
      "comment": "\n     * This method actually does the calculations (except P-value).\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @param allowOneElementData if true, allow computation for one catagory\n     * only or for one data element per category\n     * @return computed AnovaStats\n     * @throws NullArgumentException if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException if \u003ccode\u003eallowOneElementData\u003c/code\u003e is false and the number of\n     * categories is less than 2 or a contained SummaryStatistics does not contain\n     * at least two values\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 45)",
        "(line 279,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 21)",
        "(line 296,col 9)-(line 296,col 24)",
        "(line 297,col 9)-(line 297,col 26)",
        "(line 298,col 9)-(line 298,col 28)",
        "(line 299,col 9)-(line 299,col 23)",
        "(line 301,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 315,col 67)",
        "(line 316,col 9)-(line 316,col 39)",
        "(line 317,col 9)-(line 317,col 49)",
        "(line 318,col 9)-(line 318,col 40)",
        "(line 319,col 9)-(line 319,col 40)",
        "(line 320,col 9)-(line 320,col 37)",
        "(line 322,col 9)-(line 322,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnovaStats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 330,
      "end_line": 352,
      "comment": "\n        Convenience class to pass dfbg,dfwg,F values around within OneWayAnova.\n        No get/set methods provided.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "dfbg"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Degrees of freedom in numerator (between groups). "
    },
    {
      "type": "field",
      "varNames": [
        "dfwg"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Degrees of freedom in denominator (within groups). "
    },
    {
      "type": "field",
      "varNames": [
        "F"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " Statistic. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.AnovaStats.AnovaStats(int, int, double)",
      "begin_line": 347,
      "end_line": 351,
      "comment": "\n         * Constructor\n         * @param dfbg degrees of freedom in numerator (between groups)\n         * @param dfwg degrees of freedom in denominator (within groups)\n         * @param F statistic\n         ",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 29)",
        "(line 349,col 13)-(line 349,col 29)",
        "(line 350,col 13)-(line 350,col 23)"
      ]
    }
  ]
}