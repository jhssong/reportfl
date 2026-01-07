{
  "filepath": "/tmp/Math-34b/src/test/java/org/apache/commons/math3/linear/UnmodifiableRealVectorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableRealVectorAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 451,
      "comment": "\n * This is an abstract test of the {@link\n * RealVector#unmodifiableRealVector(RealVector) unmodifiable vector}\n * implementation. These unmodifiable vectors decorate a (modifiable)\n * {@link RealVector}; therefore, a new implementation of this abstract\n * test should be considered for each implementation of\n * {@link RealVector}.\n *\n * @version $Id$\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIM"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The dimension of the randomly generated vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "EPS"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Absolute tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "EXCLUDE"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The list of methods which are excluded from the general test\n     * {@link #testAllButExcluded()}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANDOM"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The random number generator (always initialized with the same seed. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(double, double)",
      "begin_line": 81,
      "end_line": 91,
      "comment": "\n     * Returns {@code true} if the specified {@code double} are equal (within a\n     * given tolerance).\n     *\n     * @param x First {@code double}.\n     * @param y Second {@code double}.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(double[], double[])",
      "begin_line": 101,
      "end_line": 112,
      "comment": "\n     * Returns {@code true} if the specified {@code double} arrays are equal\n     * (within a given tolerance).\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 31)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 122,
      "end_line": 133,
      "comment": "\n     * Returns {@code true} if the specified {@code RealVector} are equal\n     * (within a given tolerance).\n     *\n     * @param x First vector.\n     * @param y Second vector.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 39)",
        "(line 127,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math3.linear.RealVector, double[])",
      "begin_line": 143,
      "end_line": 154,
      "comment": "\n     * Returns {@code true} if the specified {@code RealVector} is equal to the\n     * specified {@code double} array (within a given tolerance).\n     *\n     * @param x Vector.\n     * @param y Array.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 39)",
        "(line 148,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 164,
      "end_line": 181,
      "comment": "\n     * Returns {@code true} if the specified {@code RealMatrix} are equal\n     * (within a given tolerance).\n     *\n     * @param x First matrix.\n     * @param y Second matrix.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 45)",
        "(line 172,col 9)-(line 172,col 48)",
        "(line 173,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(java.lang.Object, java.lang.Object)",
      "begin_line": 192,
      "end_line": 240,
      "comment": "\n     * Returns {@code true} if the specified {@code Object} are equal.\n     *\n     * @param x First object.\n     * @param y Second object.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     * @throws IllegalArgumentException if {@code x} and {@code y} could\n     * not be compared.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.createVector()",
      "begin_line": 248,
      "end_line": 248,
      "comment": "\n     * Creates a new random vector of a specified type. This vector is then to\n     * be wrapped in an unmodifiable vector.\n     *\n     * @return a new random vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.createParameter(java.lang.Class\u003c?\u003e)",
      "begin_line": 258,
      "end_line": 276,
      "comment": "\n     * Creates a new random object of the specified type.\n     *\n     * @param c Class of the object to be created.\n     * @return a new random object.\n     * @throws IllegalArgumentException if the specified class is not\n     * recognized by this method.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.callMethod(java.lang.reflect.Method, org.apache.commons.math3.linear.RealVector, java.lang.Object...)",
      "begin_line": 298,
      "end_line": 325,
      "comment": "\n     * This is the general test of most methods in the\n     * {@link RealVector#unmodifiableRealVector(RealVector) unmodifiable vector}.\n     * It works as follows.\n     * First, an unmodifiable view of a copy of the specified random vector\n     * {@code u} is created: this defines {@code v}. Then the \u003cem\u003esame\u003c/em\u003e\n     * method {@code m} is invoked on {@code u} and {@code v}, with randomly\n     * generated parameters {@code args}.\n     * If it turns out that {@code u} has changed after the call of method\n     * {@code m}, then this test checks that the call of this method on\n     * {@code v} resulted in a {@link MathUnsupportedOperationException}. If\n     * {@code u} was not modified, then this test checks that the results\n     * returned by the call of method {@code m} on {@code u} and {@code v}\n     * returned the same result.\n     *\n     * @param m Method to be tested.\n     * @param u Random vector from which the unmodifiable view is to be\n     *constructed.\n     * @param args Arguments to be passed to method {@code m}.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 39)",
        "(line 305,col 9)-(line 305,col 73)",
        "(line 306,col 9)-(line 306,col 39)",
        "(line 307,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testAllButExcluded()",
      "begin_line": 333,
      "end_line": 351,
      "comment": "\n     * This test calls {@link #callMethod(Method, RealVector, Object...)} on\n     * every method defined in interface {@link RealVector}. It generates the\n     * appropriate random arguments. Some methods are manually excluded (see\n     * {@link #EXCLUDE}), they must be handled by separate tests.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 56)",
        "(line 339,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testGetEntry()",
      "begin_line": 353,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 38)",
        "(line 356,col 9)-(line 356,col 60)",
        "(line 357,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSetEntry()",
      "begin_line": 362,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 38)",
        "(line 365,col 9)-(line 365,col 60)",
        "(line 366,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testAddToEntry()",
      "begin_line": 371,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 38)",
        "(line 374,col 9)-(line 374,col 60)",
        "(line 375,col 9)-(line 377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testGetSubVector()",
      "begin_line": 380,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 383,col 60)",
        "(line 384,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSetSubVector()",
      "begin_line": 393,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 38)",
        "(line 396,col 9)-(line 396,col 60)",
        "(line 397,col 9)-(line 397,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testIterator()",
      "begin_line": 400,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 38)",
        "(line 403,col 9)-(line 403,col 41)",
        "(line 404,col 9)-(line 404,col 67)",
        "(line 405,col 9)-(line 405,col 41)",
        "(line 406,col 9)-(line 406,col 21)",
        "(line 407,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSparseIterator()",
      "begin_line": 426,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 38)",
        "(line 429,col 9)-(line 429,col 47)",
        "(line 430,col 9)-(line 430,col 67)",
        "(line 431,col 9)-(line 431,col 47)",
        "(line 432,col 9)-(line 432,col 21)",
        "(line 433,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 40)"
      ]
    }
  ]
}