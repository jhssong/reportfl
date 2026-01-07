{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/optimization/linear/LinearObjectiveFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearObjectiveFunction",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 100,
      "comment": "\n * An objective function for a linear optimization problem.\n * \u003cp\u003e\n * A linear objective function has one the form:\n * \u003cpre\u003e\n * c\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + d\n * \u003c/pre\u003e\n * The c\u003csub\u003ei\u003c/sub\u003e and d are the coefficients of the equation,\n * the x\u003csub\u003ei\u003c/sub\u003e are the coordinates of the current point.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
        "coefficients"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Coefficients of the constraint (c\u003csub\u003ei\u003c/sub\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "constantTerm"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Constant term of the linear equation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.LinearObjectiveFunction(double[], double)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * @param coefficients The coefficients for the linear equation being optimized\n     * @param constantTerm The constant term of the linear equation\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.LinearObjectiveFunction(org.apache.commons.math.linear.RealVector, double)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * @param coefficients The coefficients for the linear equation being optimized\n     * @param constantTerm The constant term of the linear equation\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 41)",
        "(line 63,col 9)-(line 63,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.getCoefficients()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Get the coefficients of the linear equation being optimized.\n     * @return coefficients of the linear equation being optimized\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.getConstantTerm()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Get the constant of the linear equation being optimized.\n     * @return constant of the linear equation being optimized\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.getValue(double[])",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Compute the value of the linear equation at the current point\n     * @param point point at which linear equation must be evaluated\n     * @return value of the linear equation at the current point\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.getValue(org.apache.commons.math.linear.RealVector)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Compute the value of the linear equation at the current point\n     * @param point point at which linear equation must be evaluated\n     * @return value of the linear equation at the current point\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 61)"
      ]
    }
  ]
}