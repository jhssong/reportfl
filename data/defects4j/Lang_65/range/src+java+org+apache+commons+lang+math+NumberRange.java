{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/math/NumberRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 236,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eNumberRange\u003c/code\u003e represents an inclusive range of \n * {@link java.lang.Number} objects of the same type.\u003c/p\u003e\n *\n * @author \u003ca href\u003d\"mailto:chrise@esha.com\"\u003eChristopher Elkins\u003c/a\u003e\n * @author Stephen Colebourne\n * @since 2.0 (previously in org.apache.commons.lang)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * The minimum number in this range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * The maximum number in this range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.NumberRange.NumberRange(java.lang.Number)",
      "begin_line": 60,
      "end_line": 76,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eNumberRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param num the number to use for this range\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number doesn\u0027t implement \u003ccode\u003eComparable\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003eDouble.NaN\u003c/code\u003e or \u003ccode\u003eFloat.NaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 23)",
        "(line 75,col 9)-(line 75,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.NumberRange.NumberRange(java.lang.Number, java.lang.Number)",
      "begin_line": 96,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eNumberRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * {@link #getMinimumNumber()} and {@link #getMaximumNumber()} methods will return the\n     * correct value.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis constructor is designed to be used with two \u003ccode\u003eNumber\u003c/code\u003e\n     * objects of the same type. If two objects of different types are passed in,\n     * an exception is thrown.\u003c/p\u003e\n     *\n     * @param num1  first number that defines the edge of the range, inclusive\n     * @param num2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the numbers are of different types\n     * @throws IllegalArgumentException if the numbers don\u0027t implement \u003ccode\u003eComparable\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberRange.getMinimumNumber()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberRange.getMaximumNumber()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberRange.containsNumber(java.lang.Number)",
      "begin_line": 163,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     * @throws IllegalArgumentException if the number is of a different type to the range\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 62)",
        "(line 171,col 9)-(line 171,col 62)",
        "(line 172,col 9)-(line 172,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberRange.equals(java.lang.Object)",
      "begin_line": 190,
      "end_line": 199,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 46)",
        "(line 198,col 9)-(line 198,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberRange.hashCode()",
      "begin_line": 206,
      "end_line": 214,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberRange.toString()",
      "begin_line": 223,
      "end_line": 234,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 24)"
      ]
    }
  ]
}