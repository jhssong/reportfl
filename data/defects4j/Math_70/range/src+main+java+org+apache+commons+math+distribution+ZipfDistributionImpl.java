{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/ZipfDistributionImpl.java",
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
      "end_line": 213,
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
        "(line 52,col 9)-(line 52,col 54)",
        "(line 53,col 9)-(line 53,col 38)"
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
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Set the number of elements (e.g. corpus size) for the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param n the number of elements\n     * @exception IllegalArgumentException if n \u0026le; 0\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.setNumberOfElementsInternal(int)",
      "begin_line": 86,
      "end_line": 94,
      "comment": "\n     * Set the number of elements (e.g. corpus size) for the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param n the number of elements\n     * @exception IllegalArgumentException if n \u0026le; 0\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getExponent()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Get the exponent characterising the distribution.\n     *\n     * @return the exponent\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.setExponent(double)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Set the exponent characterising the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param s the exponent\n     * @exception IllegalArgumentException if s \u0026le; 0.0\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.setExponentInternal(double)",
      "begin_line": 126,
      "end_line": 134,
      "comment": "\n     * Set the exponent characterising the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param s the exponent\n     * @exception IllegalArgumentException if s \u0026le; 0.0\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.probability(int)",
      "begin_line": 142,
      "end_line": 149,
      "comment": "\n     * The probability mass function P(X \u003d x) for a Zipf distribution.\n     *\n     * @param x the value at which the probability density function is evaluated.\n     * @return the value of the probability mass function at x\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.cumulativeProbability(int)",
      "begin_line": 157,
      "end_line": 167,
      "comment": "\n     * The probability distribution function P(X \u003c\u003d x) for a Zipf distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return Zipf distribution function evaluated at x\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.generalizedHarmonic(int, double)",
      "begin_line": 205,
      "end_line": 211,
      "comment": "\n     * Calculates the Nth generalized harmonic number. See\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HarmonicSeries.html\"\u003eHarmonic\n     * Series\u003c/a\u003e.\n     *\n     * @param n the term in the series to calculate (must be \u0026ge; 1)\n     * @param m the exponent; special case m \u003d\u003d 1.0 is the harmonic series\n     * @return the nth generalized harmonic number\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 25)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 21)"
      ]
    }
  ]
}