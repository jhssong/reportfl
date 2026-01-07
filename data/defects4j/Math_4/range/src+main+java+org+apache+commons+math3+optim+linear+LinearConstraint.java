{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/linear/LinearConstraint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearConstraint",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 229,
      "comment": "\n * A linear constraint for a linear optimization problem.\n * \u003cp\u003e\n * A linear constraint has one of the forms:\n * \u003cul\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * The c\u003csub\u003ei\u003c/sub\u003e, l\u003csub\u003ei\u003c/sub\u003e or r\u003csub\u003ei\u003c/sub\u003e are the coefficients of the constraints, the x\u003csub\u003ei\u003c/sub\u003e\n * are the coordinates of the current point and v is the value of the constraint.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Coefficients of the constraint (left hand side). "
    },
    {
      "type": "field",
      "varNames": [
        "relationship"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Relationship between left and right hand sides (\u003d, \u0026lt;\u003d, \u003e\u003d). "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Value of the constraint (right hand side). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.LinearConstraint(double[], org.apache.commons.math3.optim.linear.Relationship, double)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Build a constraint involving a single linear equation.\n     * \u003cp\u003e\n     * A linear constraint with a single linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param coefficients The coefficients of the constraint (left hand side)\n     * @param relationship The type of (in)equality used in the constraint\n     * @param value The value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.LinearConstraint(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.optim.linear.Relationship, double)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n     * Build a constraint involving a single linear equation.\n     * \u003cp\u003e\n     * A linear constraint with a single linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param coefficients The coefficients of the constraint (left hand side)\n     * @param relationship The type of (in)equality used in the constraint\n     * @param value The value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 97,col 41)",
        "(line 98,col 9)-(line 98,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.LinearConstraint(double[], double, org.apache.commons.math3.optim.linear.Relationship, double[], double)",
      "begin_line": 120,
      "end_line": 130,
      "comment": "\n     * Build a constraint involving two linear equations.\n     * \u003cp\u003e\n     * A linear constraint with two linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param lhsCoefficients The coefficients of the linear expression on the left hand side of the constraint\n     * @param lhsConstant The constant term of the linear expression on the left hand side of the constraint\n     * @param relationship The type of (in)equality used in the constraint\n     * @param rhsCoefficients The coefficients of the linear expression on the right hand side of the constraint\n     * @param rhsConstant The constant term of the linear expression on the right hand side of the constraint\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 60)",
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.LinearConstraint(org.apache.commons.math3.linear.RealVector, double, org.apache.commons.math3.optim.linear.Relationship, org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 151,
      "end_line": 157,
      "comment": "\n     * Build a constraint involving two linear equations.\n     * \u003cp\u003e\n     * A linear constraint with two linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param lhsCoefficients The coefficients of the linear expression on the left hand side of the constraint\n     * @param lhsConstant The constant term of the linear expression on the left hand side of the constraint\n     * @param relationship The type of (in)equality used in the constraint\n     * @param rhsCoefficients The coefficients of the linear expression on the right hand side of the constraint\n     * @param rhsConstant The constant term of the linear expression on the right hand side of the constraint\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 70)",
        "(line 155,col 9)-(line 155,col 41)",
        "(line 156,col 9)-(line 156,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.getCoefficients()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Gets the coefficients of the constraint (left hand side).\n     *\n     * @return the coefficients of the constraint (left hand side).\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.getRelationship()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Gets the relationship between left and right hand sides.\n     *\n     * @return the relationship between left and right hand sides.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.getValue()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Gets the value of the constraint (right hand side).\n     *\n     * @return the value of the constraint (right hand side).\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.equals(java.lang.Object)",
      "begin_line": 186,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.hashCode()",
      "begin_line": 200,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\n     * Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 33)",
        "(line 215,col 9)-(line 215,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearConstraint.readObject(java.io.ObjectInputStream)",
      "begin_line": 224,
      "end_line": 228,
      "comment": "\n     * Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 32)",
        "(line 227,col 9)-(line 227,col 69)"
      ]
    }
  ]
}