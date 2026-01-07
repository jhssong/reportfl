{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/analysis/differentiation/FiniteDifferencesDifferentiator.java",
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
      "begin_line": 70,
      "end_line": 316,
      "comment": " Univariate functions differentiator using finite differences.\n * \u003cp\u003e\n * This class creates some wrapper objects around regular\n * {@link UnivariateFunction univariate functions} (or {@link\n * UnivariateVectorFunction univariate vector functions} or {@link\n * UnivariateMatrixFunction univariate matrix functions}). These\n * wrapper objects compute derivatives in addition to function\n * value.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The wrapper objects work by calling the underlying function on\n * a sampling grid around the current point and performing polynomial\n * interpolation. A finite differences scheme with n points is\n * theoretically able to compute derivatives up to order n-1, but\n * it is generally better to have a slight margin. The step size must\n * also be small enough in order for the polynomial approximation to\n * be good in the current point neighborhood, but it should not be too\n * small because numerical instability appears quickly (there are several\n * differences of close points). Choosing the number of points and\n * the step size is highly problem dependent.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example of good and bad settings, lets consider the quintic\n * polynomial function {@code f(x) \u003d (x-1)*(x-0.5)*x*(x+0.5)*(x+1)}.\n * Since it is a polynomial, finite differences with at least 6 points\n * should theoretically recover the exact same polynomial and hence\n * compute accurate derivatives for any order. However, due to numerical\n * errors, we get the following results for a 7 points finite differences\n * for abscissae in the [-10, 10] range:\n * \u003cul\u003e\n *   \u003cli\u003estep size \u003d 0.25, second order derivative error about 9.97e-10\u003c/li\u003e\n *   \u003cli\u003estep size \u003d 0.25, fourth order derivative error about 5.43e-8\u003c/li\u003e\n *   \u003cli\u003estep size \u003d 1.0e-6, second order derivative error about 56.25\u003c/li\u003e\n *   \u003cli\u003estep size \u003d 1.0e-6, fourth order derivative error about 2.47e+14\u003c/li\u003e\n * \u003c/ul\u003e\n * This example shows that the small step size is really bad, even simply\n * for second order derivative!\n * \u003c/p\u003e\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "nbPoints"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Number of points to use. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Step size. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.FiniteDifferencesDifferentiator(int, double)",
      "begin_line": 97,
      "end_line": 110,
      "comment": "\n     * Build a differentiator with number of points and step size.\n     * \u003cp\u003e\n     * Beware that wrong settings for the finite differences differentiator\n     * can lead to highly unstable and inaccurate results, especially for\n     * high derivation orders. Using very small step sizes is often a\n     * \u003cem\u003ebad\u003c/em\u003e idea.\n     * \u003c/p\u003e\n     * @param nbPoints number of points to use\n     * @param stepSize step size (gap between each point)\n     * @exception NotPositiveException if {@code stepsize \u003c\u003d 0} (note that\n     * {@link NotPositiveException} extends {@link NumberIsTooSmallException})\n     * @exception NumberIsTooSmallException {@code nbPoint \u003c\u003d 1}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.getNbPoints()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Get the number of points to use.\n     * @return number of points to use\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.getStepSize()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Get the step size.\n     * @return step size\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.evaluate(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double[])",
      "begin_line": 136,
      "end_line": 171,
      "comment": "\n     * Evaluate derivatives from a centered sample.\n     * @param t central value and derivatives\n     * @param y function values at {@code t + stepSize * (i - 0.5 * (nbPoints - 1))}\n     * @return value and derivatives at {@code t}\n     * @exception NumberIsTooLargeException if the requested derivation order\n     * is larger or equal to the number of points\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 53)",
        "(line 141,col 9)-(line 141,col 53)",
        "(line 143,col 9)-(line 154,col 9)",
        "(line 157,col 9)-(line 157,col 44)",
        "(line 158,col 9)-(line 158,col 53)",
        "(line 159,col 9)-(line 159,col 59)",
        "(line 160,col 9)-(line 160,col 92)",
        "(line 161,col 9)-(line 161,col 92)",
        "(line 162,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.differentiate(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 179,
      "end_line": 210,
      "comment": " {@inheritDoc}\n     * \u003cp\u003eThe returned object cannot compute derivatives to arbitrary orders. The\n     * value function will throw a {@link NumberIsTooLargeException} if the requested\n     * derivation order is larger or equal to the number of points.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 209,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-8be04468-7481-4f33-a70d-61d8d90eef97.value(double)",
      "begin_line": 183,
      "end_line": 185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 17)-(line 184,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-11f758b0-e232-4187-839c-7f9ca8b2dcda.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 188,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 17)-(line 194,col 17)",
        "(line 197,col 17)-(line 197,col 47)",
        "(line 198,col 17)-(line 198,col 56)",
        "(line 199,col 17)-(line 202,col 17)",
        "(line 205,col 17)-(line 205,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.differentiate(org.apache.commons.math3.analysis.UnivariateVectorFunction)",
      "begin_line": 218,
      "end_line": 260,
      "comment": " {@inheritDoc}\n     * \u003cp\u003eThe returned object cannot compute derivatives to arbitrary orders. The\n     * value function will throw a {@link NumberIsTooLargeException} if the requested\n     * derivation order is larger or equal to the number of points.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 259,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-4b1e38e8-2226-498d-becc-a4a8b017eca7.value(double)",
      "begin_line": 222,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 17)-(line 223,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-1b84c9d2-0878-4e17-9bd4-0c9f6ff66864.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 227,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 17)-(line 233,col 17)",
        "(line 236,col 17)-(line 236,col 47)",
        "(line 237,col 17)-(line 237,col 36)",
        "(line 238,col 17)-(line 247,col 17)",
        "(line 250,col 17)-(line 250,col 86)",
        "(line 251,col 17)-(line 253,col 17)",
        "(line 255,col 17)-(line 255,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.differentiate(org.apache.commons.math3.analysis.UnivariateMatrixFunction)",
      "begin_line": 268,
      "end_line": 314,
      "comment": " {@inheritDoc}\n     * \u003cp\u003eThe returned object cannot compute derivatives to arbitrary orders. The\n     * value function will throw a {@link NumberIsTooLargeException} if the requested\n     * derivation order is larger or equal to the number of points.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 313,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-584031af-74fe-4513-8cdb-2b1beefac8e9.value(double)",
      "begin_line": 272,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 17)-(line 273,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator.Anonymous-439ef587-4967-4ec9-98f8-391cda337074.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 277,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 281,col 17)-(line 283,col 17)",
        "(line 286,col 17)-(line 286,col 47)",
        "(line 287,col 17)-(line 287,col 38)",
        "(line 288,col 17)-(line 299,col 17)",
        "(line 302,col 17)-(line 302,col 101)",
        "(line 303,col 17)-(line 307,col 17)",
        "(line 309,col 17)-(line 309,col 29)"
      ]
    }
  ]
}