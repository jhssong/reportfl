{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/analysis/function/Sigmoid.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Sigmoid",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction"
      ],
      "begin_line": 37,
      "end_line": 160,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Sigmoid_function\"\u003e\n *  Sigmoid\u003c/a\u003e function.\n * It is the inverse of the {@link Logit logit} function.\n * A more flexible version, the generalised logistic, is implemented\n * by the {@link Logistic} class.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Lower asymptote. "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Higher asymptote. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Sigmoid.Sigmoid()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Usual sigmoid function, where the lower asymptote is 0 and the higher\n     * asymptote is 1.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Sigmoid.Sigmoid(double, double)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     * Sigmoid function.\n     *\n     * @param lo Lower asymptote.\n     * @param hi Higher asymptote.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 21)",
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sigmoid.derivative()",
      "begin_line": 64,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 76,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sigmoid.Anonymous-c3babba5-f7f1-4d95-b717-fb260d468dba.value(double)",
      "begin_line": 67,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 17)-(line 68,col 52)",
        "(line 69,col 17)-(line 72,col 17)",
        "(line 73,col 17)-(line 73,col 44)",
        "(line 74,col 17)-(line 74,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sigmoid.value(double)",
      "begin_line": 80,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.ParametricUnivariateRealFunction"
      ],
      "begin_line": 92,
      "end_line": 147,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the logit function, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eLower asymptote\u003c/li\u003e\n     *  \u003cli\u003eHigher asymptote\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sigmoid.Parametric.value(double, double...)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n         * Computes the value of the sigmoid at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values of lower asymptote and higher asymptote.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 38)",
        "(line 105,col 13)-(line 105,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sigmoid.Parametric.gradient(double, double...)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e (lower asymptote and higher asymptote).\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values for lower asymptote and higher asymptote.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 38)",
        "(line 124,col 13)-(line 124,col 62)",
        "(line 126,col 13)-(line 126,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sigmoid.Parametric.validateParameters(double[])",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values for lower and higher asymptotes.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 140,col 13)-(line 142,col 13)",
        "(line 143,col 13)-(line 145,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sigmoid.value(double, double, double)",
      "begin_line": 155,
      "end_line": 159,
      "comment": "\n     * @param x Value at which to compute the sigmoid.\n     * @param lo Lower asymptote.\n     * @param hi Higher asymptote.\n     * @return the value of the sigmoid function at {@code x}.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 55)"
      ]
    }
  ]
}