{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 523,
      "comment": "\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.TestUtils.TestUtils()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Collection of static methods used in math unit tests.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(double, double, double)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(java.lang.String, double, double, double)",
      "begin_line": 62,
      "end_line": 70,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertSame(double, double)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Verifies that the two arguments are exactly the same, either\n     * both NaN or infinities of same sign, or identical floating point values.\n     ",
      "child_ranges": [
        "(line 77,col 6)-(line 77,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertSame(org.apache.commons.math3.complex.Complex, org.apache.commons.math3.complex.Complex)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * are exactly the same.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 57)",
        "(line 86,col 9)-(line 86,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(org.apache.commons.math3.complex.Complex, org.apache.commons.math3.complex.Complex, double)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * differ by at most delta.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 73)",
        "(line 95,col 9)-(line 95,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(double[], double[], double)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Verifies that two double arrays have equal entries, up to tolerance\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.serializeAndRecover(java.lang.Object)",
      "begin_line": 112,
      "end_line": 128,
      "comment": "\n     * Serializes an object to a bytes array and then recovers the object from the bytes array.\n     * Returns the deserialized object.\n     *\n     * @param o  object to serialize and recover\n     * @return  the recovered, deserialized object\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.checkSerializedEquality(java.lang.Object)",
      "begin_line": 136,
      "end_line": 140,
      "comment": "\n     * Verifies that serialization preserves equals and hashCode.\n     * Serializes the object, then recovers it and checks equals and hash code.\n     *\n     * @param object  the object to serialize and recover\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 53)",
        "(line 138,col 9)-(line 138,col 61)",
        "(line 139,col 9)-(line 139,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertRelativelyEquals(double, double, double)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertRelativelyEquals(java.lang.String, double, double, double)",
      "begin_line": 166,
      "end_line": 180,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param msg  message to return with failure\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertContains(java.lang.String, org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.complex.Complex, double)",
      "begin_line": 190,
      "end_line": 199,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param msg  message to return with failure\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertContains(org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.complex.Complex, double)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertContains(java.lang.String, double[], double, double)",
      "begin_line": 221,
      "end_line": 229,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param msg  message to return with failure\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertContains(double[], double, double)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 240,col 8)-(line 240,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(java.lang.String, double[], org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 254,
      "end_line": 263,
      "comment": "\n     * Asserts that all entries of the specified vectors are equal to within a\n     * positive {@code delta}.\n     *\n     * @param message the identifying message for the assertion error (can be\n     * {@code null})\n     * @param expected expected value\n     * @param actual actual value\n     * @param delta the maximum difference between the entries of the expected\n     * and actual vectors for which both entries are still considered equal\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 74)",
        "(line 257,col 9)-(line 258,col 35)",
        "(line 259,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(java.lang.String, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 276,
      "end_line": 286,
      "comment": "\n     * Asserts that all entries of the specified vectors are equal to within a\n     * positive {@code delta}.\n     *\n     * @param message the identifying message for the assertion error (can be\n     * {@code null})\n     * @param expected expected value\n     * @param actual actual value\n     * @param delta the maximum difference between the entries of the expected\n     * and actual vectors for which both entries are still considered equal\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 74)",
        "(line 279,col 9)-(line 280,col 35)",
        "(line 281,col 9)-(line 281,col 48)",
        "(line 282,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(java.lang.String, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 289,
      "end_line": 312,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 77)",
        "(line 293,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 55)",
        "(line 305,col 9)-(line 311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(org.apache.commons.math3.linear.FieldMatrix\u003c? extends org.apache.commons.math3.FieldElement\u003c?\u003e\u003e, org.apache.commons.math3.linear.FieldMatrix\u003c? extends org.apache.commons.math3.FieldElement\u003c?\u003e\u003e)",
      "begin_line": 315,
      "end_line": 338,
      "comment": " verifies that two matrices are equal ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 69)",
        "(line 320,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 337,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(java.lang.String, double[], double[], double)",
      "begin_line": 341,
      "end_line": 367,
      "comment": " verifies that two arrays are close (sup norm) ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 51)",
        "(line 343,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 32)",
        "(line 352,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(T[], T[])",
      "begin_line": 370,
      "end_line": 377,
      "comment": " verifies that two arrays are equal ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 376,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.sumSquareDev(double[], double)",
      "begin_line": 386,
      "end_line": 393,
      "comment": "\n     * Computes the sum of squared deviations of \u003cvalues\u003e from \u003ctarget\u003e\n     * @param values array of deviates\n     * @param target value to compute deviations from\n     *\n     * @return sum of squared deviations\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 26)",
        "(line 388,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertChiSquareAccept(java.lang.String[], double[], long[], double)",
      "begin_line": 404,
      "end_line": 431,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     *\n     * @param valueLabels labels for the values of the discrete distribution under test\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 58)",
        "(line 408,col 9)-(line 430,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertChiSquareAccept(int[], double[], long[], double)",
      "begin_line": 442,
      "end_line": 448,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     *\n     * @param values integer values whose observed and expected counts are being compared\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 52)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertChiSquareAccept(double[], long[], double)",
      "begin_line": 458,
      "end_line": 464,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     *\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 54)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.getDistributionQuartiles(org.apache.commons.math3.distribution.RealDistribution)",
      "begin_line": 470,
      "end_line": 476,
      "comment": "\n     * Computes the 25th, 50th and 75th percentiles of the given distribution and returns\n     * these values in an array.\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 43)",
        "(line 472,col 9)-(line 472,col 72)",
        "(line 473,col 9)-(line 473,col 71)",
        "(line 474,col 9)-(line 474,col 72)",
        "(line 475,col 9)-(line 475,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.updateCounts(double, long[], double[])",
      "begin_line": 482,
      "end_line": 492,
      "comment": "\n     * Updates observed counts of values in quartiles.\n     * counts[0] \u003c-\u003e 1st quartile ... counts[3] \u003c-\u003e top quartile\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.eliminateZeroMassPoints(int[], double[])",
      "begin_line": 500,
      "end_line": 522,
      "comment": "\n     * Eliminates points with zero mass from densityPoints and densityValues parallel\n     * arrays.  Returns the number of positive mass points and collapses the arrays so\n     * that the first \u003creturned value\u003e elements of the input arrays represent the positive\n     * mass points.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 34)",
        "(line 502,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 33)"
      ]
    }
  ]
}