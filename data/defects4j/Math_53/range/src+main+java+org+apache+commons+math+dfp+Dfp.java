{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/dfp/Dfp.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Dfp",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.FieldElement\u003corg.apache.commons.math.dfp.Dfp\u003e"
      ],
      "begin_line": 96,
      "end_line": 2405,
      "comment": "\n *  Decimal floating point library for Java\n *\n *  \u003cp\u003eAnother floating point class.  This one is built using radix 10000\n *  which is 10\u003csup\u003e4\u003c/sup\u003e, so its almost decimal.\u003c/p\u003e\n *\n *  \u003cp\u003eThe design goals here are:\n *  \u003col\u003e\n *    \u003cli\u003eDecimal math, or close to it\u003c/li\u003e\n *    \u003cli\u003eSettable precision (but no mix between numbers using different settings)\u003c/li\u003e\n *    \u003cli\u003ePortability.  Code should be kept as portable as possible.\u003c/li\u003e\n *    \u003cli\u003ePerformance\u003c/li\u003e\n *    \u003cli\u003eAccuracy  - Results should always be +/- 1 ULP for basic\n *         algebraic operation\u003c/li\u003e\n *    \u003cli\u003eComply with IEEE 854-1987 as much as possible.\n *         (See IEEE 854-1987 notes below)\u003c/li\u003e\n *  \u003c/ol\u003e\u003c/p\u003e\n *\n *  \u003cp\u003eTrade offs:\n *  \u003col\u003e\n *    \u003cli\u003eMemory foot print.  I\u0027m using more memory than necessary to\n *         represent numbers to get better performance.\u003c/li\u003e\n *    \u003cli\u003eDigits are bigger, so rounding is a greater loss.  So, if you\n *         really need 12 decimal digits, better use 4 base 10000 digits\n *         there can be one partially filled.\u003c/li\u003e\n *  \u003c/ol\u003e\u003c/p\u003e\n *\n *  \u003cp\u003eNumbers are represented  in the following form:\n *  \u003cpre\u003e\n *  n  \u003d  sign \u0026times; mant \u0026times; (radix)\u003csup\u003eexp\u003c/sup\u003e;\u003c/p\u003e\n *  \u003c/pre\u003e\n *  where sign is \u0026plusmn;1, mantissa represents a fractional number between\n *  zero and one.  mant[0] is the least significant digit.\n *  exp is in the range of -32767 to 32768\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854-1987  Notes and differences\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 requires the radix to be either 2 or 10.  The radix here is\n *  10000, so that requirement is not met, but  it is possible that a\n *  subclassed can be made to make it behave as a radix 10\n *  number.  It is my opinion that if it looks and behaves as a radix\n *  10 number then it is one and that requirement would be met.\u003c/p\u003e\n *\n *  \u003cp\u003eThe radix of 10000 was chosen because it should be faster to operate\n *  on 4 decimal digits at once instead of one at a time.  Radix 10 behavior\n *  can be realized by adding an additional rounding step to ensure that\n *  the number of decimal digits represented is constant.\u003c/p\u003e\n *\n *  \u003cp\u003eThe IEEE standard specifically leaves out internal data encoding,\n *  so it is reasonable to conclude that such a subclass of this radix\n *  10000 system is merely an encoding of a radix 10 system.\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 also specifies the existence of \"sub-normal\" numbers.  This\n *  class does not contain any such entities.  The most significant radix\n *  10000 digit is always non-zero.  Instead, we support \"gradual underflow\"\n *  by raising the underflow flag for numbers less with exponent less than\n *  expMin, but don\u0027t flush to zero until the exponent reaches MIN_EXP-digits.\n *  Thus the smallest number we can represent would be:\n *  1E(-(MIN_EXP-digits-1)*4),  eg, for digits\u003d5, MIN_EXP\u003d-32767, that would\n *  be 1e-131092.\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 defines that the implied radix point lies just to the right\n *  of the most significant digit and to the left of the remaining digits.\n *  This implementation puts the implied radix point to the left of all\n *  digits including the most significant one.  The most significant digit\n *  here is the one just to the right of the radix point.  This is a fine\n *  detail and is really only a matter of definition.  Any side effects of\n *  this can be rendered invisible by a subclass.\u003c/p\u003e\n * @see DfpField\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "RADIX"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The radix, or base of this system.  Set to 10000 "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EXP"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The minimum exponent before underflow is signaled.  Flush to zero\n     *  occurs at minExp-DIGITS "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EXP"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The maximum exponent before overflow is signaled and results flushed\n     *  to infinity "
    },
    {
      "type": "field",
      "varNames": [
        "ERR_SCALE"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The amount under/overflows are scaled by before going to trap handler "
    },
    {
      "type": "field",
      "varNames": [
        "FINITE"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Indicator value for normal finite numbers. "
    },
    {
      "type": "field",
      "varNames": [
        "INFINITE"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Indicator value for Infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "SNAN"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Indicator value for signaling NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "QNAN"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Indicator value for quiet NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "NAN_STRING"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " String for NaN representation. "
    },
    {
      "type": "field",
      "varNames": [
        "POS_INFINITY_STRING"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " String for positive infinity representation. "
    },
    {
      "type": "field",
      "varNames": [
        "NEG_INFINITY_STRING"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " String for negative infinity representation. "
    },
    {
      "type": "field",
      "varNames": [
        "ADD_TRAP"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Name for traps triggered by addition. "
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLY_TRAP"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " Name for traps triggered by multiplication. "
    },
    {
      "type": "field",
      "varNames": [
        "DIVIDE_TRAP"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Name for traps triggered by division. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT_TRAP"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Name for traps triggered by square root. "
    },
    {
      "type": "field",
      "varNames": [
        "ALIGN_TRAP"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Name for traps triggered by alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "TRUNC_TRAP"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " Name for traps triggered by truncation. "
    },
    {
      "type": "field",
      "varNames": [
        "NEXT_AFTER_TRAP"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Name for traps triggered by nextAfter. "
    },
    {
      "type": "field",
      "varNames": [
        "LESS_THAN_TRAP"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " Name for traps triggered by lessThan. "
    },
    {
      "type": "field",
      "varNames": [
        "GREATER_THAN_TRAP"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " Name for traps triggered by greaterThan. "
    },
    {
      "type": "field",
      "varNames": [
        "NEW_INSTANCE_TRAP"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " Name for traps triggered by newInstance. "
    },
    {
      "type": "field",
      "varNames": [
        "mant"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " Mantissa. "
    },
    {
      "type": "field",
      "varNames": [
        "sign"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Sign bit: 1 for positive, -1 for negative. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "nans"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Indicator for non-finite / non-number values. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Factory building similar Dfp\u0027s. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField)",
      "begin_line": 181,
      "end_line": 187,
      "comment": " Makes an instance with a value of zero.\n     * @param field field to which this instance belongs\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 47)",
        "(line 183,col 9)-(line 183,col 17)",
        "(line 184,col 9)-(line 184,col 16)",
        "(line 185,col 9)-(line 185,col 22)",
        "(line 186,col 9)-(line 186,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, byte)",
      "begin_line": 193,
      "end_line": 195,
      "comment": " Create an instance from a byte value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, int)",
      "begin_line": 201,
      "end_line": 203,
      "comment": " Create an instance from an int value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, long)",
      "begin_line": 209,
      "end_line": 250,
      "comment": " Create an instance from a long value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 22)",
        "(line 214,col 9)-(line 214,col 27)",
        "(line 216,col 9)-(line 216,col 34)",
        "(line 217,col 9)-(line 222,col 9)",
        "(line 225,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 16)",
        "(line 233,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, double)",
      "begin_line": 256,
      "end_line": 317,
      "comment": " Create an instance from a double value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 47)",
        "(line 260,col 9)-(line 260,col 17)",
        "(line 261,col 9)-(line 261,col 16)",
        "(line 262,col 9)-(line 262,col 22)",
        "(line 263,col 9)-(line 263,col 27)",
        "(line 265,col 9)-(line 265,col 47)",
        "(line 266,col 9)-(line 266,col 51)",
        "(line 267,col 9)-(line 267,col 73)",
        "(line 269,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 44)",
        "(line 305,col 9)-(line 305,col 82)",
        "(line 306,col 9)-(line 306,col 68)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 61)",
        "(line 313,col 9)-(line 313,col 25)",
        "(line 314,col 9)-(line 314,col 24)",
        "(line 315,col 9)-(line 315,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 322,
      "end_line": 328,
      "comment": " Copy constructor.\n     * @param d instance to copy\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 31)",
        "(line 324,col 9)-(line 324,col 23)",
        "(line 325,col 9)-(line 325,col 22)",
        "(line 326,col 9)-(line 326,col 23)",
        "(line 327,col 9)-(line 327,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, java.lang.String)",
      "begin_line": 334,
      "end_line": 533,
      "comment": " Create an instance from a String representation.\n     * @param field field to which this instance belongs\n     * @param s string representation of the instance\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 47)",
        "(line 338,col 9)-(line 338,col 17)",
        "(line 339,col 9)-(line 339,col 16)",
        "(line 340,col 9)-(line 340,col 22)",
        "(line 341,col 9)-(line 341,col 27)",
        "(line 343,col 9)-(line 343,col 37)",
        "(line 344,col 9)-(line 344,col 28)",
        "(line 345,col 9)-(line 345,col 29)",
        "(line 346,col 9)-(line 346,col 79)",
        "(line 349,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 365,col 9)",
        "(line 368,col 9)-(line 368,col 31)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 31)",
        "(line 374,col 9)-(line 374,col 23)",
        "(line 375,col 9)-(line 399,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 407,col 9)-(line 407,col 14)",
        "(line 410,col 9)-(line 410,col 27)",
        "(line 411,col 9)-(line 429,col 9)",
        "(line 432,col 9)-(line 432,col 23)",
        "(line 433,col 9)-(line 433,col 25)",
        "(line 434,col 9)-(line 434,col 25)",
        "(line 435,col 9)-(line 435,col 25)",
        "(line 436,col 9)-(line 436,col 25)",
        "(line 437,col 9)-(line 437,col 32)",
        "(line 438,col 9)-(line 464,col 9)",
        "(line 468,col 9)-(line 480,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 493,col 9)-(line 493,col 19)",
        "(line 494,col 9)-(line 494,col 39)",
        "(line 496,col 9)-(line 501,col 9)",
        "(line 504,col 9)-(line 504,col 70)",
        "(line 505,col 9)-(line 505,col 15)",
        "(line 506,col 9)-(line 506,col 24)",
        "(line 509,col 9)-(line 513,col 9)",
        "(line 517,col 9)-(line 523,col 9)",
        "(line 526,col 9)-(line 526,col 42)",
        "(line 528,col 9)-(line 531,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, byte, byte)",
      "begin_line": 541,
      "end_line": 547,
      "comment": " Creates an instance with a non-finite value.\n     * @param field field to which this instance belongs\n     * @param sign sign of the Dfp to create\n     * @param nans code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 27)",
        "(line 543,col 9)-(line 543,col 55)",
        "(line 544,col 9)-(line 544,col 28)",
        "(line 545,col 9)-(line 545,col 25)",
        "(line 546,col 9)-(line 546,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance()",
      "begin_line": 553,
      "end_line": 555,
      "comment": " Create an instance with a value of 0.\n     * Use this internally in preference to constructors to facilitate subclasses\n     * @return a new instance with a value of 0\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(byte)",
      "begin_line": 561,
      "end_line": 563,
      "comment": " Create an instance from a byte value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(int)",
      "begin_line": 569,
      "end_line": 571,
      "comment": " Create an instance from an int value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(long)",
      "begin_line": 577,
      "end_line": 579,
      "comment": " Create an instance from a long value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(double)",
      "begin_line": 585,
      "end_line": 587,
      "comment": " Create an instance from a double value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 594,
      "end_line": 606,
      "comment": " Create an instance by copying an existing one.\n     * Use this internally in preference to constructors to facilitate subclasses.\n     * @param d instance to copy\n     * @return a new instance with the same value as d\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(java.lang.String)",
      "begin_line": 613,
      "end_line": 615,
      "comment": " Create an instance from a String representation.\n     * Use this internally in preference to constructors to facilitate subclasses.\n     * @param s string representation of the instance\n     * @return a new instance parsed from specified string\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(byte, byte)",
      "begin_line": 623,
      "end_line": 625,
      "comment": " Creates an instance with a non-finite value.\n     * @param sig sign of the Dfp to create\n     * @param code code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     * @return a new instance with a non-finite value\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getField()",
      "begin_line": 634,
      "end_line": 636,
      "comment": " Get the {@link org.apache.commons.math.Field Field} (really a {@link DfpField}) to which the instance belongs.\n     * \u003cp\u003e\n     * The field is linked to the number of digits and acts as a factory\n     * for {@link Dfp} instances.\n     * \u003c/p\u003e\n     * @return {@link org.apache.commons.math.Field Field} (really a {@link DfpField}) to which the instance belongs\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getRadixDigits()",
      "begin_line": 641,
      "end_line": 643,
      "comment": " Get the number of radix digits of the instance.\n     * @return number of radix digits\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getZero()",
      "begin_line": 648,
      "end_line": 650,
      "comment": " Get the constant 0.\n     * @return a Dfp with value zero\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getOne()",
      "begin_line": 655,
      "end_line": 657,
      "comment": " Get the constant 1.\n     * @return a Dfp with value one\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getTwo()",
      "begin_line": 662,
      "end_line": 664,
      "comment": " Get the constant 2.\n     * @return a Dfp with value two\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.shiftLeft()",
      "begin_line": 668,
      "end_line": 674,
      "comment": " Shift the mantissa left, and adjust the exponent to compensate.\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 20)",
        "(line 673,col 9)-(line 673,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.shiftRight()",
      "begin_line": 680,
      "end_line": 686,
      "comment": " Shift the mantissa right, and adjust the exponent to compensate.\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 34)",
        "(line 685,col 9)-(line 685,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.align(int)",
      "begin_line": 696,
      "end_line": 747,
      "comment": " Make our exp equal to the supplied one, this may cause rounding.\n     *  Also causes de-normalized numbers.  These numbers are generally\n     *  dangerous because most routines assume normalized numbers.\n     *  Align doesn\u0027t round, so it will return the last digit destroyed\n     *  by shifting right.\n     *  @param e desired exponent\n     *  @return last digit destroyed by shifting right\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 26)",
        "(line 698,col 9)-(line 698,col 32)",
        "(line 700,col 9)-(line 700,col 27)",
        "(line 702,col 9)-(line 702,col 25)",
        "(line 703,col 9)-(line 705,col 9)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 711,col 9)-(line 720,col 9)",
        "(line 722,col 9)-(line 738,col 9)",
        "(line 740,col 9)-(line 743,col 9)",
        "(line 745,col 9)-(line 745,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.lessThan(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 753,
      "end_line": 772,
      "comment": " Check if instance is less than x.\n     * @param x number to check instance against\n     * @return true if instance is less than x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 762,col 9)",
        "(line 765,col 9)-(line 769,col 9)",
        "(line 771,col 9)-(line 771,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.greaterThan(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 778,
      "end_line": 797,
      "comment": " Check if instance is greater than x.\n     * @param x number to check instance against\n     * @return true if instance is greater than x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 787,col 9)",
        "(line 790,col 9)-(line 794,col 9)",
        "(line 796,col 9)-(line 796,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.isInfinite()",
      "begin_line": 802,
      "end_line": 804,
      "comment": " Check if instance is infinite.\n     * @return true if instance is infinite\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.isNaN()",
      "begin_line": 809,
      "end_line": 811,
      "comment": " Check if instance is not a number.\n     * @return true if instance is not a number\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.equals(java.lang.Object)",
      "begin_line": 817,
      "end_line": 831,
      "comment": " Check if instance is equal to x.\n     * @param other object to check instance against\n     * @return true if instance is equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 827,col 9)",
        "(line 829,col 9)-(line 829,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.hashCode()",
      "begin_line": 837,
      "end_line": 840,
      "comment": "\n     * Gets a hashCode for the instance.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.unequal(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 846,
      "end_line": 852,
      "comment": " Check if instance is not equal to x.\n     * @param x number to check instance against\n     * @return true if instance is not equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 849,col 9)",
        "(line 851,col 9)-(line 851,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.compare(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 860,
      "end_line": 912,
      "comment": " Compare two instances.\n     * @param a first instance in comparison\n     * @param b second instance in comparison\n     * @return -1 if a\u003cb, 1 if a\u003eb and 0 if a\u003d\u003db\n     *  Note this method does not properly handle NaNs or numbers with different precision.\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 865,col 9)",
        "(line 867,col 9)-(line 873,col 9)",
        "(line 876,col 9)-(line 878,col 9)",
        "(line 880,col 9)-(line 882,col 9)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 889,col 9)-(line 897,col 9)",
        "(line 900,col 9)-(line 908,col 9)",
        "(line 910,col 9)-(line 910,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.rint()",
      "begin_line": 919,
      "end_line": 921,
      "comment": " Round to nearest integer using the round-half-even method.\n     *  That is round to nearest integer unless both are equidistant.\n     *  In which case round to the even one.\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 920,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.floor()",
      "begin_line": 927,
      "end_line": 929,
      "comment": " Round to an integer using the round floor mode.\n     * That is, round toward -Infinity\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.ceil()",
      "begin_line": 935,
      "end_line": 937,
      "comment": " Round to an integer using the round ceil mode.\n     * That is, round toward +Infinity\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.remainder(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 943,
      "end_line": 954,
      "comment": " Returns the IEEE remainder.\n     * @param d divisor\n     * @return this less n \u0026times; d, where n is the integer closest to this/d\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 76)",
        "(line 948,col 9)-(line 950,col 9)",
        "(line 952,col 9)-(line 952,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)",
      "begin_line": 960,
      "end_line": 1044,
      "comment": " Does the integer conversions with the specified rounding.\n     * @param rmode rounding mode to use\n     * @return truncated value\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 32)",
        "(line 963,col 9)-(line 965,col 9)",
        "(line 967,col 9)-(line 969,col 9)",
        "(line 971,col 9)-(line 974,col 9)",
        "(line 978,col 9)-(line 983,col 9)",
        "(line 989,col 9)-(line 991,col 9)",
        "(line 996,col 9)-(line 996,col 39)",
        "(line 997,col 9)-(line 1000,col 9)",
        "(line 1002,col 9)-(line 1041,col 9)",
        "(line 1043,col 9)-(line 1043,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.intValue()",
      "begin_line": 1050,
      "end_line": 1073,
      "comment": " Convert this to an integer.\n     * If greater than 2147483647, it returns 2147483647. If less than -2147483648 it returns -2147483648.\n     * @return converted number\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 20)",
        "(line 1052,col 9)-(line 1052,col 23)",
        "(line 1054,col 9)-(line 1054,col 25)",
        "(line 1056,col 9)-(line 1058,col 9)",
        "(line 1060,col 9)-(line 1062,col 9)",
        "(line 1064,col 9)-(line 1066,col 9)",
        "(line 1068,col 9)-(line 1070,col 9)",
        "(line 1072,col 9)-(line 1072,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.log10K()",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": " Get the exponent of the greatest power of 10000 that is\n     *  less than or equal to the absolute value of this.  I.E.  if\n     *  this is 10\u003csup\u003e6\u003c/sup\u003e then log10K would return 1.\n     *  @return integer base 10000 logarithm\n     ",
      "child_ranges": [
        "(line 1081,col 9)-(line 1081,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.power10K(int)",
      "begin_line": 1088,
      "end_line": 1092,
      "comment": " Get the specified  power of 10000.\n     * @param e desired power\n     * @return 10000\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 38)",
        "(line 1090,col 9)-(line 1090,col 22)",
        "(line 1091,col 9)-(line 1091,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.log10()",
      "begin_line": 1097,
      "end_line": 1108,
      "comment": " Get the exponent of the greatest power of 10 that is less than or equal to abs(this).\n     *  @return integer base 10 logarithm\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1103,col 9)",
        "(line 1104,col 9)-(line 1106,col 9)",
        "(line 1107,col 9)-(line 1107,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.power10(int)",
      "begin_line": 1114,
      "end_line": 1137,
      "comment": " Return the specified  power of 10.\n     * @param e desired power\n     * @return 10\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1115,col 9)-(line 1115,col 38)",
        "(line 1117,col 9)-(line 1121,col 9)",
        "(line 1123,col 9)-(line 1134,col 9)",
        "(line 1136,col 9)-(line 1136,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.complement(int)",
      "begin_line": 1145,
      "end_line": 1161,
      "comment": " Negate the mantissa of this by computing the complement.\n     *  Leaves the sign bit unchanged, used internally by add.\n     *  Denormalized numbers are handled properly here.\n     *  @param extra ???\n     *  @return ???\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 28)",
        "(line 1148,col 9)-(line 1150,col 9)",
        "(line 1152,col 9)-(line 1152,col 31)",
        "(line 1153,col 9)-(line 1153,col 35)",
        "(line 1154,col 9)-(line 1158,col 9)",
        "(line 1160,col 9)-(line 1160,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.add(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 1167,
      "end_line": 1310,
      "comment": " Add x to this.\n     * @param x number to add\n     * @return sum of this and x\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1175,col 9)",
        "(line 1178,col 9)-(line 1206,col 9)",
        "(line 1209,col 9)-(line 1209,col 34)",
        "(line 1210,col 9)-(line 1210,col 31)",
        "(line 1213,col 9)-(line 1213,col 44)",
        "(line 1216,col 9)-(line 1216,col 34)",
        "(line 1217,col 9)-(line 1217,col 34)",
        "(line 1219,col 9)-(line 1219,col 19)",
        "(line 1220,col 9)-(line 1220,col 19)",
        "(line 1223,col 9)-(line 1223,col 27)",
        "(line 1224,col 9)-(line 1226,col 9)",
        "(line 1231,col 9)-(line 1233,col 9)",
        "(line 1235,col 9)-(line 1237,col 9)",
        "(line 1240,col 9)-(line 1240,col 28)",
        "(line 1241,col 9)-(line 1241,col 28)",
        "(line 1242,col 9)-(line 1246,col 9)",
        "(line 1249,col 9)-(line 1255,col 9)",
        "(line 1258,col 9)-(line 1258,col 19)",
        "(line 1259,col 9)-(line 1263,col 9)",
        "(line 1264,col 9)-(line 1264,col 27)",
        "(line 1265,col 9)-(line 1265,col 28)",
        "(line 1270,col 9)-(line 1278,col 9)",
        "(line 1281,col 9)-(line 1291,col 9)",
        "(line 1294,col 9)-(line 1301,col 9)",
        "(line 1304,col 9)-(line 1304,col 65)",
        "(line 1305,col 9)-(line 1307,col 9)",
        "(line 1309,col 9)-(line 1309,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.negate()",
      "begin_line": 1315,
      "end_line": 1319,
      "comment": " Returns a number that is this number with the sign bit reversed.\n     * @return the opposite of this\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1316,col 39)",
        "(line 1317,col 9)-(line 1317,col 43)",
        "(line 1318,col 9)-(line 1318,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.subtract(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 1325,
      "end_line": 1327,
      "comment": " Subtract x from this.\n     * @param x number to subtract\n     * @return difference of this and a\n     ",
      "child_ranges": [
        "(line 1326,col 9)-(line 1326,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.round(int)",
      "begin_line": 1333,
      "end_line": 1406,
      "comment": " Round this given the next digit n using the current rounding mode.\n     * @param n ???\n     * @return the IEEE flag if an exception occurred\n     ",
      "child_ranges": [
        "(line 1334,col 9)-(line 1334,col 28)",
        "(line 1335,col 9)-(line 1368,col 9)",
        "(line 1370,col 9)-(line 1383,col 9)",
        "(line 1386,col 9)-(line 1390,col 9)",
        "(line 1392,col 9)-(line 1396,col 9)",
        "(line 1398,col 9)-(line 1402,col 9)",
        "(line 1404,col 9)-(line 1404,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.multiply(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 1412,
      "end_line": 1512,
      "comment": " Multiply this by x.\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1415,col 9)-(line 1420,col 9)",
        "(line 1422,col 9)-(line 1422,col 44)",
        "(line 1425,col 9)-(line 1460,col 9)",
        "(line 1462,col 9)-(line 1462,col 47)",
        "(line 1464,col 9)-(line 1474,col 9)",
        "(line 1477,col 9)-(line 1477,col 37)",
        "(line 1478,col 9)-(line 1483,col 9)",
        "(line 1486,col 9)-(line 1488,col 9)",
        "(line 1491,col 9)-(line 1491,col 60)",
        "(line 1492,col 9)-(line 1492,col 52)",
        "(line 1494,col 9)-(line 1497,col 9)",
        "(line 1499,col 9)-(line 1499,col 23)",
        "(line 1500,col 9)-(line 1504,col 9)",
        "(line 1506,col 9)-(line 1508,col 9)",
        "(line 1510,col 9)-(line 1510,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.multiply(int)",
      "begin_line": 1519,
      "end_line": 1575,
      "comment": " Multiply this by a single digit 0\u0026lt;\u003dx\u0026lt;radix.\n     * There are speed advantages in this special case\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1520,col 9)-(line 1520,col 39)",
        "(line 1523,col 9)-(line 1540,col 9)",
        "(line 1543,col 9)-(line 1549,col 9)",
        "(line 1551,col 9)-(line 1551,col 19)",
        "(line 1552,col 9)-(line 1556,col 9)",
        "(line 1558,col 9)-(line 1558,col 26)",
        "(line 1559,col 9)-(line 1563,col 9)",
        "(line 1565,col 9)-(line 1567,col 9)",
        "(line 1569,col 9)-(line 1569,col 49)",
        "(line 1570,col 9)-(line 1572,col 9)",
        "(line 1574,col 9)-(line 1574,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.divide(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 1581,
      "end_line": 1789,
      "comment": " Divide this by divisor.\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1582,col 9)-(line 1582,col 23)",
        "(line 1583,col 9)-(line 1583,col 23)",
        "(line 1584,col 9)-(line 1584,col 24)",
        "(line 1585,col 9)-(line 1585,col 15)",
        "(line 1586,col 9)-(line 1586,col 17)",
        "(line 1587,col 9)-(line 1587,col 20)",
        "(line 1588,col 9)-(line 1588,col 19)",
        "(line 1589,col 9)-(line 1589,col 26)",
        "(line 1590,col 9)-(line 1590,col 17)",
        "(line 1591,col 9)-(line 1591,col 17)",
        "(line 1594,col 9)-(line 1599,col 9)",
        "(line 1601,col 9)-(line 1601,col 44)",
        "(line 1604,col 9)-(line 1632,col 9)",
        "(line 1635,col 9)-(line 1642,col 9)",
        "(line 1644,col 9)-(line 1644,col 42)",
        "(line 1645,col 9)-(line 1645,col 42)",
        "(line 1646,col 9)-(line 1646,col 43)",
        "(line 1650,col 9)-(line 1650,col 34)",
        "(line 1651,col 9)-(line 1651,col 34)",
        "(line 1652,col 9)-(line 1652,col 36)",
        "(line 1653,col 9)-(line 1653,col 35)",
        "(line 1658,col 9)-(line 1662,col 9)",
        "(line 1665,col 9)-(line 1665,col 17)",
        "(line 1666,col 9)-(line 1754,col 9)",
        "(line 1757,col 9)-(line 1757,col 25)",
        "(line 1758,col 9)-(line 1763,col 9)",
        "(line 1766,col 9)-(line 1768,col 9)",
        "(line 1771,col 9)-(line 1771,col 58)",
        "(line 1772,col 9)-(line 1772,col 63)",
        "(line 1774,col 9)-(line 1776,col 9)",
        "(line 1778,col 9)-(line 1782,col 9)",
        "(line 1784,col 9)-(line 1786,col 9)",
        "(line 1788,col 9)-(line 1788,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.divide(int)",
      "begin_line": 1796,
      "end_line": 1854,
      "comment": " Divide by a single digit less than radix.\n     *  Special case, so there are speed advantages. 0 \u0026lt;\u003d divisor \u0026lt; radix\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1799,col 9)-(line 1807,col 9)",
        "(line 1810,col 9)-(line 1817,col 9)",
        "(line 1820,col 9)-(line 1826,col 9)",
        "(line 1828,col 9)-(line 1828,col 39)",
        "(line 1830,col 9)-(line 1830,col 19)",
        "(line 1831,col 9)-(line 1836,col 9)",
        "(line 1838,col 9)-(line 1845,col 9)",
        "(line 1847,col 9)-(line 1847,col 60)",
        "(line 1848,col 9)-(line 1850,col 9)",
        "(line 1852,col 9)-(line 1852,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.sqrt()",
      "begin_line": 1859,
      "end_line": 1950,
      "comment": " Compute the square root.\n     * @return square root of the instance\n     ",
      "child_ranges": [
        "(line 1862,col 9)-(line 1865,col 9)",
        "(line 1867,col 9)-(line 1885,col 9)",
        "(line 1887,col 9)-(line 1896,col 9)",
        "(line 1898,col 9)-(line 1898,col 34)",
        "(line 1901,col 9)-(line 1903,col 9)",
        "(line 1906,col 9)-(line 1918,col 9)",
        "(line 1920,col 9)-(line 1920,col 32)",
        "(line 1925,col 9)-(line 1925,col 28)",
        "(line 1926,col 9)-(line 1926,col 28)",
        "(line 1927,col 9)-(line 1946,col 9)",
        "(line 1948,col 9)-(line 1948,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.toString()",
      "begin_line": 1955,
      "end_line": 1972,
      "comment": " Get a string representation of the instance.\n     * @return string representation of the instance\n     ",
      "child_ranges": [
        "(line 1957,col 9)-(line 1964,col 9)",
        "(line 1966,col 9)-(line 1968,col 9)",
        "(line 1970,col 9)-(line 1970,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.dfp2sci()",
      "begin_line": 1977,
      "end_line": 2053,
      "comment": " Convert an instance to a string using scientific notation.\n     * @return string representation of the instance in scientific notation\n     ",
      "child_ranges": [
        "(line 1978,col 9)-(line 1978,col 56)",
        "(line 1979,col 9)-(line 1979,col 61)",
        "(line 1980,col 9)-(line 1980,col 14)",
        "(line 1981,col 9)-(line 1981,col 14)",
        "(line 1982,col 9)-(line 1982,col 14)",
        "(line 1983,col 9)-(line 1983,col 15)",
        "(line 1984,col 9)-(line 1984,col 16)",
        "(line 1987,col 9)-(line 1987,col 14)",
        "(line 1988,col 9)-(line 1993,col 9)",
        "(line 1996,col 9)-(line 2000,col 9)",
        "(line 2001,col 9)-(line 2001,col 16)",
        "(line 2004,col 9)-(line 2004,col 14)",
        "(line 2005,col 9)-(line 2007,col 9)",
        "(line 2009,col 9)-(line 2024,col 9)",
        "(line 2026,col 9)-(line 2026,col 32)",
        "(line 2030,col 9)-(line 2030,col 30)",
        "(line 2031,col 9)-(line 2031,col 15)",
        "(line 2032,col 9)-(line 2034,col 9)",
        "(line 2037,col 9)-(line 2039,col 9)",
        "(line 2041,col 9)-(line 2043,col 9)",
        "(line 2045,col 9)-(line 2049,col 9)",
        "(line 2051,col 9)-(line 2051,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.dfp2string()",
      "begin_line": 2058,
      "end_line": 2126,
      "comment": " Convert an instance to a string using normal notation.\n     * @return string representation of the instance in normal notation\n     ",
      "child_ranges": [
        "(line 2059,col 9)-(line 2059,col 53)",
        "(line 2060,col 9)-(line 2060,col 18)",
        "(line 2061,col 9)-(line 2061,col 14)",
        "(line 2062,col 9)-(line 2062,col 20)",
        "(line 2063,col 9)-(line 2063,col 38)",
        "(line 2065,col 9)-(line 2065,col 24)",
        "(line 2067,col 9)-(line 2071,col 9)",
        "(line 2073,col 9)-(line 2079,col 9)",
        "(line 2081,col 9)-(line 2090,col 9)",
        "(line 2092,col 9)-(line 2098,col 9)",
        "(line 2100,col 9)-(line 2103,col 9)",
        "(line 2106,col 9)-(line 2106,col 14)",
        "(line 2107,col 9)-(line 2109,col 9)",
        "(line 2110,col 9)-(line 2112,col 9)",
        "(line 2115,col 9)-(line 2117,col 9)",
        "(line 2120,col 9)-(line 2122,col 9)",
        "(line 2124,col 9)-(line 2124,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.dotrap(int, java.lang.String, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 2135,
      "end_line": 2192,
      "comment": " Raises a trap.  This does not set the corresponding flag however.\n     *  @param type the trap type\n     *  @param what - name of routine trap occurred in\n     *  @param oper - input operator to function\n     *  @param result - the result computed prior to the trap\n     *  @return The suggested return value from the trap handler\n     ",
      "child_ranges": [
        "(line 2136,col 9)-(line 2136,col 25)",
        "(line 2138,col 9)-(line 2188,col 9)",
        "(line 2190,col 9)-(line 2190,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.trap(int, java.lang.String, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 2205,
      "end_line": 2207,
      "comment": " Trap handler.  Subclasses may override this to provide trap\n     *  functionality per IEEE 854-1987.\n     *\n     *  @param type  The exception type - e.g. FLAG_OVERFLOW\n     *  @param what  The name of the routine we were in e.g. divide()\n     *  @param oper  An operand to this function if any\n     *  @param def   The default return value if trap not enabled\n     *  @param result    The result that is specified to be delivered per\n     *                   IEEE 854, if any\n     *  @return the value that should be return by the operation triggering the trap\n     ",
      "child_ranges": [
        "(line 2206,col 9)-(line 2206,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.classify()",
      "begin_line": 2212,
      "end_line": 2214,
      "comment": " Returns the type - one of FINITE, INFINITE, SNAN, QNAN.\n     * @return type of the number\n     ",
      "child_ranges": [
        "(line 2213,col 9)-(line 2213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.copysign(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 2222,
      "end_line": 2226,
      "comment": " Creates an instance that is the same as x except that it has the sign of y.\n     * abs(x) \u003d dfp.copysign(x, dfp.one)\n     * @param x number to get the value from\n     * @param y number to get the sign from\n     * @return a number with the value of x and the sign of y\n     ",
      "child_ranges": [
        "(line 2223,col 9)-(line 2223,col 38)",
        "(line 2224,col 9)-(line 2224,col 29)",
        "(line 2225,col 9)-(line 2225,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.nextAfter(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 2233,
      "end_line": 2299,
      "comment": " Returns the next number greater than this one in the direction of x.\n     * If this\u003d\u003dx then simply returns this.\n     * @param x direction where to look at\n     * @return closest number next to instance in the direction of x\n     ",
      "child_ranges": [
        "(line 2236,col 9)-(line 2241,col 9)",
        "(line 2244,col 9)-(line 2244,col 27)",
        "(line 2245,col 9)-(line 2247,col 9)",
        "(line 2249,col 9)-(line 2251,col 9)",
        "(line 2253,col 9)-(line 2255,col 9)",
        "(line 2257,col 9)-(line 2257,col 22)",
        "(line 2258,col 9)-(line 2258,col 19)",
        "(line 2259,col 9)-(line 2285,col 9)",
        "(line 2287,col 9)-(line 2290,col 9)",
        "(line 2292,col 9)-(line 2295,col 9)",
        "(line 2297,col 9)-(line 2297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.toDouble()",
      "begin_line": 2305,
      "end_line": 2389,
      "comment": " Convert the instance into a double.\n     * @return a double approximating the instance\n     * @see #toSplitDouble()\n     ",
      "child_ranges": [
        "(line 2307,col 9)-(line 2313,col 9)",
        "(line 2315,col 9)-(line 2317,col 9)",
        "(line 2319,col 9)-(line 2319,col 21)",
        "(line 2320,col 9)-(line 2320,col 31)",
        "(line 2321,col 9)-(line 2321,col 44)",
        "(line 2322,col 9)-(line 2327,col 9)",
        "(line 2331,col 9)-(line 2331,col 47)",
        "(line 2332,col 9)-(line 2334,col 9)",
        "(line 2336,col 9)-(line 2336,col 54)",
        "(line 2337,col 9)-(line 2340,col 9)",
        "(line 2341,col 9)-(line 2341,col 19)",
        "(line 2345,col 9)-(line 2345,col 54)",
        "(line 2346,col 9)-(line 2348,col 9)",
        "(line 2350,col 9)-(line 2352,col 9)",
        "(line 2354,col 9)-(line 2356,col 9)",
        "(line 2359,col 9)-(line 2359,col 62)",
        "(line 2360,col 9)-(line 2360,col 34)",
        "(line 2361,col 9)-(line 2361,col 47)",
        "(line 2362,col 9)-(line 2362,col 44)",
        "(line 2364,col 9)-(line 2368,col 9)",
        "(line 2371,col 9)-(line 2373,col 9)",
        "(line 2375,col 9)-(line 2378,col 9)",
        "(line 2380,col 9)-(line 2380,col 58)",
        "(line 2381,col 9)-(line 2381,col 49)",
        "(line 2383,col 9)-(line 2385,col 9)",
        "(line 2387,col 9)-(line 2387,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.toSplitDouble()",
      "begin_line": 2395,
      "end_line": 2403,
      "comment": " Convert the instance into a split double.\n     * @return an array of two doubles which sum represent the instance\n     * @see #toDouble()\n     ",
      "child_ranges": [
        "(line 2396,col 9)-(line 2396,col 39)",
        "(line 2397,col 9)-(line 2397,col 40)",
        "(line 2399,col 9)-(line 2399,col 87)",
        "(line 2400,col 9)-(line 2400,col 62)",
        "(line 2402,col 9)-(line 2402,col 21)"
      ]
    }
  ]
}