{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/math/NumberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 1415,
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
      "begin_line": 444,
      "end_line": 594,
      "comment": "\n     * \u003cp\u003eTurns a string value into a java.lang.Number.\u003c/p\u003e\n     *\n     * \u003cp\u003eFirst, the value is examined for a type qualifier on the end\n     * (\u003ccode\u003e\u0027f\u0027,\u0027F\u0027,\u0027d\u0027,\u0027D\u0027,\u0027l\u0027,\u0027L\u0027\u003c/code\u003e).  If it is found, it starts \n     * trying to create successively larger types from the type specified\n     * until one is found that can represent the value.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a type specifier is not found, it will check for a decimal point\n     * and then try successively larger types from \u003ccode\u003eInteger\u003c/code\u003e to\n     * \u003ccode\u003eBigInteger\u003c/code\u003e and from \u003ccode\u003eFloat\u003c/code\u003e to\n     * \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string starts with \u003ccode\u003e0x\u003c/code\u003e or \u003ccode\u003e-0x\u003c/code\u003e, it\n     * will be interpreted as a hexadecimal integer.  Values with leading\n     * \u003ccode\u003e0\u003c/code\u003e\u0027s will not be interpreted as octal.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does not trim the input string, i.e., strings with leading\n     * or trailing spaces will generate NumberFormatExceptions.\u003c/p\u003e\n     *\n     * @param str  String containing a number, may be null\n     * @return Number created from the string\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 53)",
        "(line 462,col 9)-(line 462,col 20)",
        "(line 463,col 9)-(line 463,col 19)",
        "(line 464,col 9)-(line 464,col 19)",
        "(line 465,col 9)-(line 465,col 38)",
        "(line 466,col 9)-(line 466,col 61)",
        "(line 468,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.isAllZeros(java.lang.String)",
      "begin_line": 604,
      "end_line": 614,
      "comment": "\n     * \u003cp\u003eUtility method for {@link #createNumber(java.lang.String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if s is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  the String to check\n     * @return if it is all zeros or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createFloat(java.lang.String)",
      "begin_line": 626,
      "end_line": 631,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eFloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eFloat\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createDouble(java.lang.String)",
      "begin_line": 642,
      "end_line": 647,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eDouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eDouble\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createInteger(java.lang.String)",
      "begin_line": 659,
      "end_line": 665,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eInteger\u003c/code\u003e, handling\n     * hex and octal notations.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 662,col 9)",
        "(line 664,col 9)-(line 664,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createLong(java.lang.String)",
      "begin_line": 676,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eLong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eLong\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createBigInteger(java.lang.String)",
      "begin_line": 692,
      "end_line": 697,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigInteger\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.createBigDecimal(java.lang.String)",
      "begin_line": 708,
      "end_line": 717,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigDecimal\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 711,col 9)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 716,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(long[])",
      "begin_line": 729,
      "end_line": 746,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 735,col 9)",
        "(line 738,col 9)-(line 738,col 28)",
        "(line 739,col 9)-(line 743,col 9)",
        "(line 745,col 9)-(line 745,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(int[])",
      "begin_line": 756,
      "end_line": 773,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 762,col 9)",
        "(line 765,col 9)-(line 765,col 27)",
        "(line 766,col 9)-(line 770,col 9)",
        "(line 772,col 9)-(line 772,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(short[])",
      "begin_line": 783,
      "end_line": 800,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 789,col 9)",
        "(line 792,col 9)-(line 792,col 29)",
        "(line 793,col 9)-(line 797,col 9)",
        "(line 799,col 9)-(line 799,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(byte[])",
      "begin_line": 810,
      "end_line": 827,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 816,col 9)",
        "(line 819,col 9)-(line 819,col 28)",
        "(line 820,col 9)-(line 824,col 9)",
        "(line 826,col 9)-(line 826,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(double[])",
      "begin_line": 838,
      "end_line": 858,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#min(double[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 844,col 9)",
        "(line 847,col 9)-(line 847,col 30)",
        "(line 848,col 9)-(line 855,col 9)",
        "(line 857,col 9)-(line 857,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(float[])",
      "begin_line": 869,
      "end_line": 889,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#min(float[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 875,col 9)",
        "(line 878,col 9)-(line 878,col 29)",
        "(line 879,col 9)-(line 886,col 9)",
        "(line 888,col 9)-(line 888,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(long[])",
      "begin_line": 901,
      "end_line": 918,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 907,col 9)",
        "(line 910,col 9)-(line 910,col 28)",
        "(line 911,col 9)-(line 915,col 9)",
        "(line 917,col 9)-(line 917,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(int[])",
      "begin_line": 928,
      "end_line": 945,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 934,col 9)",
        "(line 937,col 9)-(line 937,col 27)",
        "(line 938,col 9)-(line 942,col 9)",
        "(line 944,col 9)-(line 944,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(short[])",
      "begin_line": 955,
      "end_line": 972,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 961,col 9)",
        "(line 964,col 9)-(line 964,col 29)",
        "(line 965,col 9)-(line 969,col 9)",
        "(line 971,col 9)-(line 971,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(byte[])",
      "begin_line": 982,
      "end_line": 999,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 988,col 9)",
        "(line 991,col 9)-(line 991,col 28)",
        "(line 992,col 9)-(line 996,col 9)",
        "(line 998,col 9)-(line 998,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(double[])",
      "begin_line": 1010,
      "end_line": 1030,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#max(double[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1016,col 9)",
        "(line 1019,col 9)-(line 1019,col 30)",
        "(line 1020,col 9)-(line 1027,col 9)",
        "(line 1029,col 9)-(line 1029,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(float[])",
      "begin_line": 1041,
      "end_line": 1061,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#max(float[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1047,col 9)",
        "(line 1050,col 9)-(line 1050,col 29)",
        "(line 1051,col 9)-(line 1058,col 9)",
        "(line 1060,col 9)-(line 1060,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(long, long, long)",
      "begin_line": 1073,
      "end_line": 1081,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1076,col 9)",
        "(line 1077,col 9)-(line 1079,col 9)",
        "(line 1080,col 9)-(line 1080,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(int, int, int)",
      "begin_line": 1091,
      "end_line": 1099,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1094,col 9)",
        "(line 1095,col 9)-(line 1097,col 9)",
        "(line 1098,col 9)-(line 1098,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(short, short, short)",
      "begin_line": 1109,
      "end_line": 1117,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1112,col 9)",
        "(line 1113,col 9)-(line 1115,col 9)",
        "(line 1116,col 9)-(line 1116,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(byte, byte, byte)",
      "begin_line": 1127,
      "end_line": 1135,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1128,col 9)-(line 1130,col 9)",
        "(line 1131,col 9)-(line 1133,col 9)",
        "(line 1134,col 9)-(line 1134,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(double, double, double)",
      "begin_line": 1149,
      "end_line": 1151,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     * @see IEEE754rUtils#min(double, double, double) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1150,col 9)-(line 1150,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.min(float, float, float)",
      "begin_line": 1165,
      "end_line": 1167,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     * @see IEEE754rUtils#min(float, float, float) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1166,col 9)-(line 1166,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(long, long, long)",
      "begin_line": 1179,
      "end_line": 1187,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1182,col 9)",
        "(line 1183,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1186,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(int, int, int)",
      "begin_line": 1197,
      "end_line": 1205,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1200,col 9)",
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1204,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(short, short, short)",
      "begin_line": 1215,
      "end_line": 1223,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1216,col 9)-(line 1218,col 9)",
        "(line 1219,col 9)-(line 1221,col 9)",
        "(line 1222,col 9)-(line 1222,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(byte, byte, byte)",
      "begin_line": 1233,
      "end_line": 1241,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1234,col 9)-(line 1236,col 9)",
        "(line 1237,col 9)-(line 1239,col 9)",
        "(line 1240,col 9)-(line 1240,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(double, double, double)",
      "begin_line": 1255,
      "end_line": 1257,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     * @see IEEE754rUtils#max(double, double, double) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1256,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.max(float, float, float)",
      "begin_line": 1271,
      "end_line": 1273,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     * @see IEEE754rUtils#max(float, float, float) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1272,col 9)-(line 1272,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.isDigits(java.lang.String)",
      "begin_line": 1286,
      "end_line": 1296,
      "comment": "\n     * \u003cp\u003eChecks whether the \u003ccode\u003eString\u003c/code\u003e contains only\n     * digit characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if str contains only unicode numeric\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1289,col 9)",
        "(line 1290,col 9)-(line 1294,col 9)",
        "(line 1295,col 9)-(line 1295,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.NumberUtils.isNumber(java.lang.String)",
      "begin_line": 1311,
      "end_line": 1413,
      "comment": "\n     * \u003cp\u003eChecks whether the String a valid Java number.\u003c/p\u003e\n     *\n     * \u003cp\u003eValid numbers include hexadecimal marked with the \u003ccode\u003e0x\u003c/code\u003e\n     * qualifier, scientific notation and numbers marked with a type\n     * qualifier (e.g. 123L).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the string is a correctly formatted number\n     ",
      "child_ranges": [
        "(line 1312,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1315,col 41)",
        "(line 1316,col 9)-(line 1316,col 30)",
        "(line 1317,col 9)-(line 1317,col 31)",
        "(line 1318,col 9)-(line 1318,col 36)",
        "(line 1319,col 9)-(line 1319,col 35)",
        "(line 1320,col 9)-(line 1320,col 35)",
        "(line 1322,col 9)-(line 1322,col 46)",
        "(line 1323,col 9)-(line 1339,col 9)",
        "(line 1340,col 9)-(line 1340,col 13)",
        "(line 1342,col 9)-(line 1342,col 22)",
        "(line 1345,col 9)-(line 1377,col 9)",
        "(line 1378,col 9)-(line 1409,col 9)",
        "(line 1412,col 9)-(line 1412,col 41)"
      ]
    }
  ]
}