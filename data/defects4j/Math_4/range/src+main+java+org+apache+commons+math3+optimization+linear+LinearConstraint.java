{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/linear/LinearConstraint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearConstraint",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 235,
      "comment": "\n * A linear constraint for a linear optimization problem.\n * \u003cp\u003e\n * A linear constraint has one of the forms:\n * \u003cul\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * The c\u003csub\u003ei\u003c/sub\u003e, l\u003csub\u003ei\u003c/sub\u003e or r\u003csub\u003ei\u003c/sub\u003e are the coefficients of the constraints, the x\u003csub\u003ei\u003c/sub\u003e\n * are the coordinates of the current point and v is the value of the constraint.\n * \u003c/p\u003e\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Coefficients of the constraint (left hand side). "
    },
    {
      "type": "field",
      "varNames": [
        "relationship"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Relationship between left and right hand sides (\u003d, \u0026lt;\u003d, \u003e\u003d). "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Value of the constraint (right hand side). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.LinearConstraint(double[], org.apache.commons.math3.optimization.linear.Relationship, double)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Build a constraint involving a single linear equation.\n     * \u003cp\u003e\n     * A linear constraint with a single linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param coefficients The coefficients of the constraint (left hand side)\n     * @param relationship The type of (in)equality used in the constraint\n     * @param value The value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.LinearConstraint(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.optimization.linear.Relationship, double)",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * Build a constraint involving a single linear equation.\n     * \u003cp\u003e\n     * A linear constraint with a single linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param coefficients The coefficients of the constraint (left hand side)\n     * @param relationship The type of (in)equality used in the constraint\n     * @param value The value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 41)",
        "(line 103,col 9)-(line 103,col 41)",
        "(line 104,col 9)-(line 104,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.LinearConstraint(double[], double, org.apache.commons.math3.optimization.linear.Relationship, double[], double)",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n     * Build a constraint involving two linear equations.\n     * \u003cp\u003e\n     * A linear constraint with two linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param lhsCoefficients The coefficients of the linear expression on the left hand side of the constraint\n     * @param lhsConstant The constant term of the linear expression on the left hand side of the constraint\n     * @param relationship The type of (in)equality used in the constraint\n     * @param rhsCoefficients The coefficients of the linear expression on the right hand side of the constraint\n     * @param rhsConstant The constant term of the linear expression on the right hand side of the constraint\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 58)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 60)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 135,col 9)-(line 135,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.LinearConstraint(org.apache.commons.math3.linear.RealVector, double, org.apache.commons.math3.optimization.linear.Relationship, org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\n     * Build a constraint involving two linear equations.\n     * \u003cp\u003e\n     * A linear constraint with two linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param lhsCoefficients The coefficients of the linear expression on the left hand side of the constraint\n     * @param lhsConstant The constant term of the linear expression on the left hand side of the constraint\n     * @param relationship The type of (in)equality used in the constraint\n     * @param rhsCoefficients The coefficients of the linear expression on the right hand side of the constraint\n     * @param rhsConstant The constant term of the linear expression on the right hand side of the constraint\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 70)",
        "(line 161,col 9)-(line 161,col 41)",
        "(line 162,col 9)-(line 162,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.getCoefficients()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Get the coefficients of the constraint (left hand side).\n     * @return coefficients of the constraint (left hand side)\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.getRelationship()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Get the relationship between left and right hand sides.\n     * @return relationship between left and right hand sides\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.getValue()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Get the value of the constraint (right hand side).\n     * @return value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.equals(java.lang.Object)",
      "begin_line": 189,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 192,col 7)-(line 194,col 7)",
        "(line 196,col 7)-(line 201,col 7)",
        "(line 202,col 7)-(line 202,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.hashCode()",
      "begin_line": 205,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 217,
      "end_line": 221,
      "comment": "\n     * Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 33)",
        "(line 220,col 9)-(line 220,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.LinearConstraint.readObject(java.io.ObjectInputStream)",
      "begin_line": 229,
      "end_line": 233,
      "comment": "\n     * Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 32)",
        "(line 232,col 9)-(line 232,col 69)"
      ]
    }
  ]
}