{
  "filepath": "/tmp/Math-98b/src/test/org/apache/commons/math/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 255,
      "comment": "\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.TestUtils.TestUtils()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Collection of static methods used in math unit tests.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double, double, double)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double, double, double)",
      "begin_line": 55,
      "end_line": 63,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(double, double)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Verifies that the two arguments are exactly the same, either\n     * both NaN or infinities of same sign, or identical floating point values.\n     ",
      "child_ranges": [
        "(line 70,col 6)-(line 70,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * are exactly the same.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 57)",
        "(line 79,col 9)-(line 79,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex, double)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * differ by at most delta.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 66)",
        "(line 88,col 9)-(line 88,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double[], double[], double)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n     * Verifies that two double arrays have equal entries, up to tolerance\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 48)",
        "(line 96,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.serializeAndRecover(java.lang.Object)",
      "begin_line": 108,
      "end_line": 124,
      "comment": "\n     * Serializes an object to a bytes array and then recovers the object from the bytes array.\n     * Returns the deserialized object.\n     * \n     * @param o  object to serialize and recover\n     * @return  the recovered, deserialized object\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.checkSerializedEquality(java.lang.Object)",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\n     * Verifies that serialization preserves equals and hashCode.\n     * Serializes the object, then recovers it and checks equals and hash code.\n     * \n     * @param object  the object to serialize and recover\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 53)",
        "(line 134,col 9)-(line 134,col 61)",
        "(line 135,col 9)-(line 135,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(double, double, double)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     * \n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(java.lang.String, double, double, double)",
      "begin_line": 162,
      "end_line": 176,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     * \n     * @param msg  message to return with failure\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 186,
      "end_line": 203,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     * \n     * @param msg  message to return with failure\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 18)",
        "(line 189,col 9)-(line 189,col 30)",
        "(line 190,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     * \n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, double[], double, double)",
      "begin_line": 225,
      "end_line": 241,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     * \n     * @param msg  message to return with failure\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 18)",
        "(line 228,col 9)-(line 228,col 30)",
        "(line 229,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(double[], double, double)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     * \n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 252,col 8)-(line 252,col 48)"
      ]
    }
  ]
}