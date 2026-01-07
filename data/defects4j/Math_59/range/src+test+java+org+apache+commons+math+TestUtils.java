{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 516,
      "comment": "\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.TestUtils.TestUtils()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Collection of static methods used in math unit tests.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double, double, double)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double, double, double)",
      "begin_line": 62,
      "end_line": 70,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(double, double)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Verifies that the two arguments are exactly the same, either\n     * both NaN or infinities of same sign, or identical floating point values.\n     ",
      "child_ranges": [
        "(line 77,col 6)-(line 77,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex)",
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
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex, double)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * differ by at most delta.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 66)",
        "(line 95,col 9)-(line 95,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double[], double[], double)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Verifies that two double arrays have equal entries, up to tolerance\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.serializeAndRecover(java.lang.Object)",
      "begin_line": 112,
      "end_line": 128,
      "comment": "\n     * Serializes an object to a bytes array and then recovers the object from the bytes array.\n     * Returns the deserialized object.\n     *\n     * @param o  object to serialize and recover\n     * @return  the recovered, deserialized object\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.checkSerializedEquality(java.lang.Object)",
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
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(double, double, double)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(java.lang.String, double, double, double)",
      "begin_line": 166,
      "end_line": 180,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param msg  message to return with failure\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 190,
      "end_line": 207,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param msg  message to return with failure\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 18)",
        "(line 193,col 9)-(line 193,col 30)",
        "(line 194,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, double[], double, double)",
      "begin_line": 229,
      "end_line": 245,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param msg  message to return with failure\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 18)",
        "(line 232,col 9)-(line 232,col 30)",
        "(line 233,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(double[], double, double)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 256,col 8)-(line 256,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 260,
      "end_line": 284,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 77)",
        "(line 265,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 55)",
        "(line 277,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.linear.FieldMatrix\u003c? extends org.apache.commons.math.FieldElement\u003c?\u003e\u003e, org.apache.commons.math.linear.FieldMatrix\u003c? extends org.apache.commons.math.FieldElement\u003c?\u003e\u003e)",
      "begin_line": 287,
      "end_line": 310,
      "comment": " verifies that two matrices are equal ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 69)",
        "(line 292,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double[], double[], double)",
      "begin_line": 313,
      "end_line": 342,
      "comment": " verifies that two arrays are close (sup norm) ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 51)",
        "(line 316,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 32)",
        "(line 325,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(T[], T[])",
      "begin_line": 345,
      "end_line": 352,
      "comment": " verifies that two arrays are equal ",
      "child_ranges": [
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.sumSquareDev(double[], double)",
      "begin_line": 361,
      "end_line": 368,
      "comment": "\n     * Computes the sum of squared deviations of \u003cvalues\u003e from \u003ctarget\u003e\n     * @param values array of deviates\n     * @param target value to compute deviations from\n     *\n     * @return sum of squared deviations\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 26)",
        "(line 363,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(java.lang.String[], double[], long[], double)",
      "begin_line": 379,
      "end_line": 407,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param valueLabels\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 62)",
        "(line 381,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(int[], double[], long[], double)",
      "begin_line": 418,
      "end_line": 424,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param values\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 52)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(double[], double[], long[], double)",
      "begin_line": 435,
      "end_line": 441,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param values\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 52)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(double[], long[], double)",
      "begin_line": 451,
      "end_line": 457,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 54)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.getDistributionQuartiles(org.apache.commons.math.distribution.ContinuousDistribution)",
      "begin_line": 463,
      "end_line": 469,
      "comment": "\n     * Computes the 25th, 50th and 75th percentiles of the given distribution and returns\n     * these values in an array.\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 43)",
        "(line 465,col 9)-(line 465,col 72)",
        "(line 466,col 9)-(line 466,col 71)",
        "(line 467,col 9)-(line 467,col 72)",
        "(line 468,col 9)-(line 468,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.updateCounts(double, long[], double[])",
      "begin_line": 475,
      "end_line": 485,
      "comment": "\n     * Updates observed counts of values in quartiles.\n     * counts[0] \u003c-\u003e 1st quartile ... counts[3] \u003c-\u003e top quartile\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 484,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.eliminateZeroMassPoints(int[], double[])",
      "begin_line": 493,
      "end_line": 515,
      "comment": "\n     * Eliminates points with zero mass from densityPoints and densityValues parallel\n     * arrays.  Returns the number of positive mass points and collapses the arrays so\n     * that the first \u003creturned value\u003e elements of the input arrays represent the positive\n     * mass points.\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 34)",
        "(line 495,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 33)"
      ]
    }
  ]
}