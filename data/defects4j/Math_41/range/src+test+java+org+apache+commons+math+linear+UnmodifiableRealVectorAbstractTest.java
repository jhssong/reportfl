{
  "filepath": "/tmp/Math-41b/src/test/java/org/apache/commons/math/linear/UnmodifiableRealVectorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableRealVectorAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 452,
      "comment": "\n * This is an abstract test of the {@link\n * RealVector#unmodifiableRealVector(RealVector) unmodifiable vector}\n * implementation. These unmodifiable vectors decorate a (modifiable)\n * {@link RealVector}; therefore, a new implementation of this abstract\n * test should be considered for each implementation of\n * {@link RealVector}.\n *\n * @version $Id$\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIM"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The dimension of the randomly generated vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "EPS"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Absolute tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "EXCLUDE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * The list of methods which are excluded from the general test\n     * {@link #testAllButExcluded()}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANDOM"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The random number generator (always initialized with the same seed. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.equals(double, double)",
      "begin_line": 82,
      "end_line": 92,
      "comment": "\n     * Returns {@code true} if the specified {@code double} are equal (within a\n     * given tolerance).\n     *\n     * @param x First {@code double}.\n     * @param y Second {@code double}.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.equals(double[], double[])",
      "begin_line": 102,
      "end_line": 113,
      "comment": "\n     * Returns {@code true} if the specified {@code double} arrays are equal\n     * (within a given tolerance).\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 31)",
        "(line 107,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 123,
      "end_line": 134,
      "comment": "\n     * Returns {@code true} if the specified {@code RealVector} are equal\n     * (within a given tolerance).\n     *\n     * @param x First vector.\n     * @param y Second vector.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math.linear.RealVector, double[])",
      "begin_line": 144,
      "end_line": 155,
      "comment": "\n     * Returns {@code true} if the specified {@code RealVector} is equal to the\n     * specified {@code double} array (within a given tolerance).\n     *\n     * @param x Vector.\n     * @param y Array.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 39)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.equals(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 165,
      "end_line": 182,
      "comment": "\n     * Returns {@code true} if the specified {@code RealMatrix} are equal\n     * (within a given tolerance).\n     *\n     * @param x First matrix.\n     * @param y Second matrix.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 45)",
        "(line 173,col 9)-(line 173,col 48)",
        "(line 174,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.equals(java.lang.Object, java.lang.Object)",
      "begin_line": 193,
      "end_line": 241,
      "comment": "\n     * Returns {@code true} if the specified {@code Object} are equal.\n     *\n     * @param x First object.\n     * @param y Second object.\n     * @return {@code true} if {@code x} and {@code y} are equal.\n     * @throws IllegalArgumentException if {@code x} and {@code y} could\n     * not be compared.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.createVector()",
      "begin_line": 249,
      "end_line": 249,
      "comment": "\n     * Creates a new random vector of a specified type. This vector is then to\n     * be wrapped in an unmodifiable vector.\n     *\n     * @return a new random vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.createParameter(java.lang.Class\u003c?\u003e)",
      "begin_line": 259,
      "end_line": 277,
      "comment": "\n     * Creates a new random object of the specified type.\n     *\n     * @param c Class of the object to be created.\n     * @return a new random object.\n     * @throws IllegalArgumentException if the specified class is not\n     * recognized by this method.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.callMethod(java.lang.reflect.Method, org.apache.commons.math.linear.RealVector, java.lang.Object...)",
      "begin_line": 299,
      "end_line": 326,
      "comment": "\n     * This is the general test of most methods in the\n     * {@link RealVector#unmodifiableRealVector(RealVector) unmodifiable vector}.\n     * It works as follows.\n     * First, an unmodifiable view of a copy of the specified random vector\n     * {@code u} is created: this defines {@code v}. Then the \u003cem\u003esame\u003c/em\u003e\n     * method {@code m} is invoked on {@code u} and {@code v}, with randomly\n     * generated parameters {@code args}.\n     * If it turns out that {@code u} has changed after the call of method\n     * {@code m}, then this test checks that the call of this method on\n     * {@code v} resulted in a {@link MathUnsupportedOperationException}. If\n     * {@code u} was not modified, then this test checks that the results\n     * returned by the call of method {@code m} on {@code u} and {@code v}\n     * returned the same result.\n     *\n     * @param m Method to be tested.\n     * @param u Random vector from which the unmodifiable view is to be\n     *constructed.\n     * @param args Arguments to be passed to method {@code m}.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 39)",
        "(line 306,col 9)-(line 306,col 73)",
        "(line 307,col 9)-(line 307,col 39)",
        "(line 308,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.testAllButExcluded()",
      "begin_line": 334,
      "end_line": 352,
      "comment": "\n     * This test calls {@link #callMethod(Method, RealVector, Object...)} on\n     * every method defined in interface {@link RealVector}. It generates the\n     * appropriate random arguments. Some methods are manually excluded (see\n     * {@link #EXCLUDE}), they must be handled by separate tests.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 56)",
        "(line 340,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.testGetEntry()",
      "begin_line": 354,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 38)",
        "(line 357,col 9)-(line 357,col 60)",
        "(line 358,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.testSetEntry()",
      "begin_line": 363,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 38)",
        "(line 366,col 9)-(line 366,col 60)",
        "(line 367,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.testAddToEntry()",
      "begin_line": 372,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 38)",
        "(line 375,col 9)-(line 375,col 60)",
        "(line 376,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.testGetSubVector()",
      "begin_line": 381,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 38)",
        "(line 384,col 9)-(line 384,col 60)",
        "(line 385,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.testSetSubVector()",
      "begin_line": 394,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 38)",
        "(line 397,col 9)-(line 397,col 60)",
        "(line 398,col 9)-(line 398,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.testIterator()",
      "begin_line": 401,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 38)",
        "(line 404,col 9)-(line 404,col 41)",
        "(line 405,col 9)-(line 405,col 67)",
        "(line 406,col 9)-(line 406,col 41)",
        "(line 407,col 9)-(line 407,col 21)",
        "(line 408,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.UnmodifiableRealVectorAbstractTest.testSparseIterator()",
      "begin_line": 427,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 38)",
        "(line 430,col 9)-(line 430,col 47)",
        "(line 431,col 9)-(line 431,col 67)",
        "(line 432,col 9)-(line 432,col 47)",
        "(line 433,col 9)-(line 433,col 21)",
        "(line 434,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 40)"
      ]
    }
  ]
}