{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/dfp/DfpField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DfpField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.Field\u003corg.apache.commons.math3.dfp.Dfp\u003e"
      ],
      "begin_line": 27,
      "end_line": 758,
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
      "begin_line": 81,
      "end_line": 81,
      "comment": " High precision string representation of \u0026radic;2 / 2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3String"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " High precision string representation of \u0026radic;3. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3ReciprocalString"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " High precision string representation of \u0026radic;3 / 3. "
    },
    {
      "type": "field",
      "varNames": [
        "piString"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " High precision string representation of \u0026pi;. "
    },
    {
      "type": "field",
      "varNames": [
        "eString"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " High precision string representation of e. "
    },
    {
      "type": "field",
      "varNames": [
        "ln2String"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " High precision string representation of ln(2). "
    },
    {
      "type": "field",
      "varNames": [
        "ln5String"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " High precision string representation of ln(5). "
    },
    {
      "type": "field",
      "varNames": [
        "ln10String"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " High precision string representation of ln(10). "
    },
    {
      "type": "field",
      "varNames": [
        "radixDigits"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The number of radix digits.\n     * Note these depend on the radix which is 10000 digits,\n     * so each one is equivalent to 4 decimal digits.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zero"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " A {@link Dfp} with value 0. "
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " A {@link Dfp} with value 1. "
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " A {@link Dfp} with value 2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " A {@link Dfp} with value \u0026radic;2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2Split"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " A two elements {@link Dfp} array with value \u0026radic;2 split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr2Reciprocal"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " A {@link Dfp} with value \u0026radic;2 / 2. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " A {@link Dfp} with value \u0026radic;3. "
    },
    {
      "type": "field",
      "varNames": [
        "sqr3Reciprocal"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " A {@link Dfp} with value \u0026radic;3 / 3. "
    },
    {
      "type": "field",
      "varNames": [
        "pi"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " A {@link Dfp} with value \u0026pi;. "
    },
    {
      "type": "field",
      "varNames": [
        "piSplit"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " A two elements {@link Dfp} array with value \u0026pi; split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " A {@link Dfp} with value e. "
    },
    {
      "type": "field",
      "varNames": [
        "eSplit"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " A two elements {@link Dfp} array with value e split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "ln2"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " A {@link Dfp} with value ln(2). "
    },
    {
      "type": "field",
      "varNames": [
        "ln2Split"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " A two elements {@link Dfp} array with value ln(2) split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "ln5"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " A {@link Dfp} with value ln(5). "
    },
    {
      "type": "field",
      "varNames": [
        "ln5Split"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " A two elements {@link Dfp} array with value ln(5) split in two pieces. "
    },
    {
      "type": "field",
      "varNames": [
        "ln10"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " A {@link Dfp} with value ln(10). "
    },
    {
      "type": "field",
      "varNames": [
        "rMode"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Current rounding mode. "
    },
    {
      "type": "field",
      "varNames": [
        "ieeeFlags"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " IEEE 854-1987 signals. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpField.DfpField(int)",
      "begin_line": 176,
      "end_line": 178,
      "comment": " Create a factory for the specified number of radix digits.\n     * \u003cp\u003e\n     * Note that since the {@link Dfp} class uses 10000 as its radix, each radix\n     * digit is equivalent to 4 decimal digits. This implies that asking for\n     * 13, 14, 15 or 16 decimal digits will really lead to a 4 radix 10000 digits in\n     * all cases.\n     * \u003c/p\u003e\n     * @param decimalDigits minimal number of decimal digits.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpField.DfpField(int, boolean)",
      "begin_line": 191,
      "end_line": 245,
      "comment": " Create a factory for the specified number of radix digits.\n     * \u003cp\u003e\n     * Note that since the {@link Dfp} class uses 10000 as its radix, each radix\n     * digit is equivalent to 4 decimal digits. This implies that asking for\n     * 13, 14, 15 or 16 decimal digits will really lead to a 4 radix 10000 digits in\n     * all cases.\n     * \u003c/p\u003e\n     * @param decimalDigits minimal number of decimal digits\n     * @param computeConstants if true, the transcendental constants for the given precision\n     * must be computed (setting this flag to false is RESERVED for the internal recursive call)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 78)",
        "(line 194,col 9)-(line 194,col 56)",
        "(line 195,col 9)-(line 195,col 29)",
        "(line 196,col 9)-(line 196,col 44)",
        "(line 197,col 9)-(line 197,col 44)",
        "(line 198,col 9)-(line 198,col 44)",
        "(line 200,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getRadixDigits()",
      "begin_line": 250,
      "end_line": 252,
      "comment": " Get the number of radix digits of the {@link Dfp} instances built by this factory.\n     * @return number of radix digits\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.setRoundingMode(org.apache.commons.math3.dfp.DfpField.RoundingMode)",
      "begin_line": 261,
      "end_line": 263,
      "comment": " Set the rounding mode.\n     *  If not set, the default value is {@link RoundingMode#ROUND_HALF_EVEN}.\n     * @param mode desired rounding mode\n     * Note that the rounding mode is common to all {@link Dfp} instances\n     * belonging to the current {@link DfpField} in the system and will\n     * affect all future calculations.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getRoundingMode()",
      "begin_line": 268,
      "end_line": 270,
      "comment": " Get the current rounding mode.\n     * @return current rounding mode\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getIEEEFlags()",
      "begin_line": 283,
      "end_line": 285,
      "comment": " Get the IEEE 854 status flags.\n     * @return IEEE 854 status flags\n     * @see #clearIEEEFlags()\n     * @see #setIEEEFlags(int)\n     * @see #setIEEEFlagsBits(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.clearIEEEFlags()",
      "begin_line": 297,
      "end_line": 299,
      "comment": " Clears the IEEE 854 status flags.\n     * @see #getIEEEFlags()\n     * @see #setIEEEFlags(int)\n     * @see #setIEEEFlagsBits(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.setIEEEFlags(int)",
      "begin_line": 312,
      "end_line": 314,
      "comment": " Sets the IEEE 854 status flags.\n     * @param flags desired value for the flags\n     * @see #getIEEEFlags()\n     * @see #clearIEEEFlags()\n     * @see #setIEEEFlagsBits(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.setIEEEFlagsBits(int)",
      "begin_line": 330,
      "end_line": 332,
      "comment": " Sets some bits in the IEEE 854 status flags, without changing the already set bits.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call {@code setIEEEFlags(getIEEEFlags() | bits)}\n     * \u003c/p\u003e\n     * @param bits bits to set\n     * @see #getIEEEFlags()\n     * @see #clearIEEEFlags()\n     * @see #setIEEEFlags(int)\n     * @see #FLAG_INVALID\n     * @see #FLAG_DIV_ZERO\n     * @see #FLAG_OVERFLOW\n     * @see #FLAG_UNDERFLOW\n     * @see #FLAG_INEXACT\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.newDfp()",
      "begin_line": 337,
      "end_line": 339,
      "comment": " Makes a {@link Dfp} with a value of 0.\n     * @return a new {@link Dfp} with a value of 0\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.newDfp(byte)",
      "begin_line": 345,
      "end_line": 347,
      "comment": " Create an instance from a byte value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.newDfp(int)",
      "begin_line": 353,
      "end_line": 355,
      "comment": " Create an instance from an int value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.newDfp(long)",
      "begin_line": 361,
      "end_line": 363,
      "comment": " Create an instance from a long value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.newDfp(double)",
      "begin_line": 369,
      "end_line": 371,
      "comment": " Create an instance from a double value.\n     * @param x value to convert to an instance\n     * @return a new {@link Dfp} with the same value as x\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.newDfp(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 377,
      "end_line": 379,
      "comment": " Copy constructor.\n     * @param d instance to copy\n     * @return a new {@link Dfp} with the same value as d\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.newDfp(java.lang.String)",
      "begin_line": 385,
      "end_line": 387,
      "comment": " Create a {@link Dfp} given a String representation.\n     * @param s string representation of the instance\n     * @return a new {@link Dfp} parsed from specified string\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.newDfp(byte, byte)",
      "begin_line": 395,
      "end_line": 397,
      "comment": " Creates a {@link Dfp} with a non-finite value.\n     * @param sign sign of the Dfp to create\n     * @param nans code of the value, must be one of {@link Dfp#INFINITE},\n     * {@link Dfp#SNAN},  {@link Dfp#QNAN}\n     * @return a new {@link Dfp} with a non-finite value\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getZero()",
      "begin_line": 402,
      "end_line": 404,
      "comment": " Get the constant 0.\n     * @return a {@link Dfp} with value 0\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getOne()",
      "begin_line": 409,
      "end_line": 411,
      "comment": " Get the constant 1.\n     * @return a {@link Dfp} with value 1\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getRuntimeClass()",
      "begin_line": 414,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getTwo()",
      "begin_line": 421,
      "end_line": 423,
      "comment": " Get the constant 2.\n     * @return a {@link Dfp} with value 2\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getSqr2()",
      "begin_line": 428,
      "end_line": 430,
      "comment": " Get the constant \u0026radic;2.\n     * @return a {@link Dfp} with value \u0026radic;2\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getSqr2Split()",
      "begin_line": 435,
      "end_line": 437,
      "comment": " Get the constant \u0026radic;2 split in two pieces.\n     * @return a {@link Dfp} with value \u0026radic;2 split in two pieces\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getSqr2Reciprocal()",
      "begin_line": 442,
      "end_line": 444,
      "comment": " Get the constant \u0026radic;2 / 2.\n     * @return a {@link Dfp} with value \u0026radic;2 / 2\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getSqr3()",
      "begin_line": 449,
      "end_line": 451,
      "comment": " Get the constant \u0026radic;3.\n     * @return a {@link Dfp} with value \u0026radic;3\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getSqr3Reciprocal()",
      "begin_line": 456,
      "end_line": 458,
      "comment": " Get the constant \u0026radic;3 / 3.\n     * @return a {@link Dfp} with value \u0026radic;3 / 3\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getPi()",
      "begin_line": 463,
      "end_line": 465,
      "comment": " Get the constant \u0026pi;.\n     * @return a {@link Dfp} with value \u0026pi;\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getPiSplit()",
      "begin_line": 470,
      "end_line": 472,
      "comment": " Get the constant \u0026pi; split in two pieces.\n     * @return a {@link Dfp} with value \u0026pi; split in two pieces\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getE()",
      "begin_line": 477,
      "end_line": 479,
      "comment": " Get the constant e.\n     * @return a {@link Dfp} with value e\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getESplit()",
      "begin_line": 484,
      "end_line": 486,
      "comment": " Get the constant e split in two pieces.\n     * @return a {@link Dfp} with value e split in two pieces\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getLn2()",
      "begin_line": 491,
      "end_line": 493,
      "comment": " Get the constant ln(2).\n     * @return a {@link Dfp} with value ln(2)\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getLn2Split()",
      "begin_line": 498,
      "end_line": 500,
      "comment": " Get the constant ln(2) split in two pieces.\n     * @return a {@link Dfp} with value ln(2) split in two pieces\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getLn5()",
      "begin_line": 505,
      "end_line": 507,
      "comment": " Get the constant ln(5).\n     * @return a {@link Dfp} with value ln(5)\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getLn5Split()",
      "begin_line": 512,
      "end_line": 514,
      "comment": " Get the constant ln(5) split in two pieces.\n     * @return a {@link Dfp} with value ln(5) split in two pieces\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.getLn10()",
      "begin_line": 519,
      "end_line": 521,
      "comment": " Get the constant ln(10).\n     * @return a {@link Dfp} with value ln(10)\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.split(java.lang.String)",
      "begin_line": 529,
      "end_line": 572,
      "comment": " Breaks a string representation up into two {@link Dfp}\u0027s.\n     * The split is such that the sum of them is equivalent to the input string,\n     * but has higher precision than using a single Dfp.\n     * @param a string representation of the number to split\n     * @return an array of two {@link Dfp Dfp} instances which sum equals a\n     ",
      "child_ranges": [
        "(line 530,col 7)-(line 530,col 32)",
        "(line 531,col 7)-(line 531,col 29)",
        "(line 532,col 7)-(line 532,col 17)",
        "(line 533,col 7)-(line 533,col 18)",
        "(line 535,col 7)-(line 535,col 40)",
        "(line 537,col 7)-(line 557,col 7)",
        "(line 559,col 7)-(line 559,col 56)",
        "(line 561,col 7)-(line 566,col 7)",
        "(line 568,col 7)-(line 568,col 49)",
        "(line 570,col 7)-(line 570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.computeStringConstants(int)",
      "begin_line": 577,
      "end_line": 601,
      "comment": " Recompute the high precision string constants.\n     * @param highPrecisionDecimalDigits precision at which the string constants mus be computed\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 600,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.computePi(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 609,
      "end_line": 644,
      "comment": " Compute \u0026pi; using Jonathan and Peter Borwein quartic formula.\n     * @param one constant with value 1 at desired precision\n     * @param two constant with value 2 at desired precision\n     * @param three constant with value 3 at desired precision\n     * @return \u0026pi;\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 33)",
        "(line 612,col 9)-(line 612,col 42)",
        "(line 613,col 9)-(line 613,col 35)",
        "(line 614,col 9)-(line 614,col 26)",
        "(line 615,col 9)-(line 615,col 72)",
        "(line 623,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.computeExp(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 651,
      "end_line": 672,
      "comment": " Compute exp(a).\n     * @param a number for which we want the exponential\n     * @param one constant with value 1 at desired precision\n     * @return exp(a)\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 30)",
        "(line 654,col 9)-(line 654,col 30)",
        "(line 655,col 9)-(line 655,col 30)",
        "(line 656,col 9)-(line 656,col 30)",
        "(line 657,col 9)-(line 657,col 30)",
        "(line 659,col 9)-(line 668,col 9)",
        "(line 670,col 9)-(line 670,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpField.computeLn(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 734,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 20)",
        "(line 737,col 9)-(line 737,col 68)",
        "(line 739,col 9)-(line 739,col 27)",
        "(line 740,col 9)-(line 740,col 29)",
        "(line 741,col 9)-(line 741,col 28)",
        "(line 742,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 754,col 31)"
      ]
    }
  ]
}