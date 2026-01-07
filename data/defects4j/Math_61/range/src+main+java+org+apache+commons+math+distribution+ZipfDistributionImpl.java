{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/distribution/ZipfDistributionImpl.java",
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
      "begin_line": 31,
      "end_line": 214,
      "comment": "\n * Implementation for the {@link ZipfDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfElements"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Number of elements. "
    },
    {
      "type": "field",
      "varNames": [
        "exponent"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Exponent parameter of the distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.ZipfDistributionImpl(int, double)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Create a new Zipf distribution with the given number of elements and\n     * exponent. Both values must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param numberOfElements the number of elements\n     * @param exponent the exponent\n     * @exception IllegalArgumentException if n \u0026le; 0 or s \u0026le; 0.0\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 54)",
        "(line 55,col 9)-(line 55,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getNumberOfElements()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Get the number of elements (e.g. corpus size) for the distribution.\n     *\n     * @return the number of elements\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.setNumberOfElements(int)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Set the number of elements (e.g. corpus size) for the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param n the number of elements\n     * @exception IllegalArgumentException if n \u0026le; 0\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.setNumberOfElementsInternal(int)",
      "begin_line": 88,
      "end_line": 95,
      "comment": "\n     * Set the number of elements (e.g. corpus size) for the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param n the number of elements\n     * @exception IllegalArgumentException if n \u0026le; 0\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getExponent()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Get the exponent characterising the distribution.\n     *\n     * @return the exponent\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.setExponent(double)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * Set the exponent characterising the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param s the exponent\n     * @exception IllegalArgumentException if s \u0026le; 0.0\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.setExponentInternal(double)",
      "begin_line": 127,
      "end_line": 135,
      "comment": "\n     * Set the exponent characterising the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param s the exponent\n     * @exception IllegalArgumentException if s \u0026le; 0.0\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.probability(int)",
      "begin_line": 143,
      "end_line": 150,
      "comment": "\n     * The probability mass function P(X \u003d x) for a Zipf distribution.\n     *\n     * @param x the value at which the probability density function is evaluated.\n     * @return the value of the probability mass function at x\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.cumulativeProbability(int)",
      "begin_line": 158,
      "end_line": 168,
      "comment": "\n     * The probability distribution function P(X \u003c\u003d x) for a Zipf distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return Zipf distribution function evaluated at x\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.generalizedHarmonic(int, double)",
      "begin_line": 206,
      "end_line": 212,
      "comment": "\n     * Calculates the Nth generalized harmonic number. See\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HarmonicSeries.html\"\u003eHarmonic\n     * Series\u003c/a\u003e.\n     *\n     * @param n the term in the series to calculate (must be \u0026ge; 1)\n     * @param m the exponent; special case m \u003d\u003d 1.0 is the harmonic series\n     * @return the nth generalized harmonic number\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 25)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 21)"
      ]
    }
  ]
}