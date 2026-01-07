{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/SimpleVectorialValueChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleVectorialValueChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.VectorialConvergenceChecker"
      ],
      "begin_line": 34,
      "end_line": 89,
      "comment": "\n * Simple implementation of the {@link VectorialConvergenceChecker} interface using\n * only objective function values.\n * \u003cp\u003e\n * Convergence is considered to have been reached if either the relative\n * difference between the objective function values is smaller than a\n * threshold or if either the absolute difference between the objective\n * function values is smaller than another threshold for all vectors elements.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_THRESHOLD"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Default relative threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_THRESHOLD"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default absolute threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Relative tolerance threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Absolute tolerance threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleVectorialValueChecker.SimpleVectorialValueChecker()",
      "begin_line": 50,
      "end_line": 53,
      "comment": " Build an instance with default threshold.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 60)",
        "(line 52,col 9)-(line 52,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleVectorialValueChecker.SimpleVectorialValueChecker(double, double)",
      "begin_line": 64,
      "end_line": 68,
      "comment": " Build an instance with a specified threshold.\n     * \u003cp\u003e\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     * \u003c/p\u003e\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 51)",
        "(line 67,col 9)-(line 67,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.SimpleVectorialValueChecker.converged(int, org.apache.commons.math.optimization.VectorialPointValuePair, org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 71,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 57)",
        "(line 75,col 9)-(line 75,col 56)",
        "(line 76,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 20)"
      ]
    }
  ]
}