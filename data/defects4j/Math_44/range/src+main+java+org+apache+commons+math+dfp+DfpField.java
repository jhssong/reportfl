{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/dfp/DfpField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DfpField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.Field\u003corg.apache.commons.math.dfp.Dfp\u003e"
      ],
      "begin_line": 27,
      "end_line": 756,
      "comment": " Field for Decimal floating point instances.\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_INVALID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " IEEE 854-1987 flag for invalid operation. "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_DIV_ZERO"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " IEEE 854-1987 flag for division by zero. "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_OVERFLOW"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " IEEE 854-1987 flag for overflow. "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_UNDERFLOW"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " IEEE 854-1987 flag for underflow. "
    },
    {
      "type": "field",
      "varNames": [
        "FLAG_INEXACT"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " IEEE 854-1987 flag for inexact result. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2String"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " High precision string representation of \u0026radic;2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2ReciprocalString"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " High precision string representation of \u0026radic;2 / 2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3String"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " High precision string representation of \u0026radic;3. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3ReciprocalString"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " High precision string representation of \u0026radic;3 / 3. "
    },
    {
      "type": "field",
      "varNames": [
        "piString"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " High precision string representation of \u0026pi;. "
    },
    {
      "type": "field",
      "varNames": [
        "eString"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " High precision string representation of e. "
    },
    {
      "type": "field",
      "varNames": [
        "ln2String"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " High precision string representation of ln(2). "
    },
    {
      "type": "field",
      "varNames": [
        "ln5String"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " High precision string representation of ln(5). "
    },
    {
      "type": "field",
      "varNames": [
        "ln10String"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " High precision string representation of ln(10). "
    },
    {
      "type": "field",
      "varNames": [
        "radixDigits"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The number of radix digits.\n     * Note these depend on the radix which is 10000 digits,\n     * so each one is equivalent to 4 decimal digits.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zero"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " A {@link Dfp} with value 0. "
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " A {@link Dfp} with value 1. "
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " A {@link Dfp} with value 2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " A {@link Dfp} with value \u0026radic;2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2Split"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " A two elements {@link Dfp} array with value \u0026radic;2 split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2Reciprocal"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " A {@link Dfp} with value \u0026radic;2 / 2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " A {@link Dfp} with value \u0026radic;3. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3Reciprocal"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " A {@link Dfp} with value \u0026radic;3 / 3. "
    },
    {
      "type": "field",
      "varNames": [
        "pi"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " A {@link Dfp} with value \u0026pi;. "
    },
    {
      "type": "field",
      "varNames": [
        "piSplit"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " A two elements {@link Dfp} array with value \u0026pi; split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " A {@link Dfp} with value e. "
    },
    {
      "type": "field",
      "varNames": [
        "eSplit"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " A two elements {@link Dfp} array with value e split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "ln2"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " A {@link Dfp} with value ln(2). "
    },
    {
      "type": "field",
      "varNames": [
        "ln2Split"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " A two elements {@link Dfp} array with value ln(2) split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "ln5"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " A {@link Dfp} with value ln(5). "
    },
    {
      "type": "field",
      "varNames": [
        "ln5Split"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " A two elements {@link Dfp} array with value ln(5) split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "ln10"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " A {@link Dfp} with value ln(10). "
    },
    {
      "type": "field",
      "varNames": [
        "rMode"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " Current rounding mode. "
    },
    {
      "type": "field",
      "varNames": [
        "ieeeFlags"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " IEEE 854-1987 signals. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpField.DfpField(int)",
      "begin_line": 174,
      "end_line": 176,
      "comment": " Create a factory for the specified number of radix digits.\n     * \u003cp\u003e\n     * Note that since the {@link Dfp} class uses 10000 as its radix, each radix\n     * digit is equivalent to 4 decimal digits. This implies that asking for\n     * 13, 14, 15 or 16 decimal digits will really lead to a 4 radix 10000 digits in\n     * all cases.\n     * \u003c/p\u003e\n     * @param decimalDigits minimal number of decimal digits.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpField.DfpField(int, boolean)",
      "begin_line": 189,
      "end_line": 243,
      "comment": " Create a factory for the specified number of radix digits.\n     * \u003cp\u003e\n     * Note that since the {@link Dfp} class uses 10000 as its radix, each radix\n     * digit is equivalent to 4 decimal digits. This implies that asking for\n     * 13, 14, 15 or 16 decimal digits will really lead to a 4 radix 10000 digits in\n     * all cases.\n     * \u003c/p\u003e\n     * @param decimalDigits minimal number of decimal digits\n     * @param computeConstants if true, the transcendental constants for the given precision\n     * must be computed (setting this flag to false is RESERVED for the internal recursive call)\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 78)",
        "(line 192,col 9)-(line 192,col 56)",
        "(line 193,col 9)-(line 193,col 29)",
        "(line 194,col 9)-(line 194,col 44)",
        "(line 195,col 9)-(line 195,col 44)",
        "(line 196,col 9)-(line 196,col 44)",
        "(line 198,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getRadixDigits()",
      "begin_line": 248,
      "end_line": 250,
      "comment": " Get the number of radix digits of the {@link Dfp} instances built by this factory.\n     * @return number of radix digits\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.setRoundingMode(org.apache.commons.math.dfp.DfpField.RoundingMode)",
      "begin_line": 259,
      "end_line": 261,
      "comment": " Set the rounding mode.\n     *  If not set, the default value is {@link RoundingMode#ROUND_HALF_EVEN}.\n     * @param mode desired rounding mode\n     * Note that the rounding mode is common to all {@link Dfp} instances\n     * belonging to the current {@link DfpField} in the system and will\n     * affect all future calculations.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getRoundingMode()",
      "begin_line": 266,
      "end_line": 268,
      "comment": " Get the current rounding mode.\n     * @return current rounding mode\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getIEEEFlags()",
      "begin_line": 281,
      "end_line": 283,
      "comment": " Get the IEEE 854 status flags.\n     * @return IEEE 854 status flags\n     * @see #clearIEEEFlags()\n     * @see #setIEEEFlags(int)\n     * @see #setIEEEFlagsBits(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.clearIEEEFlags()",
      "begin_line": 295,
      "end_line": 297,
      "comment": " Clears the IEEE 854 status flags.\n     * @see #getIEEEFlags()\n     * @see #setIEEEFlags(int)\n     * @see #setIEEEFlagsBits(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.setIEEEFlags(int)",
      "begin_line": 310,
      "end_line": 312,
      "comment": " Sets the IEEE 854 status flags.\n     * @param flags desired value for the flags\n     * @see #getIEEEFlags()\n     * @see #clearIEEEFlags()\n     * @see #setIEEEFlagsBits(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.setIEEEFlagsBits(int)",
      "begin_line": 328,
      "end_line": 330,
      "comment": " Sets some bits in the IEEE 854 status flags, without changing the already set bits.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call {@code setIEEEFlags(getIEEEFlags() | bits)}\n     * \u003c/p\u003e\n     * @param bits bits to set\n     * @see #getIEEEFlags()\n     * @see #clearIEEEFlags()\n     * @see #setIEEEFlags(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp()",
      "begin_line": 335,
      "end_line": 337,
      "comment": " Makes a {@link Dfp} with a value of 0.\n     * @return a new {@link Dfp} with a value of 0\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(byte)",
      "begin_line": 343,
      "end_line": 345,
      "comment": " Create an instance from a byte value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(int)",
      "begin_line": 351,
      "end_line": 353,
      "comment": " Create an instance from an int value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(long)",
      "begin_line": 359,
      "end_line": 361,
      "comment": " Create an instance from a long value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(double)",
      "begin_line": 367,
      "end_line": 369,
      "comment": " Create an instance from a double value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 375,
      "end_line": 377,
      "comment": " Copy constructor.\n     * @param d instance to copy\n     * @return a new {@link Dfp} with the same value as d\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(java.lang.String)",
      "begin_line": 383,
      "end_line": 385,
      "comment": " Create a {@link Dfp} given a String representation.\n     * @param s string representation of the instance\n     * @return a new {@link Dfp} parsed from specified string\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.newDfp(byte, byte)",
      "begin_line": 393,
      "end_line": 395,
      "comment": " Creates a {@link Dfp} with a non-finite value.\n     * @param sign sign of the Dfp to create\n     * @param nans code of the value, must be one of {@link Dfp#INFINITE},\n     * {@link Dfp#SNAN},  {@link Dfp#QNAN}\n     * @return a new {@link Dfp} with a non-finite value\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getZero()",
      "begin_line": 400,
      "end_line": 402,
      "comment": " Get the constant 0.\n     * @return a {@link Dfp} with value 0\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getOne()",
      "begin_line": 407,
      "end_line": 409,
      "comment": " Get the constant 1.\n     * @return a {@link Dfp} with value 1\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getRuntimeClass()",
      "begin_line": 412,
      "end_line": 414,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getTwo()",
      "begin_line": 419,
      "end_line": 421,
      "comment": " Get the constant 2.\n     * @return a {@link Dfp} with value 2\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr2()",
      "begin_line": 426,
      "end_line": 428,
      "comment": " Get the constant \u0026radic;2.\n     * @return a {@link Dfp} with value \u0026radic;2\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr2Split()",
      "begin_line": 433,
      "end_line": 435,
      "comment": " Get the constant \u0026radic;2 split in two pieces.\n     * @return a {@link Dfp} with value \u0026radic;2 split in two pieces\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr2Reciprocal()",
      "begin_line": 440,
      "end_line": 442,
      "comment": " Get the constant \u0026radic;2 / 2.\n     * @return a {@link Dfp} with value \u0026radic;2 / 2\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr3()",
      "begin_line": 447,
      "end_line": 449,
      "comment": " Get the constant \u0026radic;3.\n     * @return a {@link Dfp} with value \u0026radic;3\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getSqr3Reciprocal()",
      "begin_line": 454,
      "end_line": 456,
      "comment": " Get the constant \u0026radic;3 / 3.\n     * @return a {@link Dfp} with value \u0026radic;3 / 3\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getPi()",
      "begin_line": 461,
      "end_line": 463,
      "comment": " Get the constant \u0026pi;.\n     * @return a {@link Dfp} with value \u0026pi;\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getPiSplit()",
      "begin_line": 468,
      "end_line": 470,
      "comment": " Get the constant \u0026pi; split in two pieces.\n     * @return a {@link Dfp} with value \u0026pi; split in two pieces\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getE()",
      "begin_line": 475,
      "end_line": 477,
      "comment": " Get the constant e.\n     * @return a {@link Dfp} with value e\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getESplit()",
      "begin_line": 482,
      "end_line": 484,
      "comment": " Get the constant e split in two pieces.\n     * @return a {@link Dfp} with value e split in two pieces\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn2()",
      "begin_line": 489,
      "end_line": 491,
      "comment": " Get the constant ln(2).\n     * @return a {@link Dfp} with value ln(2)\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn2Split()",
      "begin_line": 496,
      "end_line": 498,
      "comment": " Get the constant ln(2) split in two pieces.\n     * @return a {@link Dfp} with value ln(2) split in two pieces\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn5()",
      "begin_line": 503,
      "end_line": 505,
      "comment": " Get the constant ln(5).\n     * @return a {@link Dfp} with value ln(5)\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn5Split()",
      "begin_line": 510,
      "end_line": 512,
      "comment": " Get the constant ln(5) split in two pieces.\n     * @return a {@link Dfp} with value ln(5) split in two pieces\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.getLn10()",
      "begin_line": 517,
      "end_line": 519,
      "comment": " Get the constant ln(10).\n     * @return a {@link Dfp} with value ln(10)\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.split(java.lang.String)",
      "begin_line": 527,
      "end_line": 570,
      "comment": " Breaks a string representation up into two {@link Dfp}\u0027s.\n     * The split is such that the sum of them is equivalent to the input string,\n     * but has higher precision than using a single Dfp.\n     * @param a string representation of the number to split\n     * @return an array of two {@link Dfp Dfp} instances which sum equals a\n     ",
      "child_ranges": [
        "(line 528,col 7)-(line 528,col 32)",
        "(line 529,col 7)-(line 529,col 29)",
        "(line 530,col 7)-(line 530,col 17)",
        "(line 531,col 7)-(line 531,col 18)",
        "(line 533,col 7)-(line 533,col 40)",
        "(line 535,col 7)-(line 555,col 7)",
        "(line 557,col 7)-(line 557,col 56)",
        "(line 559,col 7)-(line 564,col 7)",
        "(line 566,col 7)-(line 566,col 49)",
        "(line 568,col 7)-(line 568,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.computeStringConstants(int)",
      "begin_line": 575,
      "end_line": 599,
      "comment": " Recompute the high precision string constants.\n     * @param highPrecisionDecimalDigits precision at which the string constants mus be computed\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 598,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.computePi(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 607,
      "end_line": 642,
      "comment": " Compute \u0026pi; using Jonathan and Peter Borwein quartic formula.\n     * @param one constant with value 1 at desired precision\n     * @param two constant with value 2 at desired precision\n     * @param three constant with value 3 at desired precision\n     * @return \u0026pi;\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 33)",
        "(line 610,col 9)-(line 610,col 42)",
        "(line 611,col 9)-(line 611,col 35)",
        "(line 612,col 9)-(line 612,col 26)",
        "(line 613,col 9)-(line 613,col 72)",
        "(line 621,col 9)-(line 638,col 9)",
        "(line 640,col 9)-(line 640,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.computeExp(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 649,
      "end_line": 670,
      "comment": " Compute exp(a).\n     * @param a number for which we want the exponential\n     * @param one constant with value 1 at desired precision\n     * @return exp(a)\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 30)",
        "(line 652,col 9)-(line 652,col 30)",
        "(line 653,col 9)-(line 653,col 30)",
        "(line 654,col 9)-(line 654,col 30)",
        "(line 655,col 9)-(line 655,col 30)",
        "(line 657,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 668,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpField.computeLn(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 732,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 20)",
        "(line 735,col 9)-(line 735,col 68)",
        "(line 737,col 9)-(line 737,col 27)",
        "(line 738,col 9)-(line 738,col 29)",
        "(line 739,col 9)-(line 739,col 28)",
        "(line 740,col 9)-(line 750,col 9)",
        "(line 752,col 9)-(line 752,col 31)"
      ]
    }
  ]
}