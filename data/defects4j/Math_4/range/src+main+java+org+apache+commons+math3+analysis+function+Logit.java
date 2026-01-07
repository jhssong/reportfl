{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Logit.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Logit",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 39,
      "end_line": 213,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Logit\"\u003e\n *  Logit\u003c/a\u003e function.\n * It is the inverse of the {@link Sigmoid sigmoid} function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Higher bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Logit.Logit()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Usual logit function, where the lower bound is 0 and the higher\n     * bound is 1.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Logit.Logit(double, double)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Logit function.\n     *\n     * @param lo Lower bound of the function domain.\n     * @param hi Higher bound of the function domain.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 21)",
        "(line 62,col 9)-(line 62,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logit.value(double)",
      "begin_line": 66,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logit.derivative()",
      "begin_line": 74,
      "end_line": 77,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.ParametricUnivariateFunction"
      ],
      "begin_line": 87,
      "end_line": 149,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the logit function, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eLower bound\u003c/li\u003e\n     *  \u003cli\u003eHigher bound\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logit.Parametric.value(double, double...)",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n         * Computes the value of the logit at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values of lower bound and higher bounds.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 38)",
        "(line 102,col 13)-(line 102,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logit.Parametric.gradient(double, double...)",
      "begin_line": 118,
      "end_line": 127,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e (lower bound and higher bound).\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values for lower and higher bounds.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 38)",
        "(line 123,col 13)-(line 123,col 39)",
        "(line 124,col 13)-(line 124,col 39)",
        "(line 126,col 13)-(line 126,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logit.Parametric.validateParameters(double[])",
      "begin_line": 139,
      "end_line": 148,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values for lower and higher bounds.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 2.\n         ",
      "child_ranges": [
        "(line 142,col 13)-(line 144,col 13)",
        "(line 145,col 13)-(line 147,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logit.value(double, double, double)",
      "begin_line": 158,
      "end_line": 166,
      "comment": "\n     * @param x Value at which to compute the logit.\n     * @param lo Lower bound.\n     * @param hi Higher bound.\n     * @return the value of the logit function at {@code x}.\n     * @throws OutOfRangeException if {@code x \u003c lo} or {@code x \u003e hi}.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Logit.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 172,
      "end_line": 212,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     * @exception OutOfRangeException if parameter is outside of function domain\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 38)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 50)",
        "(line 181,col 9)-(line 181,col 49)",
        "(line 183,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 28)"
      ]
    }
  ]
}