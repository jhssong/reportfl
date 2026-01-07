{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/analysis/function/Logistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Logistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 35,
      "end_line": 208,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Generalised_logistic_function\"\u003e\n *  Generalised logistic\u003c/a\u003e function.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Lower asymptote. "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Upper asymptote. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Growth rate. "
    },
    {
      "type": "field",
      "varNames": [
        "oneOverN"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Parameter that affects near which asymptote maximum growth occurs. "
    },
    {
      "type": "field",
      "varNames": [
        "q"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Parameter that affects the position of the curve along the ordinate axis. "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Abscissa of maximum growth. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Logistic.Logistic(double, double, double, double, double, double)",
      "begin_line": 62,
      "end_line": 78,
      "comment": "\n     * @param k If {@code b \u003e 0}, value of the function for x going towards +\u0026infin;.\n     * If {@code b \u003c 0}, value of the function for x going towards -\u0026infin;.\n     * @param m Abscissa of maximum growth.\n     * @param b Growth rate.\n     * @param q Parameter that affects the position of the curve along the\n     * ordinate axis.\n     * @param a If {@code b \u003e 0}, value of the function for x going towards -\u0026infin;.\n     * If {@code b \u003c 0}, value of the function for x going towards +\u0026infin;.\n     * @param n Parameter that affects near which asymptote the maximum\n     * growth occurs.\n     * @throws NotStrictlyPositiveException if {@code n \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 72,col 19)",
        "(line 73,col 9)-(line 73,col 19)",
        "(line 74,col 9)-(line 74,col 19)",
        "(line 75,col 9)-(line 75,col 19)",
        "(line 76,col 9)-(line 76,col 19)",
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logistic.value(double)",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logistic.derivative()",
      "begin_line": 86,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 98,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logistic.Anonymous-c2cc80b2-ed6a-44ba-822e-252b4200a53d.value(double)",
      "begin_line": 89,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 17)-(line 90,col 65)",
        "(line 91,col 17)-(line 94,col 17)",
        "(line 95,col 17)-(line 95,col 44)",
        "(line 96,col 17)-(line 96,col 77)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.ParametricUnivariateFunction"
      ],
      "begin_line": 109,
      "end_line": 189,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the logit function, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eLower asymptote\u003c/li\u003e\n     *  \u003cli\u003eHigher asymptote\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logistic.Parametric.value(double, double...)",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n         * Computes the value of the sigmoid at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values for {@code k}, {@code m}, {@code b}, {@code q},\n         * {@code a} and  {@code n}.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 6.\n         ",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 38)",
        "(line 123,col 13)-(line 125,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logistic.Parametric.gradient(double, double...)",
      "begin_line": 142,
      "end_line": 165,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e.\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values for {@code k}, {@code m}, {@code b}, {@code q},\n         * {@code a} and  {@code n}.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 6.\n         ",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 38)",
        "(line 145,col 13)-(line 145,col 38)",
        "(line 146,col 13)-(line 146,col 38)",
        "(line 148,col 13)-(line 148,col 48)",
        "(line 149,col 13)-(line 149,col 49)",
        "(line 150,col 13)-(line 150,col 57)",
        "(line 151,col 13)-(line 151,col 40)",
        "(line 152,col 13)-(line 152,col 42)",
        "(line 153,col 13)-(line 153,col 100)",
        "(line 154,col 13)-(line 154,col 52)",
        "(line 157,col 13)-(line 157,col 76)",
        "(line 158,col 13)-(line 158,col 49)",
        "(line 159,col 13)-(line 159,col 55)",
        "(line 160,col 13)-(line 160,col 44)",
        "(line 161,col 13)-(line 161,col 76)",
        "(line 162,col 13)-(line 162,col 67)",
        "(line 164,col 13)-(line 164,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logistic.Parametric.validateParameters(double[])",
      "begin_line": 178,
      "end_line": 188,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values for {@code k}, {@code m}, {@code b}, {@code q},\n         * {@code a} and  {@code n}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 6.\n         ",
      "child_ranges": [
        "(line 179,col 13)-(line 181,col 13)",
        "(line 182,col 13)-(line 184,col 13)",
        "(line 185,col 13)-(line 187,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logistic.value(double, double, double, double, double, double)",
      "begin_line": 200,
      "end_line": 207,
      "comment": "\n     * @param mMinusX {@code m - x}.\n     * @param k {@code k}.\n     * @param b {@code b}.\n     * @param q {@code q}.\n     * @param a {@code a}.\n     * @param oneOverN {@code 1 / n}.\n     * @return the value of the function.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 87)"
      ]
    }
  ]
}