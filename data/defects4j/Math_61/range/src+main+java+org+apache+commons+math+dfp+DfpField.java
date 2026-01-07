{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/dfp/DfpField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DfpField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.Field\u003corg.apache.commons.math.dfp.Dfp\u003e"
      ],
      "begin_line": 26,
      "end_line": 750,
      "comment": " Field for Decimal floating point instances.\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_INVALID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " IEEE 854-1987 flag for invalid operation. "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_DIV_ZERO"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " IEEE 854-1987 flag for division by zero. "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_OVERFLOW"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " IEEE 854-1987 flag for overflow. "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_UNDERFLOW"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " IEEE 854-1987 flag for underflow. "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_INEXACT"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " IEEE 854-1987 flag for inexact result. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2String"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " High precision string representation of \u0026radic;2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2ReciprocalString"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " High precision string representation of \u0026radic;2 / 2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3String"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " High precision string representation of \u0026radic;3. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3ReciprocalString"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " High precision string representation of \u0026radic;3 / 3. "
    },
    {
      "type": "field",
      "varNames": [
        "piString"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " High precision string representation of \u0026pi;. "
    },
    {
      "type": "field",
      "varNames": [
        "eString"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " High precision string representation of e. "
    },
    {
      "type": "field",
      "varNames": [
        "ln2String"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " High precision string representation of ln(2). "
    },
    {
      "type": "field",
      "varNames": [
        "ln5String"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " High precision string representation of ln(5). "
    },
    {
      "type": "field",
      "varNames": [
        "ln10String"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " High precision string representation of ln(10). "
    },
    {
      "type": "field",
      "varNames": [
        "radixDigits"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The number of radix digits.\n     * Note these depend on the radix which is 10000 digits,\n     * so each one is equivalent to 4 decimal digits.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zero"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " A {@link Dfp} with value 0. "
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " A {@link Dfp} with value 1. "
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " A {@link Dfp} with value 2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " A {@link Dfp} with value \u0026radic;2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2Split"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " A two elements {@link Dfp} array with value \u0026radic;2 split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2Reciprocal"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " A {@link Dfp} with value \u0026radic;2 / 2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " A {@link Dfp} with value \u0026radic;3. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3Reciprocal"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " A {@link Dfp} with value \u0026radic;3 / 3. "
    },
    {
      "type": "field",
      "varNames": [
        "pi"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " A {@link Dfp} with value \u0026pi;. "
    },
    {
      "type": "field",
      "varNames": [
        "piSplit"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " A two elements {@link Dfp} array with value \u0026pi; split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " A {@link Dfp} with value e. "
    },
    {
      "type": "field",
      "varNames": [
        "eSplit"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " A two elements {@link Dfp} array with value e split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "ln2"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " A {@link Dfp} with value ln(2). "
    },
    {
      "type": "field",
      "varNames": [
        "ln2Split"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " A two elements {@link Dfp} array with value ln(2) split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "ln5"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " A {@link Dfp} with value ln(5). "
    },
    {
      "type": "field",
      "varNames": [
        "ln5Split"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " A two elements {@link Dfp} array with value ln(5) split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "ln10"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " A {@link Dfp} with value ln(10). "
    },
    {
      "type": "field",
      "varNames": [
        "rMode"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " Current rounding mode. "
    },
    {
      "type": "field",
      "varNames": [
        "ieeeFlags"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " IEEE 854-1987 signals. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpField.DfpField(int)",
      "begin_line": 173,
      "end_line": 175,
      "comment": " Create a factory for the specified number of radix digits.\n     * \u003cp\u003e\n     * Note that since the {@link Dfp} class uses 10000 as its radix, each radix\n     * digit is equivalent to 4 decimal digits. This implies that asking for\n     * 13, 14, 15 or 16 decimal digits will really lead to a 4 radix 10000 digits in\n     * all cases.\n     * \u003c/p\u003e\n     * @param decimalDigits minimal number of decimal digits.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpField.DfpField(int, boolean)",
      "begin_line": 188,
      "end_line": 242,
      "comment": " Create a factory for the specified number of radix digits.\n     * \u003cp\u003e\n     * Note that since the {@link Dfp} class uses 10000 as its radix, each radix\n     * digit is equivalent to 4 decimal digits. This implies that asking for\n     * 13, 14, 15 or 16 decimal digits will really lead to a 4 radix 10000 digits in\n     * all cases.\n     * \u003c/p\u003e\n     * @param decimalDigits minimal number of decimal digits\n     * @param computeConstants if true, the transcendental constants for the given precision\n     * must be computed (setting this flag to false is RESERVED for the internal recursive call)\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 78)",
        "(line 191,col 9)-(line 191,col 56)",
        "(line 192,col 9)-(line 192,col 29)",
        "(line 193,col 9)-(line 193,col 44)",
        "(line 194,col 9)-(line 194,col 44)",
        "(line 195,col 9)-(line 195,col 44)",
        "(line 197,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getRadixDigits()",
      "begin_line": 247,
      "end_line": 249,
      "comment": " Get the number of radix digits of the {@link Dfp} instances built by this factory.\n     * @return number of radix digits\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.setRoundingMode(org.apache.commons.math.dfp.DfpField.RoundingMode)",
      "begin_line": 258,
      "end_line": 260,
      "comment": " Set the rounding mode.\n     *  If not set, the default value is {@link RoundingMode#ROUND_HALF_EVEN}.\n     * @param mode desired rounding mode\n     * Note that the rounding mode is common to all {@link Dfp} instances\n     * belonging to the current {@link DfpField} in the system and will\n     * affect all future calculations.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getRoundingMode()",
      "begin_line": 265,
      "end_line": 267,
      "comment": " Get the current rounding mode.\n     * @return current rounding mode\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getIEEEFlags()",
      "begin_line": 280,
      "end_line": 282,
      "comment": " Get the IEEE 854 status flags.\n     * @return IEEE 854 status flags\n     * @see #clearIEEEFlags()\n     * @see #setIEEEFlags(int)\n     * @see #setIEEEFlagsBits(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.clearIEEEFlags()",
      "begin_line": 294,
      "end_line": 296,
      "comment": " Clears the IEEE 854 status flags.\n     * @see #getIEEEFlags()\n     * @see #setIEEEFlags(int)\n     * @see #setIEEEFlagsBits(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.setIEEEFlags(int)",
      "begin_line": 309,
      "end_line": 311,
      "comment": " Sets the IEEE 854 status flags.\n     * @param flags desired value for the flags\n     * @see #getIEEEFlags()\n     * @see #clearIEEEFlags()\n     * @see #setIEEEFlagsBits(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.setIEEEFlagsBits(int)",
      "begin_line": 327,
      "end_line": 329,
      "comment": " Sets some bits in the IEEE 854 status flags, without changing the already set bits.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call {@code setIEEEFlags(getIEEEFlags() | bits)}\n     * \u003c/p\u003e\n     * @param bits bits to set\n     * @see #getIEEEFlags()\n     * @see #clearIEEEFlags()\n     * @see #setIEEEFlags(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp()",
      "begin_line": 334,
      "end_line": 336,
      "comment": " Makes a {@link Dfp} with a value of 0.\n     * @return a new {@link Dfp} with a value of 0\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(byte)",
      "begin_line": 342,
      "end_line": 344,
      "comment": " Create an instance from a byte value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(int)",
      "begin_line": 350,
      "end_line": 352,
      "comment": " Create an instance from an int value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(long)",
      "begin_line": 358,
      "end_line": 360,
      "comment": " Create an instance from a long value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(double)",
      "begin_line": 366,
      "end_line": 368,
      "comment": " Create an instance from a double value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 374,
      "end_line": 376,
      "comment": " Copy constructor.\n     * @param d instance to copy\n     * @return a new {@link Dfp} with the same value as d\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(java.lang.String)",
      "begin_line": 382,
      "end_line": 384,
      "comment": " Create a {@link Dfp} given a String representation.\n     * @param s string representation of the instance\n     * @return a new {@link Dfp} parsed from specified string\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(byte, byte)",
      "begin_line": 392,
      "end_line": 394,
      "comment": " Creates a {@link Dfp} with a non-finite value.\n     * @param sign sign of the Dfp to create\n     * @param nans code of the value, must be one of {@link Dfp#INFINITE},\n     * {@link Dfp#SNAN},  {@link Dfp#QNAN}\n     * @return a new {@link Dfp} with a non-finite value\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getZero()",
      "begin_line": 399,
      "end_line": 401,
      "comment": " Get the constant 0.\n     * @return a {@link Dfp} with value 0\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getOne()",
      "begin_line": 406,
      "end_line": 408,
      "comment": " Get the constant 1.\n     * @return a {@link Dfp} with value 1\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getTwo()",
      "begin_line": 413,
      "end_line": 415,
      "comment": " Get the constant 2.\n     * @return a {@link Dfp} with value 2\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr2()",
      "begin_line": 420,
      "end_line": 422,
      "comment": " Get the constant \u0026radic;2.\n     * @return a {@link Dfp} with value \u0026radic;2\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr2Split()",
      "begin_line": 427,
      "end_line": 429,
      "comment": " Get the constant \u0026radic;2 split in two pieces.\n     * @return a {@link Dfp} with value \u0026radic;2 split in two pieces\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr2Reciprocal()",
      "begin_line": 434,
      "end_line": 436,
      "comment": " Get the constant \u0026radic;2 / 2.\n     * @return a {@link Dfp} with value \u0026radic;2 / 2\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr3()",
      "begin_line": 441,
      "end_line": 443,
      "comment": " Get the constant \u0026radic;3.\n     * @return a {@link Dfp} with value \u0026radic;3\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr3Reciprocal()",
      "begin_line": 448,
      "end_line": 450,
      "comment": " Get the constant \u0026radic;3 / 3.\n     * @return a {@link Dfp} with value \u0026radic;3 / 3\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getPi()",
      "begin_line": 455,
      "end_line": 457,
      "comment": " Get the constant \u0026pi;.\n     * @return a {@link Dfp} with value \u0026pi;\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getPiSplit()",
      "begin_line": 462,
      "end_line": 464,
      "comment": " Get the constant \u0026pi; split in two pieces.\n     * @return a {@link Dfp} with value \u0026pi; split in two pieces\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getE()",
      "begin_line": 469,
      "end_line": 471,
      "comment": " Get the constant e.\n     * @return a {@link Dfp} with value e\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getESplit()",
      "begin_line": 476,
      "end_line": 478,
      "comment": " Get the constant e split in two pieces.\n     * @return a {@link Dfp} with value e split in two pieces\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn2()",
      "begin_line": 483,
      "end_line": 485,
      "comment": " Get the constant ln(2).\n     * @return a {@link Dfp} with value ln(2)\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn2Split()",
      "begin_line": 490,
      "end_line": 492,
      "comment": " Get the constant ln(2) split in two pieces.\n     * @return a {@link Dfp} with value ln(2) split in two pieces\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn5()",
      "begin_line": 497,
      "end_line": 499,
      "comment": " Get the constant ln(5).\n     * @return a {@link Dfp} with value ln(5)\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn5Split()",
      "begin_line": 504,
      "end_line": 506,
      "comment": " Get the constant ln(5) split in two pieces.\n     * @return a {@link Dfp} with value ln(5) split in two pieces\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn10()",
      "begin_line": 511,
      "end_line": 513,
      "comment": " Get the constant ln(10).\n     * @return a {@link Dfp} with value ln(10)\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.split(java.lang.String)",
      "begin_line": 521,
      "end_line": 564,
      "comment": " Breaks a string representation up into two {@link Dfp}\u0027s.\n     * The split is such that the sum of them is equivalent to the input string,\n     * but has higher precision than using a single Dfp.\n     * @param a string representation of the number to split\n     * @return an array of two {@link Dfp Dfp} instances which sum equals a\n     ",
      "child_ranges": [
        "(line 522,col 7)-(line 522,col 32)",
        "(line 523,col 7)-(line 523,col 29)",
        "(line 524,col 7)-(line 524,col 17)",
        "(line 525,col 7)-(line 525,col 18)",
        "(line 527,col 7)-(line 527,col 40)",
        "(line 529,col 7)-(line 549,col 7)",
        "(line 551,col 7)-(line 551,col 56)",
        "(line 553,col 7)-(line 558,col 7)",
        "(line 560,col 7)-(line 560,col 49)",
        "(line 562,col 7)-(line 562,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.computeStringConstants(int)",
      "begin_line": 569,
      "end_line": 593,
      "comment": " Recompute the high precision string constants.\n     * @param highPrecisionDecimalDigits precision at which the string constants mus be computed\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 592,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.computePi(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 601,
      "end_line": 636,
      "comment": " Compute \u0026pi; using Jonathan and Peter Borwein quartic formula.\n     * @param one constant with value 1 at desired precision\n     * @param two constant with value 2 at desired precision\n     * @param three constant with value 3 at desired precision\n     * @return \u0026pi;\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 33)",
        "(line 604,col 9)-(line 604,col 42)",
        "(line 605,col 9)-(line 605,col 35)",
        "(line 606,col 9)-(line 606,col 26)",
        "(line 607,col 9)-(line 607,col 72)",
        "(line 615,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 634,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.computeExp(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 643,
      "end_line": 664,
      "comment": " Compute exp(a).\n     * @param a number for which we want the exponential\n     * @param one constant with value 1 at desired precision\n     * @return exp(a)\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 30)",
        "(line 646,col 9)-(line 646,col 30)",
        "(line 647,col 9)-(line 647,col 30)",
        "(line 648,col 9)-(line 648,col 30)",
        "(line 649,col 9)-(line 649,col 30)",
        "(line 651,col 9)-(line 660,col 9)",
        "(line 662,col 9)-(line 662,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.computeLn(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 726,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 20)",
        "(line 729,col 9)-(line 729,col 68)",
        "(line 731,col 9)-(line 731,col 27)",
        "(line 732,col 9)-(line 732,col 29)",
        "(line 733,col 9)-(line 733,col 28)",
        "(line 734,col 9)-(line 744,col 9)",
        "(line 746,col 9)-(line 746,col 31)"
      ]
    }
  ]
}