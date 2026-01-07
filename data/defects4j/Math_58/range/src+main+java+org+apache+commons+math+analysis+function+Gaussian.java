{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/analysis/function/Gaussian.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gaussian",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction"
      ],
      "begin_line": 35,
      "end_line": 199,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Gaussian_function\"\u003e\n *  Gaussian\u003c/a\u003e function.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Mean. "
    },
    {
      "type": "field",
      "varNames": [
        "i2s2"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Inverse of twice the square of the standard deviation. "
    },
    {
      "type": "field",
      "varNames": [
        "norm"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Normalization factor. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.Gaussian(double, double, double)",
      "begin_line": 51,
      "end_line": 61,
      "comment": "\n     * Gaussian with given normalization factor, mean and standard deviation.\n     *\n     * @param norm Normalization factor.\n     * @param mean Mean.\n     * @param sigma Standard deviation.\n     * @throws NotStrictlyPositiveException if {@code sigma \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 58,col 25)",
        "(line 59,col 9)-(line 59,col 25)",
        "(line 60,col 9)-(line 60,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.Gaussian(double, double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Normalized gaussian with given mean and standard deviation.\n     *\n     * @param mean Mean.\n     * @param sigma Standard deviation.\n     * @throws NotStrictlyPositiveException if {@code sigma \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.Gaussian()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Normalized gaussian with zero mean and unit standard deviation.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.value(double)",
      "begin_line": 83,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.derivative()",
      "begin_line": 88,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 102,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.Anonymous-fa7cabb5-f004-4c3a-a728-2054153b8f90.value(double)",
      "begin_line": 91,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 17)-(line 92,col 45)",
        "(line 93,col 17)-(line 93,col 66)",
        "(line 95,col 17)-(line 100,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.ParametricUnivariateRealFunction"
      ],
      "begin_line": 114,
      "end_line": 186,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the Gaussian, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eNorm\u003c/li\u003e\n     *  \u003cli\u003eMean\u003c/li\u003e\n     *  \u003cli\u003eStandard deviation\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.Parametric.value(double, double[])",
      "begin_line": 126,
      "end_line": 133,
      "comment": "\n         * Computes the value of the Gaussian at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values of norm, mean and standard deviation.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         * @throws NotStrictlyPositiveException if {@code param[2]} is negative.\n         ",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 38)",
        "(line 130,col 13)-(line 130,col 45)",
        "(line 131,col 13)-(line 131,col 62)",
        "(line 132,col 13)-(line 132,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.Parametric.gradient(double, double[])",
      "begin_line": 149,
      "end_line": 162,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e (norm, mean and standard deviation).\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values of norm, mean and standard deviation.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         * @throws NotStrictlyPositiveException if {@code param[2]} is negative.\n         ",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 38)",
        "(line 152,col 13)-(line 152,col 41)",
        "(line 153,col 13)-(line 153,col 45)",
        "(line 154,col 13)-(line 154,col 42)",
        "(line 155,col 13)-(line 155,col 56)",
        "(line 157,col 13)-(line 157,col 59)",
        "(line 158,col 13)-(line 158,col 56)",
        "(line 159,col 13)-(line 159,col 46)",
        "(line 161,col 13)-(line 161,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.Parametric.validateParameters(double[])",
      "begin_line": 175,
      "end_line": 185,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values of norm, mean and standard deviation.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         * @throws NotStrictlyPositiveException if {@code param[2]} is negative.\n         ",
      "child_ranges": [
        "(line 176,col 13)-(line 178,col 13)",
        "(line 179,col 13)-(line 181,col 13)",
        "(line 182,col 13)-(line 184,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Gaussian.value(double, double, double)",
      "begin_line": 194,
      "end_line": 198,
      "comment": "\n     * @param xMinusMean {@code x - mean}.\n     * @param norm Normalization factor.\n     * @param i2s2 Inverse of twice the square of the standard deviation.\n     * @return the value of the Gaussian at {@code x}.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 68)"
      ]
    }
  ]
}