{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/analysis/function/Logit.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Logit",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction"
      ],
      "begin_line": 36,
      "end_line": 157,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Logit\"\u003e\n *  Logit\u003c/a\u003e function.\n * It is the inverse of the {@link Sigmoid sigmoid} function.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Higher bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Logit.Logit()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Usual logit function, where the lower bound is 0 and the higher\n     * bound is 1.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Logit.Logit(double, double)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "\n     * Logit function.\n     *\n     * @param lo Lower bound of the function domain.\n     * @param hi Higher bound of the function domain.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 21)",
        "(line 59,col 9)-(line 59,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logit.value(double)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logit.derivative()",
      "begin_line": 68,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 74,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logit.Anonymous-6370e6c6-cbcd-4581-a94a-8370c32cff94.value(double)",
      "begin_line": 71,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 17)-(line 72,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.ParametricUnivariateRealFunction"
      ],
      "begin_line": 85,
      "end_line": 141,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the logit function, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eLower bound\u003c/li\u003e\n     *  \u003cli\u003eHigher bound\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logit.Parametric.value(double, double...)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n         * Computes the value of the logit at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values of lower bound and higher bounds.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 38)",
        "(line 98,col 13)-(line 98,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logit.Parametric.gradient(double, double...)",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e (lower bound and higher bound).\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values for lower and higher bounds.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 38)",
        "(line 117,col 13)-(line 117,col 39)",
        "(line 118,col 13)-(line 118,col 39)",
        "(line 120,col 13)-(line 120,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logit.Parametric.validateParameters(double[])",
      "begin_line": 133,
      "end_line": 140,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values for lower and higher bounds.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 134,col 13)-(line 136,col 13)",
        "(line 137,col 13)-(line 139,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logit.value(double, double, double)",
      "begin_line": 149,
      "end_line": 156,
      "comment": "\n     * @param x Value at which to compute the logit.\n     * @param lo Lower bound.\n     * @param hi Higher bound.\n     * @return the value of the logit function at {@code x}.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 49)"
      ]
    }
  ]
}