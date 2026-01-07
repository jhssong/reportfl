{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/math/IEEE754rUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IEEE754rUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 265,
      "comment": "\n * \u003cp\u003eProvides IEEE-754r variants of NumberUtils methods. \u003c/p\u003e\n *\n * \u003cp\u003eSee: \u003ca href\u003d\"http://en.wikipedia.org/wiki/IEEE_754r\"\u003ehttp://en.wikipedia.org/wiki/IEEE_754r\u003c/a\u003e\u003c/p\u003e\n *\n * @since 2.4\n * @version $Id: IEEE754rUtils.java 491076 2006-12-29 18:48:37Z bayard $\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.min(double[])",
      "begin_line": 37,
      "end_line": 52,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 43,col 9)",
        "(line 46,col 9)-(line 46,col 30)",
        "(line 47,col 9)-(line 49,col 9)",
        "(line 51,col 9)-(line 51,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.min(float[])",
      "begin_line": 62,
      "end_line": 77,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 68,col 9)",
        "(line 71,col 9)-(line 71,col 29)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.min(double, double, double)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.min(double, double)",
      "begin_line": 102,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003eGets the minimum of two \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.min(float, float, float)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.min(float, float)",
      "begin_line": 136,
      "end_line": 145,
      "comment": "\n     * \u003cp\u003eGets the minimum of two \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.max(double[])",
      "begin_line": 155,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 161,col 9)",
        "(line 164,col 9)-(line 164,col 30)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.max(float[])",
      "begin_line": 180,
      "end_line": 195,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 186,col 9)",
        "(line 189,col 9)-(line 189,col 29)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.max(double, double, double)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.max(double, double)",
      "begin_line": 220,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eGets the maximum of two \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.max(float, float, float)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IEEE754rUtils.max(float, float)",
      "begin_line": 254,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003eGets the maximum of two \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eNaN is only returned if all numbers are NaN as per IEEE-754r. \u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 262,col 9)"
      ]
    }
  ]
}