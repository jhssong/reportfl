{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 589,
      "comment": "\n * A tableau for use in the Simplex method.\n *\n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS\n * ---------------------------------------------------\n *  -1    0    0     0     0     0     0     1     0   \u0026lt;\u003d phase 1 objective\n *   0    1   -15   -10    0     0     0     0     0   \u0026lt;\u003d phase 2 objective\n *   0    0    1     0     0     1     0     0     2   \u0026lt;\u003d constraint 1\n *   0    0    0     1     0     0     1     0     3   \u0026lt;\u003d constraint 2\n *   0    0    1     1     0     0     0     1     4   \u0026lt;\u003d constraint 3\n * \u003c/pre\u003e\n * W: Phase 1 objective function\u003c/br\u003e\n * Z: Phase 2 objective function\u003c/br\u003e\n * x1 \u0026amp; x2: Decision variables\u003c/br\u003e\n * x-: Extra decision variable to allow for negative values\u003c/br\u003e\n * s1 \u0026amp; s2: Slack/Surplus variables\u003c/br\u003e\n * a1: Artificial variable\u003c/br\u003e\n * RHS: Right hand side\u003c/br\u003e\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_VAR_COLUMN_LABEL"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Column label for negative vars. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "columnLabels"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The variables each column represents "
    },
    {
      "type": "field",
      "varNames": [
        "tableau"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Simple tableau. "
    },
    {
      "type": "field",
      "varNames": [
        "numDecisionVariables"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Number of decision variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numSlackVariables"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Number of slack variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numArtificialVariables"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Number of artificial variables. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean, double)",
      "begin_line": 107,
      "end_line": 123,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 40)",
        "(line 112,col 9)-(line 112,col 72)",
        "(line 113,col 9)-(line 113,col 60)",
        "(line 114,col 9)-(line 114,col 46)",
        "(line 115,col 9)-(line 116,col 70)",
        "(line 117,col 9)-(line 118,col 80)",
        "(line 119,col 9)-(line 120,col 80)",
        "(line 121,col 9)-(line 121,col 68)",
        "(line 122,col 9)-(line 122,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.initializeColumnLabels()",
      "begin_line": 128,
      "end_line": 146,
      "comment": "\n     * Initialize the labels for the columns.\n     ",
      "child_ranges": [
        "(line 129,col 7)-(line 131,col 7)",
        "(line 132,col 7)-(line 132,col 28)",
        "(line 133,col 7)-(line 135,col 7)",
        "(line 136,col 7)-(line 138,col 7)",
        "(line 139,col 7)-(line 141,col 7)",
        "(line 142,col 7)-(line 144,col 7)",
        "(line 145,col 7)-(line 145,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 153,
      "end_line": 214,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 157,col 64)",
        "(line 158,col 9)-(line 158,col 69)",
        "(line 159,col 9)-(line 159,col 78)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 63)",
        "(line 166,col 9)-(line 166,col 59)",
        "(line 167,col 9)-(line 168,col 81)",
        "(line 169,col 9)-(line 169,col 80)",
        "(line 170,col 9)-(line 171,col 71)",
        "(line 173,col 9)-(line 176,col 9)",
        "(line 179,col 9)-(line 179,col 25)",
        "(line 180,col 9)-(line 180,col 30)",
        "(line 181,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.normalizeConstraints(java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e)",
      "begin_line": 221,
      "end_line": 227,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @param originalConstraints original (not normalized) constraints\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 78)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.normalize(org.apache.commons.math.optimization.linear.LinearConstraint)",
      "begin_line": 234,
      "end_line": 242,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 241,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)",
      "begin_line": 257,
      "end_line": 265,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 22)",
        "(line 259,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)",
      "begin_line": 272,
      "end_line": 278,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 23)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 285,
      "end_line": 295,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 27)",
        "(line 287,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective()",
      "begin_line": 301,
      "end_line": 340,
      "comment": "\n     * Removes the phase 1 objective function, positive cost non-artificial variables,\n     * and the non-basic artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 306,col 63)",
        "(line 307,col 9)-(line 307,col 29)",
        "(line 310,col 9)-(line 314,col 9)",
        "(line 317,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 91)",
        "(line 325,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 338,col 56)",
        "(line 339,col 9)-(line 339,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(double[], double[])",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal()",
      "begin_line": 354,
      "end_line": 361,
      "comment": "\n     * Returns whether the problem is at an optimal state.\n     * @return whether the model has been solved\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSolution()",
      "begin_line": 368,
      "end_line": 394,
      "comment": "\n     * Get the current solution.\n     *\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 369,col 7)-(line 369,col 78)",
        "(line 370,col 7)-(line 370,col 98)",
        "(line 371,col 7)-(line 371,col 108)",
        "(line 373,col 7)-(line 373,col 54)",
        "(line 374,col 7)-(line 374,col 76)",
        "(line 375,col 7)-(line 392,col 7)",
        "(line 393,col 7)-(line 393,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 405,
      "end_line": 409,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 421,
      "end_line": 425,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 424,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getWidth()",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getHeight()",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 448,
      "end_line": 450,
      "comment": " Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 457,
      "end_line": 460,
      "comment": " Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSlackVariableOffset()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * Get the offset of the first slack variable.\n     * @return offset of the first slack variable\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getArtificialVariableOffset()",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Get the offset of the first artificial variable.\n     * @return offset of the first artificial variable\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Get the offset of the right hand side.\n     * @return offset of the right hand side\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumDecisionVariables()",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1\n     * extra decision variable to represent the absolute value of the most\n     * negative variable.\n     * \u003c/p\u003e\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getData()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.equals(java.lang.Object)",
      "begin_line": 534,
      "end_line": 553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 7)-(line 539,col 7)",
        "(line 541,col 7)-(line 551,col 7)",
        "(line 552,col 7)-(line 552,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.hashCode()",
      "begin_line": 556,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 558,col 9)-(line 565,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 572,
      "end_line": 576,
      "comment": " Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 33)",
        "(line 575,col 9)-(line 575,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.readObject(java.io.ObjectInputStream)",
      "begin_line": 583,
      "end_line": 587,
      "comment": " Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 32)",
        "(line 586,col 9)-(line 586,col 64)"
      ]
    }
  ]
}