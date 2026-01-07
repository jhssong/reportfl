{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/linear/LinearConstraint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearConstraint",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 242,
      "comment": "\n * A linear constraint for a linear optimization problem.\n * \u003cp\u003e\n * A linear constraint has one of the forms:\n * \u003cul\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * The c\u003csub\u003ei\u003c/sub\u003e, l\u003csub\u003ei\u003c/sub\u003e or r\u003csub\u003ei\u003c/sub\u003e are the coefficients of the constraints, the x\u003csub\u003ei\u003c/sub\u003e\n * are the coordinates of the current point and v is the value of the constraint.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Coefficients of the constraint (left hand side). "
    },
    {
      "type": "field",
      "varNames": [
        "relationship"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Relationship between left and right hand sides (\u003d, \u0026lt;\u003d, \u003e\u003d). "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Value of the constraint (right hand side). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.LinearConstraint(double[], org.apache.commons.math.optimization.linear.Relationship, double)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Build a constraint involving a single linear equation.\n     * \u003cp\u003e\n     * A linear constraint with a single linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param coefficients The coefficients of the constraint (left hand side)\n     * @param relationship The type of (in)equality used in the constraint\n     * @param value The value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.LinearConstraint(org.apache.commons.math.linear.RealVector, org.apache.commons.math.optimization.linear.Relationship, double)",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n     * Build a constraint involving a single linear equation.\n     * \u003cp\u003e\n     * A linear constraint with a single linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param coefficients The coefficients of the constraint (left hand side)\n     * @param relationship The type of (in)equality used in the constraint\n     * @param value The value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 41)",
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 102,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.LinearConstraint(double[], double, org.apache.commons.math.optimization.linear.Relationship, double[], double)",
      "begin_line": 124,
      "end_line": 134,
      "comment": "\n     * Build a constraint involving two linear equations.\n     * \u003cp\u003e\n     * A linear constraint with two linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param lhsCoefficients The coefficients of the linear expression on the left hand side of the constraint\n     * @param lhsConstant The constant term of the linear expression on the left hand side of the constraint\n     * @param relationship The type of (in)equality used in the constraint\n     * @param rhsCoefficients The coefficients of the linear expression on the right hand side of the constraint\n     * @param rhsConstant The constant term of the linear expression on the right hand side of the constraint\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 58)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 60)",
        "(line 132,col 9)-(line 132,col 41)",
        "(line 133,col 9)-(line 133,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.LinearConstraint(org.apache.commons.math.linear.RealVector, double, org.apache.commons.math.optimization.linear.Relationship, org.apache.commons.math.linear.RealVector, double)",
      "begin_line": 155,
      "end_line": 161,
      "comment": "\n     * Build a constraint involving two linear equations.\n     * \u003cp\u003e\n     * A linear constraint with two linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param lhsCoefficients The coefficients of the linear expression on the left hand side of the constraint\n     * @param lhsConstant The constant term of the linear expression on the left hand side of the constraint\n     * @param relationship The type of (in)equality used in the constraint\n     * @param rhsCoefficients The coefficients of the linear expression on the right hand side of the constraint\n     * @param rhsConstant The constant term of the linear expression on the right hand side of the constraint\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 70)",
        "(line 159,col 9)-(line 159,col 41)",
        "(line 160,col 9)-(line 160,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.getCoefficients()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Get the coefficients of the constraint (left hand side).\n     * @return coefficients of the constraint (left hand side)\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.getRelationship()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Get the relationship between left and right hand sides.\n     * @return relationship between left and right hand sides\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.getValue()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Get the value of the constraint (right hand side).\n     * @return value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.equals(java.lang.Object)",
      "begin_line": 188,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 191,col 7)-(line 193,col 7)",
        "(line 195,col 7)-(line 197,col 7)",
        "(line 199,col 7)-(line 209,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.hashCode()",
      "begin_line": 214,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 225,
      "end_line": 229,
      "comment": " Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 33)",
        "(line 228,col 9)-(line 228,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.readObject(java.io.ObjectInputStream)",
      "begin_line": 236,
      "end_line": 240,
      "comment": " Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 32)",
        "(line 239,col 9)-(line 239,col 69)"
      ]
    }
  ]
}