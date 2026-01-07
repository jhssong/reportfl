{
  "filepath": "/tmp/Lang-7b/src/main/java/org/apache/commons/lang3/math/NumberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 1422,
      "comment": "\n * \u003cp\u003eProvides extra functionality for Java Number classes.\u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_ZERO"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Reusable Long constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_ONE"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Reusable Long constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_MINUS_ONE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Reusable Long constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_ZERO"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Reusable Integer constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_ONE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Reusable Integer constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_MINUS_ONE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Reusable Integer constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_ZERO"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Reusable Short constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_ONE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Reusable Short constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_MINUS_ONE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Reusable Short constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_ZERO"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Reusable Byte constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_ONE"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Reusable Byte constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MINUS_ONE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Reusable Byte constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_ZERO"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Reusable Double constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_ONE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Reusable Double constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_MINUS_ONE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Reusable Double constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_ZERO"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Reusable Float constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_ONE"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Reusable Float constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_MINUS_ONE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Reusable Float constant for minus one. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.math.NumberUtils.NumberUtils()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eNumberUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eNumberUtils.toInt(\"6\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toInt(java.lang.String)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toInt(null) \u003d 0\n     *   NumberUtils.toInt(\"\")   \u003d 0\n     *   NumberUtils.toInt(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the int represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toInt(java.lang.String, int)",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toInt(null, 1) \u003d 1\n     *   NumberUtils.toInt(\"\", 1)   \u003d 1\n     *   NumberUtils.toInt(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the int represented by the string, or the default if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toLong(java.lang.String)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003elong\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toLong(null) \u003d 0L\n     *   NumberUtils.toLong(\"\")   \u003d 0L\n     *   NumberUtils.toLong(\"1\")  \u003d 1L\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the long represented by the string, or \u003ccode\u003e0\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toLong(java.lang.String, long)",
      "begin_line": 168,
      "end_line": 177,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003elong\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toLong(null, 1L) \u003d 1L\n     *   NumberUtils.toLong(\"\", 1L)   \u003d 1L\n     *   NumberUtils.toLong(\"1\", 0L)  \u003d 1L\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the long represented by the string, or the default if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toFloat(java.lang.String)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003efloat\u003c/code\u003e, returning\n     * \u003ccode\u003e0.0f\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     * \u003ccode\u003e0.0f\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toFloat(null)   \u003d 0.0f\n     *   NumberUtils.toFloat(\"\")     \u003d 0.0f\n     *   NumberUtils.toFloat(\"1.5\")  \u003d 1.5f\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the float represented by the string, or \u003ccode\u003e0.0f\u003c/code\u003e\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toFloat(java.lang.String, float)",
      "begin_line": 220,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003efloat\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the default\n     * value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toFloat(null, 1.1f)   \u003d 1.0f\n     *   NumberUtils.toFloat(\"\", 1.1f)     \u003d 1.1f\n     *   NumberUtils.toFloat(\"1.5\", 0.0f)  \u003d 1.5f\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue the default value\n     * @return the float represented by the string, or defaultValue\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 221,col 7)-(line 223,col 7)",
        "(line 224,col 7)-(line 228,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toDouble(java.lang.String)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003edouble\u003c/code\u003e, returning\n     * \u003ccode\u003e0.0d\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     * \u003ccode\u003e0.0d\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toDouble(null)   \u003d 0.0d\n     *   NumberUtils.toDouble(\"\")     \u003d 0.0d\n     *   NumberUtils.toDouble(\"1.5\")  \u003d 1.5d\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the double represented by the string, or \u003ccode\u003e0.0d\u003c/code\u003e\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toDouble(java.lang.String, double)",
      "begin_line": 272,
      "end_line": 281,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003edouble\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the default\n     * value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toDouble(null, 1.1d)   \u003d 1.1d\n     *   NumberUtils.toDouble(\"\", 1.1d)     \u003d 1.1d\n     *   NumberUtils.toDouble(\"1.5\", 0.0d)  \u003d 1.5d\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue the default value\n     * @return the double represented by the string, or defaultValue\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 273,col 7)-(line 275,col 7)",
        "(line 276,col 7)-(line 280,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toByte(java.lang.String)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003ebyte\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toByte(null) \u003d 0\n     *   NumberUtils.toByte(\"\")   \u003d 0\n     *   NumberUtils.toByte(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the byte represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toByte(java.lang.String, byte)",
      "begin_line": 322,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003ebyte\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toByte(null, 1) \u003d 1\n     *   NumberUtils.toByte(\"\", 1)   \u003d 1\n     *   NumberUtils.toByte(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the byte represented by the string, or the default if conversion fails\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toShort(java.lang.String)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eshort\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toShort(null) \u003d 0\n     *   NumberUtils.toShort(\"\")   \u003d 0\n     *   NumberUtils.toShort(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the short represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.toShort(java.lang.String, short)",
      "begin_line": 371,
      "end_line": 380,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eshort\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toShort(null, 1) \u003d 1\n     *   NumberUtils.toShort(\"\", 1)   \u003d 1\n     *   NumberUtils.toShort(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the short represented by the string, or the default if conversion fails\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 379,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createNumber(java.lang.String)",
      "begin_line": 445,
      "end_line": 598,
      "comment": "\n     * \u003cp\u003eTurns a string value into a java.lang.Number.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string starts with \u003ccode\u003e0x\u003c/code\u003e or \u003ccode\u003e-0x\u003c/code\u003e (lower or upper case), it\n     * will be interpreted as a hexadecimal integer - or long, if the number of digits after the 0x\n     * prefix is more than 8.\n     * Values with leading \u003ccode\u003e0\u003c/code\u003e\u0027s will not be interpreted as octal.\u003c/p\u003e\n     *\n     * \u003cp\u003eThen, the value is examined for a type qualifier on the end, i.e. one of\n     * \u003ccode\u003e\u0027f\u0027,\u0027F\u0027,\u0027d\u0027,\u0027D\u0027,\u0027l\u0027,\u0027L\u0027\u003c/code\u003e.  If it is found, it starts \n     * trying to create successively larger types from the type specified\n     * until one is found that can represent the value.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a type specifier is not found, it will check for a decimal point\n     * and then try successively larger types from \u003ccode\u003eInteger\u003c/code\u003e to\n     * \u003ccode\u003eBigInteger\u003c/code\u003e and from \u003ccode\u003eFloat\u003c/code\u003e to\n     * \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does not trim the input string, i.e., strings with leading\n     * or trailing spaces will generate NumberFormatExceptions.\u003c/p\u003e\n     *\n     * @param str  String containing a number, may be null\n     * @return Number created from the string (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 53)",
        "(line 466,col 9)-(line 466,col 20)",
        "(line 467,col 9)-(line 467,col 19)",
        "(line 468,col 9)-(line 468,col 19)",
        "(line 469,col 9)-(line 469,col 38)",
        "(line 470,col 9)-(line 470,col 61)",
        "(line 472,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 597,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.isAllZeros(java.lang.String)",
      "begin_line": 608,
      "end_line": 618,
      "comment": "\n     * \u003cp\u003eUtility method for {@link #createNumber(java.lang.String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if s is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  the String to check\n     * @return if it is all zeros or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createFloat(java.lang.String)",
      "begin_line": 630,
      "end_line": 635,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eFloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eFloat\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createDouble(java.lang.String)",
      "begin_line": 646,
      "end_line": 651,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eDouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eDouble\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createInteger(java.lang.String)",
      "begin_line": 663,
      "end_line": 669,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eInteger\u003c/code\u003e, handling\n     * hex and octal notations.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eInteger\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 668,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createLong(java.lang.String)",
      "begin_line": 681,
      "end_line": 686,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eLong\u003c/code\u003e; \n     * since 3.1 it handles hex and octal notations.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eLong\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createBigInteger(java.lang.String)",
      "begin_line": 697,
      "end_line": 702,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigInteger\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigInteger\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createBigDecimal(java.lang.String)",
      "begin_line": 713,
      "end_line": 726,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigDecimal\u003c/code\u003e (or null if the input is null)\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 716,col 9)",
        "(line 718,col 9)-(line 720,col 9)",
        "(line 725,col 9)-(line 725,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(long[])",
      "begin_line": 738,
      "end_line": 755,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 744,col 9)",
        "(line 747,col 9)-(line 747,col 28)",
        "(line 748,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 754,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(int[])",
      "begin_line": 765,
      "end_line": 782,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 771,col 9)",
        "(line 774,col 9)-(line 774,col 27)",
        "(line 775,col 9)-(line 779,col 9)",
        "(line 781,col 9)-(line 781,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(short[])",
      "begin_line": 792,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 798,col 9)",
        "(line 801,col 9)-(line 801,col 29)",
        "(line 802,col 9)-(line 806,col 9)",
        "(line 808,col 9)-(line 808,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(byte[])",
      "begin_line": 819,
      "end_line": 836,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 825,col 9)",
        "(line 828,col 9)-(line 828,col 28)",
        "(line 829,col 9)-(line 833,col 9)",
        "(line 835,col 9)-(line 835,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(double[])",
      "begin_line": 847,
      "end_line": 867,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#min(double[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 853,col 9)",
        "(line 856,col 9)-(line 856,col 30)",
        "(line 857,col 9)-(line 864,col 9)",
        "(line 866,col 9)-(line 866,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(float[])",
      "begin_line": 878,
      "end_line": 898,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#min(float[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 884,col 9)",
        "(line 887,col 9)-(line 887,col 29)",
        "(line 888,col 9)-(line 895,col 9)",
        "(line 897,col 9)-(line 897,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(long[])",
      "begin_line": 910,
      "end_line": 927,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 916,col 9)",
        "(line 919,col 9)-(line 919,col 28)",
        "(line 920,col 9)-(line 924,col 9)",
        "(line 926,col 9)-(line 926,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(int[])",
      "begin_line": 937,
      "end_line": 954,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 943,col 9)",
        "(line 946,col 9)-(line 946,col 27)",
        "(line 947,col 9)-(line 951,col 9)",
        "(line 953,col 9)-(line 953,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(short[])",
      "begin_line": 964,
      "end_line": 981,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 970,col 9)",
        "(line 973,col 9)-(line 973,col 29)",
        "(line 974,col 9)-(line 978,col 9)",
        "(line 980,col 9)-(line 980,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(byte[])",
      "begin_line": 991,
      "end_line": 1008,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 997,col 9)",
        "(line 1000,col 9)-(line 1000,col 28)",
        "(line 1001,col 9)-(line 1005,col 9)",
        "(line 1007,col 9)-(line 1007,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(double[])",
      "begin_line": 1019,
      "end_line": 1039,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#max(double[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1025,col 9)",
        "(line 1028,col 9)-(line 1028,col 30)",
        "(line 1029,col 9)-(line 1036,col 9)",
        "(line 1038,col 9)-(line 1038,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(float[])",
      "begin_line": 1050,
      "end_line": 1070,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#max(float[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1052,col 9)-(line 1056,col 9)",
        "(line 1059,col 9)-(line 1059,col 29)",
        "(line 1060,col 9)-(line 1067,col 9)",
        "(line 1069,col 9)-(line 1069,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(long, long, long)",
      "begin_line": 1082,
      "end_line": 1090,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1083,col 9)-(line 1085,col 9)",
        "(line 1086,col 9)-(line 1088,col 9)",
        "(line 1089,col 9)-(line 1089,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(int, int, int)",
      "begin_line": 1100,
      "end_line": 1108,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1103,col 9)",
        "(line 1104,col 9)-(line 1106,col 9)",
        "(line 1107,col 9)-(line 1107,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(short, short, short)",
      "begin_line": 1118,
      "end_line": 1126,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1121,col 9)",
        "(line 1122,col 9)-(line 1124,col 9)",
        "(line 1125,col 9)-(line 1125,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(byte, byte, byte)",
      "begin_line": 1136,
      "end_line": 1144,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1139,col 9)",
        "(line 1140,col 9)-(line 1142,col 9)",
        "(line 1143,col 9)-(line 1143,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(double, double, double)",
      "begin_line": 1158,
      "end_line": 1160,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     * @see IEEE754rUtils#min(double, double, double) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1159,col 9)-(line 1159,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(float, float, float)",
      "begin_line": 1174,
      "end_line": 1176,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     * @see IEEE754rUtils#min(float, float, float) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(long, long, long)",
      "begin_line": 1188,
      "end_line": 1196,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1189,col 9)-(line 1191,col 9)",
        "(line 1192,col 9)-(line 1194,col 9)",
        "(line 1195,col 9)-(line 1195,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(int, int, int)",
      "begin_line": 1206,
      "end_line": 1214,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1209,col 9)",
        "(line 1210,col 9)-(line 1212,col 9)",
        "(line 1213,col 9)-(line 1213,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(short, short, short)",
      "begin_line": 1224,
      "end_line": 1232,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1225,col 9)-(line 1227,col 9)",
        "(line 1228,col 9)-(line 1230,col 9)",
        "(line 1231,col 9)-(line 1231,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(byte, byte, byte)",
      "begin_line": 1242,
      "end_line": 1250,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1245,col 9)",
        "(line 1246,col 9)-(line 1248,col 9)",
        "(line 1249,col 9)-(line 1249,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(double, double, double)",
      "begin_line": 1264,
      "end_line": 1266,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     * @see IEEE754rUtils#max(double, double, double) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1265,col 9)-(line 1265,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(float, float, float)",
      "begin_line": 1280,
      "end_line": 1282,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     * @see IEEE754rUtils#max(float, float, float) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.isDigits(java.lang.String)",
      "begin_line": 1295,
      "end_line": 1305,
      "comment": "\n     * \u003cp\u003eChecks whether the \u003ccode\u003eString\u003c/code\u003e contains only\n     * digit characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if str contains only Unicode numeric\n     ",
      "child_ranges": [
        "(line 1296,col 9)-(line 1298,col 9)",
        "(line 1299,col 9)-(line 1303,col 9)",
        "(line 1304,col 9)-(line 1304,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.isNumber(java.lang.String)",
      "begin_line": 1320,
      "end_line": 1420,
      "comment": "\n     * \u003cp\u003eChecks whether the String a valid Java number.\u003c/p\u003e\n     *\n     * \u003cp\u003eValid numbers include hexadecimal marked with the \u003ccode\u003e0x\u003c/code\u003e\n     * qualifier, scientific notation and numbers marked with a type\n     * qualifier (e.g. 123L).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the string is a correctly formatted number\n     ",
      "child_ranges": [
        "(line 1321,col 9)-(line 1323,col 9)",
        "(line 1324,col 9)-(line 1324,col 41)",
        "(line 1325,col 9)-(line 1325,col 30)",
        "(line 1326,col 9)-(line 1326,col 31)",
        "(line 1327,col 9)-(line 1327,col 36)",
        "(line 1328,col 9)-(line 1328,col 35)",
        "(line 1329,col 9)-(line 1329,col 35)",
        "(line 1331,col 9)-(line 1331,col 46)",
        "(line 1332,col 9)-(line 1346,col 9)",
        "(line 1347,col 9)-(line 1347,col 13)",
        "(line 1349,col 9)-(line 1349,col 22)",
        "(line 1352,col 9)-(line 1384,col 9)",
        "(line 1385,col 9)-(line 1416,col 9)",
        "(line 1419,col 9)-(line 1419,col 41)"
      ]
    }
  ]
}