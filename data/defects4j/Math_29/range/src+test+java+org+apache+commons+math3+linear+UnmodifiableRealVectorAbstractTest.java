{
  "filepath": "/tmp/Math-29b/src/test/java/org/apache/commons/math3/linear/UnmodifiableRealVectorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableRealVectorAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 453,
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
      "begin_line": 83,
      "end_line": 93,
      "comment": "\n     * Returns {@code true} if the specified {@code double} are equal (within a\n     * given tolerance).\n     *\n     * @param x First {@code double}.\n     * @param y Second {@code double}.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(double[], double[])",
      "begin_line": 103,
      "end_line": 114,
      "comment": "\n     * Returns {@code true} if the specified {@code double} arrays are equal\n     * (within a given tolerance).\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 31)",
        "(line 108,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 124,
      "end_line": 135,
      "comment": "\n     * Returns {@code true} if the specified {@code RealVector} are equal\n     * (within a given tolerance).\n     *\n     * @param x First vector.\n     * @param y Second vector.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math3.linear.RealVector, double[])",
      "begin_line": 145,
      "end_line": 156,
      "comment": "\n     * Returns {@code true} if the specified {@code RealVector} is equal to the\n     * specified {@code double} array (within a given tolerance).\n     *\n     * @param x Vector.\n     * @param y Array.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 39)",
        "(line 150,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 166,
      "end_line": 183,
      "comment": "\n     * Returns {@code true} if the specified {@code RealMatrix} are equal\n     * (within a given tolerance).\n     *\n     * @param x First matrix.\n     * @param y Second matrix.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 45)",
        "(line 174,col 9)-(line 174,col 48)",
        "(line 175,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.equals(java.lang.Object, java.lang.Object)",
      "begin_line": 194,
      "end_line": 242,
      "comment": "\n     * Returns {@code true} if the specified {@code Object} are equal.\n     *\n     * @param x First object.\n     * @param y Second object.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     * @throws IllegalArgumentException if {@code x} and {@code y} could\n     * not be compared.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.createVector()",
      "begin_line": 250,
      "end_line": 250,
      "comment": "\n     * Creates a new random vector of a specified type. This vector is then to\n     * be wrapped in an unmodifiable vector.\n     *\n     * @return a new random vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.createParameter(java.lang.Class\u003c?\u003e)",
      "begin_line": 260,
      "end_line": 278,
      "comment": "\n     * Creates a new random object of the specified type.\n     *\n     * @param c Class of the object to be created.\n     * @return a new random object.\n     * @throws IllegalArgumentException if the specified class is not\n     * recognized by this method.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.callMethod(java.lang.reflect.Method, org.apache.commons.math3.linear.RealVector, java.lang.Object...)",
      "begin_line": 300,
      "end_line": 327,
      "comment": "\n     * This is the general test of most methods in the\n     * {@link RealVector#unmodifiableRealVector(RealVector) unmodifiable vector}.\n     * It works as follows.\n     * First, an unmodifiable view of a copy of the specified random vector\n     * {@code u} is created: this defines {@code v}. Then the \u003cem\u003esame\u003c/em\u003e\n     * method {@code m} is invoked on {@code u} and {@code v}, with randomly\n     * generated parameters {@code args}.\n     * If it turns out that {@code u} has changed after the call of method\n     * {@code m}, then this test checks that the call of this method on\n     * {@code v} resulted in a {@link MathUnsupportedOperationException}. If\n     * {@code u} was not modified, then this test checks that the results\n     * returned by the call of method {@code m} on {@code u} and {@code v}\n     * returned the same result.\n     *\n     * @param m Method to be tested.\n     * @param u Random vector from which the unmodifiable view is to be\n     *constructed.\n     * @param args Arguments to be passed to method {@code m}.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 39)",
        "(line 307,col 9)-(line 307,col 73)",
        "(line 308,col 9)-(line 308,col 39)",
        "(line 309,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testAllButExcluded()",
      "begin_line": 335,
      "end_line": 353,
      "comment": "\n     * This test calls {@link #callMethod(Method, RealVector, Object...)} on\n     * every method defined in interface {@link RealVector}. It generates the\n     * appropriate random arguments. Some methods are manually excluded (see\n     * {@link #EXCLUDE}), they must be handled by separate tests.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 56)",
        "(line 341,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testGetEntry()",
      "begin_line": 355,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 38)",
        "(line 358,col 9)-(line 358,col 60)",
        "(line 359,col 9)-(line 361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSetEntry()",
      "begin_line": 364,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 38)",
        "(line 367,col 9)-(line 367,col 60)",
        "(line 368,col 9)-(line 370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testAddToEntry()",
      "begin_line": 373,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 38)",
        "(line 376,col 9)-(line 376,col 60)",
        "(line 377,col 9)-(line 379,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testGetSubVector()",
      "begin_line": 382,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 38)",
        "(line 385,col 9)-(line 385,col 60)",
        "(line 386,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSetSubVector()",
      "begin_line": 395,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 38)",
        "(line 398,col 9)-(line 398,col 60)",
        "(line 399,col 9)-(line 399,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testIterator()",
      "begin_line": 402,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 38)",
        "(line 405,col 9)-(line 405,col 41)",
        "(line 406,col 9)-(line 406,col 67)",
        "(line 407,col 9)-(line 407,col 41)",
        "(line 408,col 9)-(line 408,col 21)",
        "(line 409,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSparseIterator()",
      "begin_line": 428,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 38)",
        "(line 431,col 9)-(line 431,col 47)",
        "(line 432,col 9)-(line 432,col 67)",
        "(line 433,col 9)-(line 433,col 47)",
        "(line 434,col 9)-(line 434,col 21)",
        "(line 435,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 40)"
      ]
    }
  ]
}