{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/distribution/WeibullDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeibullDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.WeibullDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 261,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.WeibullDistribution}.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Creates weibull distribution with the given shape and scale and a\n     * location equal to zero.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double, double)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\n     * Creates weibull distribution with the given shape, scale and inverse\n     * cumulative probability accuracy and a location equal to zero.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)",
        "(line 74,col 9)-(line 74,col 32)",
        "(line 75,col 9)-(line 75,col 31)",
        "(line 76,col 9)-(line 76,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.cumulativeProbability(double)",
      "begin_line": 84,
      "end_line": 92,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 19)",
        "(line 86,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getShape()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Access the shape parameter.\n     * @return the shape parameter.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getScale()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Access the scale parameter.\n     * @return the scale parameter.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.density(double)",
      "begin_line": 117,
      "end_line": 134,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 40)",
        "(line 124,col 9)-(line 124,col 61)",
        "(line 131,col 9)-(line 131,col 57)",
        "(line 133,col 9)-(line 133,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 148,
      "end_line": 162,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 19)",
        "(line 151,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setShape(double)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\n     * Modify the shape parameter.\n     * @param alpha the new shape parameter value.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setShapeInternal(double)",
      "begin_line": 177,
      "end_line": 184,
      "comment": "\n     * Modify the shape parameter.\n     * @param alpha the new shape parameter value.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setScale(double)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Modify the scale parameter.\n     * @param beta the new scale parameter value.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setScaleInternal(double)",
      "begin_line": 199,
      "end_line": 206,
      "comment": "\n     * Modify the scale parameter.\n     * @param beta the new scale parameter value.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getInitialDomain(double)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 38)"
      ]
    }
  ]
}