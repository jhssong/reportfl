{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/linear/LinearObjectiveFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearObjectiveFunction",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 149,
      "comment": "\n * An objective function for a linear optimization problem.\n * \u003cp\u003e\n * A linear objective function has one the form:\n * \u003cpre\u003e\n * c\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + d\n * \u003c/pre\u003e\n * The c\u003csub\u003ei\u003c/sub\u003e and d are the coefficients of the equation,\n * the x\u003csub\u003ei\u003c/sub\u003e are the coordinates of the current point.\n * \u003c/p\u003e\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Coefficients of the constraint (c\u003csub\u003ei\u003c/sub\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "constantTerm"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Constant term of the linear equation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.LinearObjectiveFunction(double[], double)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * @param coefficients The coefficients for the linear equation being optimized\n     * @param constantTerm The constant term of the linear equation\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.LinearObjectiveFunction(org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * @param coefficients The coefficients for the linear equation being optimized\n     * @param constantTerm The constant term of the linear equation\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 41)",
        "(line 69,col 9)-(line 69,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.getCoefficients()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Get the coefficients of the linear equation being optimized.\n     * @return coefficients of the linear equation being optimized\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.getConstantTerm()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Get the constant of the linear equation being optimized.\n     * @return constant of the linear equation being optimized\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.getValue(double[])",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Compute the value of the linear equation at the current point\n     * @param point point at which linear equation must be evaluated\n     * @return value of the linear equation at the current point\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.getValue(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Compute the value of the linear equation at the current point\n     * @param point point at which linear equation must be evaluated\n     * @return value of the linear equation at the current point\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.equals(java.lang.Object)",
      "begin_line": 106,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 109,col 7)-(line 111,col 7)",
        "(line 113,col 7)-(line 116,col 7)",
        "(line 118,col 7)-(line 118,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.hashCode()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n     * Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 33)",
        "(line 134,col 9)-(line 134,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction.readObject(java.io.ObjectInputStream)",
      "begin_line": 143,
      "end_line": 147,
      "comment": "\n     * Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 32)",
        "(line 146,col 9)-(line 146,col 69)"
      ]
    }
  ]
}