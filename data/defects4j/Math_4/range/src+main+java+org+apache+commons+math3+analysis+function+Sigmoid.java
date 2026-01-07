{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Sigmoid.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Sigmoid",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 42,
      "end_line": 218,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Sigmoid_function\"\u003e\n *  Sigmoid\u003c/a\u003e function.\n * It is the inverse of the {@link Logit logit} function.\n * A more flexible version, the generalised logistic, is implemented\n * by the {@link Logistic} class.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Lower asymptote. "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Higher asymptote. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Sigmoid.Sigmoid()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Usual sigmoid function, where the lower asymptote is 0 and the higher\n     * asymptote is 1.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Sigmoid.Sigmoid(double, double)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Sigmoid function.\n     *\n     * @param lo Lower asymptote.\n     * @param hi Higher asymptote.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 21)",
        "(line 65,col 9)-(line 65,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sigmoid.derivative()",
      "begin_line": 71,
      "end_line": 74,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sigmoid.value(double)",
      "begin_line": 77,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.ParametricUnivariateFunction"
      ],
      "begin_line": 89,
      "end_line": 150,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the logit function, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eLower asymptote\u003c/li\u003e\n     *  \u003cli\u003eHigher asymptote\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sigmoid.Parametric.value(double, double...)",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n         * Computes the value of the sigmoid at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values of lower asymptote and higher asymptote.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 38)",
        "(line 104,col 13)-(line 104,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sigmoid.Parametric.gradient(double, double...)",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e (lower asymptote and higher asymptote).\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values for lower asymptote and higher asymptote.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 38)",
        "(line 125,col 13)-(line 125,col 62)",
        "(line 127,col 13)-(line 127,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sigmoid.Parametric.validateParameters(double[])",
      "begin_line": 140,
      "end_line": 149,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values for lower and higher asymptotes.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 143,col 13)-(line 145,col 13)",
        "(line 146,col 13)-(line 148,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sigmoid.value(double, double, double)",
      "begin_line": 158,
      "end_line": 162,
      "comment": "\n     * @param x Value at which to compute the sigmoid.\n     * @param lo Lower asymptote.\n     * @param hi Higher asymptote.\n     * @return the value of the sigmoid function at {@code x}.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sigmoid.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 167,
      "end_line": 216,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 50)",
        "(line 171,col 9)-(line 171,col 55)",
        "(line 172,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 28)"
      ]
    }
  ]
}