{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/math/LongRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LongRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 396,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eLongRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003elong\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * The minimum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * The maximum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minObject"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Cached output minObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxObject"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Cached output maxObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(long)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 70,col 26)",
        "(line 71,col 9)-(line 71,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(java.lang.Number)",
      "begin_line": 82,
      "end_line": 93,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 38)",
        "(line 88,col 9)-(line 88,col 38)",
        "(line 89,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(long, long)",
      "begin_line": 105,
      "end_line": 114,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 16)",
        "(line 107,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(java.lang.Number, java.lang.Number)",
      "begin_line": 127,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 16)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 46)",
        "(line 133,col 9)-(line 133,col 46)",
        "(line 134,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumNumber()",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumLong()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumInteger()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumDouble()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumFloat()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumNumber()",
      "begin_line": 217,
      "end_line": 222,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumLong()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumInteger()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range cast to an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return the maximum number in this range cast to an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumDouble()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return The maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumFloat()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return The maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsNumber(java.lang.Number)",
      "begin_line": 278,
      "end_line": 283,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsLong(long)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003elong\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the long to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003elong\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 313,
      "end_line": 319,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 318,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 330,
      "end_line": 337,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 336,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.equals(java.lang.Object)",
      "begin_line": 350,
      "end_line": 359,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 42)",
        "(line 358,col 9)-(line 358,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.hashCode()",
      "begin_line": 366,
      "end_line": 374,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.toString()",
      "begin_line": 383,
      "end_line": 394,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 24)"
      ]
    }
  ]
}