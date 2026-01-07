{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/LevyDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevyDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 31,
      "end_line": 159,
      "comment": "\n * This class implements the \u003ca href\u003d\"http://en.wikipedia.org/wiki/L%C3%A9vy_distribution\"\u003e\n * L\u0026eacute;vy distribution\u003c/a\u003e.\n *\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Location parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Setting this to 1 returns a cumProb of 1.0"
    },
    {
      "type": "field",
      "varNames": [
        "halfC"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Half of c (for calculations). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.LevyDistribution(org.apache.commons.math3.random.RandomGenerator, double, double)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "\n     * Creates a LevyDistribution.\n     * @param rng random generator to be used for sampling\n     * @param mu location\n     * @param c scale parameter\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 19)",
        "(line 53,col 9)-(line 53,col 24)",
        "(line 54,col 9)-(line 54,col 23)",
        "(line 55,col 9)-(line 55,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.density(double)",
      "begin_line": 72,
      "end_line": 80,
      "comment": " {@inheritDoc}\n    * \u003cp\u003e\n    * From Wikipedia: The probability density function of the L\u0026eacute;vy distribution\n    * over the domain is\n    * \u003c/p\u003e\n    * \u003cpre\u003e\n    * f(x; \u0026mu;, c) \u003d \u0026radic;(c / 2\u0026pi;) * e\u003csup\u003e-c / 2 (x - \u0026mu;)\u003c/sup\u003e / (x - \u0026mu;)\u003csup\u003e3/2\u003c/sup\u003e\n    * \u003c/pre\u003e\n    * \u003cp\u003e\n    * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n    * If {@code x} is less than location parameter \u0026mu;, {@code Double.NaN} is\n    * returned, as in these cases the distribution is not defined.\n    * \u003c/p\u003e\n    ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 43)",
        "(line 79,col 9)-(line 79,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.cumulativeProbability(double)",
      "begin_line": 90,
      "end_line": 95,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e\n     * From Wikipedia: the cumulative distribution function is\n     * \u003c/p\u003e\n     * \u003cpre\u003e\n     * f(x; u, c) \u003d erfc (\u0026radic; (c / 2 (x - u )))\n     * \u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.inverseCumulativeProbability(double)",
      "begin_line": 98,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 40)",
        "(line 104,col 9)-(line 104,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.getScale()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " Get the scale parameter of the distribution.\n     * @return scale parameter of the distribution\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.getLocation()",
      "begin_line": 117,
      "end_line": 119,
      "comment": " Get the location parameter of the distribution.\n     * @return location parameter of the distribution\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.getNumericalMean()",
      "begin_line": 122,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.getNumericalVariance()",
      "begin_line": 127,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.getSupportLowerBound()",
      "begin_line": 132,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.getSupportUpperBound()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 142,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 149,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LevyDistribution.isSupportConnected()",
      "begin_line": 155,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 20)"
      ]
    }
  ]
}