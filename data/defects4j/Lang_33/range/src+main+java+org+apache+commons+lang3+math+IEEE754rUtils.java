{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/math/IEEE754rUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IEEE754rUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 266,
      "comment": "\n * \u003cp\u003eProvides IEEE-754r variants of NumberUtils methods. \u003c/p\u003e\n *\n * \u003cp\u003eSee: \u003ca href\u003d\"http://en.wikipedia.org/wiki/IEEE_754r\"\u003ehttp://en.wikipedia.org/wiki/IEEE_754r\u003c/a\u003e\u003c/p\u003e\n *\n * @since 2.4\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.min(double[])",
      "begin_line": 38,
      "end_line": 53,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 44,col 9)",
        "(line 47,col 9)-(line 47,col 30)",
        "(line 48,col 9)-(line 50,col 9)",
        "(line 52,col 9)-(line 52,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.min(float[])",
      "begin_line": 63,
      "end_line": 78,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 69,col 9)",
        "(line 72,col 9)-(line 72,col 29)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.min(double, double, double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.min(double, double)",
      "begin_line": 103,
      "end_line": 112,
      "comment": "\n     * \u003cp\u003eGets the minimum of two \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.min(float, float, float)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.min(float, float)",
      "begin_line": 137,
      "end_line": 146,
      "comment": "\n     * \u003cp\u003eGets the minimum of two \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.max(double[])",
      "begin_line": 156,
      "end_line": 171,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 165,col 30)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.max(float[])",
      "begin_line": 181,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 187,col 9)",
        "(line 190,col 9)-(line 190,col 29)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.max(double, double, double)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.max(double, double)",
      "begin_line": 221,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eGets the maximum of two \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.max(float, float, float)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.IEEE754rUtils.max(float, float)",
      "begin_line": 255,
      "end_line": 264,
      "comment": "\n     * \u003cp\u003eGets the maximum of two \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 263,col 9)"
      ]
    }
  ]
}