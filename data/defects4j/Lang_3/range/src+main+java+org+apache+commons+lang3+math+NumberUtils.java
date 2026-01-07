{
  "filepath": "/tmp/Lang-3b/src/main/java/org/apache/commons/lang3/math/NumberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 1423,
      "comment": "\n * \u003cp\u003eProvides extra functionality for Java Number classes.\u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_ZERO"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Reusable Long constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_ONE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Reusable Long constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_MINUS_ONE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Reusable Long constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_ZERO"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Reusable Integer constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_ONE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Reusable Integer constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_MINUS_ONE"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Reusable Integer constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_ZERO"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Reusable Short constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_ONE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Reusable Short constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_MINUS_ONE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Reusable Short constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_ZERO"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Reusable Byte constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_ONE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Reusable Byte constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MINUS_ONE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Reusable Byte constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_ZERO"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Reusable Double constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_ONE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Reusable Double constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_MINUS_ONE"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Reusable Double constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_ZERO"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Reusable Float constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_ONE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Reusable Float constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_MINUS_ONE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Reusable Float constant for minus one. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.math.NumberUtils.NumberUtils()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eNumberUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eNumberUtils.toInt(\"6\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toInt(java.lang.String)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toInt(null) \u003d 0\n     *   NumberUtils.toInt(\"\")   \u003d 0\n     *   NumberUtils.toInt(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the int represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toInt(java.lang.String, int)",
      "begin_line": 120,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toInt(null, 1) \u003d 1\n     *   NumberUtils.toInt(\"\", 1)   \u003d 1\n     *   NumberUtils.toInt(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the int represented by the string, or the default if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toLong(java.lang.String)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003elong\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toLong(null) \u003d 0L\n     *   NumberUtils.toLong(\"\")   \u003d 0L\n     *   NumberUtils.toLong(\"1\")  \u003d 1L\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the long represented by the string, or \u003ccode\u003e0\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toLong(java.lang.String, long)",
      "begin_line": 169,
      "end_line": 178,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003elong\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toLong(null, 1L) \u003d 1L\n     *   NumberUtils.toLong(\"\", 1L)   \u003d 1L\n     *   NumberUtils.toLong(\"1\", 0L)  \u003d 1L\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the long represented by the string, or the default if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toFloat(java.lang.String)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003efloat\u003c/code\u003e, returning\n     * \u003ccode\u003e0.0f\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     * \u003ccode\u003e0.0f\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toFloat(null)   \u003d 0.0f\n     *   NumberUtils.toFloat(\"\")     \u003d 0.0f\n     *   NumberUtils.toFloat(\"1.5\")  \u003d 1.5f\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the float represented by the string, or \u003ccode\u003e0.0f\u003c/code\u003e\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toFloat(java.lang.String, float)",
      "begin_line": 221,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003efloat\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the default\n     * value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toFloat(null, 1.1f)   \u003d 1.0f\n     *   NumberUtils.toFloat(\"\", 1.1f)     \u003d 1.1f\n     *   NumberUtils.toFloat(\"1.5\", 0.0f)  \u003d 1.5f\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue the default value\n     * @return the float represented by the string, or defaultValue\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 222,col 7)-(line 224,col 7)",
        "(line 225,col 7)-(line 229,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toDouble(java.lang.String)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003edouble\u003c/code\u003e, returning\n     * \u003ccode\u003e0.0d\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     * \u003ccode\u003e0.0d\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toDouble(null)   \u003d 0.0d\n     *   NumberUtils.toDouble(\"\")     \u003d 0.0d\n     *   NumberUtils.toDouble(\"1.5\")  \u003d 1.5d\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the double represented by the string, or \u003ccode\u003e0.0d\u003c/code\u003e\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toDouble(java.lang.String, double)",
      "begin_line": 273,
      "end_line": 282,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003edouble\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the default\n     * value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toDouble(null, 1.1d)   \u003d 1.1d\n     *   NumberUtils.toDouble(\"\", 1.1d)     \u003d 1.1d\n     *   NumberUtils.toDouble(\"1.5\", 0.0d)  \u003d 1.5d\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue the default value\n     * @return the double represented by the string, or defaultValue\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 274,col 7)-(line 276,col 7)",
        "(line 277,col 7)-(line 281,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toByte(java.lang.String)",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003ebyte\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toByte(null) \u003d 0\n     *   NumberUtils.toByte(\"\")   \u003d 0\n     *   NumberUtils.toByte(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the byte represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toByte(java.lang.String, byte)",
      "begin_line": 323,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003ebyte\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toByte(null, 1) \u003d 1\n     *   NumberUtils.toByte(\"\", 1)   \u003d 1\n     *   NumberUtils.toByte(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the byte represented by the string, or the default if conversion fails\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toShort(java.lang.String)",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eshort\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toShort(null) \u003d 0\n     *   NumberUtils.toShort(\"\")   \u003d 0\n     *   NumberUtils.toShort(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the short represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toShort(java.lang.String, short)",
      "begin_line": 372,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eshort\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toShort(null, 1) \u003d 1\n     *   NumberUtils.toShort(\"\", 1)   \u003d 1\n     *   NumberUtils.toShort(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the short represented by the string, or the default if conversion fails\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createNumber(java.lang.String)",
      "begin_line": 450,
      "end_line": 610,
      "comment": "\n     * \u003cp\u003eTurns a string value into a java.lang.Number.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string starts with {@code 0x} or {@code -0x} (lower or upper case) or {@code #} or {@code -#}, it\n     * will be interpreted as a hexadecimal Integer - or Long, if the number of digits after the\n     * prefix is more than 8 - or BigInteger if there are more than 16 digits.\n     * \u003c/p\u003e\n     * \u003cp\u003eThen, the value is examined for a type qualifier on the end, i.e. one of\n     * \u003ccode\u003e\u0027f\u0027,\u0027F\u0027,\u0027d\u0027,\u0027D\u0027,\u0027l\u0027,\u0027L\u0027\u003c/code\u003e.  If it is found, it starts \n     * trying to create successively larger types from the type specified\n     * until one is found that can represent the value.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a type specifier is not found, it will check for a decimal point\n     * and then try successively larger types from \u003ccode\u003eInteger\u003c/code\u003e to\n     * \u003ccode\u003eBigInteger\u003c/code\u003e and from \u003ccode\u003eFloat\u003c/code\u003e to\n    * \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n    * \n     * \u003cp\u003e\n     * Integral values with a leading {@code 0} will be interpreted as octal; the returned number will\n     * be Integer, Long or BigDecimal as appropriate.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does not trim the input string, i.e., strings with leading\n     * or trailing spaces will generate NumberFormatExceptions.\u003c/p\u003e\n     *\n     * @param str  String containing a number, may be null\n     * @return Number created from the string (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 458,col 76)",
        "(line 459,col 9)-(line 459,col 23)",
        "(line 460,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 59)",
        "(line 477,col 9)-(line 477,col 20)",
        "(line 478,col 9)-(line 478,col 19)",
        "(line 479,col 9)-(line 479,col 19)",
        "(line 480,col 9)-(line 480,col 44)",
        "(line 481,col 9)-(line 481,col 67)",
        "(line 485,col 9)-(line 485,col 28)",
        "(line 486,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 567,col 9)",
        "(line 570,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 588,col 9)",
        "(line 591,col 9)-(line 591,col 69)",
        "(line 592,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 609,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.isAllZeros(java.lang.String)",
      "begin_line": 620,
      "end_line": 630,
      "comment": "\n     * \u003cp\u003eUtility method for {@link #createNumber(java.lang.String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if s is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  the String to check\n     * @return if it is all zeros or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createFloat(java.lang.String)",
      "begin_line": 642,
      "end_line": 647,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eFloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eFloat\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createDouble(java.lang.String)",
      "begin_line": 658,
      "end_line": 663,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eDouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eDouble\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createInteger(java.lang.String)",
      "begin_line": 675,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eInteger\u003c/code\u003e, handling\n     * hex and octal notations.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eInteger\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 678,col 9)",
        "(line 680,col 9)-(line 680,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createLong(java.lang.String)",
      "begin_line": 693,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eLong\u003c/code\u003e; \n     * since 3.1 it handles hex and octal notations.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eLong\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createBigInteger(java.lang.String)",
      "begin_line": 710,
      "end_line": 734,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigInteger\u003c/code\u003e;\n     * since 3.2 it handles hex (0x or #) and octal (0) notations.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigInteger\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 20)",
        "(line 715,col 9)-(line 715,col 23)",
        "(line 716,col 9)-(line 716,col 31)",
        "(line 717,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 730,col 9)",
        "(line 732,col 9)-(line 732,col 75)",
        "(line 733,col 9)-(line 733,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createBigDecimal(java.lang.String)",
      "begin_line": 745,
      "end_line": 761,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigDecimal\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 748,col 9)",
        "(line 750,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(long[])",
      "begin_line": 773,
      "end_line": 786,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 29)",
        "(line 778,col 9)-(line 778,col 28)",
        "(line 779,col 9)-(line 783,col 9)",
        "(line 785,col 9)-(line 785,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(int[])",
      "begin_line": 796,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 29)",
        "(line 801,col 9)-(line 801,col 27)",
        "(line 802,col 9)-(line 806,col 9)",
        "(line 808,col 9)-(line 808,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(short[])",
      "begin_line": 819,
      "end_line": 832,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 29)",
        "(line 824,col 9)-(line 824,col 29)",
        "(line 825,col 9)-(line 829,col 9)",
        "(line 831,col 9)-(line 831,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(byte[])",
      "begin_line": 842,
      "end_line": 855,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 29)",
        "(line 847,col 9)-(line 847,col 28)",
        "(line 848,col 9)-(line 852,col 9)",
        "(line 854,col 9)-(line 854,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(double[])",
      "begin_line": 866,
      "end_line": 882,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#min(double[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 29)",
        "(line 871,col 9)-(line 871,col 30)",
        "(line 872,col 9)-(line 879,col 9)",
        "(line 881,col 9)-(line 881,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(float[])",
      "begin_line": 893,
      "end_line": 909,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#min(float[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 29)",
        "(line 898,col 9)-(line 898,col 29)",
        "(line 899,col 9)-(line 906,col 9)",
        "(line 908,col 9)-(line 908,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(long[])",
      "begin_line": 921,
      "end_line": 934,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 29)",
        "(line 926,col 9)-(line 926,col 28)",
        "(line 927,col 9)-(line 931,col 9)",
        "(line 933,col 9)-(line 933,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(int[])",
      "begin_line": 944,
      "end_line": 957,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 29)",
        "(line 949,col 9)-(line 949,col 27)",
        "(line 950,col 9)-(line 954,col 9)",
        "(line 956,col 9)-(line 956,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(short[])",
      "begin_line": 967,
      "end_line": 980,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 29)",
        "(line 972,col 9)-(line 972,col 29)",
        "(line 973,col 9)-(line 977,col 9)",
        "(line 979,col 9)-(line 979,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(byte[])",
      "begin_line": 990,
      "end_line": 1003,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 29)",
        "(line 995,col 9)-(line 995,col 28)",
        "(line 996,col 9)-(line 1000,col 9)",
        "(line 1002,col 9)-(line 1002,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(double[])",
      "begin_line": 1014,
      "end_line": 1030,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#max(double[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 29)",
        "(line 1019,col 9)-(line 1019,col 30)",
        "(line 1020,col 9)-(line 1027,col 9)",
        "(line 1029,col 9)-(line 1029,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(float[])",
      "begin_line": 1041,
      "end_line": 1057,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#max(float[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 29)",
        "(line 1046,col 9)-(line 1046,col 29)",
        "(line 1047,col 9)-(line 1054,col 9)",
        "(line 1056,col 9)-(line 1056,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.validateArray(java.lang.Object)",
      "begin_line": 1065,
      "end_line": 1071,
      "comment": "\n     * Checks if the specified array is neither null nor empty.\n     *\n     * @param array  the array to check\n     * @throws IllegalArgumentException if {@code array} is either {@code null} or empty\n     ",
      "child_ranges": [
        "(line 1066,col 9)-(line 1070,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(long, long, long)",
      "begin_line": 1083,
      "end_line": 1091,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1084,col 9)-(line 1086,col 9)",
        "(line 1087,col 9)-(line 1089,col 9)",
        "(line 1090,col 9)-(line 1090,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(int, int, int)",
      "begin_line": 1101,
      "end_line": 1109,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1102,col 9)-(line 1104,col 9)",
        "(line 1105,col 9)-(line 1107,col 9)",
        "(line 1108,col 9)-(line 1108,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(short, short, short)",
      "begin_line": 1119,
      "end_line": 1127,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1122,col 9)",
        "(line 1123,col 9)-(line 1125,col 9)",
        "(line 1126,col 9)-(line 1126,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(byte, byte, byte)",
      "begin_line": 1137,
      "end_line": 1145,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1143,col 9)",
        "(line 1144,col 9)-(line 1144,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(double, double, double)",
      "begin_line": 1159,
      "end_line": 1161,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     * @see IEEE754rUtils#min(double, double, double) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1160,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(float, float, float)",
      "begin_line": 1175,
      "end_line": 1177,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     * @see IEEE754rUtils#min(float, float, float) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1176,col 9)-(line 1176,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(long, long, long)",
      "begin_line": 1189,
      "end_line": 1197,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1190,col 9)-(line 1192,col 9)",
        "(line 1193,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1196,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(int, int, int)",
      "begin_line": 1207,
      "end_line": 1215,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1208,col 9)-(line 1210,col 9)",
        "(line 1211,col 9)-(line 1213,col 9)",
        "(line 1214,col 9)-(line 1214,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(short, short, short)",
      "begin_line": 1225,
      "end_line": 1233,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1226,col 9)-(line 1228,col 9)",
        "(line 1229,col 9)-(line 1231,col 9)",
        "(line 1232,col 9)-(line 1232,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(byte, byte, byte)",
      "begin_line": 1243,
      "end_line": 1251,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1244,col 9)-(line 1246,col 9)",
        "(line 1247,col 9)-(line 1249,col 9)",
        "(line 1250,col 9)-(line 1250,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(double, double, double)",
      "begin_line": 1265,
      "end_line": 1267,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     * @see IEEE754rUtils#max(double, double, double) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1266,col 9)-(line 1266,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(float, float, float)",
      "begin_line": 1281,
      "end_line": 1283,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     * @see IEEE754rUtils#max(float, float, float) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1282,col 9)-(line 1282,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.isDigits(java.lang.String)",
      "begin_line": 1296,
      "end_line": 1306,
      "comment": "\n     * \u003cp\u003eChecks whether the \u003ccode\u003eString\u003c/code\u003e contains only\n     * digit characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if str contains only Unicode numeric\n     ",
      "child_ranges": [
        "(line 1297,col 9)-(line 1299,col 9)",
        "(line 1300,col 9)-(line 1304,col 9)",
        "(line 1305,col 9)-(line 1305,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.isNumber(java.lang.String)",
      "begin_line": 1321,
      "end_line": 1421,
      "comment": "\n     * \u003cp\u003eChecks whether the String a valid Java number.\u003c/p\u003e\n     *\n     * \u003cp\u003eValid numbers include hexadecimal marked with the \u003ccode\u003e0x\u003c/code\u003e\n     * qualifier, scientific notation and numbers marked with a type\n     * qualifier (e.g. 123L).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the string is a correctly formatted number\n     ",
      "child_ranges": [
        "(line 1322,col 9)-(line 1324,col 9)",
        "(line 1325,col 9)-(line 1325,col 47)",
        "(line 1326,col 9)-(line 1326,col 30)",
        "(line 1327,col 9)-(line 1327,col 31)",
        "(line 1328,col 9)-(line 1328,col 36)",
        "(line 1329,col 9)-(line 1329,col 35)",
        "(line 1330,col 9)-(line 1330,col 35)",
        "(line 1332,col 9)-(line 1332,col 52)",
        "(line 1333,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1348,col 13)",
        "(line 1350,col 9)-(line 1350,col 22)",
        "(line 1353,col 9)-(line 1385,col 9)",
        "(line 1386,col 9)-(line 1417,col 9)",
        "(line 1420,col 9)-(line 1420,col 41)"
      ]
    }
  ]
}