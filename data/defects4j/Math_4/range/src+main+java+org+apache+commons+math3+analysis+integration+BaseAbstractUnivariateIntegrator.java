{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/integration/BaseAbstractUnivariateIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractUnivariateIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.UnivariateIntegrator"
      ],
      "begin_line": 36,
      "end_line": 281,
      "comment": "\n * Provide a default implementation for several generic functions.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_ACCURACY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MIN_ITERATIONS_COUNT"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Default minimal iteration count. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS_COUNT"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Default maximal iteration count. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The iteration count. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "minimalIterationCount"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The functions evaluation count. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Function to integrate. "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Lower bound for the interval. "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Upper bound for the interval. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.BaseAbstractUnivariateIntegrator(double, double, int, int)",
      "begin_line": 109,
      "end_line": 133,
      "comment": "\n     * Construct an integrator with given accuracies and iteration counts.\n     * \u003cp\u003e\n     * The meanings of the various parameters are:\n     * \u003cul\u003e\n     *   \u003cli\u003erelative accuracy:\n     *       this is used to stop iterations if the absolute accuracy can\u0027t be\n     *       achieved due to large values or short mantissa length. If this\n     *       should be the primary criterion for convergence rather then a\n     *       safety measure, set the absolute accuracy to a ridiculously small value,\n     *       like {@link org.apache.commons.math3.util.Precision#SAFE_MIN Precision.SAFE_MIN}.\u003c/li\u003e\n     *   \u003cli\u003eabsolute accuracy:\n     *       The default is usually chosen so that results in the interval\n     *       -10..-0.1 and +0.1..+10 can be found with a reasonable accuracy. If the\n     *       expected absolute value of your results is of much smaller magnitude, set\n     *       this to a smaller value.\u003c/li\u003e\n     *   \u003cli\u003eminimum number of iterations:\n     *       minimal iteration is needed to avoid false early convergence, e.g.\n     *       the sample points happen to be zeroes of the function. Users can\n     *       use the default value or choose one that they see as appropriate.\u003c/li\u003e\n     *   \u003cli\u003emaximum number of iterations:\n     *       usually a high iteration count indicates convergence problems. However,\n     *       the \"reasonable value\" varies widely for different algorithms. Users are\n     *       advised to use the default value supplied by the algorithm.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 54)",
        "(line 117,col 9)-(line 117,col 54)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 59)",
        "(line 127,col 9)-(line 127,col 55)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 131,col 9)-(line 131,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.BaseAbstractUnivariateIntegrator(double, double)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "\n     * Construct an integrator with given accuracies.\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 143,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.BaseAbstractUnivariateIntegrator(int, int)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n     * Construct an integrator with given iteration counts.\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 159,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.getRelativeAccuracy()",
      "begin_line": 163,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.getAbsoluteAccuracy()",
      "begin_line": 168,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.getMinimalIterationCount()",
      "begin_line": 173,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.getMaximalIterationCount()",
      "begin_line": 178,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.getEvaluations()",
      "begin_line": 183,
      "end_line": 185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.getIterations()",
      "begin_line": 188,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.getMin()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * @return the lower bound.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.getMax()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * @return the upper bound.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.computeObjectiveValue(double)",
      "begin_line": 213,
      "end_line": 221,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of function\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.setup(int, org.apache.commons.math3.analysis.UnivariateFunction, double, double)",
      "begin_line": 235,
      "end_line": 252,
      "comment": "\n     * Prepare for computation.\n     * Subclasses must call this method if they override any of the\n     * {@code solve} methods.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f the integrand function\n     * @param lower the min bound for the interval\n     * @param upper the upper bound for the interval\n     * @throws NullArgumentException if {@code f} is {@code null}.\n     * @throws MathIllegalArgumentException if {@code min \u003e\u003d max}.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 34)",
        "(line 242,col 9)-(line 242,col 59)",
        "(line 245,col 9)-(line 245,col 20)",
        "(line 246,col 9)-(line 246,col 20)",
        "(line 247,col 9)-(line 247,col 21)",
        "(line 248,col 9)-(line 248,col 45)",
        "(line 249,col 9)-(line 249,col 33)",
        "(line 250,col 9)-(line 250,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.integrate(int, org.apache.commons.math3.analysis.UnivariateFunction, double, double)",
      "begin_line": 255,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 40)",
        "(line 264,col 9)-(line 264,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.doIntegrate()",
      "begin_line": 278,
      "end_line": 279,
      "comment": "\n     * Method for implementing actual integration algorithms in derived\n     * classes.\n     *\n     * @return the root.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     * @throws MaxCountExceededException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     ",
      "child_ranges": []
    }
  ]
}