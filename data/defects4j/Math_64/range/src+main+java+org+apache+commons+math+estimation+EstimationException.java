{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/estimation/EstimationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EstimationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 33,
      "end_line": 61,
      "comment": "\n * This class represents exceptions thrown by the estimation solvers.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated as of 2.0, everything in package org.apache.commons.math.estimation has\n * been deprecated and replaced by package org.apache.commons.math.optimization.general\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimationException.EstimationException(java.lang.String, java.lang.Object...)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimationException.EstimationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 32)"
      ]
    }
  ]
}