{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/analysis/function/Sinc.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Sinc",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 34,
      "end_line": 76,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Sinc_function\"\u003eSinc\u003c/a\u003e function,\n * defined by\n * \u003cpre\u003e\u003ccode\u003e\n *   sinc(x) \u003d 1            if x \u003d 0,\n *             sin(x) / x   otherwise.\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " For normalized sinc function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Sinc.Sinc()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * The sinc function, {@code sin(x) / x}.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Sinc.Sinc(boolean)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Instantiates the sinc function.\n     *\n     * @param normalized If {@code true}, the function is\n     * \u003ccode\u003e sin(\u0026pi;x) / \u0026pi;x\u003c/code\u003e, otherwise {@code sin(x) / x}.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sinc.value(double)",
      "begin_line": 56,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 57,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sinc.sinc(double)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * @param x Argument.\n     * @return {@code sin(x) / x}.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 64)"
      ]
    }
  ]
}