{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/optimization/SimpleScalarValueChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleScalarValueChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.RealConvergenceChecker",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 88,
      "comment": " \n * Simple implementation of the {@link RealConvergenceChecker} interface using\n * only objective function values.\n * \u003cp\u003e\n * Convergence is considered to have been reached if either the relative\n * difference between the objective function values is smaller than a\n * threshold or if either the absolute difference between the objective\n * function values is smaller than another threshold.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_THRESHOLD"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Default relative threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_THRESHOLD"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Default absolute threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Relative tolerance threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Absolute tolerance threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleScalarValueChecker.SimpleScalarValueChecker()",
      "begin_line": 57,
      "end_line": 60,
      "comment": " Build an instance with default threshold.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 60)",
        "(line 59,col 9)-(line 59,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleScalarValueChecker.SimpleScalarValueChecker(double, double)",
      "begin_line": 71,
      "end_line": 75,
      "comment": " Build an instance with a specified threshold.\n     * \u003cp\u003e\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     * \u003c/p\u003e\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 51)",
        "(line 74,col 9)-(line 74,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.SimpleScalarValueChecker.converged(int, org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 78,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 54)",
        "(line 82,col 9)-(line 82,col 53)",
        "(line 83,col 9)-(line 83,col 50)",
        "(line 84,col 9)-(line 84,col 69)",
        "(line 85,col 9)-(line 85,col 95)"
      ]
    }
  ]
}