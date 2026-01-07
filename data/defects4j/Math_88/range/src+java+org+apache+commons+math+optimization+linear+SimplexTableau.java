{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 550,
      "comment": "\n * A tableau for use in the Simplex method.\n * \n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS\n * ---------------------------------------------------\n *  -1    0    0     0     0     0     0     1     0   \u0026lt;\u003d phase 1 objective\n *   0    1   -15   -10    0     0     0     0     0   \u0026lt;\u003d phase 2 objective\n *   0    0    1     0     0     1     0     0     2   \u0026lt;\u003d constraint 1\n *   0    0    0     1     0     0     1     0     3   \u0026lt;\u003d constraint 2\n *   0    0    1     1     0     0     0     1     4   \u0026lt;\u003d constraint 3\n * \u003c/pre\u003e\n * W: Phase 1 objective function\u003c/br\u003e\n * Z: Phase 2 objective function\u003c/br\u003e\n * x1 \u0026amp; x2: Decision variables\u003c/br\u003e\n * x-: Extra decision variable to allow for negative values\u003c/br\u003e\n * s1 \u0026amp; s2: Slack/Surplus variables\u003c/br\u003e\n * a1: Artificial variable\u003c/br\u003e\n * RHS: Right hand side\u003c/br\u003e\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "tableau"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Simple tableau. "
    },
    {
      "type": "field",
      "varNames": [
        "numDecisionVariables"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Number of decision variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numSlackVariables"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Number of slack variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numArtificialVariables"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Number of artificial variables. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean, double)",
      "begin_line": 101,
      "end_line": 116,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 40)",
        "(line 106,col 9)-(line 106,col 50)",
        "(line 107,col 9)-(line 107,col 60)",
        "(line 108,col 9)-(line 108,col 46)",
        "(line 109,col 9)-(line 109,col 90)",
        "(line 110,col 9)-(line 111,col 80)",
        "(line 112,col 9)-(line 113,col 80)",
        "(line 114,col 9)-(line 114,col 88)",
        "(line 115,col 9)-(line 115,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 123,
      "end_line": 184,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 72)",
        "(line 127,col 9)-(line 128,col 64)",
        "(line 129,col 9)-(line 129,col 69)",
        "(line 130,col 9)-(line 130,col 54)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 63)",
        "(line 137,col 9)-(line 137,col 51)",
        "(line 138,col 9)-(line 139,col 81)",
        "(line 140,col 13)-(line 140,col 99)",
        "(line 141,col 13)-(line 142,col 74)",
        "(line 144,col 17)-(line 147,col 17)",
        "(line 150,col 17)-(line 150,col 33)",
        "(line 151,col 17)-(line 151,col 38)",
        "(line 152,col 17)-(line 181,col 17)",
        "(line 183,col 17)-(line 183,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumVariables()",
      "begin_line": 189,
      "end_line": 191,
      "comment": " Get the number of variables.\n     * @return number of variables\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints()",
      "begin_line": 197,
      "end_line": 203,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 78)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.normalize(org.apache.commons.math.optimization.linear.LinearConstraint)",
      "begin_line": 210,
      "end_line": 218,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 217,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)",
      "begin_line": 233,
      "end_line": 241,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 22)",
        "(line 235,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.initialize()",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n     * Puts the tableau in proper form by zeroing out the artificial variables\n     * in the objective function via elementary row operations.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)",
      "begin_line": 259,
      "end_line": 265,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 23)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 272,
      "end_line": 284,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 27)",
        "(line 274,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables()",
      "begin_line": 289,
      "end_line": 304,
      "comment": "\n     * Removes the phase 1 objective function and artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 60)",
        "(line 294,col 9)-(line 294,col 37)",
        "(line 295,col 9)-(line 295,col 54)",
        "(line 296,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 50)",
        "(line 303,col 9)-(line 303,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(double[], double[], int)",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     * @param destPos the destination position\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSolution()",
      "begin_line": 324,
      "end_line": 345,
      "comment": "\n     * Get the current solution.\n     * \u003cp\u003e\n     * {@link #solve} should be called first for this to be the optimal solution.\n     * \u003c/p\u003e\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 78)",
        "(line 326,col 9)-(line 327,col 88)",
        "(line 328,col 9)-(line 328,col 88)",
        "(line 329,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 356,
      "end_line": 360,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 372,
      "end_line": 378,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getWidth()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getHeight()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 401,
      "end_line": 403,
      "comment": " Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 410,
      "end_line": 413,
      "comment": " Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSlackVariableOffset()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * Get the offset of the first slack variable.\n     * @return offset of the first slack variable\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getArtificialVariableOffset()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Get the offset of the first artificial variable.\n     * @return offset of the first artificial variable\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset()",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * Get the offset of the right hand side.\n     * @return offset of the right hand side\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumDecisionVariables()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1\n     * extra decision variable to represent the absolute value of the most\n     * negative variable.\n     * \u003c/p\u003e\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getData()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.equals(java.lang.Object)",
      "begin_line": 487,
      "end_line": 515,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 490,col 7)-(line 492,col 7)",
        "(line 494,col 7)-(line 496,col 7)",
        "(line 498,col 7)-(line 513,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.hashCode()",
      "begin_line": 518,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 520,col 9)-(line 527,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 534,
      "end_line": 538,
      "comment": " Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 33)",
        "(line 537,col 9)-(line 537,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.readObject(java.io.ObjectInputStream)",
      "begin_line": 545,
      "end_line": 549,
      "comment": " Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 32)",
        "(line 548,col 9)-(line 548,col 64)"
      ]
    }
  ]
}