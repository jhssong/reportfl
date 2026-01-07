{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/linear/LinearObjectiveFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearObjectiveFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction",
        "org.apache.commons.math3.optim.OptimizationData",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 149,
      "comment": "\n * An objective function for a linear optimization problem.\n * \u003cp\u003e\n * A linear objective function has one the form:\n * \u003cpre\u003e\n * c\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + d\n * \u003c/pre\u003e\n * The c\u003csub\u003ei\u003c/sub\u003e and d are the coefficients of the equation,\n * the x\u003csub\u003ei\u003c/sub\u003e are the coordinates of the current point.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Coefficients of the linear equation (c\u003csub\u003ei\u003c/sub\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "constantTerm"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Constant term of the linear equation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.LinearObjectiveFunction(double[], double)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * @param coefficients Coefficients for the linear equation being optimized.\n     * @param constantTerm Constant term of the linear equation.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.LinearObjectiveFunction(org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * @param coefficients Coefficients for the linear equation being optimized.\n     * @param constantTerm Constant term of the linear equation.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 41)",
        "(line 68,col 9)-(line 68,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.getCoefficients()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Gets the coefficients of the linear equation being optimized.\n     *\n     * @return coefficients of the linear equation being optimized.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.getConstantTerm()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Gets the constant of the linear equation being optimized.\n     *\n     * @return constant of the linear equation being optimized.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.value(double[])",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Computes the value of the linear equation at the current point.\n     *\n     * @param point Point at which linear equation must be evaluated.\n     * @return the value of the linear equation at the current point.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.value(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Computes the value of the linear equation at the current point.\n     *\n     * @param point Point at which linear equation must be evaluated.\n     * @return the value of the linear equation at the current point.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.equals(java.lang.Object)",
      "begin_line": 109,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.hashCode()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\n     * Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 33)",
        "(line 135,col 9)-(line 135,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearObjectiveFunction.readObject(java.io.ObjectInputStream)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "\n     * Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 32)",
        "(line 147,col 9)-(line 147,col 69)"
      ]
    }
  ]
}