{
  "filepath": "/tmp/Math-8b/src/main/java/org/apache/commons/math3/analysis/differentiation/FiniteDifferencesDifferentiator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FiniteDifferencesDifferentiator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateFunctionDifferentiator",
        "org.apache.commons.math3.analysis.differentiation.UnivariateVectorFunctionDifferentiator",
        "org.apache.commons.math3.analysis.differentiation.UnivariateMatrixFunctionDifferentiator",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 384,
      "comment": " Univariate functions differentiator using finite differences.\n * \u003cp\u003e\n * This class creates some wrapper objects around regular\n * {@link UnivariateFunction univariate functions} (or {@link\n * UnivariateVectorFunction univariate vector functions} or {@link\n * UnivariateMatrixFunction univariate matrix functions}). These\n * wrapper objects compute derivatives in addition to function\n * value.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The wrapper objects work by calling the underlying function on\n * a sampling grid around the current point and performing polynomial\n * interpolation. A finite differences scheme with n points is\n * theoretically able to compute derivatives up to order n-1, but\n * it is generally better to have a slight margin. The step size must\n * also be small enough in order for the polynomial approximation to\n * be good in the current point neighborhood, but it should not be too\n * small because numerical instability appears quickly (there are several\n * differences of close points). Choosing the number of points and\n * the step size is highly problem dependent.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example of good and bad settings, lets consider the quintic\n * polynomial function {@code f(x) \u003d (x-1)*(x-0.5)*x*(x+0.5)*(x+1)}.\n * Since it is a polynomial, finite differences with at least 6 points\n * should theoretically recover the exact same polynomial and hence\n * compute accurate derivatives for any order. However, due to numerical\n * errors, we get the following results for a 7 points finite differences\n * for abscissae in the [-10, 10] range:\n * \u003cul\u003e\n *   \u003cli\u003estep size \u003d 0.25, second order derivative error about 9.97e-10\u003c/li\u003e\n *   \u003cli\u003estep size \u003d 0.25, fourth order derivative error about 5.43e-8\u003c/li\u003e\n *   \u003cli\u003estep size \u003d 1.0e-6, second order derivative error about 148\u003c/li\u003e\n *   \u003cli\u003estep size \u003d 1.0e-6, fourth order derivative error about 6.35e+14\u003c/li\u003e\n * \u003c/ul\u003e\n * This example shows that the small step size is really bad, even simply\n * for second order derivative!\n * \u003c/p\u003e\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "nbPoints"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Number of points to use. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Step size. "
    },
    {
      "type": "field",
      "varNames": [
        "halfSampleSpan"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Half sample span. "
    },
    {
      "type": "field",
      "varNames": [
        "tMin"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Lower bound for independent variable. "
    },
    {
      "type": "field",
      "varNames": [
        "tMax"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Upper bound for independent variable. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.FiniteDifferencesDifferentiator(int, double)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Build a differentiator with number of points and step size when independent variable is unbounded.\n     * \u003cp\u003e\n     * Beware that wrong settings for the finite differences differentiator\n     * can lead to highly unstable and inaccurate results, especially for\n     * high derivation orders. Using very small step sizes is often a\n     * \u003cem\u003ebad\u003c/em\u003e idea.\n     * \u003c/p\u003e\n     * @param nbPoints number of points to use\n     * @param stepSize step size (gap between each point)\n     * @exception NotPositiveException if {@code stepsize \u003c\u003d 0} (note that\n     * {@link NotPositiveException} extends {@link NumberIsTooSmallException})\n     * @exception NumberIsTooSmallException {@code nbPoint \u003c\u003d 1}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 85)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.FiniteDifferencesDifferentiator(int, double, double, double)",
      "begin_line": 141,
      "end_line": 163,
      "comment": "\n     * Build a differentiator with number of points and step size when independent variable is bounded.\n     * \u003cp\u003e\n     * When the independent variable is bounded (tLower \u0026lt; t \u0026lt; tUpper), the sampling\n     * points used for differentiation will be adapted to ensure the constraint holds\n     * even near the boundaries. This means the sample will not be centered anymore in\n     * these cases. At an extreme case, computing derivatives exactly at the lower bound\n     * will lead the sample to be entirely on the right side of the derivation point.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that the boundaries are considered to be excluded for function evaluation.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Beware that wrong settings for the finite differences differentiator\n     * can lead to highly unstable and inaccurate results, especially for\n     * high derivation orders. Using very small step sizes is often a\n     * \u003cem\u003ebad\u003c/em\u003e idea.\n     * \u003c/p\u003e\n     * @param nbPoints number of points to use\n     * @param stepSize step size (gap between each point)\n     * @param tLower lower bound for independent variable (may be {@code Double.NEGATIVE_INFINITY}\n     * if there are no lower bounds)\n     * @param tUpper upper bound for independent variable (may be {@code Double.POSITIVE_INFINITY}\n     * if there are no upper bounds)\n     * @exception NotPositiveException if {@code stepsize \u003c\u003d 0} (note that\n     * {@link NotPositiveException} extends {@link NumberIsTooSmallException})\n     * @exception NumberIsTooSmallException {@code nbPoint \u003c\u003d 1}\n     * @exception NumberIsTooLargeException {@code stepSize * (nbPoints - 1) \u003e\u003d tUpper - tLower}\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 33)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 33)",
        "(line 155,col 9)-(line 155,col 57)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 59)",
        "(line 160,col 9)-(line 160,col 53)",
        "(line 161,col 9)-(line 161,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.getNbPoints()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Get the number of points to use.\n     * @return number of points to use\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.getStepSize()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Get the step size.\n     * @return step size\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.evaluate(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, double[])",
      "begin_line": 193,
      "end_line": 236,
      "comment": "\n     * Evaluate derivatives from a sample.\n     * \u003cp\u003e\n     * Evaluation is done using divided differences.\n     * \u003c/p\u003e\n     * @param t evaluation abscissa value and derivatives\n     * @param t0 first sample point abscissa\n     * @param y function values sample {@code y[i] \u003d f(t[i]) \u003d f(t0 + i * stepSize)}\n     * @return value and derivatives at {@code t}\n     * @exception NumberIsTooLargeException if the requested derivation order\n     * is larger or equal to the number of points\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 53)",
        "(line 199,col 9)-(line 199,col 53)",
        "(line 201,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 215,col 50)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 217,col 59)",
        "(line 218,col 9)-(line 218,col 55)",
        "(line 219,col 9)-(line 219,col 92)",
        "(line 220,col 9)-(line 220,col 44)",
        "(line 221,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.differentiate(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 244,
      "end_line": 276,
      "comment": " {@inheritDoc}\n     * \u003cp\u003eThe returned object cannot compute derivatives to arbitrary orders. The\n     * value function will throw a {@link NumberIsTooLargeException} if the requested\n     * derivation order is larger or equal to the number of points.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 275,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-fa8f09b8-55df-4495-a225-5acf158f68e7.value(double)",
      "begin_line": 248,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 17)-(line 249,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-7bf8fc5f-84a4-4fb4-994f-bbfd6f2bbcd0.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 253,
      "end_line": 273,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 17)-(line 259,col 17)",
        "(line 262,col 17)-(line 262,col 104)",
        "(line 265,col 17)-(line 265,col 56)",
        "(line 266,col 17)-(line 268,col 17)",
        "(line 271,col 17)-(line 271,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.differentiate(org.apache.commons.math3.analysis.UnivariateVectorFunction)",
      "begin_line": 284,
      "end_line": 327,
      "comment": " {@inheritDoc}\n     * \u003cp\u003eThe returned object cannot compute derivatives to arbitrary orders. The\n     * value function will throw a {@link NumberIsTooLargeException} if the requested\n     * derivation order is larger or equal to the number of points.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 326,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-87e3a4f3-dff2-446e-a862-230a2a2184dc.value(double)",
      "begin_line": 288,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 17)-(line 289,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-0a21ce03-c77a-4203-9f16-6695a6b95b22.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 293,
      "end_line": 324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 17)-(line 299,col 17)",
        "(line 302,col 17)-(line 302,col 104)",
        "(line 305,col 17)-(line 305,col 36)",
        "(line 306,col 17)-(line 314,col 17)",
        "(line 317,col 17)-(line 317,col 86)",
        "(line 318,col 17)-(line 320,col 17)",
        "(line 322,col 17)-(line 322,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.differentiate(org.apache.commons.math3.analysis.UnivariateMatrixFunction)",
      "begin_line": 335,
      "end_line": 382,
      "comment": " {@inheritDoc}\n     * \u003cp\u003eThe returned object cannot compute derivatives to arbitrary orders. The\n     * value function will throw a {@link NumberIsTooLargeException} if the requested\n     * derivation order is larger or equal to the number of points.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 381,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-077671dd-0813-453f-8260-4dcb61f40f7a.value(double)",
      "begin_line": 339,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 17)-(line 340,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-93280961-bc3b-42ef-9864-d4f94e9fc5a6.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 344,
      "end_line": 379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 17)-(line 350,col 17)",
        "(line 353,col 17)-(line 353,col 104)",
        "(line 356,col 17)-(line 356,col 38)",
        "(line 357,col 17)-(line 367,col 17)",
        "(line 370,col 17)-(line 370,col 101)",
        "(line 371,col 17)-(line 375,col 17)",
        "(line 377,col 17)-(line 377,col 29)"
      ]
    }
  ]
}