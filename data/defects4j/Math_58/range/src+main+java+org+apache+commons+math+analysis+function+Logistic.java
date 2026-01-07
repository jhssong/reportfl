{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/analysis/function/Logistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Logistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 31,
      "end_line": 80,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Generalised_logistic_function\"\u003e\n *  Generalised logistic\u003c/a\u003e function.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Lower asymptote. "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Upper asymptote. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Growth rate. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Parameter that affects near which asymptote maximum growth occurs. "
    },
    {
      "type": "field",
      "varNames": [
        "q"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Parameter that affects the position of the curve along the ordinate axis. "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Abscissa of maximum growth. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Logistic.Logistic(double, double, double, double, double, double)",
      "begin_line": 58,
      "end_line": 74,
      "comment": "\n     * @param k If {@code b \u003e 0}, value of the function for x going towards +\u0026infin;.\n     * If {@code b \u003c 0}, value of the function for x going towards -\u0026infin;.\n     * @param m Abscissa of maximum growth.\n     * @param b Growth rate.\n     * @param q Parameter that affects the position of the curve along the\n     * ordinate axis.\n     * @param a If {@code b \u003e 0}, value of the function for x going towards -\u0026infin;.\n     * If {@code b \u003c 0}, value of the function for x going towards +\u0026infin;.\n     * @param n Parameter that affects near which asymptote the maximum\n     * growth occurs.\n     * @throws NotStrictlyPositiveException if {@code n \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)",
        "(line 68,col 9)-(line 68,col 19)",
        "(line 69,col 9)-(line 69,col 19)",
        "(line 70,col 9)-(line 70,col 19)",
        "(line 71,col 9)-(line 71,col 19)",
        "(line 72,col 9)-(line 72,col 19)",
        "(line 73,col 9)-(line 73,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Logistic.value(double)",
      "begin_line": 77,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 84)"
      ]
    }
  ]
}