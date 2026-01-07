{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Logistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Logistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 38,
      "end_line": 224,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Generalised_logistic_function\"\u003e\n *  Generalised logistic\u003c/a\u003e function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Lower asymptote. "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Upper asymptote. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Growth rate. "
    },
    {
      "type": "field",
      "varNames": [
        "oneOverN"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Parameter that affects near which asymptote maximum growth occurs. "
    },
    {
      "type": "field",
      "varNames": [
        "q"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Parameter that affects the position of the curve along the ordinate axis. "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Abscissa of maximum growth. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Logistic.Logistic(double, double, double, double, double, double)",
      "begin_line": 65,
      "end_line": 82,
      "comment": "\n     * @param k If {@code b \u003e 0}, value of the function for x going towards +\u0026infin;.\n     * If {@code b \u003c 0}, value of the function for x going towards -\u0026infin;.\n     * @param m Abscissa of maximum growth.\n     * @param b Growth rate.\n     * @param q Parameter that affects the position of the curve along the\n     * ordinate axis.\n     * @param a If {@code b \u003e 0}, value of the function for x going towards -\u0026infin;.\n     * If {@code b \u003c 0}, value of the function for x going towards +\u0026infin;.\n     * @param n Parameter that affects near which asymptote the maximum\n     * growth occurs.\n     * @throws NotStrictlyPositiveException if {@code n \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 19)",
        "(line 77,col 9)-(line 77,col 19)",
        "(line 78,col 9)-(line 78,col 19)",
        "(line 79,col 9)-(line 79,col 19)",
        "(line 80,col 9)-(line 80,col 19)",
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logistic.value(double)",
      "begin_line": 85,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logistic.derivative()",
      "begin_line": 92,
      "end_line": 95,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.ParametricUnivariateFunction"
      ],
      "begin_line": 105,
      "end_line": 197,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the logit function, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eLower asymptote\u003c/li\u003e\n     *  \u003cli\u003eHigher asymptote\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logistic.Parametric.value(double, double...)",
      "begin_line": 118,
      "end_line": 126,
      "comment": "\n         * Computes the value of the sigmoid at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values for {@code k}, {@code m}, {@code b}, {@code q},\n         * {@code a} and  {@code n}.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 6.\n         * @throws NotStrictlyPositiveException if {@code param[5] \u003c\u003d 0}.\n         ",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 38)",
        "(line 123,col 13)-(line 125,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logistic.Parametric.gradient(double, double...)",
      "begin_line": 143,
      "end_line": 169,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e.\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values for {@code k}, {@code m}, {@code b}, {@code q},\n         * {@code a} and  {@code n}.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 6.\n         * @throws NotStrictlyPositiveException if {@code param[5] \u003c\u003d 0}.\n         ",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 38)",
        "(line 149,col 13)-(line 149,col 38)",
        "(line 150,col 13)-(line 150,col 38)",
        "(line 152,col 13)-(line 152,col 48)",
        "(line 153,col 13)-(line 153,col 49)",
        "(line 154,col 13)-(line 154,col 57)",
        "(line 155,col 13)-(line 155,col 40)",
        "(line 156,col 13)-(line 156,col 42)",
        "(line 157,col 13)-(line 157,col 100)",
        "(line 158,col 13)-(line 158,col 52)",
        "(line 161,col 13)-(line 161,col 76)",
        "(line 162,col 13)-(line 162,col 49)",
        "(line 163,col 13)-(line 163,col 55)",
        "(line 164,col 13)-(line 164,col 44)",
        "(line 165,col 13)-(line 165,col 76)",
        "(line 166,col 13)-(line 166,col 67)",
        "(line 168,col 13)-(line 168,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logistic.Parametric.validateParameters(double[])",
      "begin_line": 183,
      "end_line": 196,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values for {@code k}, {@code m}, {@code b}, {@code q},\n         * {@code a} and {@code n}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 6.\n         * @throws NotStrictlyPositiveException if {@code param[5] \u003c\u003d 0}.\n         ",
      "child_ranges": [
        "(line 187,col 13)-(line 189,col 13)",
        "(line 190,col 13)-(line 192,col 13)",
        "(line 193,col 13)-(line 195,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logistic.value(double, double, double, double, double, double)",
      "begin_line": 208,
      "end_line": 215,
      "comment": "\n     * @param mMinusX {@code m - x}.\n     * @param k {@code k}.\n     * @param b {@code b}.\n     * @param q {@code q}.\n     * @param a {@code a}.\n     * @param oneOverN {@code 1 / n}.\n     * @return the value of the function.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logistic.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 220,
      "end_line": 222,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 120)"
      ]
    }
  ]
}