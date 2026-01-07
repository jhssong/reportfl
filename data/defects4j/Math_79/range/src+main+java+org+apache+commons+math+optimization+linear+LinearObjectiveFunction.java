{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/linear/LinearObjectiveFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearObjectiveFunction",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 155,
      "comment": "\n * An objective function for a linear optimization problem.\n * \u003cp\u003e\n * A linear objective function has one the form:\n * \u003cpre\u003e\n * c\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + d\n * \u003c/pre\u003e\n * The c\u003csub\u003ei\u003c/sub\u003e and d are the coefficients of the equation,\n * the x\u003csub\u003ei\u003c/sub\u003e are the coordinates of the current point.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Coefficients of the constraint (c\u003csub\u003ei\u003c/sub\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "constantTerm"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Constant term of the linear equation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.LinearObjectiveFunction(double[], double)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * @param coefficients The coefficients for the linear equation being optimized\n     * @param constantTerm The constant term of the linear equation\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.LinearObjectiveFunction(org.apache.commons.math.linear.RealVector, double)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * @param coefficients The coefficients for the linear equation being optimized\n     * @param constantTerm The constant term of the linear equation\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 41)",
        "(line 67,col 9)-(line 67,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.getCoefficients()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Get the coefficients of the linear equation being optimized.\n     * @return coefficients of the linear equation being optimized\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.getConstantTerm()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Get the constant of the linear equation being optimized.\n     * @return constant of the linear equation being optimized\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.getValue(double[])",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Compute the value of the linear equation at the current point\n     * @param point point at which linear equation must be evaluated\n     * @return value of the linear equation at the current point\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.getValue(org.apache.commons.math.linear.RealVector)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Compute the value of the linear equation at the current point\n     * @param point point at which linear equation must be evaluated\n     * @return value of the linear equation at the current point\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.equals(java.lang.Object)",
      "begin_line": 105,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 7)-(line 110,col 7)",
        "(line 112,col 7)-(line 114,col 7)",
        "(line 116,col 7)-(line 124,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.hashCode()",
      "begin_line": 129,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 138,
      "end_line": 142,
      "comment": " Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 33)",
        "(line 141,col 9)-(line 141,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearObjectiveFunction.readObject(java.io.ObjectInputStream)",
      "begin_line": 149,
      "end_line": 153,
      "comment": " Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 32)",
        "(line 152,col 9)-(line 152,col 69)"
      ]
    }
  ]
}