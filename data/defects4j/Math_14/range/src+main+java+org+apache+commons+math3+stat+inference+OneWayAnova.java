{
  "filepath": "/tmp/Math-14b/src/main/java/org/apache/commons/math3/stat/inference/OneWayAnova.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OneWayAnova",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 284,
      "comment": "\n * Implements one-way ANOVA (analysis of variance) statistics.\n *\n * \u003cp\u003e Tests for differences between two or more categories of univariate data\n * (for example, the body mass index of accountants, lawyers, doctors and\n * computer programmers).  When two categories are given, this is equivalent to\n * the {@link org.apache.commons.math3.stat.inference.TTest}.\n * \u003c/p\u003e\u003cp\u003e\n * Uses the {@link org.apache.commons.math3.distribution.FDistribution\n * commons-math F Distribution implementation} to estimate exact p-values.\u003c/p\u003e\n * \u003cp\u003eThis implementation is based on a description at\n * http://faculty.vassar.edu/lowry/ch13pt1.html\u003c/p\u003e\n * \u003cpre\u003e\n * Abbreviations: bg \u003d between groups,\n *                wg \u003d within groups,\n *                ss \u003d sum squared deviations\n * \u003c/pre\u003e\n *\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.OneWayAnova()",
      "begin_line": 57,
      "end_line": 58,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaFValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Computes the ANOVA F-value for a collection of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * \u003ccode\u003edouble[]\u003c/code\u003e arrays.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two \u003ccode\u003edouble[]\u003c/code\u003e arrays in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these arrays must\n     * contain at least two values.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * This implementation computes the F statistic using the definitional\n     * formula\u003cpre\u003e\n     *   F \u003d msbg/mswg\u003c/pre\u003e\n     * where\u003cpre\u003e\n     *  msbg \u003d between group mean square\n     *  mswg \u003d within group mean square\u003c/pre\u003e\n     * are as defined \u003ca href\u003d\"http://faculty.vassar.edu/lowry/ch13pt1.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @return Fvalue\n     * @throws NullArgumentException if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException if the length of the \u003ccode\u003ecategoryData\u003c/code\u003e\n     * array is less than 2 or a contained \u003ccode\u003edouble[]\u003c/code\u003e array does not have\n     * at least two values\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 48)",
        "(line 91,col 9)-(line 91,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaPValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 123,
      "end_line": 132,
      "comment": "\n     * Computes the ANOVA P-value for a collection of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * \u003ccode\u003edouble[]\u003c/code\u003e arrays.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two \u003ccode\u003edouble[]\u003c/code\u003e arrays in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these arrays must\n     * contain at least two values.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * This implementation uses the\n     * {@link org.apache.commons.math3.distribution.FDistribution\n     * commons-math F Distribution implementation} to estimate the exact\n     * p-value, using the formula\u003cpre\u003e\n     *   p \u003d 1 - cumulativeProbability(F)\u003c/pre\u003e\n     * where \u003ccode\u003eF\u003c/code\u003e is the F value and \u003ccode\u003ecumulativeProbability\u003c/code\u003e\n     * is the commons-math implementation of the F distribution.\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @return Pvalue\n     * @throws NullArgumentException if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException if the length of the \u003ccode\u003ecategoryData\u003c/code\u003e\n     * array is less than 2 or a contained \u003ccode\u003edouble[]\u003c/code\u003e array does not have\n     * at least two values\n     * @throws ConvergenceException if the p-value can not be computed due to a convergence error\n     * @throws MaxCountExceededException if the maximum number of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 48)",
        "(line 129,col 9)-(line 129,col 64)",
        "(line 130,col 9)-(line 130,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaTest(java.util.Collection\u003cdouble[]\u003e, double)",
      "begin_line": 168,
      "end_line": 180,
      "comment": "\n     * Performs an ANOVA test, evaluating the null hypothesis that there\n     * is no difference among the means of the data categories.\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe categoryData \u003ccode\u003eCollection\u003c/code\u003e must contain\n     * \u003ccode\u003edouble[]\u003c/code\u003e arrays.\u003c/li\u003e\n     * \u003cli\u003e There must be at least two \u003ccode\u003edouble[]\u003c/code\u003e arrays in the\n     * \u003ccode\u003ecategoryData\u003c/code\u003e collection and each of these arrays must\n     * contain at least two values.\u003c/li\u003e\n     * \u003cli\u003ealpha must be strictly greater than 0 and less than or equal to 0.5.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * This implementation uses the\n     * {@link org.apache.commons.math3.distribution.FDistribution\n     * commons-math F Distribution implementation} to estimate the exact\n     * p-value, using the formula\u003cpre\u003e\n     *   p \u003d 1 - cumulativeProbability(F)\u003c/pre\u003e\n     * where \u003ccode\u003eF\u003c/code\u003e is the F value and \u003ccode\u003ecumulativeProbability\u003c/code\u003e\n     * is the commons-math implementation of the F distribution.\u003c/p\u003e\n     * \u003cp\u003eTrue is returned iff the estimated p-value is less than alpha.\u003c/p\u003e\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @param alpha significance level of the test\n     * @return true if the null hypothesis can be rejected with\n     * confidence 1 - alpha\n     * @throws NullArgumentException if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException if the length of the \u003ccode\u003ecategoryData\u003c/code\u003e\n     * array is less than 2 or a contained \u003ccode\u003edouble[]\u003c/code\u003e array does not have\n     * at least two values\n     * @throws OutOfRangeException if \u003ccode\u003ealpha\u003c/code\u003e is not in the range (0, 0.5]\n     * @throws ConvergenceException if the p-value can not be computed due to a convergence error\n     * @throws MaxCountExceededException if the maximum number of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.anovaStats(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 193,
      "end_line": 254,
      "comment": "\n     * This method actually does the calculations (except P-value).\n     *\n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @return computed AnovaStats\n     * @throws NullArgumentException if \u003ccode\u003ecategoryData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws DimensionMismatchException if the length of the \u003ccode\u003ecategoryData\u003c/code\u003e\n     * array is less than 2 or a contained \u003ccode\u003edouble[]\u003c/code\u003e array does not contain\n     * at least two values\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 201,col 9)-(line 205,col 9)",
        "(line 208,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 21)",
        "(line 217,col 9)-(line 217,col 24)",
        "(line 218,col 9)-(line 218,col 31)",
        "(line 219,col 9)-(line 219,col 51)",
        "(line 220,col 9)-(line 220,col 23)",
        "(line 222,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 246,col 38)",
        "(line 247,col 9)-(line 247,col 33)",
        "(line 248,col 9)-(line 248,col 43)",
        "(line 249,col 9)-(line 249,col 32)",
        "(line 250,col 9)-(line 250,col 32)",
        "(line 251,col 9)-(line 251,col 29)",
        "(line 253,col 9)-(line 253,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnovaStats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 260,
      "end_line": 282,
      "comment": "\n        Convenience class to pass dfbg,dfwg,F values around within OneWayAnova.\n        No get/set methods provided.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "dfbg"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " Degrees of freedom in numerator (between groups). "
    },
    {
      "type": "field",
      "varNames": [
        "dfwg"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " Degrees of freedom in denominator (within groups). "
    },
    {
      "type": "field",
      "varNames": [
        "F"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": " Statistic. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.OneWayAnova.AnovaStats.AnovaStats(int, int, double)",
      "begin_line": 277,
      "end_line": 281,
      "comment": "\n         * Constructor\n         * @param dfbg degrees of freedom in numerator (between groups)\n         * @param dfwg degrees of freedom in denominator (within groups)\n         * @param F statistic\n         ",
      "child_ranges": [
        "(line 278,col 13)-(line 278,col 29)",
        "(line 279,col 13)-(line 279,col 29)",
        "(line 280,col 13)-(line 280,col 23)"
      ]
    }
  ]
}