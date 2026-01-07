{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/distribution/ZipfDistributionImpl.java",
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
      "end_line": 150,
      "comment": "\n * Implementation for the {@link ZipfDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
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
      "begin_line": 38,
      "end_line": 38,
      "comment": " Exponent parameter of the distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.ZipfDistributionImpl(int, double)",
      "begin_line": 49,
      "end_line": 62,
      "comment": "\n     * Create a new Zipf distribution with the given number of elements and\n     * exponent.\n     *\n     * @param numberOfElements Number of elements.\n     * @param exponent Exponent.\n     * @exception NotStrictlyPositiveException if {@code numberOfElements \u003c\u003d 0}\n     * or {@code exponent \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 58,col 9)",
        "(line 60,col 9)-(line 60,col 49)",
        "(line 61,col 9)-(line 61,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getNumberOfElements()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getExponent()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.probability(int)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * The probability mass function {@code P(X \u003d x)} for a Zipf distribution.\n     *\n     * @param x Value at which the probability density function is evaluated.\n     * @return the value of the probability mass function at {@code x}.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.cumulativeProbability(int)",
      "begin_line": 99,
      "end_line": 108,
      "comment": "\n     * The probability distribution function {@code P(X \u003c\u003d x)} for a\n     * Zipf distribution.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return Zipf distribution function evaluated at {@code x}.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.generalizedHarmonic(int, double)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "\n     * Calculates the Nth generalized harmonic number. See\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HarmonicSeries.html\"\u003eHarmonic\n     * Series\u003c/a\u003e.\n     *\n     * @param n Term in the series to calculate (must be larger than 1)\n     * @param m Exponent (special case {@code m \u003d 1} is the harmonic series).\n     * @return the n\u003csup\u003eth\u003c/sup\u003e generalized harmonic number.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 25)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 21)"
      ]
    }
  ]
}