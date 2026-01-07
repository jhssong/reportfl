{
  "filepath": "/tmp/Math-103b/src/test/org/apache/commons/math/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 283,
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
      "end_line": 152,
      "comment": "\n     * Serializes an object to a temp file and then recovers the object from the file.\n     * Returns the deserialized object.\n     * \n     * @param o  object to serialize and recover\n     * @return  the recovered, deseriailized object\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)",
        "(line 112,col 9)-(line 112,col 24)",
        "(line 113,col 9)-(line 113,col 35)",
        "(line 114,col 9)-(line 114,col 34)",
        "(line 116,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.checkSerializedEquality(java.lang.Object)",
      "begin_line": 160,
      "end_line": 164,
      "comment": "\n     * Verifies that serialization preserves equals and hashCode.\n     * Serializes the object, then recovers it and checks equals and hash code.\n     * \n     * @param object  the object to serialize and recover\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 53)",
        "(line 162,col 9)-(line 162,col 61)",
        "(line 163,col 9)-(line 163,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(double, double, double)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     * \n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(java.lang.String, double, double, double)",
      "begin_line": 190,
      "end_line": 204,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     * \n     * @param msg  message to return with failure\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 214,
      "end_line": 231,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     * \n     * @param msg  message to return with failure\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 18)",
        "(line 217,col 9)-(line 217,col 30)",
        "(line 218,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     * \n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, double[], double, double)",
      "begin_line": 253,
      "end_line": 269,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     * \n     * @param msg  message to return with failure\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 18)",
        "(line 256,col 9)-(line 256,col 30)",
        "(line 257,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(double[], double, double)",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     * \n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 280,col 8)-(line 280,col 48)"
      ]
    }
  ]
}