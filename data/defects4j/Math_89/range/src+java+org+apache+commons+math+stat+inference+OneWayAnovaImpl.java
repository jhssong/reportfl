{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/stat/inference/OneWayAnovaImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OneWayAnovaImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.OneWayAnova"
      ],
      "begin_line": 47,
      "end_line": 204,
      "comment": "\n * Implements one-way ANOVA statistics defined in the {@link OneWayAnovaImpl}\n * interface.\n * \n * \u003cp\u003eUses the \n * {@link org.apache.commons.math.distribution.FDistribution\n *  commons-math F Distribution implementation} to estimate exact p-values.\u003c/p\u003e\n *\n * \u003cp\u003eThis implementation is based on a description at \n * http://faculty.vassar.edu/lowry/ch13pt1.html\u003c/p\u003e\n * \u003cpre\u003e\n * Abbreviations: bg \u003d between groups,\n *                wg \u003d within groups,\n *                ss \u003d sum squared deviations\n * \u003c/pre\u003e\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.OneWayAnovaImpl()",
      "begin_line": 52,
      "end_line": 53,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.anovaFValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * {@inheritDoc}\u003cp\u003e\n     * This implementation computes the F statistic using the definitional \n     * formula\u003cpre\u003e\n     *   F \u003d msbg/mswg\u003c/pre\u003e\n     * where\u003cpre\u003e\n     *  msbg \u003d between group mean square\n     *  mswg \u003d within group mean square\u003c/pre\u003e\n     * are as defined \u003ca href\u003d\"http://faculty.vassar.edu/lowry/ch13pt1.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 48)",
        "(line 69,col 9)-(line 69,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.anovaPValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\u003cp\u003e\n     * This implementation uses the\n     * {@link org.apache.commons.math.distribution.FDistribution\n     * commons-math F Distribution implementation} to estimate the exact\n     * p-value, using the formula\u003cpre\u003e\n     *   p \u003d 1 - cumulativeProbability(F)\u003c/pre\u003e\n     * where \u003ccode\u003eF\u003c/code\u003e is the F value and \u003ccode\u003ecumulativeProbability\u003c/code\u003e\n     * is the commons-math implementation of the F distribution.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 48)",
        "(line 85,col 9)-(line 85,col 68)",
        "(line 86,col 9)-(line 86,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.anovaTest(java.util.Collection\u003cdouble[]\u003e, double)",
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\u003cp\u003e\n     * This implementation uses the\n     * {@link org.apache.commons.math.distribution.FDistribution\n     * commons-math F Distribution implementation} to estimate the exact\n     * p-value, using the formula\u003cpre\u003e\n     *   p \u003d 1 - cumulativeProbability(F)\u003c/pre\u003e\n     * where \u003ccode\u003eF\u003c/code\u003e is the F value and \u003ccode\u003ecumulativeProbability\u003c/code\u003e\n     * is the commons-math implementation of the F distribution.\u003c/p\u003e\n     * \u003cp\u003eTrue is returned iff the estimated p-value is less than alpha.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.anovaStats(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 119,
      "end_line": 174,
      "comment": "\n     * This method actually does the calculations (except P-value).\n     * \n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @return computed AnovaStats\n     * @throws IllegalArgumentException if categoryData does not meet\n     * preconditions specified in the interface definition\n     * @throws MathException if an error occurs computing the Anova stats\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 126,col 9)",
        "(line 129,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 21)",
        "(line 137,col 9)-(line 137,col 24)",
        "(line 138,col 9)-(line 138,col 31)",
        "(line 139,col 9)-(line 139,col 51)",
        "(line 140,col 9)-(line 140,col 23)",
        "(line 142,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 166,col 38)",
        "(line 167,col 9)-(line 167,col 33)",
        "(line 168,col 9)-(line 168,col 43)",
        "(line 169,col 9)-(line 169,col 32)",
        "(line 170,col 9)-(line 170,col 32)",
        "(line 171,col 9)-(line 171,col 29)",
        "(line 173,col 9)-(line 173,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnovaStats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 180,
      "end_line": 202,
      "comment": " \n        Convenience class to pass dfbg,dfwg,F values around within AnovaImpl.\n        No get/set methods provided.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "dfbg"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " Degrees of freedom in numerator (between groups). "
    },
    {
      "type": "field",
      "varNames": [
        "dfwg"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " Degrees of freedom in denominator (within groups). "
    },
    {
      "type": "field",
      "varNames": [
        "F"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " Statistic. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.AnovaStats.AnovaStats(int, int, double)",
      "begin_line": 197,
      "end_line": 201,
      "comment": "\n         * Constructor\n         * @param dfbg degrees of freedom in numerator (between groups)\n         * @param dfwg degrees of freedom in denominator (within groups)\n         * @param F statistic\n         ",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 29)",
        "(line 199,col 13)-(line 199,col 29)",
        "(line 200,col 13)-(line 200,col 23)"
      ]
    }
  ]
}