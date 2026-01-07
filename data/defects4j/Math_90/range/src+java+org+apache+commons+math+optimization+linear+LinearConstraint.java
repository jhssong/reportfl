{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/optimization/linear/LinearConstraint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearConstraint",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 183,
      "comment": "\n * A linear constraint for a linear optimization problem.\n * \u003cp\u003e\n * A linear constraint has one of the forms:\n * \u003cul\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * The c\u003csub\u003ei\u003c/sub\u003e, l\u003csub\u003ei\u003c/sub\u003e or r\u003csub\u003ei\u003c/sub\u003e are the coefficients of the constraints, the x\u003csub\u003ei\u003c/sub\u003e\n * are the coordinates of the current point and v is the value of the constraint.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
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
      "begin_line": 56,
      "end_line": 56,
      "comment": " Relationship between left and right hand sides (\u003d, \u0026lt;\u003d, \u003e\u003d). "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Value of the constraint (right hand side). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.LinearConstraint(double[], org.apache.commons.math.optimization.linear.Relationship, double)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Build a constraint involving a single linear equation.\n     * \u003cp\u003e\n     * A linear constraint with a single linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n     *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param coefficients The coefficients of the constraint (left hand side)\n     * @param relationship The type of (in)equality used in the constraint\n     * @param value The value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.LinearConstraint(org.apache.commons.math.linear.RealVector, org.apache.commons.math.optimization.linear.Relationship, double)",
      "begin_line": 94,
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
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.LinearConstraint(double[], double, org.apache.commons.math.optimization.linear.Relationship, double[], double)",
      "begin_line": 120,
      "end_line": 130,
      "comment": "\n     * Build a constraint involving two linear equations.\n     * \u003cp\u003e\n     * A linear constraint with two linear equation has one of the forms:\n     * \u003cul\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n     *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param lhsCoefficients The coefficients of the linear expression on the left hand side of the constraint\n     * @param lhsConstant The constant term of the linear expression on the left hand side of the constraint\n     * @param relationship The type of (in)equality used in the constraint\n     * @param rhsCoefficients The coefficients of the linear expression on the right hand side of the constraint\n     * @param rhsConstant The constant term of the linear expression on the right hand side of the constraint\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 59)",
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.LinearConstraint(org.apache.commons.math.linear.RealVector, double, org.apache.commons.math.optimization.linear.Relationship, org.apache.commons.math.linear.RealVector, double)",
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
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.getCoefficients()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Get the coefficients of the constraint (left hand side).\n     * @return coefficients of the constraint (left hand side)\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.getRelationship()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Get the relationship between left and right hand sides.\n     * @return relationship between left and right hand sides\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearConstraint.getValue()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Get the value of the constraint (right hand side).\n     * @return value of the constraint (right hand side)\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 21)"
      ]
    }
  ]
}