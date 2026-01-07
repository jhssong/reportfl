{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/optimization/SimpleVectorialValueChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleVectorialValueChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.VectorialConvergenceChecker"
      ],
      "begin_line": 34,
      "end_line": 92,
      "comment": " \n * Simple implementation of the {@link VectorialConvergenceChecker} interface using\n * only objective function values.\n * \u003cp\u003e\n * Convergence is considered to have been reached if either the relative\n * difference between the objective function values is smaller than a\n * threshold or if either the absolute difference between the objective\n * function values is smaller than another threshold for all vectors elements.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_THRESHOLD"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default relative threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_THRESHOLD"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default absolute threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Relative tolerance threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Absolute tolerance threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleVectorialValueChecker.SimpleVectorialValueChecker()",
      "begin_line": 53,
      "end_line": 56,
      "comment": " Build an instance with default threshold.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 60)",
        "(line 55,col 9)-(line 55,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleVectorialValueChecker.SimpleVectorialValueChecker(double, double)",
      "begin_line": 67,
      "end_line": 71,
      "comment": " Build an instance with a specified threshold.\n     * \u003cp\u003e\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     * \u003c/p\u003e\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 51)",
        "(line 70,col 9)-(line 70,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.SimpleVectorialValueChecker.converged(int, org.apache.commons.math.optimization.VectorialPointValuePair, org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 74,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 57)",
        "(line 78,col 9)-(line 78,col 56)",
        "(line 79,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 20)"
      ]
    }
  ]
}