{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/linear/UnmodifiableRealVectorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableRealVectorAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 455,
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
      "begin_line": 85,
      "end_line": 95,
      "comment": "\n     * Returns {@code true} if the specified {@code double} are equal (within a\n     * given tolerance).\n     *\n     * @param x First {@code double}.\n     * @param y Second {@code double}.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(double[], double[])",
      "begin_line": 105,
      "end_line": 116,
      "comment": "\n     * Returns {@code true} if the specified {@code double} arrays are equal\n     * (within a given tolerance).\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 31)",
        "(line 110,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 126,
      "end_line": 137,
      "comment": "\n     * Returns {@code true} if the specified {@code RealVector} are equal\n     * (within a given tolerance).\n     *\n     * @param x First vector.\n     * @param y Second vector.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math3.linear.RealVector, double[])",
      "begin_line": 147,
      "end_line": 158,
      "comment": "\n     * Returns {@code true} if the specified {@code RealVector} is equal to the\n     * specified {@code double} array (within a given tolerance).\n     *\n     * @param x Vector.\n     * @param y Array.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 152,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 168,
      "end_line": 185,
      "comment": "\n     * Returns {@code true} if the specified {@code RealMatrix} are equal\n     * (within a given tolerance).\n     *\n     * @param x First matrix.\n     * @param y Second matrix.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 45)",
        "(line 176,col 9)-(line 176,col 48)",
        "(line 177,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(java.lang.Object, java.lang.Object)",
      "begin_line": 196,
      "end_line": 244,
      "comment": "\n     * Returns {@code true} if the specified {@code Object} are equal.\n     *\n     * @param x First object.\n     * @param y Second object.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     * @throws IllegalArgumentException if {@code x} and {@code y} could\n     * not be compared.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.createVector()",
      "begin_line": 252,
      "end_line": 252,
      "comment": "\n     * Creates a new random vector of a specified type. This vector is then to\n     * be wrapped in an unmodifiable vector.\n     *\n     * @return a new random vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.createParameter(java.lang.Class\u003c?\u003e)",
      "begin_line": 262,
      "end_line": 280,
      "comment": "\n     * Creates a new random object of the specified type.\n     *\n     * @param c Class of the object to be created.\n     * @return a new random object.\n     * @throws IllegalArgumentException if the specified class is not\n     * recognized by this method.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.callMethod(java.lang.reflect.Method, org.apache.commons.math3.linear.RealVector, java.lang.Object...)",
      "begin_line": 302,
      "end_line": 329,
      "comment": "\n     * This is the general test of most methods in the\n     * {@link RealVector#unmodifiableRealVector(RealVector) unmodifiable vector}.\n     * It works as follows.\n     * First, an unmodifiable view of a copy of the specified random vector\n     * {@code u} is created: this defines {@code v}. Then the \u003cem\u003esame\u003c/em\u003e\n     * method {@code m} is invoked on {@code u} and {@code v}, with randomly\n     * generated parameters {@code args}.\n     * If it turns out that {@code u} has changed after the call of method\n     * {@code m}, then this test checks that the call of this method on\n     * {@code v} resulted in a {@link MathUnsupportedOperationException}. If\n     * {@code u} was not modified, then this test checks that the results\n     * returned by the call of method {@code m} on {@code u} and {@code v}\n     * returned the same result.\n     *\n     * @param m Method to be tested.\n     * @param u Random vector from which the unmodifiable view is to be\n     *constructed.\n     * @param args Arguments to be passed to method {@code m}.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 39)",
        "(line 309,col 9)-(line 309,col 73)",
        "(line 310,col 9)-(line 310,col 39)",
        "(line 311,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testAllButExcluded()",
      "begin_line": 337,
      "end_line": 355,
      "comment": "\n     * This test calls {@link #callMethod(Method, RealVector, Object...)} on\n     * every method defined in interface {@link RealVector}. It generates the\n     * appropriate random arguments. Some methods are manually excluded (see\n     * {@link #EXCLUDE}), they must be handled by separate tests.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 56)",
        "(line 343,col 9)-(line 354,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testGetEntry()",
      "begin_line": 357,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 38)",
        "(line 360,col 9)-(line 360,col 60)",
        "(line 361,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSetEntry()",
      "begin_line": 366,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 38)",
        "(line 369,col 9)-(line 369,col 60)",
        "(line 370,col 9)-(line 372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testAddToEntry()",
      "begin_line": 375,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 38)",
        "(line 378,col 9)-(line 378,col 60)",
        "(line 379,col 9)-(line 381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testGetSubVector()",
      "begin_line": 384,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 38)",
        "(line 387,col 9)-(line 387,col 60)",
        "(line 388,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSetSubVector()",
      "begin_line": 397,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 38)",
        "(line 400,col 9)-(line 400,col 60)",
        "(line 401,col 9)-(line 401,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testIterator()",
      "begin_line": 404,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 38)",
        "(line 407,col 9)-(line 407,col 41)",
        "(line 408,col 9)-(line 408,col 67)",
        "(line 409,col 9)-(line 409,col 41)",
        "(line 410,col 9)-(line 410,col 21)",
        "(line 411,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSparseIterator()",
      "begin_line": 430,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 38)",
        "(line 433,col 9)-(line 433,col 47)",
        "(line 434,col 9)-(line 434,col 67)",
        "(line 435,col 9)-(line 435,col 47)",
        "(line 436,col 9)-(line 436,col 21)",
        "(line 437,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 40)"
      ]
    }
  ]
}