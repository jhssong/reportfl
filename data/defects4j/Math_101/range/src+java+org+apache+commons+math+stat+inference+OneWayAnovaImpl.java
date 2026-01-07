{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/stat/inference/OneWayAnovaImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OneWayAnovaImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.OneWayAnova"
      ],
      "begin_line": 49,
      "end_line": 208,
      "comment": "\n * Implements one-way ANOVA statistics defined in the {@link OneWayAnovaImpl}\n * interface.\n * \n * \u003cp\u003eUses the \n * {@link org.apache.commons.math.distribution.FDistribution\n *  commons-math F Distribution implementation} to estimate exact p-values.\u003c/p\u003e\n *\n * \u003cp\u003eThis implementation is based on a description at \n * http://faculty.vassar.edu/lowry/ch13pt1.html\u003c/p\u003e\n * \u003cpre\u003e\n * Abbreviations: bg \u003d between groups,\n *                wg \u003d within groups,\n *                ss \u003d sum squared deviations\n * \u003c/pre\u003e\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.OneWayAnovaImpl()",
      "begin_line": 54,
      "end_line": 55,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.anovaFValue(java.util.Collection)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\u003cp\u003e\n     * This implementation computes the F statistic using the definitional \n     * formula\u003cpre\u003e\n     *   F \u003d msbg/mswg\u003c/pre\u003e\n     * where\u003cpre\u003e\n     *  msbg \u003d between group mean square\n     *  mswg \u003d within group mean square\u003c/pre\u003e\n     * are as defined \u003ca href\u003d\"http://faculty.vassar.edu/lowry/ch13pt1.html\"\u003e\n     * here\u003c/a\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 48)",
        "(line 71,col 9)-(line 71,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.anovaPValue(java.util.Collection)",
      "begin_line": 84,
      "end_line": 89,
      "comment": "\n     * {@inheritDoc}\u003cp\u003e\n     * This implementation uses the\n     * {@link org.apache.commons.math.distribution.FDistribution\n     * commons-math F Distribution implementation} to estimate the exact\n     * p-value, using the formula\u003cpre\u003e\n     *   p \u003d 1 - cumulativeProbability(F)\u003c/pre\u003e\n     * where \u003ccode\u003eF\u003c/code\u003e is the F value and \u003ccode\u003ecumulativeProbability\u003c/code\u003e\n     * is the commons-math implementation of the F distribution.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 87,col 68)",
        "(line 88,col 9)-(line 88,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.anovaTest(java.util.Collection, double)",
      "begin_line": 102,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\u003cp\u003e\n     * This implementation uses the\n     * {@link org.apache.commons.math.distribution.FDistribution\n     * commons-math F Distribution implementation} to estimate the exact\n     * p-value, using the formula\u003cpre\u003e\n     *   p \u003d 1 - cumulativeProbability(F)\u003c/pre\u003e\n     * where \u003ccode\u003eF\u003c/code\u003e is the F value and \u003ccode\u003ecumulativeProbability\u003c/code\u003e\n     * is the commons-math implementation of the F distribution.\u003c/p\u003e\n     * \u003cp\u003eTrue is returned iff the estimated p-value is less than alpha.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.anovaStats(java.util.Collection)",
      "begin_line": 121,
      "end_line": 184,
      "comment": "\n     * This method actually does the calculations (except P-value).\n     * \n     * @param categoryData \u003ccode\u003eCollection\u003c/code\u003e of \u003ccode\u003edouble[]\u003c/code\u003e\n     * arrays each containing data for one category\n     * @return computed AnovaStats\n     * @throws IllegalArgumentException if categoryData does not meet\n     * preconditions specified in the interface definition\n     * @throws MathException if an error occurs computing the Anova stats\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 21)",
        "(line 146,col 9)-(line 146,col 24)",
        "(line 147,col 9)-(line 147,col 31)",
        "(line 148,col 9)-(line 148,col 51)",
        "(line 149,col 9)-(line 149,col 23)",
        "(line 151,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 176,col 38)",
        "(line 177,col 9)-(line 177,col 33)",
        "(line 178,col 9)-(line 178,col 43)",
        "(line 179,col 9)-(line 179,col 32)",
        "(line 180,col 9)-(line 180,col 32)",
        "(line 181,col 9)-(line 181,col 29)",
        "(line 183,col 9)-(line 183,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnovaStats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 190,
      "end_line": 206,
      "comment": " \n        Convenience class to pass dfbg,dfwg,F values around within AnovaImpl.\n        No get/set methods provided.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "dfbg"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dfwg"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "F"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.OneWayAnovaImpl.AnovaStats.AnovaStats(int, int, double)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n         * Constructor\n         * @param dfbg degrees of freedom in numerator (between groups)\n         * @param dfwg degrees of freedom in denominator (within groups)\n         * @param F statistic\n         ",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 29)",
        "(line 203,col 13)-(line 203,col 29)",
        "(line 204,col 13)-(line 204,col 23)"
      ]
    }
  ]
}