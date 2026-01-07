{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/distribution/ZipfDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipfDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "org.apache.commons.math.distribution.ZipfDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 187,
      "comment": "\n * Implementation for the {@link ZipfDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfElements"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Number of elements. "
    },
    {
      "type": "field",
      "varNames": [
        "exponent"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Exponent parameter of the distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.ZipfDistributionImpl(int, double)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Create a new Zipf distribution with the given number of elements and\n     * exponent. Both values must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param numberOfElements the number of elements\n     * @param exponent the exponent\n     * @exception IllegalArgumentException if n \u0026le; 0 or s \u0026le; 0.0\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 46)",
        "(line 53,col 9)-(line 53,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getNumberOfElements()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Get the number of elements (e.g. corpus size) for the distribution.\n     *\n     * @return the number of elements\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.setNumberOfElements(int)",
      "begin_line": 73,
      "end_line": 81,
      "comment": "\n     * Set the number of elements (e.g. corpus size) for the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param n the number of elements\n     * @exception IllegalArgumentException if n \u0026le; 0\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getExponent()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Get the exponent characterising the distribution.\n     *\n     * @return the exponent\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.setExponent(double)",
      "begin_line": 100,
      "end_line": 108,
      "comment": "\n     * Set the exponent characterising the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param s the exponent\n     * @exception IllegalArgumentException if s \u0026le; 0.0\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.probability(int)",
      "begin_line": 116,
      "end_line": 123,
      "comment": "\n     * The probability mass function P(X \u003d x) for a Zipf distribution.\n     *\n     * @param x the value at which the probability density function is evaluated.\n     * @return the value of the probability mass function at x\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.cumulativeProbability(int)",
      "begin_line": 131,
      "end_line": 141,
      "comment": "\n     * The probability distribution function P(X \u003c\u003d x) for a Zipf distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return Zipf distribution function evaluated at x\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.generalizedHarmonic(int, double)",
      "begin_line": 179,
      "end_line": 185,
      "comment": "\n     * Calculates the Nth generalized harmonic number. See\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HarmonicSeries.html\"\u003eHarmonic\n     * Series\u003c/a\u003e.\n     *\n     * @param n the term in the series to calculate (must be \u0026ge; 1)\n     * @param m the exponent; special case m \u003d\u003d 1.0 is the harmonic series\n     * @return the nth generalized harmonic number\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 25)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 21)"
      ]
    }
  ]
}