{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Gaussian.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gaussian",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 41,
      "end_line": 260,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Gaussian_function\"\u003e\n *  Gaussian\u003c/a\u003e function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Mean. "
    },
    {
      "type": "field",
      "varNames": [
        "is"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Inverse of the standard deviation. "
    },
    {
      "type": "field",
      "varNames": [
        "i2s2"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Inverse of twice the square of the standard deviation. "
    },
    {
      "type": "field",
      "varNames": [
        "norm"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Normalization factor. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.Gaussian(double, double, double)",
      "begin_line": 59,
      "end_line": 71,
      "comment": "\n     * Gaussian with given normalization factor, mean and standard deviation.\n     *\n     * @param norm Normalization factor.\n     * @param mean Mean.\n     * @param sigma Standard deviation.\n     * @throws NotStrictlyPositiveException if {@code sigma \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 67,col 9)-(line 67,col 25)",
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 30)",
        "(line 70,col 9)-(line 70,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.Gaussian(double, double)",
      "begin_line": 80,
      "end_line": 84,
      "comment": "\n     * Normalized gaussian with given mean and standard deviation.\n     *\n     * @param mean Mean.\n     * @param sigma Standard deviation.\n     * @throws NotStrictlyPositiveException if {@code sigma \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.Gaussian()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Normalized gaussian with zero mean and unit standard deviation.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.value(double)",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.derivative()",
      "begin_line": 101,
      "end_line": 104,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.ParametricUnivariateFunction"
      ],
      "begin_line": 115,
      "end_line": 195,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the Gaussian, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eNorm\u003c/li\u003e\n     *  \u003cli\u003eMean\u003c/li\u003e\n     *  \u003cli\u003eStandard deviation\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.Parametric.value(double, double...)",
      "begin_line": 127,
      "end_line": 136,
      "comment": "\n         * Computes the value of the Gaussian at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values of norm, mean and standard deviation.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         * @throws NotStrictlyPositiveException if {@code param[2]} is negative.\n         ",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 38)",
        "(line 133,col 13)-(line 133,col 45)",
        "(line 134,col 13)-(line 134,col 62)",
        "(line 135,col 13)-(line 135,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.Parametric.gradient(double, double...)",
      "begin_line": 152,
      "end_line": 168,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e (norm, mean and standard deviation).\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values of norm, mean and standard deviation.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         * @throws NotStrictlyPositiveException if {@code param[2]} is negative.\n         ",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 38)",
        "(line 158,col 13)-(line 158,col 41)",
        "(line 159,col 13)-(line 159,col 45)",
        "(line 160,col 13)-(line 160,col 42)",
        "(line 161,col 13)-(line 161,col 56)",
        "(line 163,col 13)-(line 163,col 59)",
        "(line 164,col 13)-(line 164,col 56)",
        "(line 165,col 13)-(line 165,col 46)",
        "(line 167,col 13)-(line 167,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.Parametric.validateParameters(double[])",
      "begin_line": 181,
      "end_line": 194,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values of norm, mean and standard deviation.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         * @throws NotStrictlyPositiveException if {@code param[2]} is negative.\n         ",
      "child_ranges": [
        "(line 185,col 13)-(line 187,col 13)",
        "(line 188,col 13)-(line 190,col 13)",
        "(line 191,col 13)-(line 193,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.value(double, double, double)",
      "begin_line": 203,
      "end_line": 207,
      "comment": "\n     * @param xMinusMean {@code x - mean}.\n     * @param norm Normalization factor.\n     * @param i2s2 Inverse of twice the square of the standard deviation.\n     * @return the value of the Gaussian at {@code x}.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Gaussian.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 212,
      "end_line": 258,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 52)",
        "(line 216,col 9)-(line 216,col 50)",
        "(line 225,col 9)-(line 225,col 48)",
        "(line 226,col 9)-(line 226,col 17)",
        "(line 227,col 9)-(line 227,col 32)",
        "(line 228,col 9)-(line 228,col 54)",
        "(line 229,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 28)"
      ]
    }
  ]
}