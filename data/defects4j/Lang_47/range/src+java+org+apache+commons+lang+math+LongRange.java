{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/math/LongRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LongRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 411,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eLongRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003elong\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * The minimum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * The maximum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minObject"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Cached output minObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxObject"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Cached output maxObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(long)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)",
        "(line 71,col 9)-(line 71,col 26)",
        "(line 72,col 9)-(line 72,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(java.lang.Number)",
      "begin_line": 83,
      "end_line": 94,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 16)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 38)",
        "(line 89,col 9)-(line 89,col 38)",
        "(line 90,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(long, long)",
      "begin_line": 106,
      "end_line": 115,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 16)",
        "(line 108,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(java.lang.Number, java.lang.Number)",
      "begin_line": 128,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 16)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 46)",
        "(line 134,col 9)-(line 134,col 46)",
        "(line 135,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumNumber()",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumLong()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumInteger()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumDouble()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumFloat()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumNumber()",
      "begin_line": 218,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumLong()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumInteger()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range cast to an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return the maximum number in this range cast to an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumDouble()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return The maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumFloat()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return The maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsNumber(java.lang.Number)",
      "begin_line": 279,
      "end_line": 284,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsLong(long)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003elong\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the long to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003elong\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 314,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 319,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 331,
      "end_line": 338,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 337,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.equals(java.lang.Object)",
      "begin_line": 351,
      "end_line": 360,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 42)",
        "(line 359,col 9)-(line 359,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.hashCode()",
      "begin_line": 367,
      "end_line": 375,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.toString()",
      "begin_line": 384,
      "end_line": 395,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.toArray()",
      "begin_line": 403,
      "end_line": 409,
      "comment": "\n     * \u003cp\u003eReturns an array containing all the long values in the range.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003elong[]\u003c/code\u003e representation of this range\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 55)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 21)"
      ]
    }
  ]
}