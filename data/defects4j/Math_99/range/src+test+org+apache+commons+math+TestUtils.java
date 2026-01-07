{
  "filepath": "/tmp/Math-99b/src/test/org/apache/commons/math/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 297,
      "comment": "\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.TestUtils.TestUtils()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Collection of static methods used in math unit tests.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double, double, double)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double, double, double)",
      "begin_line": 56,
      "end_line": 64,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(double, double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Verifies that the two arguments are exactly the same, either\n     * both NaN or infinities of same sign, or identical floating point values.\n     ",
      "child_ranges": [
        "(line 71,col 6)-(line 71,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * are exactly the same.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 57)",
        "(line 80,col 9)-(line 80,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex, double)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * differ by at most delta.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 66)",
        "(line 89,col 9)-(line 89,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double[], double[], double)",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * Verifies that two double arrays have equal entries, up to tolerance\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 48)",
        "(line 97,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.serializeAndRecover(java.lang.Object)",
      "begin_line": 109,
      "end_line": 125,
      "comment": "\n     * Serializes an object to a bytes array and then recovers the object from the bytes array.\n     * Returns the deserialized object.\n     * \n     * @param o  object to serialize and recover\n     * @return  the recovered, deserialized object\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.checkSerializedEquality(java.lang.Object)",
      "begin_line": 133,
      "end_line": 137,
      "comment": "\n     * Verifies that serialization preserves equals and hashCode.\n     * Serializes the object, then recovers it and checks equals and hash code.\n     * \n     * @param object  the object to serialize and recover\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 53)",
        "(line 135,col 9)-(line 135,col 61)",
        "(line 136,col 9)-(line 136,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(double, double, double)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     * \n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(java.lang.String, double, double, double)",
      "begin_line": 163,
      "end_line": 177,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     * \n     * @param msg  message to return with failure\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 187,
      "end_line": 204,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     * \n     * @param msg  message to return with failure\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 18)",
        "(line 190,col 9)-(line 190,col 30)",
        "(line 191,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     * \n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, double[], double, double)",
      "begin_line": 226,
      "end_line": 242,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     * \n     * @param msg  message to return with failure\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 18)",
        "(line 229,col 9)-(line 229,col 30)",
        "(line 230,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(double[], double, double)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     * \n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 253,col 8)-(line 253,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 257,
      "end_line": 283,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 55)",
        "(line 276,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double[], double[], double)",
      "begin_line": 286,
      "end_line": 295,
      "comment": " verifies that two arrays are close (sup norm) ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 294,col 9)"
      ]
    }
  ]
}